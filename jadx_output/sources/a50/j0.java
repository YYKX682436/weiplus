package a50;

/* loaded from: classes11.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a50.j0 f1496a = new a50.j0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f1497b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f1498c;

    static {
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        f1497b = R;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f1498c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizCreationCenterInfoUpdateEvent>(a0Var) { // from class: com.tencent.mm.feature.finderbox.flutter.BoxBizFlutterDigestHelper$bizCreationCenterInfoUpdateEvent$1
            {
                this.__eventId = -694955796;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BizCreationCenterInfoUpdateEvent bizCreationCenterInfoUpdateEvent) {
                com.tencent.mm.autogen.events.BizCreationCenterInfoUpdateEvent event = bizCreationCenterInfoUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                a50.j0.f1496a.a(a50.a.f1444g, null);
                return false;
            }
        };
    }

    public final void a(a50.a scene, java.lang.String str) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (!z40.e.l4()) {
            com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterDigestHelper", "Finder exp false, skip finder box doUpdateBizMainCell");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new a50.f0(scene, str), "BizDigestUpdateThread");
    }

    public final int b() {
        int f17 = r01.q3.oj().f();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        int i17 = 0;
        if (!su4.r2.l()) {
            ur1.j jVar = ur1.j.f430354a;
            if (ur1.n.f430361a.a()) {
                i17 = ur1.j.f430356c;
            }
        }
        return f17 + i17;
    }

    public final boolean c(long j17) {
        long min = java.lang.Math.min(c01.id.c(), j17);
        long c17 = c01.id.c();
        com.tencent.mm.sdk.platformtools.o4 o4Var = f1497b;
        boolean i17 = o4Var.i("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", false);
        com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterDigestHelper", "needUpdateConv: isLastHideBoxWhenDeleteAndKeepData=" + i17);
        if (i17) {
            long q17 = o4Var.q("mmkvKeyBrandTimelineSessionChangeValidatorForHideBoxWhenDeleteAndKeepData", 0L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needUpdateConv: lastChangeValidator=");
            sb6.append(q17);
            sb6.append(", convTime=");
            sb6.append(min);
            sb6.append(", serverTime=");
            sb6.append(c17);
            sb6.append(", isUpdate=");
            sb6.append(min > q17);
            com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterDigestHelper", sb6.toString());
            if (min > q17) {
                o4Var.G("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", false);
            } else {
                if (c17 <= 0 || q17 <= c17) {
                    return false;
                }
                o4Var.G("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", false);
            }
        }
        return true;
    }

    public final long d(com.tencent.mm.storage.l8 l8Var, com.tencent.mm.storage.l4 l4Var, boolean z17) {
        long Y;
        if (z17) {
            Y = ((com.tencent.mm.storage.m4) l8Var).G(l4Var);
        } else {
            Y = ((com.tencent.mm.storage.m4) l8Var).Y(l4Var, l4Var.h1(), true, true);
        }
        f1497b.B("mmkvKeyBrandTimelineSessionChangeValidatorForHideBoxWhenDeleteAndKeepData", l4Var.w0());
        return Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0336, code lost:
    
        if ((r1.length() > 0) != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if ((r1.length() > 0) != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0124, code lost:
    
        if ((r13.f219942m == 7) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.tencent.mm.storage.l4 r12, com.tencent.wechat.mm.finder_box.x0 r13) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a50.j0.e(com.tencent.mm.storage.l4, com.tencent.wechat.mm.finder_box.x0):void");
    }

    public final void f(long j17, cw5.b bVar, int i17, long j18, int i18) {
        java.lang.String c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLastDigestTime: lastDigestTime=");
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        sb6.append(com.tencent.mm.storage.a1.C);
        sb6.append(", curDigestTime=");
        sb6.append(j17);
        sb6.append(", bizBoxCovTimeType=");
        sb6.append(bVar);
        sb6.append(", notifyType=");
        sb6.append(i17);
        sb6.append(", msgId=");
        sb6.append(j18);
        sb6.append(", unreadNotifyMsgCount=");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterDigestHelper", sb6.toString());
        long j19 = com.tencent.mm.storage.a1.C;
        cw5.b bVar2 = cw5.b.BOX_TYPE_SERVER_ASSIGN;
        if (j17 != j19) {
            if (bVar == bVar2) {
                a1Var.z(com.tencent.mm.storage.a0.f193711m, "officialaccounts");
            } else {
                a1Var.z(com.tencent.mm.storage.a0.f193710i, "officialaccounts");
            }
        }
        com.tencent.mm.storage.a1.C = j17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = f1497b;
        o4Var.B("bizLastDigestTime", j17);
        boolean z17 = true;
        if (i17 == 1 || i17 == 2) {
            a1Var.A(com.tencent.mm.storage.f0.f193901m);
            com.tencent.mm.storage.g0[] g0VarArr = com.tencent.mm.storage.g0.f193942e;
            com.tencent.mm.storage.a1.f193736u = 1;
        } else if (i17 == 4) {
            if (i18 > 0) {
                if (j18 != -1) {
                    com.tencent.wechat.mm.biz.f1 h17 = a1Var.h(j18);
                    c17 = h17 != null ? h17.c() : null;
                    if (c17 != null && c17.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        a1Var.A(com.tencent.mm.storage.f0.f193902n);
                    }
                }
                a1Var.A(com.tencent.mm.storage.f0.f193903o);
            } else {
                if (j18 != -1) {
                    com.tencent.wechat.mm.biz.f1 h18 = a1Var.h(j18);
                    c17 = h18 != null ? h18.c() : null;
                    if (c17 != null && c17.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        a1Var.A(com.tencent.mm.storage.f0.f193898g);
                    }
                }
                a1Var.A(com.tencent.mm.storage.f0.f193899h);
            }
            if (bVar == bVar2) {
                com.tencent.mm.storage.g0[] g0VarArr2 = com.tencent.mm.storage.g0.f193942e;
                com.tencent.mm.storage.a1.f193736u = 3;
            } else {
                com.tencent.mm.storage.g0[] g0VarArr3 = com.tencent.mm.storage.g0.f193942e;
                com.tencent.mm.storage.a1.f193736u = 2;
            }
        }
        o4Var.A("bizLastDigestTimeType", com.tencent.mm.storage.a1.f193736u);
    }

    public final void g(long j17, boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f1497b;
        if (o4Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.BoxBizFlutterDigestHelper", "updateLastMsgId failed! mmkv is null");
            return;
        }
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        com.tencent.mm.storage.a1.f193733r = j17;
        com.tencent.mm.storage.a1.f193735t = z17;
        o4Var.B("BizLastMsgId", j17);
    }
}
