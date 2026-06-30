package uy3;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f513472e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7, int i17) {
        this.f513471d = abstractC17267x816864c7;
        this.f513472e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uy3.t tVar = this.f513471d.f240220i;
        if (tVar != null) {
            ((uy3.j0) tVar).m170709xf0b10c72(this.f513472e);
        }
    }
}
