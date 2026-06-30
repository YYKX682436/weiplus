package av2;

/* loaded from: classes2.dex */
public final class a implements av2.d {

    /* renamed from: a, reason: collision with root package name */
    public float f14196a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14197b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14198c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI f14199d;

    public a(com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI) {
        this.f14199d = finderHomeSlideProfileUI;
    }

    public void a(float f17, int i17, boolean z17) {
        com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI = this.f14199d;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = finderHomeSlideProfileUI.f129827w;
        if (((vASCommonFragment != null ? vASCommonFragment.f211121p : null) instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) && !this.f14197b && !this.f14198c && !z17) {
            if (f17 > this.f14196a && i17 == 1) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("left_slide_enter_profile_page", null, kz5.b1.e(new jz5.l("comment_scene", java.lang.Integer.valueOf(finderHomeSlideProfileUI.getD()))), 1, false);
                this.f14197b = true;
            }
            float f18 = this.f14196a;
            if (!(f18 == 0.0f) && f18 > f17 && i17 == 1) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = finderHomeSlideProfileUI.f129827w;
                com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment2 != null ? vASCommonFragment2.f211121p : null;
                com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = vASActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) vASActivity : null;
                ((cy1.a) rVar).yj("right_slide_exit_profile_page", null, kz5.b1.e(new jz5.l("comment_scene", finderProfileUI != null ? java.lang.Integer.valueOf(finderProfileUI.getD()) : null)), 1, false);
                this.f14198c = true;
            }
        }
        this.f14196a = f17;
        com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI.c7(finderHomeSlideProfileUI, i17);
    }

    public void b(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI;
        com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI = this.f14199d;
        if (i17 == 0) {
            if (this.f14198c) {
                com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = finderHomeSlideProfileUI.f129827w;
                androidx.activity.ComponentActivity componentActivity = vASCommonFragment != null ? vASCommonFragment.f211121p : null;
                finderProfileUI = componentActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) componentActivity : null;
                if (finderProfileUI != null) {
                    finderProfileUI.e7(true);
                }
                this.f14198c = false;
            }
            this.f14197b = false;
        } else if (i17 == 1) {
            if (this.f14197b) {
                com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = finderHomeSlideProfileUI.f129827w;
                androidx.activity.ComponentActivity componentActivity2 = vASCommonFragment2 != null ? vASCommonFragment2.f211121p : null;
                finderProfileUI = componentActivity2 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) componentActivity2 : null;
                if (finderProfileUI != null) {
                    finderProfileUI.e7(false);
                }
                this.f14197b = false;
            }
            this.f14198c = false;
        }
        com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI.c7(finderHomeSlideProfileUI, i17);
    }
}
