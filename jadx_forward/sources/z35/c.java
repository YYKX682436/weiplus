package z35;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 f551538d;

    public c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2) {
        this.f551538d = c19716x17d12db2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/seekbar/ExpandableHeroSeekBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f551538d.f272653v) {
            x25.a reporter = this.f551538d.getReporter();
            if (reporter != null) {
                xd4.l0 l0Var = (xd4.l0) reporter;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCollapseClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                l0Var.a();
                l0Var.f535207i++;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCollapseClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            }
        } else {
            x25.a reporter2 = this.f551538d.getReporter();
            if (reporter2 != null) {
                xd4.l0 l0Var2 = (xd4.l0) reporter2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onExpandClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                l0Var2.a();
                l0Var2.f535206h++;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onExpandClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            }
        }
        this.f551538d.d(!r7.f272653v, true);
        if (!this.f551538d.isAccessibilityEnable) {
            this.f551538d.a();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/seekbar/ExpandableHeroSeekBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
