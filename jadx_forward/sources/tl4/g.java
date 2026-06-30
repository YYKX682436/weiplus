package tl4;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl4.h f501840d;

    public g(tl4.h hVar) {
        this.f501840d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b66.g gVar;
        b66.n a17;
        tl4.h hVar = this.f501840d;
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = hVar.f501843c;
        if (((c26845xac206036 == null || (gVar = (b66.g) c26845xac206036.m106052x32c52b()) == null || (a17 = ((b66.i) gVar).a()) == null) ? 0 : a17.i()) == 3) {
            hVar.f501841a.stopForeground(false);
        }
    }
}
