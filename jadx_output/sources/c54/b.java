package c54;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f38663a;

    /* renamed from: b, reason: collision with root package name */
    public final c54.k f38664b;

    /* renamed from: c, reason: collision with root package name */
    public final f54.r f38665c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1 f38666d;

    /* renamed from: e, reason: collision with root package name */
    public final c54.g f38667e;

    /* renamed from: f, reason: collision with root package name */
    public final ab4.n0 f38668f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38669g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f38670h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f38671i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f38672j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View.OnClickListener f38673k;

    public b(android.content.Context mContext, c54.k mViewHolder, f54.r mCardInfo, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1 mFinderConfig, c54.g mBulletCommentBuilder, ab4.n0 mLandingPageData, boolean z17) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mViewHolder, "mViewHolder");
        kotlin.jvm.internal.o.g(mCardInfo, "mCardInfo");
        kotlin.jvm.internal.o.g(mFinderConfig, "mFinderConfig");
        kotlin.jvm.internal.o.g(mBulletCommentBuilder, "mBulletCommentBuilder");
        kotlin.jvm.internal.o.g(mLandingPageData, "mLandingPageData");
        this.f38663a = mContext;
        this.f38664b = mViewHolder;
        this.f38665c = mCardInfo;
        this.f38666d = mFinderConfig;
        this.f38667e = mBulletCommentBuilder;
        this.f38668f = mLandingPageData;
        this.f38669g = z17;
        this.f38670h = new java.util.HashMap();
    }

    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a(java.lang.String str, ab4.d0 d0Var, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        java.lang.String str2 = d0Var.f2817d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        boolean z17 = true;
        boolean z18 = str2 == null || str2.length() == 0;
        java.util.HashMap hashMap = this.f38670h;
        if (z18) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.Card", "getCacheComponent, err cId=" + str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            a2Var = null;
        } else {
            a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) hashMap.get(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        }
        if (a2Var != null) {
            android.view.View x17 = a2Var.x();
            if ((x17 != null ? x17.getParent() : null) != null) {
                com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.Card", "addComponent, cached comp has parent=" + a2Var.x().getParent());
                android.view.View x18 = a2Var.x();
                kotlin.jvm.internal.o.f(x18, "getView(...)");
                pm0.v.B(x18);
            }
        }
        if (a2Var == null) {
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "addComponent, new comp, cardId=" + str + ", compId=" + d0Var.f2817d + ", container=" + viewGroup.getClass().getSimpleName());
            a2Var = com.tencent.mm.plugin.sns.ui.ta.a(this.f38663a, d0Var, viewGroup, 0);
            java.lang.String str3 = d0Var.f2817d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            if (str3 != null && str3.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.Card", "setCacheComponent, componentId empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            } else {
                hashMap.put(str3, a2Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCacheComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            }
        } else {
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "addComponent, hit cache, cardId=" + str + ", compId=" + d0Var.f2817d + ", container=" + viewGroup.getClass().getSimpleName());
        }
        android.view.View x19 = a2Var.x();
        if (x19 != null) {
            viewGroup.addView(x19);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        return a2Var;
    }

    public final void b(ab4.u uVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustBtnSizeInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        if (uVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustBtnSizeInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            return;
        }
        c54.o oVar = c54.o.f38714a;
        uVar.f2893J = oVar.b(14.0f);
        uVar.L = 1;
        uVar.f2824n = oVar.b(48.0f);
        uVar.f2830t = 0.0f;
        uVar.f2829s = 0.0f;
        uVar.Y = oVar.b(8.0f);
        if (i17 < 9) {
            uVar.f2823m = oVar.b(183.0f);
        } else if (i17 < 10) {
            uVar.f2823m = oVar.b(201.0f);
        } else {
            uVar.f2823m = oVar.b(219.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustBtnSizeInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        java.lang.String a17 = this.f38665c.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        return a17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:52|(2:54|(16:56|57|58|59|(1:61)(1:139)|62|63|64|65|66|67|(7:69|(3:71|(2:74|72)|75)|76|(1:78)|79|(1:81)|82)(1:133)|83|84|(3:(4:87|(1:89)(1:130)|90|(2:92|(1:94)))(1:131)|129|(0))(1:132)|127))|142|59|(0)(0)|62|63|64|65|66|67|(0)(0)|83|84|(0)(0)|127) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033c, code lost:
    
        if (r20.f38669g == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x023f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0240, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0336, code lost:
    
        if (r10.f2900y1 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x033f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0340, code lost:
    
        r20.f38672j = r2;
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnStyle", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        if (button != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i17 = (int) (17.0f * c54.o.f38715b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            button.setTextSize(0, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            button.setSingleLine();
            button.setEllipsize(android.text.TextUtils.TruncateAt.END);
            com.tencent.mm.ui.bk.s0(button.getPaint());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnStyle", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final void f(c54.k kVar, f54.r rVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCenterComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "setCenterComponent, cardId=" + rVar.a() + ", childCount=" + kVar.e().getChildCount());
        kVar.e().removeAllViews();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        ab4.d0 d0Var = rVar.f259742g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        ab4.d0 d0Var2 = rVar.f259743h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        c54.o oVar = c54.o.f38714a;
        float f17 = 0.5622318f;
        if (d0Var != null) {
            float f18 = d0Var.f2829s;
            if (f18 > 0.0f) {
                float f19 = d0Var.f2830t;
                if (f19 > 0.0f) {
                    f17 = f18 / f19;
                }
            }
            oVar.a(kVar.f(), kVar.e(), f17);
            d0Var.f2829s = kVar.e().getLayoutParams().width;
            d0Var.f2830t = kVar.e().getLayoutParams().height;
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "add imgComp");
            a(rVar.a(), d0Var, kVar.e());
        } else if (d0Var2 != null) {
            float f27 = d0Var2.f2829s;
            if (f27 > 0.0f) {
                float f28 = d0Var2.f2830t;
                if (f28 > 0.0f) {
                    f17 = f27 / f28;
                }
            }
            oVar.a(kVar.f(), kVar.e(), f17);
            d0Var2.f2829s = kVar.e().getLayoutParams().width;
            d0Var2.f2830t = kVar.e().getLayoutParams().height;
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "add videoComp");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a17 = a(rVar.a(), d0Var2, kVar.e());
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var = a17 instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 ? (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1) a17 : null;
            if (f1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delRootBackground", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                android.view.View view = f1Var.f162806z;
                if (view != null) {
                    view.setBackground(null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delRootBackground", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            }
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.Card", "setCenterComponent, no center compInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCenterComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final void g(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerCardAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "triggerCardAppeared, cardId=" + c() + ", includeVideo=" + z17);
        java.util.Iterator it = this.f38670h.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) ((java.util.Map.Entry) it.next()).getValue();
            if (z17 || !(a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1)) {
                a2Var.J();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerCardAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final void h(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerCardWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "triggerCardWillAppear, cardId=" + c() + ", includeVideo=" + z17);
        java.util.Iterator it = this.f38670h.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) ((java.util.Map.Entry) it.next()).getValue();
            if (z17 || !(a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1)) {
                a2Var.K();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerCardWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerCardWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.Card", "triggerCardWillDisappear, cardId=" + c());
        java.util.Iterator it = this.f38670h.entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) ((java.util.Map.Entry) it.next()).getValue()).M();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerCardWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
    }
}
