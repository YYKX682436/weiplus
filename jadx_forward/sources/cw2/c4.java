package cw2;

/* loaded from: classes10.dex */
public final class c4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b f305148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b) {
        super(0);
        this.f305148d = c15182x1607686b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae883;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae884;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = this.f305148d;
        java.lang.Object obj = null;
        if (c15182x1607686b.f212154y0) {
            kd2.r1 r1Var = c15182x1607686b.f212131J;
            if (r1Var != null) {
                kd2.p1 p1Var = (kd2.p1) ((kd2.c0) r1Var).f388244a.f388257a;
                if (p1Var.M0()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLivePlayerPause, feedId: ");
                    kd2.q0 q0Var = p1Var.C;
                    if (q0Var != null && (c14989xf862ae883 = q0Var.f388339g) != null) {
                        obj = java.lang.Long.valueOf(c14989xf862ae883.getFeedId());
                    }
                    sb6.append(obj);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", sb6.toString());
                    p1Var.k0().m58249xa2fbf520(false);
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("currFeed mediaType: ");
                    kd2.q0 q0Var2 = p1Var.C;
                    if (q0Var2 != null && (c14989xf862ae884 = q0Var2.f388339g) != null) {
                        obj = java.lang.Integer.valueOf(c14989xf862ae884.getMediaType());
                    }
                    sb7.append(obj);
                    sb7.append(", not live feed");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", sb7.toString());
                }
            }
        } else {
            kd2.r1 r1Var2 = c15182x1607686b.f212131J;
            if (r1Var2 != null) {
                kd2.p1 p1Var2 = (kd2.p1) ((kd2.c0) r1Var2).f388244a.f388257a;
                if (p1Var2.M0()) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onLivePlayerPlay, feedId: ");
                    kd2.q0 q0Var3 = p1Var2.C;
                    if (q0Var3 != null && (c14989xf862ae88 = q0Var3.f388339g) != null) {
                        obj = java.lang.Long.valueOf(c14989xf862ae88.getFeedId());
                    }
                    sb8.append(obj);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", sb8.toString());
                    p1Var2.k0().m58249xa2fbf520(true);
                } else {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("currFeed mediaType: ");
                    kd2.q0 q0Var4 = p1Var2.C;
                    if (q0Var4 != null && (c14989xf862ae882 = q0Var4.f388339g) != null) {
                        obj = java.lang.Integer.valueOf(c14989xf862ae882.getMediaType());
                    }
                    sb9.append(obj);
                    sb9.append(", not live feed");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", sb9.toString());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
