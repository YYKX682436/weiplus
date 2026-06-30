package n74;

/* loaded from: classes4.dex */
public abstract class x0 {
    public static android.widget.ImageView a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x79511098, int i17, int i18) {
        android.widget.FrameLayout.LayoutParams e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
        if (context == null || c17989x79511098 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
            return null;
        }
        try {
            e17 = c17989x79511098.e(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AddWeAppIconHelper", th6.toString());
        }
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AddWeAppIconHelper", "getEachImageViewLayoutParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
            return null;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(e17);
        layoutParams.width = i18;
        layoutParams.height = i18;
        imageView.setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.bpt));
        imageView.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
        return imageView;
    }
}
