package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.p0 f172745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.p0 p0Var) {
        super(0);
        this.f172745d = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.p0 p0Var = this.f172745d;
        android.app.Activity r07 = p0Var.f172746a.r0();
        if (r07 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = p0Var.f172746a.u0().L1;
        c11816x5915d2c1.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig.f158916f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig2 = c11816x5915d2c1.f158895i;
        boolean z17 = false;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(closeWhenClickEmptyAreaConfig2, closeWhenClickEmptyAreaConfig)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5163xb50f8dbb c5163xb50f8dbb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5163xb50f8dbb();
            int hashCode = r07.hashCode();
            am.t tVar = c5163xb50f8dbb.f135513g;
            tVar.f89483a = hashCode;
            k91.s2 style = closeWhenClickEmptyAreaConfig2.f158918e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
            tVar.f89484b = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.n0.f172741a[style.ordinal()] == 1 ? com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7 : com.p314xaae8f345.mm.ui.uc.f292614d).intValue();
            c5163xb50f8dbb.e();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("extra_start_by_half_screen_empty_area_click_scene", true);
            intent.addFlags(603979776);
            intent.setClass(r07, java.lang.Class.forName(closeWhenClickEmptyAreaConfig2.f158917d));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(r07, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/config/HalfScreenConfig", "performCloseHalfScreen", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            r07.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(r07, "com/tencent/mm/plugin/appbrand/config/HalfScreenConfig", "performCloseHalfScreen", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
