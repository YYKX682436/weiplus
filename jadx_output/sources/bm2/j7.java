package bm2;

/* loaded from: classes10.dex */
public final class j7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f22016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f22018f;

    public j7(bm2.k7 k7Var, int i17, r45.yx1 yx1Var) {
        this.f22016d = k7Var;
        this.f22017e = i17;
        this.f22018f = yx1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            bm2.k7 k7Var = this.f22016d;
            k7Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Delete song position ");
            int i18 = this.f22017e;
            sb6.append(i18);
            sb6.append(", ");
            r45.yx1 yx1Var = this.f22018f;
            sb6.append(yx1Var.f391459e);
            sb6.append(", name ");
            sb6.append(yx1Var.f391466o.f371143d.f370351e);
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongPlayListAdapter", sb6.toString());
            java.util.ArrayList arrayList = (java.util.ArrayList) k7Var.f22045q;
            arrayList.remove(i18);
            k7Var.notifyItemRemoved(i18);
            k7Var.notifyItemRangeChanged(i18, arrayList.size() - i18);
            kotlinx.coroutines.y0 y0Var = k7Var.f22043o;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new bm2.h7(k7Var, yx1Var, null), 3, null);
            }
        }
    }
}
