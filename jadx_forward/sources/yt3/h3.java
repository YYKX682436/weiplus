package yt3;

/* loaded from: classes3.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f547013d;

    public h3(yt3.r3 r3Var) {
        this.f547013d = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yt3.r3 r3Var = this.f547013d;
        r3Var.f547162g.animate().alpha(0.0f).withEndAction(new yt3.g3(r3Var)).start();
    }
}
