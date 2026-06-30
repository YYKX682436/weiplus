package ix3;

/* loaded from: classes.dex */
public final class r2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.y2 f377076d;

    public r2(ix3.y2 y2Var) {
        this.f377076d = y2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = this.f377076d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
