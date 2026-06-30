package fl1;

/* loaded from: classes7.dex */
public abstract class p1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f345375d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f345376e;

    /* renamed from: f, reason: collision with root package name */
    public final fl1.r1 f345377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.view.View view, java.util.List items, fl1.r1 itemAdapter) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemAdapter, "itemAdapter");
        this.f345375d = view;
        this.f345376e = items;
        this.f345377f = itemAdapter;
    }

    public abstract void i(fl1.h1 h1Var);

    public final void j(boolean z17, fl1.h1 h1Var) {
        fl1.i1 i1Var;
        int size = this.f345376e.size();
        fl1.r1 r1Var = this.f345377f;
        if (size == 1) {
            k(true);
            if (!z17 || (i1Var = r1Var.f345385e) == null) {
                return;
            }
            i1Var.a(h1Var);
            return;
        }
        if (!z17) {
            k(false);
            return;
        }
        fl1.i1 i1Var2 = r1Var.f345385e;
        if (i1Var2 != null) {
            i1Var2.a(h1Var);
        }
        k(true);
    }

    public abstract void k(boolean z17);
}
