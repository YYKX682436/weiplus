package yw;

/* loaded from: classes11.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.q0 f547962a = new yw.q0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f547963b;

    /* renamed from: c, reason: collision with root package name */
    public static jz5.l f547964c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f547965d;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        f547963b = R;
        f547964c = new jz5.l("", 0);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f547965d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5192x4c17a6dc>(a0Var) { // from class: com.tencent.mm.feature.brandservice.flutter.BizFlutterDigestHelper$bizCreationCenterInfoUpdateEvent$1
            {
                this.f39173x3fe91575 = -694955796;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5192x4c17a6dc c5192x4c17a6dc) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5192x4c17a6dc event = c5192x4c17a6dc;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                yw.q0.b(yw.q0.f547962a, yw.d0.f547826g, null, 2, null);
                return false;
            }
        };
    }

    public static /* synthetic */ void b(yw.q0 q0Var, yw.d0 d0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            d0Var = yw.d0.f547831o;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        q0Var.a(d0Var, str);
    }

    public final void a(yw.d0 scene, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (!z40.e.l4()) {
            ((ku5.t0) ku5.t0.f394148d).h(new yw.m0(scene, str), "BizDigestUpdateThread");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDigestHelper", "use Finder exp, skip UpdateBizMainCell");
        z40.e eVar = z40.e.get();
        java.lang.String str2 = scene.f547833d;
        ((y40.i0) eVar).getClass();
        a50.a aVar = a50.a.f82978h;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "BizFlutterPersonalCenterRedDotMgr.subscribePersonalCenterEvent")) {
            aVar = a50.a.f82975e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "OnBizInfoChange.onNotifyChange")) {
                aVar = a50.a.f82979i;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "BizProcessorCommand.addFinderRedDot")) {
                    return;
                }
            }
        }
        a50.j0.f83029a.a(aVar, str);
    }

    public final int c() {
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

    public final boolean d(long j17) {
        long min = java.lang.Math.min(c01.id.c(), j17);
        long c17 = c01.id.c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f547963b;
        boolean i17 = o4Var.i("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDigestHelper", "needUpdateConv: isLastHideBoxWhenDeleteAndKeepData=" + i17);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDigestHelper", sb6.toString());
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

    public final long e(com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17) {
        long Y;
        if (z17) {
            Y = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var).G(l4Var);
        } else {
            Y = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) l8Var).Y(l4Var, l4Var.h1(), true, true);
        }
        f547963b.B("mmkvKeyBrandTimelineSessionChangeValidatorForHideBoxWhenDeleteAndKeepData", l4Var.w0());
        return Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x02c2, code lost:
    
        if ((r1.length() > 0) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if ((r1.length() > 0) != false) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.p314xaae8f345.mm.p2621x8fb0427b.l4 r11, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f1 r12) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw.q0.f(com.tencent.mm.storage.l4, com.tencent.wechat.mm.biz.f1):void");
    }

    public final void g(long j17, boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f547963b;
        if (o4Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
            com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275266r = j17;
            com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275268t = z17;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.a1.G = str;
            o4Var.B("BizLastMsgId", j17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizFlutterDigestHelper", "updateLastDigestInfo failed! mmkv is null");
    }

    public final void i(int i17) {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n5z, java.lang.Integer.valueOf(i17), "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        f547964c = new jz5.l(string, 4);
    }

    public final void g(long j17, dw5.b bVar, int i17, long j18, int i18) {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDigestHelper", sb6.toString());
        long j19 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.C;
        dw5.b bVar2 = dw5.b.TYPE_SERVER_ASSIGN;
        if (j17 != j19) {
            if (bVar == bVar2) {
                a1Var.z(com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275244m, "officialaccounts");
            } else {
                a1Var.z(com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275243i, "officialaccounts");
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.C = j17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f547963b;
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
}
