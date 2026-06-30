package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k0 f197118a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.l f197119b = new kk.l(1000);

    public final r45.i52 a(java.lang.String coverUrl) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        r45.i52 i52Var = (r45.i52) f197119b.get(coverUrl);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getStatus] status:");
        if (i52Var == null || (obj = pm0.b0.g(i52Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        sb6.append(", url:");
        sb6.append(coverUrl);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedPacketCache", sb6.toString());
        return i52Var;
    }
}
