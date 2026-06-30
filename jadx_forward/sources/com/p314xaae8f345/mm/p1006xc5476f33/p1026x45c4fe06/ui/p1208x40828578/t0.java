package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f171686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.u0 f171687e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.u0 u0Var, boolean z17) {
        this.f171687e = u0Var;
        this.f171686d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.e2 e2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.u0 u0Var = this.f171687e;
        if (!u0Var.f171691a.f171549y.y() && (e2Var = u0Var.f171691a.f171549y) != null) {
            try {
                e2Var.m8147xed6e4d18(e2Var.mo1894x7e414b06() - 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLauncherRecentsList", "adjustListBottomDivider notifyItemChanged e=%s", e17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = u0Var.f171691a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f1 f1Var = c12723x5ab2de90.H;
        if (f1Var != null) {
            boolean z17 = (this.f171686d || c12723x5ab2de90.f171549y.y()) ? false : true;
            android.view.View view = f1Var.f171610c;
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setShowDivider", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setShowDivider", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
