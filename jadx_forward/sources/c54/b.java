package c54;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f120196a;

    /* renamed from: b, reason: collision with root package name */
    public final c54.k f120197b;

    /* renamed from: c, reason: collision with root package name */
    public final f54.r f120198c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.r1 f120199d;

    /* renamed from: e, reason: collision with root package name */
    public final c54.g f120200e;

    /* renamed from: f, reason: collision with root package name */
    public final ab4.n0 f120201f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f120202g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f120203h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f120204i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f120205j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View.OnClickListener f120206k;

    public b(android.content.Context mContext, c54.k mViewHolder, f54.r mCardInfo, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.r1 mFinderConfig, c54.g mBulletCommentBuilder, ab4.n0 mLandingPageData, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mViewHolder, "mViewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mCardInfo, "mCardInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mFinderConfig, "mFinderConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mBulletCommentBuilder, "mBulletCommentBuilder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mLandingPageData, "mLandingPageData");
        this.f120196a = mContext;
        this.f120197b = mViewHolder;
        this.f120198c = mCardInfo;
        this.f120199d = mFinderConfig;
        this.f120200e = mBulletCommentBuilder;
        this.f120201f = mLandingPageData;
        this.f120202g = z17;
        this.f120203h = new java.util.HashMap();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a(java.lang.String str, ab4.d0 d0Var, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        java.lang.String str2 = d0Var.f84350d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        boolean z17 = true;
        boolean z18 = str2 == null || str2.length() == 0;
        java.util.HashMap hashMap = this.f120203h;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.Card", "getCacheComponent, err cId=" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            a2Var = null;
        } else {
            a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) hashMap.get(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        }
        if (a2Var != null) {
            android.view.View x17 = a2Var.x();
            if ((x17 != null ? x17.getParent() : null) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.Card", "addComponent, cached comp has parent=" + a2Var.x().getParent());
                android.view.View x18 = a2Var.x();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x18, "getView(...)");
                pm0.v.B(x18);
            }
        }
        if (a2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", "addComponent, new comp, cardId=" + str + ", compId=" + d0Var.f84350d + ", container=" + viewGroup.getClass().getSimpleName());
            a2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ta.a(this.f120196a, d0Var, viewGroup, 0);
            java.lang.String str3 = d0Var.f84350d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            if (str3 != null && str3.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.Card", "setCacheComponent, componentId empty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            } else {
                hashMap.put(str3, a2Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", "addComponent, hit cache, cardId=" + str + ", compId=" + d0Var.f84350d + ", container=" + viewGroup.getClass().getSimpleName());
        }
        android.view.View x19 = a2Var.x();
        if (x19 != null) {
            viewGroup.addView(x19);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        return a2Var;
    }

    public final void b(ab4.u uVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustBtnSizeInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        if (uVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustBtnSizeInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            return;
        }
        c54.o oVar = c54.o.f120247a;
        uVar.f84426J = oVar.b(14.0f);
        uVar.L = 1;
        uVar.f84357n = oVar.b(48.0f);
        uVar.f84363t = 0.0f;
        uVar.f84362s = 0.0f;
        uVar.Y = oVar.b(8.0f);
        if (i17 < 9) {
            uVar.f84356m = oVar.b(183.0f);
        } else if (i17 < 10) {
            uVar.f84356m = oVar.b(201.0f);
        } else {
            uVar.f84356m = oVar.b(219.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustBtnSizeInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        java.lang.String a17 = this.f120198c.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        return a17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:52|(2:54|(16:56|57|58|59|(1:61)(1:139)|62|63|64|65|66|67|(7:69|(3:71|(2:74|72)|75)|76|(1:78)|79|(1:81)|82)(1:133)|83|84|(3:(4:87|(1:89)(1:130)|90|(2:92|(1:94)))(1:131)|129|(0))(1:132)|127))|142|59|(0)(0)|62|63|64|65|66|67|(0)(0)|83|84|(0)(0)|127) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033c, code lost:
    
        if (r20.f120202g == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x023f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0240, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0336, code lost:
    
        if (r10.f84433y1 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x033f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0340, code lost:
    
        r20.f120205j = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0226 A[Catch: Exception -> 0x0242, TryCatch #2 {Exception -> 0x0242, blocks: (B:58:0x01de, B:59:0x0208, B:61:0x0212, B:62:0x0235, B:139:0x0226), top: B:57:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0212 A[Catch: Exception -> 0x0242, TryCatch #2 {Exception -> 0x0242, blocks: (B:58:0x01de, B:59:0x0208, B:61:0x0212, B:62:0x0235, B:139:0x0226), top: B:57:0x01de }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0334  */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q0, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(c54.k r21, f54.r r22) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c54.b.d(c54.k, f54.r):void");
    }

    public final void e(android.widget.Button button) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnStyle", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        if (button != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i17 = (int) (17.0f * c54.o.f120248b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            button.setTextSize(0, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            button.setSingleLine();
            button.setEllipsize(android.text.TextUtils.TruncateAt.END);
            com.p314xaae8f345.mm.ui.bk.s0(button.getPaint());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnStyle", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final void f(c54.k kVar, f54.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCenterComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", "setCenterComponent, cardId=" + rVar.a() + ", childCount=" + kVar.e().getChildCount());
        kVar.e().removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        ab4.d0 d0Var = rVar.f341275g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        ab4.d0 d0Var2 = rVar.f341276h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        c54.o oVar = c54.o.f120247a;
        float f17 = 0.5622318f;
        if (d0Var != null) {
            float f18 = d0Var.f84362s;
            if (f18 > 0.0f) {
                float f19 = d0Var.f84363t;
                if (f19 > 0.0f) {
                    f17 = f18 / f19;
                }
            }
            oVar.a(kVar.f(), kVar.e(), f17);
            d0Var.f84362s = kVar.e().getLayoutParams().width;
            d0Var.f84363t = kVar.e().getLayoutParams().height;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", "add imgComp");
            a(rVar.a(), d0Var, kVar.e());
        } else if (d0Var2 != null) {
            float f27 = d0Var2.f84362s;
            if (f27 > 0.0f) {
                float f28 = d0Var2.f84363t;
                if (f28 > 0.0f) {
                    f17 = f27 / f28;
                }
            }
            oVar.a(kVar.f(), kVar.e(), f17);
            d0Var2.f84362s = kVar.e().getLayoutParams().width;
            d0Var2.f84363t = kVar.e().getLayoutParams().height;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", "add videoComp");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a17 = a(rVar.a(), d0Var2, kVar.e());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1 f1Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1) a17 : null;
            if (f1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delRootBackground", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                android.view.View view = f1Var.f244339z;
                if (view != null) {
                    view.setBackground(null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delRootBackground", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.Card", "setCenterComponent, no center compInfo");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCenterComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerCardAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", "triggerCardAppeared, cardId=" + c() + ", includeVideo=" + z17);
        java.util.Iterator it = this.f120203h.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) ((java.util.Map.Entry) it.next()).getValue();
            if (z17 || !(a2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1)) {
                a2Var.J();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerCardAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final void h(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerCardWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", "triggerCardWillAppear, cardId=" + c() + ", includeVideo=" + z17);
        java.util.Iterator it = this.f120203h.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) ((java.util.Map.Entry) it.next()).getValue();
            if (z17 || !(a2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1)) {
                a2Var.K();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerCardWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerCardWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", "triggerCardWillDisappear, cardId=" + c());
        java.util.Iterator it = this.f120203h.entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) ((java.util.Map.Entry) it.next()).getValue()).M();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerCardWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }
}
