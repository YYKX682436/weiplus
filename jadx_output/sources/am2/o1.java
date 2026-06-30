package am2;

/* loaded from: classes3.dex */
public final class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.s1 f8723d;

    public o1(am2.s1 s1Var) {
        this.f8723d = s1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        am2.s1 s1Var = this.f8723d;
        s1Var.f8747c.offerLast(am2.s1.b(s1Var, am2.h3.f8686i, 0, 2, null));
        am2.e1.f8657a.a(s1Var.f8747c, false);
        return true;
    }
}
