package ad0;

/* loaded from: classes11.dex */
public final class f extends com.tencent.mm.sdk.event.n {
    public f() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.pigeon.mm_foundation.DartServiceCallerApi Bi;
        java.lang.String str;
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (gm0.j1.a()) {
            am.uq uqVar = event.f54679g;
            if (kotlin.jvm.internal.o.b(uqVar.f8126b, "RepairerConfig_Global_DispatchPostSyncTaskEvent_Int")) {
                new com.tencent.mm.autogen.events.PostSyncTaskEvent().e();
            } else if (kotlin.jvm.internal.o.b(uqVar.f8126b, "RepairerConfig_Global_KillMainProcess_Int")) {
                if (k35.p.f303943a != null) {
                    com.tencent.mm.ui.vb.d(com.tencent.mm.sdk.platformtools.x2.f193071a, true, 2);
                }
            } else if (kotlin.jvm.internal.o.b(uqVar.f8126b, new com.tencent.mm.repairer.config.tools.RepairerConfigGlobalUiTool().l())) {
                java.lang.String str2 = uqVar.f8127c;
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.mm.uitool.UITool");
                    java.lang.Object obj = cls.getDeclaredField("INSTANCE").get(cls);
                    int a17 = com.tencent.mm.sdk.platformtools.b8.a(str2);
                    if (a17 > 0) {
                        cls.getDeclaredMethod("setEnabled", java.lang.Integer.TYPE).invoke(obj, java.lang.Integer.valueOf(a17));
                        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.UIToolCommon", "enable UIToolCommon", new java.lang.Object[0]);
                        zl5.b.f474087b = true;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.b8.a(str2)));
                    } else {
                        cls.getDeclaredMethod("setDisabled", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                        zl5.b.f474087b = false;
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC, 0);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Repairer.StaticRepairerActionEventListener", e17, "fail to enable uitool", new java.lang.Object[0]);
                }
            } else if (kotlin.jvm.internal.o.b(uqVar.f8126b, new com.tencent.mm.repairer.config.wecheck.RepairerConfigWeCheckEnable().l())) {
                java.lang.String str3 = uqVar.f8127c;
                kotlin.jvm.internal.o.d(str3);
                try {
                    java.lang.Class<?> cls2 = java.lang.Class.forName("com.tencent.mm.uitool.wecheck.UIToolWeCheck");
                    java.lang.Object obj2 = cls2.getDeclaredField("INSTANCE").get(cls2);
                    int a18 = com.tencent.mm.sdk.platformtools.b8.a(str3);
                    if (a18 > 0) {
                        cls2.getDeclaredMethod("setEnabled", java.lang.Integer.TYPE).invoke(obj2, java.lang.Integer.valueOf(a18));
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LOCAL_WECHECK_UITOOL_ENABLE_INT_SYNC, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.b8.a(str3)));
                    } else {
                        cls2.getDeclaredMethod("setDisabled", new java.lang.Class[0]).invoke(obj2, new java.lang.Object[0]);
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LOCAL_WECHECK_UITOOL_ENABLE_INT_SYNC, 0);
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Repairer.StaticRepairerActionEventListener", e18, "fail to enable uitool", new java.lang.Object[0]);
                }
            } else if (kotlin.jvm.internal.o.b(uqVar.f8126b, new com.tencent.mm.repairer.config.global.RepairerConfigAmoebaDebugView().l()) && (Bi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Bi()) != null) {
                Bi.setEnableAmoebaDebugView(kotlin.jvm.internal.o.b(uqVar.f8127c, "1"), ad0.e.f3094d);
            }
            if (uqVar.f8125a == 1 && (str = uqVar.f8126b) != null) {
                switch (str.hashCode()) {
                    case -524767361:
                        str.equals("RepairerConfig_Matrix_Proc_Recycle_Bg_Int_Int");
                        break;
                    case -188060562:
                        if (str.equals("RepairerConfig_StorageNoSpaceThreshold_Int")) {
                            w55.a aVar = com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageNoSpaceThreshold.f192218a;
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            aVar.b(context);
                            break;
                        }
                        break;
                    case 942856282:
                        if (str.equals("RepairerConfig_RepairerConfigGlobalCacheAutoClean_Int_Int")) {
                            i95.m c17 = i95.n0.c(zv1.f1.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            int i17 = zv1.f1.f476299w1;
                            ((yv1.h) ((zv1.f1) c17)).Bi(null);
                            break;
                        }
                        break;
                    case 1104641729:
                        if (str.equals("RepairerConfig_Matrix_Battery_Top_Thread_Int_Int")) {
                            ob0.a3 a3Var = (ob0.a3) i95.n0.c(ob0.a3.class);
                            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            java.lang.String value = uqVar.f8127c;
                            kotlin.jvm.internal.o.f(value, "value");
                            ((com.tencent.mm.feature.performance.w1) a3Var).Ri(context2, java.lang.Integer.parseInt(value));
                            break;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
