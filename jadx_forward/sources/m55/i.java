package m55;

/* loaded from: classes10.dex */
public final class i extends m55.b {
    @Override // m55.b
    public java.lang.Object d(og3.d dVar, og3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17;
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) kz5.n0.X(dVar.f426692a)).f230143e, true);
        if (d17 != null) {
            int i18 = d17.f243917c;
            int i19 = d17.f243918d;
            int i27 = d17.f243928n;
            if (i27 != 90 && i27 != 270) {
                z17 = false;
            }
            if (z17) {
                i17 = i18;
                i18 = i19;
            } else {
                i17 = i19;
            }
            if (i18 > i17) {
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = eVar.f426694a;
                int i28 = c11120x15dce88d.f152725e;
                if (i18 <= i28) {
                    i28 = i18;
                }
                int i29 = (i19 * i28) / i18;
                c11120x15dce88d.f152724d = i28;
                c11120x15dce88d.f152725e = i29;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoNotCropRemuxChain", "VideoNotCropRemuxChain make size:" + i28 + ' ' + i29);
            } else {
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = eVar.f426694a;
                int i37 = c11120x15dce88d2.f152725e;
                if (i17 <= i37) {
                    i37 = i17;
                }
                int i38 = (i18 * i37) / i17;
                c11120x15dce88d2.f152724d = i38;
                c11120x15dce88d2.f152725e = i37;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoNotCropRemuxChain", "VideoNotCropRemuxChain make size:" + i38 + ' ' + i37);
            }
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(og3.h.f426699f, 0, null, null, 12, null);
    }
}
