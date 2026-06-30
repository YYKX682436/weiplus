package uf;

/* loaded from: classes7.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f508621d;

    public p1(uf.c2 c2Var) {
        this.f508621d = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uf.c2 c2Var = this.f508621d;
        if (c2Var.e() && c2Var.f508530g != null) {
            uf.v1 v1Var = c2Var.f508533m;
            if (v1Var != null) {
                v1Var.m8146xced61ae5();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recycleViewAdapter");
                throw null;
            }
        }
    }
}
