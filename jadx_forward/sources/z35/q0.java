package z35;

/* loaded from: classes4.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 f551571d;

    public q0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 c19719xa864b110) {
        this.f551571d = c19719xa864b110;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f551571d.M) {
            x25.b reporter = this.f551571d.getReporter();
            if (reporter != null) {
                xd4.l0 l0Var = (xd4.l0) reporter;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPauseClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                l0Var.a();
                l0Var.f535205g++;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPauseClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            }
        } else {
            x25.b reporter2 = this.f551571d.getReporter();
            if (reporter2 != null) {
                xd4.l0 l0Var2 = (xd4.l0) reporter2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlayClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                l0Var2.a();
                l0Var2.f535204f++;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayClicked", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            }
        }
        this.f551571d.n(!r7.M);
        this.f551571d.e();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
