package s74;

/* loaded from: classes4.dex */
public final class f1 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485797d;

    public f1(s74.o2 o2Var) {
        this.f485797d = o2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w4
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$fillLivingViewInfo$1");
        this.f485797d.b0(z17, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$fillLivingViewInfo$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w4
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateButtonText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$fillLivingViewInfo$1");
        s74.o2 o2Var = this.f485797d;
        android.widget.Button T = o2Var.T();
        if (T != null) {
            T.setText(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o2Var.k(), "updateButtonText=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateButtonText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$fillLivingViewInfo$1");
    }
}
