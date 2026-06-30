package am2;

/* loaded from: classes3.dex */
public final class w1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.e2 f8765d;

    public w1(am2.e2 e2Var) {
        this.f8765d = e2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.ai1 ai1Var = new r45.ai1();
        ai1Var.set(0, java.lang.Integer.valueOf(c01.id.e()));
        ai1Var.set(1, "太好听了");
        ai1Var.set(2, 3);
        ai1Var.set(3, 5);
        ai1Var.set(4, 8);
        am2.e2.a(this.f8765d, ai1Var);
        return true;
    }
}
