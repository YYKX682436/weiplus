package wj3;

/* loaded from: classes14.dex */
public final class a implements uj3.b {

    /* renamed from: d, reason: collision with root package name */
    public int f528278d;

    /* renamed from: e, reason: collision with root package name */
    public final uj3.b0 f528279e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f528280f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f528281g;

    public a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f528278d = -1;
        this.f528280f = zj3.j.h();
        this.f528279e = new uj3.b0(context, this);
    }

    @Override // uj3.b
    public int b() {
        return 0;
    }

    @Override // uj3.b
    public boolean c() {
        return false;
    }

    @Override // uj3.b
    public boolean d() {
        return this.f528281g;
    }

    @Override // uj3.b
    public int e() {
        return this.f528278d;
    }

    @Override // uj3.b
    public void f(uj3.a status, android.os.Bundle bundle) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        boolean z18 = false;
        if (ordinal != 7) {
            if (ordinal != 8) {
                return;
            }
            this.f528281g = false;
            return;
        }
        if (this.f528280f || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().m().j()) {
            uj3.b0 b0Var = this.f528279e;
            if (b0Var != null) {
                android.view.ViewGroup viewGroup = b0Var.f509754i;
                if (viewGroup != null && viewGroup.getVisibility() == 0) {
                    z17 = true;
                    if (z17 || bundle == null) {
                    }
                    java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("avatar_available_speaker");
                    if (b0Var != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringArrayList);
                        b0Var.f(stringArrayList);
                        z18 = true;
                    }
                    this.f528281g = z18;
                    return;
                }
            }
            z17 = false;
            if (z17) {
            }
        }
    }

    public final void g(android.view.ViewGroup rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        rootView.removeAllViews();
        uj3.b0 b0Var = this.f528279e;
        if (b0Var != null) {
            b0Var.c(false);
        }
    }

    @Override // uj3.b
    /* renamed from: getCurrentStatus */
    public boolean mo168117x430e7715() {
        return false;
    }
}
