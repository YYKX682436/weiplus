package iy2;

/* loaded from: classes13.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 f377433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f377434e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4, int i17) {
        this.f377433d = c15488x2a0085b4;
        this.f377434e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.b bVar = this.f377433d.C;
        if (bVar != null) {
            bVar.f377411q = this.f377434e < 28;
            bVar.invalidateSelf();
        }
    }
}
