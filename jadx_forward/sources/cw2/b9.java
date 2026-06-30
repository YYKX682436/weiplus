package cw2;

/* loaded from: classes2.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f305138e;

    public b9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, boolean z17) {
        this.f305137d = c15196x85976f5f;
        this.f305138e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305137d;
        yz5.p videoPauseCallback = c15196x85976f5f.getVideoPauseCallback();
        if (videoPauseCallback != null) {
            videoPauseCallback.mo149xb9724478(java.lang.Boolean.valueOf(this.f305138e), c15196x85976f5f.getPlayInfo());
        }
        c15196x85976f5f.getClass();
    }
}
