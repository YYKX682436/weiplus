package fi5;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f344602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi5.f f344603e;

    public b(java.lang.Runnable runnable, fi5.f fVar) {
        this.f344602d = runnable;
        this.f344603e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f344602d.run();
        fi5.f fVar = this.f344603e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(fVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, fVar.m158354x19263085(), null, null);
    }
}
