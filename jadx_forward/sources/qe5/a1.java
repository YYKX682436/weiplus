package qe5;

/* loaded from: classes3.dex */
public final class a1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f443603d;

    public a1(qe5.n1 n1Var) {
        this.f443603d = n1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = this.f443603d.P6();
        if (P6 == null) {
            return true;
        }
        P6.finish();
        return true;
    }
}
