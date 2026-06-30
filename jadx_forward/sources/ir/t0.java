package ir;

/* loaded from: classes15.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f375434a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f375435b;

    /* renamed from: c, reason: collision with root package name */
    public ir.o0 f375436c;

    public abstract ir.k0 a();

    public abstract ir.k0 b();

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c(java.util.List oldItemList, java.util.List newItemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldItemList, "oldItemList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newItemList, "newItemList");
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new ir.p0(oldItemList, newItemList), false);
    }

    public final void d(ir.k0 newData, p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 diff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(diff, "diff");
        pm0.v.X(new ir.r0(this, newData, diff));
    }

    public final synchronized void e() {
        if (this.f375435b) {
            this.f375434a = true;
        } else {
            if (this.f375436c == null) {
                return;
            }
            this.f375435b = true;
            pm0.v.L("PanelGroupModel_postUpdate", true, new ir.s0(this));
        }
    }

    public abstract void f(ir.k0 k0Var);

    public final void g(ir.o0 o0Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375436c, o0Var)) {
            return;
        }
        this.f375436c = o0Var;
        if (o0Var != null) {
            e();
        }
    }

    public void h() {
        if (this.f375436c == null) {
            this.f375435b = false;
            this.f375434a = true;
        } else {
            ir.k0 a17 = a();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c17 = c(b().b(), a17.b());
            f(a17);
            d(a17, c17);
        }
    }
}
