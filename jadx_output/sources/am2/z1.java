package am2;

/* loaded from: classes3.dex */
public final class z1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.e2 f8781d;

    public z1(am2.e2 e2Var) {
        this.f8781d = e2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.ai1 ai1Var = new r45.ai1();
        ai1Var.set(0, java.lang.Integer.valueOf(c01.id.e()));
        ai1Var.set(1, "太好听了");
        ai1Var.set(2, 1);
        ai1Var.set(3, 100);
        ai1Var.set(4, 130);
        am2.e2.a(this.f8781d, ai1Var);
        return true;
    }
}
