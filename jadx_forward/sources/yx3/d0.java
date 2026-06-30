package yx3;

/* loaded from: classes15.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.e0 f549431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx3.y f549432e;

    public d0(yx3.e0 e0Var, yx3.y yVar) {
        this.f549431d = e0Var;
        this.f549432e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx3.e0 e0Var = this.f549431d;
        m8.i0 i0Var = e0Var.f549435a;
        if (i0Var != null) {
            i0Var.n();
        }
        m8.i0 i0Var2 = e0Var.f549435a;
        if (i0Var2 != null) {
            i0Var2.mo146927x41012807();
        }
        yx3.y yVar = this.f549432e;
        if (yVar != null) {
            yVar.b();
        }
    }
}
