package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class d0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAQueryListUI f72598a;

    public d0(com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI) {
        this.f72598a = aAQueryListUI;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListUI", "getNexPage failed: %s", obj);
        com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI = this.f72598a;
        android.app.Dialog dialog = aAQueryListUI.f72446m;
        if (dialog != null) {
            dialog.dismiss();
            aAQueryListUI.f72446m = null;
        }
        aAQueryListUI.f72447n = false;
        if (aAQueryListUI.f72444h.getFooterViewsCount() > 0) {
            aAQueryListUI.f72444h.removeFooterView(aAQueryListUI.f72449p);
        }
        if (obj instanceof java.lang.String) {
            dp.a.makeText(aAQueryListUI, obj.toString(), 1).show();
        } else {
            dp.a.makeText(aAQueryListUI, com.tencent.mm.R.string.frv, 1).show();
        }
    }
}
