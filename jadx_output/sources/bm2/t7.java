package bm2;

/* loaded from: classes3.dex */
public final class t7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.w7 f22333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.u7 f22334e;

    public t7(bm2.w7 w7Var, bm2.u7 u7Var) {
        this.f22333d = w7Var;
        this.f22334e = u7Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        yz5.l lVar;
        if (i17 != 0 || (lVar = this.f22333d.f22419g) == null) {
            return;
        }
        lVar.invoke(this.f22334e.f22355f);
    }
}
