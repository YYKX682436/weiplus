package ix3;

/* loaded from: classes.dex */
public final class u1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.z1 f377104d;

    public u1(ix3.z1 z1Var) {
        this.f377104d = z1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = this.f377104d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
