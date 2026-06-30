package ud4;

/* loaded from: classes13.dex */
public class i0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a f508248a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a, ud4.w wVar) {
        this.f508248a = c18379xb7ff44a;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
        if (message.what == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a = this.f508248a;
            c18379xb7ff44a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("detectedLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            android.view.View childAt = c18379xb7ff44a.getChildAt(c18379xb7ff44a.T);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "detectedLongPress downPos:%d, lastTouchX:%f, lastTouchY:%f, downX:%d, downY:%d, mTotalOffsetRawX:%f, mTotalOffsetRawY:%f", java.lang.Integer.valueOf(c18379xb7ff44a.T), java.lang.Float.valueOf(c18379xb7ff44a.U), java.lang.Float.valueOf(c18379xb7ff44a.V), java.lang.Integer.valueOf(c18379xb7ff44a.f251801q), java.lang.Integer.valueOf(c18379xb7ff44a.f251802r), java.lang.Float.valueOf(c18379xb7ff44a.f251798o), java.lang.Float.valueOf(c18379xb7ff44a.f251799p));
            if (c18379xb7ff44a.D || c18379xb7ff44a.E || !ud4.u.a(childAt, c18379xb7ff44a.U, c18379xb7ff44a.V) || java.lang.Math.abs(c18379xb7ff44a.U - c18379xb7ff44a.f251801q) >= 50.0f || java.lang.Math.abs(c18379xb7ff44a.V - c18379xb7ff44a.f251802r) >= 50.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "touch outside");
            } else {
                int i17 = c18379xb7ff44a.T;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (c18379xb7ff44a.G) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "startEditMode: ");
                    c18379xb7ff44a.requestDisallowInterceptTouchEvent(true);
                    c18379xb7ff44a.s();
                    if (c18379xb7ff44a.F) {
                        c18379xb7ff44a.x();
                    }
                    if (i17 != -1) {
                        boolean w17 = c18379xb7ff44a.w(i17);
                        c18379xb7ff44a.B = w17;
                        if (w17) {
                            c18379xb7ff44a.f251808x = true;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("detectedLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
    }
}
