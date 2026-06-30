package ck1;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f123843e;

    public c0(ck1.k0 k0Var, ck1.y0 y0Var) {
        this.f123842d = k0Var;
        this.f123843e = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck1.i0 i0Var = this.f123842d.f123873f;
        ck1.b0 b0Var = new ck1.b0(this.f123843e);
        i0Var.getClass();
        if (i0Var.f123866a) {
            return;
        }
        int intValue = ((java.lang.Number) b0Var.mo152xb9724478()).intValue();
        ck1.g gVar = (ck1.g) i0Var.f123867b;
        gVar.f123858a.i(new ck1.f(gVar.f123859b, intValue));
        i0Var.f123866a = true;
    }
}
