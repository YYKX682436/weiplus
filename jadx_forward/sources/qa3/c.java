package qa3;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa3.d f442573e;

    public c(java.lang.String str, qa3.d dVar) {
        this.f442572d = str;
        this.f442573e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(this.f442572d, null);
        qa3.d dVar = this.f442573e;
        java.lang.String str = dVar.f442569b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("null ");
        sb6.append(y17 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (y17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().L(y17);
        }
        qa3.o.f442584a.c(dVar.f442568a, true, "");
    }
}
