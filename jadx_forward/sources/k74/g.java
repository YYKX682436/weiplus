package k74;

/* loaded from: classes4.dex */
public final class g implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k74.h f386321d;

    public g(k74.h hVar) {
        this.f386321d = hVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 b17;
        android.view.View c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 b18;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 b19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$updateView$1");
        k74.h hVar = this.f386321d;
        k74.j a17 = k74.h.a(hVar);
        int i39 = 0;
        if ((a17 == null || (b19 = a17.b()) == null || b19.getVisibility() != 0) ? false : true) {
            k74.j a18 = k74.h.a(hVar);
            if (a18 != null && (b18 = a18.b()) != null && (layoutParams = b18.getLayoutParams()) != null) {
                i39 = layoutParams.width;
            }
            int i47 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStyleDisplayer", "topLayWidth = SelectItemContainer.w", null);
        } else {
            k74.j a19 = k74.h.a(hVar);
            if (a19 != null && (b17 = a19.b()) != null) {
                i39 = b17.m69485xb2c4f28d();
            }
            int i48 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStyleDisplayer", "topLayWidth = defaultW", null);
        }
        k74.j a27 = k74.h.a(hVar);
        android.view.ViewGroup.LayoutParams layoutParams2 = (a27 == null || (c17 = a27.c()) == null) ? null : c17.getLayoutParams();
        if (i39 > 0 && layoutParams2 != null && layoutParams2.width != i39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStyleDisplayer", "onLayoutChange, topLayoutWidth=" + i39 + ", topLayoutParamsW=" + java.lang.Integer.valueOf(layoutParams2.width), null);
            layoutParams2.width = i39;
            k74.j a28 = k74.h.a(hVar);
            android.view.View c18 = a28 != null ? a28.c() : null;
            if (c18 != null) {
                c18.setLayoutParams(layoutParams2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$updateView$1");
    }
}
