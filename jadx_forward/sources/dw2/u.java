package dw2;

/* loaded from: classes2.dex */
public final class u implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 f325699d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 c15205x28f20815) {
        this.f325699d = c15205x28f20815;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = it.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 c15205x28f20815 = this.f325699d;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "data change to check play...");
            c15205x28f20815.I0(c15205x28f20815.f212308h, false);
        } else if (i17 == 2) {
            java.lang.Object obj = it.obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((java.lang.Long) obj).longValue();
            c15205x28f20815.getClass();
            if (longValue == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815.f212306z) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "feedId:" + longValue + " no eqauls current center feed");
            }
        }
        return true;
    }
}
