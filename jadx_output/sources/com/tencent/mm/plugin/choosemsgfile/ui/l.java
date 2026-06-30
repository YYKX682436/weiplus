package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes8.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.m f95625d;

    public l(com.tencent.mm.plugin.choosemsgfile.ui.m mVar) {
        this.f95625d = mVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.choosemsgfile.ui.m mVar = this.f95625d;
        if (itemId == 0) {
            by5.s0.j(mVar.f95626a.f95579e);
            uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
            com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI = mVar.f95626a;
            java.lang.String str = chooseMsgFileShowUI.f95578d;
            java.lang.String str2 = chooseMsgFileShowUI.f95581g;
            java.lang.String str3 = chooseMsgFileShowUI.f95579e;
            ((th0.u) rVar).getClass();
            com.tencent.mm.xwebutil.i.f(chooseMsgFileShowUI, str, str2, str3, 0L, "", false);
            return;
        }
        if (itemId == 1) {
            by5.s0.i(mVar.f95626a.f95579e);
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI2 = mVar.f95626a;
            java.lang.String str4 = chooseMsgFileShowUI2.f95578d;
            java.lang.String str5 = chooseMsgFileShowUI2.f95581g;
            java.lang.String str6 = chooseMsgFileShowUI2.f95579e;
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.m(chooseMsgFileShowUI2, str4, str5, str6, 8);
            return;
        }
        if (itemId == 2) {
            mVar.f95626a.f95584m.B(false);
            return;
        }
        if (itemId == 3) {
            mVar.f95626a.f95584m.B(true);
            return;
        }
        if (itemId != 4) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI3 = mVar.f95626a;
        java.lang.String str7 = chooseMsgFileShowUI3.f95578d;
        java.lang.String str8 = chooseMsgFileShowUI3.f95581g;
        com.tencent.mm.plugin.choosemsgfile.ui.k kVar = new com.tencent.mm.plugin.choosemsgfile.ui.k(this);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.e(chooseMsgFileShowUI3, str7, str8, kVar);
    }
}
