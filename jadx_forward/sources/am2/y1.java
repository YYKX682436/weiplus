package am2;

/* loaded from: classes3.dex */
public final class y1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.e2 f90309d;

    public y1(am2.e2 e2Var) {
        this.f90309d = e2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.ai1 ai1Var = new r45.ai1();
        ai1Var.set(0, java.lang.Integer.valueOf(c01.id.e()));
        ai1Var.set(1, "太好听了");
        ai1Var.set(2, 10);
        ai1Var.set(3, 60);
        ai1Var.set(4, 69);
        am2.e2.a(this.f90309d, ai1Var);
        return true;
    }
}
