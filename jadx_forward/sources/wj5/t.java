package wj5;

/* loaded from: classes9.dex */
public final class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.u f528373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj5.h f528374e;

    public t(wj5.u uVar, xj5.h hVar) {
        this.f528373d = uVar;
        this.f528374e = hVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27193, 1, 3);
            h45.s sVar = (h45.s) i95.n0.c(h45.s.class);
            java.lang.String x17 = this.f528373d.f528375e.x();
            xj5.h hVar = this.f528374e;
            ((li3.g) sVar).Ni(x17, hVar.f536438u);
            hVar.f536430e = 3;
        }
    }
}
