package u84;

/* loaded from: classes4.dex */
public final class x1 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17800x9656c5e8 f507220a;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17800x9656c5e8 c17800x9656c5e8) {
        this.f507220a = c17800x9656c5e8;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFlush", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGFlushListener$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17800x9656c5e8 c17800x9656c5e8 = this.f507220a;
        if (c17800x9656c5e8.m69594x835c9bb7() != null) {
            android.widget.ImageView m69594x835c9bb7 = c17800x9656c5e8.m69594x835c9bb7();
            boolean z17 = false;
            if (m69594x835c9bb7 != null && m69594x835c9bb7.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdInteractionTagView", "mThumbIv need to be gone");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m69595xb1a910a4 = c17800x9656c5e8.m69595xb1a910a4();
                if (m69595xb1a910a4 != null) {
                    m69595xb1a910a4.j(this);
                }
                android.widget.ImageView m69594x835c9bb72 = c17800x9656c5e8.m69594x835c9bb7();
                if (m69594x835c9bb72 != null) {
                    m69594x835c9bb72.clearAnimation();
                }
                android.widget.ImageView m69594x835c9bb73 = c17800x9656c5e8.m69594x835c9bb7();
                if (m69594x835c9bb73 != null) {
                    m69594x835c9bb73.setVisibility(8);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFlush", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGFlushListener$1");
    }
}
