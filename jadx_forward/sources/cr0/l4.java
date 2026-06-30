package cr0;

/* loaded from: classes12.dex */
public final class l4 extends gi.d1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cr0.o4 f303212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(cr0.o4 o4Var, qh.f0 f0Var) {
        super(f0Var, "shell");
        this.f303212b = o4Var;
    }

    @Override // gi.d1
    public void a() {
        f(this.f303212b.f303234a);
        b(true, false);
        c();
        e();
        g(r0.f303235b * 1000);
        rh.c1 c1Var = this.f353554a;
        c1Var.H(rh.w1.class, r0.f303235b * 1000);
        c1Var.H(rh.l3.class, r0.f303235b * 1000);
        c1Var.F(oh.b.class);
        c1Var.H(rh.r1.class, r0.f303235b * 1000);
        c1Var.H(oh.c.class, r0.f303235b * 1000);
        c1Var.H(rh.t1.class, r0.f303235b * 1000);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            c1Var.H(rh.c2.class, r0.f303235b * 1000);
        }
        if (pj.h.f436442a) {
            c1Var.H(gi.l.class, r0.f303235b * 1000);
        }
    }
}
