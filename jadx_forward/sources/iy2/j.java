package iy2;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 f377430d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4) {
        this.f377430d = c15488x2a0085b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.b bVar = this.f377430d.C;
        if (bVar != null) {
            bVar.f377413s = 5;
            bVar.f377414t.cancel();
            bVar.invalidateSelf();
        }
    }
}
