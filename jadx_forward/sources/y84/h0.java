package y84;

/* loaded from: classes4.dex */
public final class h0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f541595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f541596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f541597c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f541598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f541599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f541600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f541601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f541602h;

    public h0(y84.h3 h3Var, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f541595a = h3Var;
        this.f541596b = i17;
        this.f541597c = i18;
        this.f541598d = i19;
        this.f541599e = i27;
        this.f541600f = i28;
        this.f541601g = i29;
        this.f541602h = i37;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1");
        y84.h3 h3Var = this.f541595a;
        java.lang.String j17 = h3Var.j();
        int i17 = this.f541596b;
        int i18 = this.f541597c;
        int i19 = this.f541598d;
        int i27 = this.f541599e;
        int i28 = this.f541600f;
        int i29 = this.f541601g;
        int i37 = this.f541602h;
        try {
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "onPreDraw";
        }
        if (h3Var.W() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) h3Var.f541628s).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            if (linearLayout != null) {
                int[] iArr = new int[2];
                h3Var.W().getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                linearLayout.getLocationOnScreen(iArr2);
                int height = linearLayout.getHeight();
                str = "onPreDraw";
                try {
                    int i38 = iArr2[0] - iArr[0];
                    int i39 = iArr2[1] - iArr[1];
                    java.lang.String j18 = h3Var.j();
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1";
                    try {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("testOnPreDraw, inLargeWindow is ");
                        i64.b0 C = y84.h3.C(h3Var);
                        C.getClass();
                        str3 = j17;
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMInLargeWindow", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMInLargeWindow", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
                            sb6.append(C.f370616d);
                            sb6.append(", imagesKeeperLayoutHeight is ");
                            sb6.append(height);
                            sb6.append(", imagesKeeperLayoutHeightCalc is ");
                            sb6.append(i17);
                            sb6.append(", topMargin is ");
                            sb6.append(i39);
                            sb6.append(", topMarginCalc is ");
                            sb6.append(i18);
                            sb6.append(", leftMargin is ");
                            sb6.append(i38);
                            sb6.append(", leftMarginCalc is ");
                            sb6.append(i19);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j18, sb6.toString());
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                            h3Var.Q(height, i38, i39, i27, i28, i29, i37);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                            android.widget.LinearLayout F = y84.h3.F(h3Var);
                            if (F != null) {
                                F.setVisibility(0);
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            ca4.q.c(str3, th);
                            str4 = str;
                            str5 = str2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        str3 = j17;
                        ca4.q.c(str3, th);
                        str4 = str;
                        str5 = str2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1";
                    str3 = j17;
                    ca4.q.c(str3, th);
                    str4 = str;
                    str5 = str2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
                }
                str4 = str;
                str5 = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1");
        }
        str4 = "onPreDraw";
        str5 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$doResizeUI$1$1";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
    }
}
