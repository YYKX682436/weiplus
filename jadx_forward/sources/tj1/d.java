package tj1;

/* loaded from: classes7.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f501224d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f501224d = c11510xdd90c2f2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandTranslateLogic", "onMenuSelected index:" + i17);
        if (i17 == 0) {
            tj1.o oVar = new tj1.o();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = this.f501224d.C0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C0, "getService(...)");
            oVar.x(C0, 1);
        }
    }
}
