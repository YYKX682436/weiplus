package m84;

/* loaded from: classes4.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m84.u f406288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f406289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f406290c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f406291d;

    public b(m84.u uVar, int i17, int i18, int i19) {
        this.f406288a = uVar;
        this.f406289b = i17;
        this.f406290c = i18;
        this.f406291d = i19;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$adjustContentContainerLayout$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$adjustContentContainerLayout$1$1");
        m84.u uVar = this.f406288a;
        java.lang.String j17 = uVar.j();
        int i17 = this.f406289b;
        int i18 = this.f406290c;
        int i19 = this.f406291d;
        try {
            android.view.View L = uVar.L();
            if (L != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) uVar.f406332x).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                if (linearLayout != null) {
                    int[] iArr = new int[2];
                    L.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    linearLayout.getLocationOnScreen(iArr2);
                    int height = linearLayout.getHeight();
                    int i27 = iArr2[0] - iArr[0];
                    int i28 = iArr2[1] - iArr[1];
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(uVar.j(), "onPreDraw measured, imagesKeeperLayoutHeight=" + height + ", imagesKeeperLayoutHeightCalc=" + i17 + ", leftMargin=" + i27 + ", leftMarginCalc=" + i18 + ", topMargin=" + i28 + ", topMarginCalc=" + i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                    uVar.H(height, i27, i28);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$adjustContentContainerLayout$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$adjustContentContainerLayout$1$1");
    }
}
