package y84;

/* loaded from: classes4.dex */
public final class x0 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f541755a;

    public x0(y84.h3 h3Var) {
        this.f541755a = h3Var;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFlush", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mDonePAGFlushListener$1");
        y84.h3 h3Var = this.f541755a;
        if (y84.h3.D(h3Var) != null) {
            android.widget.ImageView D = y84.h3.D(h3Var);
            if (D != null && D.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h3Var.j(), "mDonePAGThumb need to be gone");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMDonePAGView$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = h3Var.X;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMDonePAGView$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                if (c22789xd23e9a9b != null) {
                    c22789xd23e9a9b.j(this);
                }
                android.widget.ImageView D2 = y84.h3.D(h3Var);
                if (D2 != null) {
                    D2.clearAnimation();
                }
                android.widget.ImageView D3 = y84.h3.D(h3Var);
                if (D3 != null) {
                    D3.setVisibility(8);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFlush", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mDonePAGFlushListener$1");
    }
}
