package w64;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ w64.v f524870a = new w64.v();

    public final void a(android.content.Intent intent, w64.x xVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rewriteJumpAnimIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        if (xVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rewriteJumpAnimIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
            return;
        }
        if (intent == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rewriteJumpAnimIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
            return;
        }
        if (xVar.l() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rewriteJumpAnimIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("IAdLandingPageJumpAnimInfo", "rewriteJumpAnimIntent forbid = " + z17 + ' ' + xVar.l());
        if (z17 || xVar.l() == 1) {
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            intent.putExtra("sns_landing_pages_is_normal_ad_animation", false);
        } else if (xVar.l() == 2) {
            int[] iArr = new int[2];
            android.view.View c17 = xVar.c();
            if (c17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rewriteJumpAnimIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                return;
            }
            c17.getLocationInWindow(iArr);
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", c17.getWidth());
            intent.putExtra("img_gallery_height", c17.getHeight());
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            intent.putExtra("sns_landing_pages_is_normal_ad_animation", true);
        } else if (xVar.l() == 3) {
            int[] iArr2 = new int[2];
            android.view.View c18 = xVar.c();
            if (c18 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rewriteJumpAnimIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                return;
            }
            c18.getLocationInWindow(iArr2);
            intent.putExtra("img_gallery_left", iArr2[0]);
            intent.putExtra("img_gallery_top", iArr2[1]);
            intent.putExtra("img_gallery_width", c18.getWidth());
            intent.putExtra("img_gallery_height", c18.getHeight());
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            intent.putExtra("sns_landing_pages_is_normal_ad_animation", false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rewriteJumpAnimIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
    }
}
