package aw2;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.c0 f14805d;

    public x(aw2.c0 c0Var) {
        this.f14805d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aw2.c0 c0Var = this.f14805d;
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) c0Var.f14726f).getValue()).f();
        c0Var.f14724d.showVKB();
    }
}
