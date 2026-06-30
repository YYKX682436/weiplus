package zh5;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f554596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.v f554597e;

    public r(java.lang.Runnable runnable, zh5.v vVar) {
        this.f554596d = runnable;
        this.f554597e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f554596d.run();
        zh5.v vVar = this.f554597e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(vVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, vVar.m158354x19263085(), null, null);
    }
}
