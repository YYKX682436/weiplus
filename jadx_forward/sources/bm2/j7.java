package bm2;

/* loaded from: classes10.dex */
public final class j7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f103549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f103551f;

    public j7(bm2.k7 k7Var, int i17, r45.yx1 yx1Var) {
        this.f103549d = k7Var;
        this.f103550e = i17;
        this.f103551f = yx1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            bm2.k7 k7Var = this.f103549d;
            k7Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Delete song position ");
            int i18 = this.f103550e;
            sb6.append(i18);
            sb6.append(", ");
            r45.yx1 yx1Var = this.f103551f;
            sb6.append(yx1Var.f472992e);
            sb6.append(", name ");
            sb6.append(yx1Var.f472999o.f452676d.f451884e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongPlayListAdapter", sb6.toString());
            java.util.ArrayList arrayList = (java.util.ArrayList) k7Var.f103578q;
            arrayList.remove(i18);
            k7Var.m8155x27702c4(i18);
            k7Var.m8151xc67946d3(i18, arrayList.size() - i18);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = k7Var.f103576o;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bm2.h7(k7Var, yx1Var, null), 3, null);
            }
        }
    }
}
