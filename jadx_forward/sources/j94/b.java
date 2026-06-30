package j94;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j94.b f380077a = new j94.b();

    public static final void a(android.widget.ImageView imageView, r45.d43 foldSnsInfo) {
        java.lang.String str;
        j94.a b17;
        r45.bo boVar;
        r45.bo boVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindBrandIconView", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foldSnsInfo, "foldSnsInfo");
        r45.x30 x30Var = foldSnsInfo.f453613p;
        if (x30Var == null) {
            java.util.LinkedList linkedList = foldSnsInfo.f453605e;
            x30Var = linkedList != null ? (r45.x30) kz5.n0.Z(linkedList) : null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resolveBrandIconRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        boolean z17 = true;
        boolean z18 = x30Var != null && x30Var.f471261d == 26;
        j94.b bVar = f380077a;
        if (z18) {
            r45.wm4 wm4Var = foldSnsInfo.f453617t;
            java.lang.String str2 = wm4Var != null ? wm4Var.f470817n : null;
            str = wm4Var != null ? wm4Var.f470822s : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pickIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            if (C) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    str2 = str;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pickIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            b17 = bVar.b("minishop_data.brand_icon", str2, (wm4Var == null || (boVar2 = wm4Var.f470821r) == null) ? 0 : boVar2.f452436d, (wm4Var == null || (boVar = wm4Var.f470821r) == null) ? 0 : boVar.f452437e);
        } else {
            r45.zn znVar = foldSnsInfo.B;
            java.lang.String str3 = znVar != null ? znVar.f473748d : null;
            str = znVar != null ? znVar.f473749e : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pickIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            if (C) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    str3 = str;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pickIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            b17 = bVar.b("brand_badge_info", str3, znVar != null ? znVar.f473750f : 0, znVar != null ? znVar.f473751g : 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resolveBrandIconRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        if (b17 == null) {
            imageView.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindBrandIconView", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            return;
        }
        float q17 = i65.a.q(imageView.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWidthDp", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWidthDp", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        int a17 = (int) (c44.b.a(b17.f380075b) * q17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeightDp", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeightDp", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        int a18 = (int) (c44.b.a(b17.f380076c) * q17);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null && (layoutParams.width != a17 || layoutParams.height != a18)) {
            layoutParams.width = a17;
            layoutParams.height = a18;
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        a84.m.a(b17.f380074a, imageView);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindBrandIconView", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
    }

    public static jz5.l c(android.content.Context context, int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdMaterialAreaSize$default", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        if ((i19 & 2) != 0) {
            i17 = 8;
        }
        if ((i19 & 4) != 0) {
            i18 = 20;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdMaterialAreaSize", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int b17 = context.getResources().getDisplayMetrics().widthPixels - i65.a.b(context, (i18 * 2) + (i17 * 2));
        jz5.l lVar = new jz5.l(java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf((int) ((b17 * 9.0f) / 16.0f)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdMaterialAreaSize", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdMaterialAreaSize$default", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        return lVar;
    }

    public static final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableWsFoldAd", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ws_fold_disable_ad, 0) == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableWsFoldAd", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Object m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                ca4.q.c("WsFoldAdHelper", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
            }
            p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableWsFoldAd", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            return true;
        }
    }

    public final j94.a b(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        if (!(str2 == null || str2.length() == 0) && i17 > 0 && i18 > 0) {
            j94.a aVar = new j94.a(str2, i17, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            return aVar;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(str2 == null || str2.length() == 0);
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WsFoldAdHelper", "resolveBrandIconRenderInfo, %s missing fields, iconUrlEmpty=%b, widthDp=%d, heightDp=%d", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        return null;
    }
}
