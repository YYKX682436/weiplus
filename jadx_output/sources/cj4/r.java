package cj4;

/* loaded from: classes11.dex */
public final class r implements bk4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f42024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f42026c;

    public r(cj4.a0 a0Var, android.view.View view, bk4.c2 c2Var) {
        this.f42024a = a0Var;
        this.f42025b = view;
        this.f42026c = c2Var;
    }

    @Override // bk4.l1
    public void onChange(int i17) {
        cj4.a0 a0Var = this.f42024a;
        java.lang.String str = a0Var.D1;
        bk4.c2 c2Var = this.f42026c;
        if (c2Var != null) {
            c2Var.f21420k = null;
        }
        a0Var.S(i17);
    }
}
