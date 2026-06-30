package ix3;

/* loaded from: classes.dex */
public final class c5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i5 f376914d;

    public c5(ix3.i5 i5Var) {
        this.f376914d = i5Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = this.f376914d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
