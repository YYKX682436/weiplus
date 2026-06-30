package a50;

/* loaded from: classes11.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a50.j0 f83029a = new a50.j0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f83030b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f83031c;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        f83030b = R;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f83031c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5192x4c17a6dc>(a0Var) { // from class: com.tencent.mm.feature.finderbox.flutter.BoxBizFlutterDigestHelper$bizCreationCenterInfoUpdateEvent$1
            {
                this.f39173x3fe91575 = -694955796;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5192x4c17a6dc c5192x4c17a6dc) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5192x4c17a6dc event = c5192x4c17a6dc;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                a50.j0.f83029a.a(a50.a.f82977g, null);
                return false;
            }
        };
    }

    public final void a(a50.a scene, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (!z40.e.l4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterDigestHelper", "Finder exp false, skip finder box doUpdateBizMainCell");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new a50.f0(scene, str), "BizDigestUpdateThread");
    }

    public final int b() {
        int f17 = r01.q3.oj().f();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        int i17 = 0;
        if (!su4.r2.l()) {
            ur1.j jVar = ur1.j.f511887a;
            if (ur1.n.f511894a.a()) {
                i17 = ur1.j.f511889c;
            }
        }
        return f17 + i17;
    }

    public final boolean c(long j17) {
        long min = java.lang.Math.min(c01.id.c(), j17);
        long c17 = c01.id.c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f83030b;
        boolean i17 = o4Var.i("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterDigestHelper", "needUpdateConv: isLastHideBoxWhenDeleteAndKeepData=" + i17);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterDigestHelper", sb6.toString());
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

    public final long d(com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17) {
        long Y;
        if (z17) {
            Y = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var).G(l4Var);
        } else {
            Y = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var).Y(l4Var, l4Var.h1(), true, true);
        }
        f83030b.B("mmkvKeyBrandTimelineSessionChangeValidatorForHideBoxWhenDeleteAndKeepData", l4Var.w0());
        return Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0336, code lost:
    
        if ((r1.length() > 0) != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if ((r1.length() > 0) != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0124, code lost:
    
        if ((r13.f301475m == 7) != false) goto L62;
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
    public final void e(com.p314xaae8f345.mm.p2621x8fb0427b.l4 r12, com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x0 r13) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a50.j0.e(com.tencent.mm.storage.l4, com.tencent.wechat.mm.finder_box.x0):void");
    }

    public final void f(long j17, cw5.b bVar, int i17, long j18, int i18) {
        java.lang.String c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLastDigestTime: lastDigestTime=");
        com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
        sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.a1.C);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxBizFlutterDigestHelper", sb6.toString());
        long j19 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.C;
        cw5.b bVar2 = cw5.b.BOX_TYPE_SERVER_ASSIGN;
        if (j17 != j19) {
            if (bVar == bVar2) {
                a1Var.z(com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275244m, "officialaccounts");
            } else {
                a1Var.z(com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275243i, "officialaccounts");
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.C = j17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f83030b;
        o4Var.B("bizLastDigestTime", j17);
        boolean z17 = true;
        if (i17 == 1 || i17 == 2) {
            a1Var.A(com.p314xaae8f345.mm.p2621x8fb0427b.f0.f275434m);
            com.p314xaae8f345.mm.p2621x8fb0427b.g0[] g0VarArr = com.p314xaae8f345.mm.p2621x8fb0427b.g0.f275475e;
            com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275269u = 1;
        } else if (i17 == 4) {
            if (i18 > 0) {
                if (j18 != -1) {
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f1 h17 = a1Var.h(j18);
                    c17 = h17 != null ? h17.c() : null;
                    if (c17 != null && c17.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        a1Var.A(com.p314xaae8f345.mm.p2621x8fb0427b.f0.f275435n);
                    }
                }
                a1Var.A(com.p314xaae8f345.mm.p2621x8fb0427b.f0.f275436o);
            } else {
                if (j18 != -1) {
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f1 h18 = a1Var.h(j18);
                    c17 = h18 != null ? h18.c() : null;
                    if (c17 != null && c17.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        a1Var.A(com.p314xaae8f345.mm.p2621x8fb0427b.f0.f275431g);
                    }
                }
                a1Var.A(com.p314xaae8f345.mm.p2621x8fb0427b.f0.f275432h);
            }
            if (bVar == bVar2) {
                com.p314xaae8f345.mm.p2621x8fb0427b.g0[] g0VarArr2 = com.p314xaae8f345.mm.p2621x8fb0427b.g0.f275475e;
                com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275269u = 3;
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.g0[] g0VarArr3 = com.p314xaae8f345.mm.p2621x8fb0427b.g0.f275475e;
                com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275269u = 2;
            }
        }
        o4Var.A("bizLastDigestTimeType", com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275269u);
    }

    public final void g(long j17, boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f83030b;
        if (o4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.BoxBizFlutterDigestHelper", "updateLastMsgId failed! mmkv is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275266r = j17;
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275268t = z17;
        o4Var.B("BizLastMsgId", j17);
    }
}
