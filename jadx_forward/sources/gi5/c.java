package gi5;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f353830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi5.g f353831e;

    public c(java.lang.Runnable runnable, gi5.g gVar) {
        this.f353830d = runnable;
        this.f353831e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f353830d.run();
        gi5.g gVar = this.f353831e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(gVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, gVar.m158354x19263085(), null, null);
    }
}
