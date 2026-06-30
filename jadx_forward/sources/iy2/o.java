package iy2;

/* loaded from: classes13.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 f377436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f377437e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4, boolean z17) {
        this.f377436d = c15488x2a0085b4;
        this.f377437e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.b bVar = this.f377436d.C;
        if (bVar != null) {
            if (!this.f377437e) {
                bVar.f377413s = 3;
            }
            bVar.f377411q = true;
            bVar.invalidateSelf();
        }
    }
}
