package ck1;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f42310e;

    public c0(ck1.k0 k0Var, ck1.y0 y0Var) {
        this.f42309d = k0Var;
        this.f42310e = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck1.i0 i0Var = this.f42309d.f42340f;
        ck1.b0 b0Var = new ck1.b0(this.f42310e);
        i0Var.getClass();
        if (i0Var.f42333a) {
            return;
        }
        int intValue = ((java.lang.Number) b0Var.invoke()).intValue();
        ck1.g gVar = (ck1.g) i0Var.f42334b;
        gVar.f42325a.i(new ck1.f(gVar.f42326b, intValue));
        i0Var.f42333a = true;
    }
}
