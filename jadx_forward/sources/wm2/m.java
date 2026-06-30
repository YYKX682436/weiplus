package wm2;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm2.n f528782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f528783e;

    public m(wm2.n nVar, boolean z17) {
        this.f528782d = nVar;
        this.f528783e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wm2.n nVar = this.f528782d;
        nVar.c();
        yz5.l lVar = nVar.f528792i;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(this.f528783e));
        }
    }
}
