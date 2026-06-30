package l44;

/* loaded from: classes4.dex */
public abstract class f4 {
    public static void a(android.content.Context context, android.widget.Button button, float f17, ab4.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        if (button == null || uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", "adjustFloatBarIconBtn, but btn or btnInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        float f18 = uVar.f84428p0;
        if (f18 <= 0.0f) {
            f18 = i65.a.b(context, 20);
        }
        float b17 = f18 + i65.a.b(context, 4) + button.getPaint().measureText(button.getText().toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "btn width = " + f17);
        int i17 = ((int) (f17 - b17)) / 2;
        if (i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "horizontalPadding = " + i17);
        button.setPadding(i17, 0, i17, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustFloatBarIconBtn", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }

    public static boolean b(android.content.Context context, ab4.u uVar, android.widget.Button button) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        if (context == null || uVar == null || button == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", "context or btnInfo or btn is null ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.Z)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(button.getText())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", "btnText is null ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanUpdateIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        return false;
    }

    public static void c(android.content.Context context, ab4.u uVar, android.widget.Button button, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
        if (J2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", "onDownloaded, bitmap == null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(J2);
        float f17 = uVar.f84428p0;
        if (f17 <= 0.0f) {
            f17 = i65.a.b(context, 20);
        }
        int b17 = i65.a.b(context, 4);
        float measureText = b17 + f17 + button.getPaint().measureText(button.getText().toString());
        float width = button.getWidth();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "btn width = " + width);
        int i17 = ((int) (width - measureText)) / 2;
        if (i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "horizontalPadding = " + i17);
        button.setPadding(i17, 0, i17, 0);
        button.setIncludeFontPadding(false);
        f3.b.g(bitmapDrawable, android.graphics.Color.parseColor(uVar.I));
        int i18 = (int) f17;
        bitmapDrawable.setBounds(0, 0, i18, i18);
        button.setCompoundDrawables(bitmapDrawable, null, null, null);
        button.setCompoundDrawablePadding(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }

    public static void d(android.content.Context context, ab4.u uVar, android.widget.Button button, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        ((ku5.t0) ku5.t0.f394148d).g(new l44.e4(str, uVar, context, button, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }

    public static void e(android.content.Context context, ab4.u uVar, android.widget.Button button) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", th6.toString());
        }
        if (!b(context, uVar, button)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        if (button.getWidth() <= 0) {
            button.addOnLayoutChangeListener(new l44.a4(context, uVar, button));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "already onLayoutChange, then updateBtnIconLogic");
            f(context, uVar, button);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIcon", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        }
    }

    public static void f(android.content.Context context, ab4.u uVar, android.widget.Button button) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        java.lang.String l17 = za4.t0.l("adId", uVar.Z);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17) && com.p314xaae8f345.mm.vfs.w6.j(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "icon exists, url = " + uVar.Z);
            c(context, uVar, button, l17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        java.lang.String str = uVar.Z;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        } else {
            button.hashCode();
            button.setTag(com.p314xaae8f345.mm.R.id.n1z, str);
            za4.t0.b("adId", str, false, 41, 0, new l44.b4(button, str, context, uVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnIconLogic", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
    }
}
