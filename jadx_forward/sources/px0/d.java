package px0;

/* loaded from: classes5.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f440302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440303e;

    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc) {
        this.f440302d = k0Var;
        this.f440303e = c10988x551cb0cc;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        yx0.b8 f151090v;
        this.f440302d.u();
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc = this.f440303e;
        if (itemId != 1001) {
            if (itemId != 1002) {
                return;
            }
            c10988x551cb0cc.l0();
            c10988x551cb0cc.m0("aigc_give_up_generation_half_screen", true, "aigc_give_up_generation_clk", 1);
            return;
        }
        int i18 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc.f151175z;
        if (c10988x551cb0cc.m7481x7a6e8df6() && !c10988x551cb0cc.m7482xefa32bc() && !c10988x551cb0cc.m7489xb226ab8b()) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = c10988x551cb0cc.f151186q;
            if (c10977x8e40eced != null && (f151090v = c10977x8e40eced.getF151090v()) != null) {
                f151090v.p(com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f.UserAbandon);
            }
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = c10988x551cb0cc.m7454x171a637d().m7630xb2c12e75();
            m7630xb2c12e75.j(c10988x551cb0cc);
            m7630xb2c12e75.g();
            if (c10977x8e40eced != null) {
                c10977x8e40eced.J0();
            }
        }
        c10988x551cb0cc.m0("aigc_give_up_generation_half_screen", true, "aigc_give_up_generation_clk", 2);
    }
}
