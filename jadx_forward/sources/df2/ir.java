package df2;

/* loaded from: classes10.dex */
public final class ir implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.h f311960e;

    public ir(df2.lt ltVar, dk2.h hVar) {
        this.f311959d = ltVar;
        this.f311960e = hVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        java.lang.String str = df2.lt.W;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "click dislike banner menu from share menu");
            df2.lt.e7(this.f311959d, this.f311960e, false);
        }
    }
}
