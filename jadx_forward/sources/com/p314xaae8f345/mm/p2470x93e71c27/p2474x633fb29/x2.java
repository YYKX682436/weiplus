package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes10.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 f271031a = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2();

    /* renamed from: b, reason: collision with root package name */
    public d11.n f271032b;

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a(java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 z2Var) {
        d11.v[] uj6;
        int b17;
        boolean z17;
        if (d11.s.fj().Ni(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportFavVideo", "check remuxing, this video had wx meta do not remuxing. %s ", str);
            c19767x257d7f.f38864x6ac9171 = 1;
            return null;
        }
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a17 = com.p314xaae8f345.mm.p962x4177e4be.j.a(str);
        boolean h17 = com.p314xaae8f345.mm.p962x4177e4be.j.h(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportFavVideo", "check remuxing old para %s", a17);
        d11.s fj6 = d11.s.fj();
        fj6.getClass();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Ui = fj6.Ui(a17.f152728h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            if (fj6.f307220v == null) {
                fj6.f307220v = fj6.tj("C2CAlbumVideoStepConfig");
            }
            uj6 = fj6.f307220v;
        } else {
            uj6 = fj6.uj("");
        }
        d11.a aVar = fj6.f307205d;
        if (uj6 != null) {
            for (d11.v vVar : uj6) {
                if (vVar != null && vVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to calc c2c album config.");
                    b17 = aVar.b(vVar.f307232g, a17, Ui);
                    z17 = vVar.f307231f;
                    break;
                }
            }
            b17 = 0;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it not busy time, try to calc c2c album default config.");
            b17 = aVar.b(null, a17, Ui);
        }
        z17 = true;
        if (b17 <= 0) {
            Ui = fj6.Ui(a17.f152728h);
        } else {
            Ui.f152736s = false;
        }
        fj6.aj(Ui, 1);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, 2L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, 1L, 1L, false);
        }
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(Ui.f152727g / 1000, new int[]{com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a, 544, 800, 1200, 1600}, 3, 8));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, q17, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "get c2c album para cost %d rpt %d. bitrate %d new para %s, original para %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(q17), java.lang.Integer.valueOf(b17), Ui, a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportFavVideo", "check remuxing new para %s", Ui);
        int[] c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.c(str, Ui, z2Var);
        int i17 = c17[0];
        Ui.f152727g = i17;
        Ui.f152724d = c17[1];
        Ui.f152725e = c17[2];
        Ui.M = c17[3] / 100.0f;
        Ui.N = c17[4];
        int i18 = a17.f152727g;
        if (i18 <= 640000 || i17 > i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportFavVideo", "new bitrate is bigger than old bitrate %s %s", Ui, a17);
            if (h17) {
                c19767x257d7f.f38864x6ac9171 = 1;
                return null;
            }
        }
        if (Ui.f152724d > 0 && Ui.f152725e > 0) {
            c19767x257d7f.f38864x6ac9171 = 0;
            return Ui;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportFavVideo", "para.width or height is 0:" + Ui.f152724d + ", " + Ui.f152725e);
        c19767x257d7f.f38864x6ac9171 = -5;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r19, java.lang.String r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x2.b(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r19, java.lang.String r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x2.c(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r34, java.lang.String r35, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r36, boolean r37, boolean r38, long r39, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r41) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x2.d(java.lang.String, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, boolean, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r22, java.lang.String r23, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r24, boolean r25, boolean r26, long r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r29) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x2.e(java.lang.String, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, boolean, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
