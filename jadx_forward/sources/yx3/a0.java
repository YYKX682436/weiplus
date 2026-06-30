package yx3;

/* loaded from: classes15.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.e0 f549422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx3.y f549423e;

    public a0(yx3.e0 e0Var, yx3.y yVar) {
        this.f549422d = e0Var;
        this.f549423e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx3.e0 e0Var = this.f549422d;
        m8.i0 i0Var = e0Var.f549435a;
        if (i0Var != null) {
            i0Var.n();
        }
        m8.i0 i0Var2 = e0Var.f549435a;
        if (i0Var2 != null) {
            i0Var2.mo146927x41012807();
        }
        yx3.y yVar = this.f549423e;
        if (yVar != null) {
            yVar.mo149901xa6db431b();
        }
        if (yVar != null) {
            yVar.b();
        }
    }
}
