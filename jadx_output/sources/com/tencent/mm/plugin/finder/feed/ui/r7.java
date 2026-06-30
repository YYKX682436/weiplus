package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class r7 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI f110484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.lo1 f110485b;

    public r7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI finderLiveAnchorSettingUI, r45.lo1 lo1Var) {
        this.f110484a = finderLiveAnchorSettingUI;
        this.f110485b = lo1Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            androidx.appcompat.app.AppCompatActivity context = this.f110484a.getContext();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
            if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f328040e;
            a4Var.a(str2, "", b17, "person_page_ext_entrance", "{\"entrance_id\":\"" + this.f110485b.getInteger(2) + "\"}");
        }
    }
}
