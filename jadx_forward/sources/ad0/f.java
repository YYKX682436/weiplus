package ad0;

/* loaded from: classes11.dex */
public final class f extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public f() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24543xfc330919 Bi;
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (gm0.j1.a()) {
            am.uq uqVar = event.f136212g;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, "RepairerConfig_Global_DispatchPostSyncTaskEvent_Int")) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5846xa44f96da().e();
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, "RepairerConfig_Global_KillMainProcess_Int")) {
                if (k35.p.f385476a != null) {
                    com.p314xaae8f345.mm.ui.vb.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true, 2);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2576x696c9db.C20794x83ac3aeb().l())) {
                java.lang.String str2 = uqVar.f89660c;
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.mm.uitool.UITool");
                    java.lang.Object obj = cls.getDeclaredField("INSTANCE").get(cls);
                    int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(str2);
                    if (a17 > 0) {
                        cls.getDeclaredMethod("setEnabled", java.lang.Integer.TYPE).invoke(obj, java.lang.Integer.valueOf(a17));
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.UIToolCommon", "enable UIToolCommon", new java.lang.Object[0]);
                        zl5.b.f555620b = true;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(str2)));
                    } else {
                        cls.getDeclaredMethod("setDisabled", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                        zl5.b.f555620b = false;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC, 0);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Repairer.StaticRepairerActionEventListener", e17, "fail to enable uitool", new java.lang.Object[0]);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2583x4902e6fa.C20830xc0839161().l())) {
                java.lang.String str3 = uqVar.f89660c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                try {
                    java.lang.Class<?> cls2 = java.lang.Class.forName("com.tencent.mm.uitool.wecheck.UIToolWeCheck");
                    java.lang.Object obj2 = cls2.getDeclaredField("INSTANCE").get(cls2);
                    int a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(str3);
                    if (a18 > 0) {
                        cls2.getDeclaredMethod("setEnabled", java.lang.Integer.TYPE).invoke(obj2, java.lang.Integer.valueOf(a18));
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_WECHECK_UITOOL_ENABLE_INT_SYNC, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(str3)));
                    } else {
                        cls2.getDeclaredMethod("setDisabled", new java.lang.Class[0]).invoke(obj2, new java.lang.Object[0]);
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_WECHECK_UITOOL_ENABLE_INT_SYNC, 0);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Repairer.StaticRepairerActionEventListener", e18, "fail to enable uitool", new java.lang.Object[0]);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20243x5172853b().l()) && (Bi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Bi()) != null) {
                Bi.m91024xfa4c7a92(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89660c, "1"), ad0.e.f84627d);
            }
            if (uqVar.f89658a == 1 && (str = uqVar.f89659b) != null) {
                switch (str.hashCode()) {
                    case -524767361:
                        str.equals("RepairerConfig_Matrix_Proc_Recycle_Bg_Int_Int");
                        break;
                    case -188060562:
                        if (str.equals("RepairerConfig_StorageNoSpaceThreshold_Int")) {
                            w55.a aVar = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20281x8414f802.f273751a;
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            aVar.b(context);
                            break;
                        }
                        break;
                    case 942856282:
                        if (str.equals("RepairerConfig_RepairerConfigGlobalCacheAutoClean_Int_Int")) {
                            i95.m c17 = i95.n0.c(zv1.f1.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            int i17 = zv1.f1.f557832w1;
                            ((yv1.h) ((zv1.f1) c17)).Bi(null);
                            break;
                        }
                        break;
                    case 1104641729:
                        if (str.equals("RepairerConfig_Matrix_Battery_Top_Thread_Int_Int")) {
                            ob0.a3 a3Var = (ob0.a3) i95.n0.c(ob0.a3.class);
                            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            java.lang.String value = uqVar.f89660c;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1) a3Var).Ri(context2, java.lang.Integer.parseInt(value));
                            break;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
