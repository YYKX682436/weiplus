package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f182607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd f182608e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd, o72.e2 e2Var) {
        this.f182608e = activityC13597x28c5d1bd;
        this.f182607d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = this.f182608e;
        android.view.View selectedView = activityC13597x28c5d1bd.f182405f.getSelectedView();
        if (selectedView == null || selectedView.getTag() == null || !(selectedView.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.g0) selectedView.getTag();
        o72.e2 e2Var = this.f182607d;
        int i17 = e2Var.f67094xeb1a61d6 > 0 ? ((e2Var.f67090x90a9378 * 100) / r3) - 1 : 0;
        int i18 = i17 >= 0 ? i17 : 0;
        g0Var.f182460d.setProgress(i18);
        g0Var.f182461e.setText(i18 + "%");
        if (i18 >= 100 || e2Var.w0()) {
            activityC13597x28c5d1bd.f182406g.notifyDataSetChanged();
        }
    }
}
