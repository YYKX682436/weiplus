package l44;

/* loaded from: classes4.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.v5 f397927a = new l44.v5();

    public final int a(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimelineAdVisibleAreaHelper", "getTitleBarBottomY, activity !is MMActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            return 0;
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo2533x106ab264();
        android.view.View j17 = mo2533x106ab264 != null ? mo2533x106ab264.j() : null;
        if (j17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            return 0;
        }
        if (j17.getHeight() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            return 0;
        }
        int[] iArr = {0, 0};
        j17.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        j17.getLocalVisibleRect(rect);
        j17.getBottom();
        rect.toString();
        j17.getHeight();
        int height = iArr[1] + j17.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
        return height;
    }
}
