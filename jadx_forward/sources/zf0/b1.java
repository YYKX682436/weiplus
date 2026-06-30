package zf0;

/* loaded from: classes10.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final zf0.b1 f553918a = new zf0.b1();

    /* renamed from: b, reason: collision with root package name */
    public static final wf0.z1 f553919b = (wf0.z1) i95.n0.c(wf0.z1.class);

    /* renamed from: c, reason: collision with root package name */
    public static final wf0.e1 f553920c = (wf0.e1) i95.n0.c(wf0.e1.class);

    /* renamed from: d, reason: collision with root package name */
    public static final wf0.x1 f553921d = (wf0.x1) i95.n0.c(wf0.x1.class);

    public static final java.lang.Object a(zf0.b1 b1Var, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, java.lang.String str3, java.lang.String str4, zf0.a aVar, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b1Var.getClass();
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new zf0.z0(str, c17683x770f5025, c11120x15dce88d, str3, map, str2, str4, z17, lVar, aVar, null), interfaceC29045xdcb5ca57);
    }

    public static final void b(zf0.b1 b1Var, java.lang.String str, int[] iArr) {
        gp.d dVar;
        b1Var.getClass();
        int i17 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c;
        int i18 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        try {
            dVar = new gp.d();
            try {
                dVar.setDataSource(str);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
                iArr[0] = P;
                iArr[1] = P2;
                if (P > P2) {
                    if (P > 720) {
                        iArr[0] = 720;
                        iArr[1] = P > 0 ? (P2 * com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf) / P : 0;
                    }
                } else if (P2 > 720) {
                    iArr[0] = P2 > 0 ? (P * com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf) / P2 : 0;
                    iArr[1] = 720;
                }
                dVar.release();
                int i19 = iArr[0];
                if (i19 <= 0 || i19 % 2 != 0) {
                    if (i19 > 0) {
                        i18 = i19 + 1;
                    }
                    iArr[0] = i18;
                }
                int i27 = iArr[1];
                if (i27 <= 0 || i27 % 2 != 0) {
                    if (i27 > 0) {
                        i17 = i27 + 1;
                    }
                    iArr[1] = i17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.CompressUtils", "getImportProperRemuxingResolutionForC2C Width:%d Height:%d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoMsg.CompressUtils", "VFSMediaMetadataRetriever error", th);
                } finally {
                    if (dVar != null) {
                        dVar.release();
                    }
                    int i28 = iArr[0];
                    if (i28 <= 0 || i28 % 2 != 0) {
                        if (i28 > 0) {
                            i18 = i28 + 1;
                        }
                        iArr[0] = i18;
                    }
                    int i29 = iArr[1];
                    if (i29 <= 0 || i29 % 2 != 0) {
                        if (i29 > 0) {
                            i17 = i29 + 1;
                        }
                        iArr[1] = i17;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.CompressUtils", "getImportProperRemuxingResolutionForC2C Width:%d Height:%d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            dVar = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0480  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static vf0.e e(zf0.b1 r35, java.lang.String r36, java.lang.String r37, int r38, java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.b1.e(zf0.b1, java.lang.String, java.lang.String, int, java.lang.Object):vf0.e");
    }

    public final java.lang.Object f(java.lang.String str, boolean z17, boolean z18, java.lang.String str2, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, java.lang.String str3, java.lang.String str4, zf0.a aVar, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025, java.lang.String str5, yz5.l lVar, p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new zf0.a1(str, str2, str5, map, dVar, z17, z18, c11120x15dce88d, str3, str4, aVar, c17683x770f5025, lVar, null), interfaceC29045xdcb5ca57);
    }
}
