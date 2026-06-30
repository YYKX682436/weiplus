package zh1;

/* loaded from: classes8.dex */
public final class e0 implements db5.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh1.r0 f554409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 f554410b;

    public e0(zh1.r0 r0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2) {
        this.f554409a = r0Var;
        this.f554410b = c12475x7cfc32b2;
    }

    @Override // db5.v4
    public final void a(android.view.MenuItem menuItem, android.view.View view) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        zh1.r0 r0Var = this.f554409a;
        if (zh1.r0.a(r0Var, view)) {
            di1.f fVar = r0Var.f554485m;
            fVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 openMaterialModel = this.f554410b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialModel, "openMaterialModel");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f314174m, "onBottomSheetAppBrandExposure");
            java.util.HashSet hashSet = fVar.f314170i;
            if (hashSet.contains(openMaterialModel)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = fVar.f314164c;
            long indexOf = ((c12473xe2bfc4b5 == null || (list = c12473xe2bfc4b5.f167784f) == null) ? 0 : list.indexOf(openMaterialModel)) + 1;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7175x339f1fd6 c7175x339f1fd6 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7175x339f1fd6) fVar.f314167f.mo141623x754a37bb();
            c7175x339f1fd6.f144742d = c7175x339f1fd6.b("session", fVar.f314173l, true);
            c7175x339f1fd6.f144747i = fVar.f314162a;
            c7175x339f1fd6.f144748j = 2L;
            c7175x339f1fd6.f144743e = 1L;
            c7175x339f1fd6.f144746h = indexOf;
            c7175x339f1fd6.f144744f = c7175x339f1fd6.b("weapp_id", openMaterialModel.f167795d, true);
            java.lang.String str = openMaterialModel.f167800i;
            if (str == null) {
                str = "";
            }
            c7175x339f1fd6.f144745g = c7175x339f1fd6.b("weapp_name", str, true);
            c7175x339f1fd6.k();
            hashSet.add(openMaterialModel);
        }
    }
}
