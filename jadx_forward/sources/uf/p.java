package uf;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508619d;

    public p(uf.o0 o0Var) {
        this.f508619d = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uf.c2 c2Var = this.f508619d.f508596f;
        if (c2Var != null) {
            if (c2Var != null) {
                c2Var.f();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
                throw null;
            }
        }
    }
}
