package zh1;

/* loaded from: classes8.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f554453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.c1 f554454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f554455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 f554456g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, zh1.c1 c1Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        super(1);
        this.f554453d = k0Var;
        this.f554454e = c1Var;
        this.f554455f = context;
        this.f554456g = c12473xe2bfc4b5;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 openMaterialModel = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialModel, "openMaterialModel");
        this.f554453d.u();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "itemClickAction, appBrandLauncher is null");
        } else {
            this.f554454e.a(new zh1.m0(h6Var, this.f554455f, this.f554456g, openMaterialModel));
        }
        return jz5.f0.f384359a;
    }
}
