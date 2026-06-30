package dw2;

/* loaded from: classes2.dex */
public final class r implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 f325695d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 c15204x9dd9b8b0) {
        this.f325695d = c15204x9dd9b8b0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "data change to check play...");
            int i17 = it.arg1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 c15204x9dd9b8b0 = this.f325695d;
            c15204x9dd9b8b0.getClass();
            c15204x9dd9b8b0.f212294h.post(new dw2.p(c15204x9dd9b8b0, i17));
        }
        return true;
    }
}
