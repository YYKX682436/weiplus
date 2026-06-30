package am2;

/* loaded from: classes3.dex */
public final class h1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.s1 f90212d;

    public h1(am2.s1 s1Var) {
        this.f90212d = s1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        am2.s1 s1Var = this.f90212d;
        s1Var.f90280c.offerLast(am2.s1.b(s1Var, am2.h3.f90224q, 0, 2, null));
        am2.e1.f90190a.a(s1Var.f90280c, false);
        return true;
    }
}
