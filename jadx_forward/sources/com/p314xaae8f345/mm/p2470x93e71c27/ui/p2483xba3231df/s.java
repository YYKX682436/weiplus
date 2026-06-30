package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class s implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v f272521d;

    public s(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar) {
        this.f272521d = vVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        kb0.g gVar = this.f272521d.f272543k;
        if (gVar != null) {
            jz5.l[] lVarArr = new jz5.l[2];
            jz5.g gVar2 = gVar.f387736g;
            boolean z17 = false;
            lVarArr[0] = new jz5.l("install_app_name_list", (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb());
            java.util.List list = gVar.f387732c;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) kz5.n0.Z(list);
            lVarArr[1] = new jz5.l("has_forward_yuanbao", java.lang.Integer.valueOf((wVar == null || !wVar.f272552i) ? 0 : 1));
            java.util.HashMap i17 = kz5.c1.i(lVarArr);
            java.util.HashMap hashMap = gVar.f387734e;
            i17.putAll(hashMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_app_panel", "view_exp", i17, 35480);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) kz5.n0.Z(list);
            if (wVar2 != null && wVar2.f272552i) {
                z17 = true;
            }
            if (z17) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbo_ad_component", "view_exp", hashMap, 35480);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.p3 p3Var = gVar.f387730a.f270852l;
            if (p3Var == null) {
                return;
            }
            p3Var.f270939c = new kb0.f(gVar);
        }
    }
}
