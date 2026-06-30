package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f182771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e f182772e;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e, o72.e2 e2Var) {
        this.f182772e = activityC13568x82804f7e;
        this.f182771d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f182772e;
        android.view.View selectedView = activityC13568x82804f7e.f181891e.getSelectedView();
        if (selectedView == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z3 z3Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z3) selectedView.getTag();
        o72.e2 e2Var = this.f182771d;
        int i17 = e2Var.f67094xeb1a61d6 > 0 ? ((e2Var.f67090x90a9378 * 100) / r3) - 1 : 0;
        int i18 = i17 >= 0 ? i17 : 0;
        z3Var.f183177d.setProgress(i18);
        z3Var.f183178e.setText(i18 + "%");
        if (i18 >= 100 || e2Var.w0()) {
            activityC13568x82804f7e.f181892f.notifyDataSetChanged();
        }
    }
}
