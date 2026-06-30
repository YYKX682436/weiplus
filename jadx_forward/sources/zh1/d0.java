package zh1;

/* loaded from: classes8.dex */
public final class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.r0 f554405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 f554406e;

    public d0(zh1.r0 r0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2) {
        this.f554405d = r0Var;
        this.f554406e = c12475x7cfc32b2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        zh1.y0 y0Var = zh1.y0.ENABLE;
        zh1.r0 r0Var = this.f554405d;
        int i17 = 0;
        if (y0Var != r0Var.f554468o.f554396a) {
            return false;
        }
        di1.f fVar = r0Var.f554485m;
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 openMaterialModel = this.f554406e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialModel, "openMaterialModel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f314174m, "onBottomSheetAppBrandClick");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = fVar.f314164c;
        if (c12473xe2bfc4b5 != null && (list = c12473xe2bfc4b5.f167784f) != null) {
            i17 = list.indexOf(openMaterialModel);
        }
        long j17 = i17 + 1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7127x99e920dc c17 = fVar.c();
        c17.p(fVar.f314173l);
        c17.f144437k = fVar.f314162a;
        c17.f144431e = 6L;
        c17.f144432f = fVar.a();
        c17.f144433g = fVar.b();
        c17.f144434h = j17;
        c17.f144435i = c17.b("weapp_id", openMaterialModel.f167795d, true);
        java.lang.String str = openMaterialModel.f167800i;
        if (str == null) {
            str = "";
        }
        c17.f144436j = c17.b("weapp_name", str, true);
        c17.k();
        ((yz5.l) ((jz5.n) r0Var.f554470q).mo141623x754a37bb()).mo146xb9724478(openMaterialModel);
        return true;
    }
}
