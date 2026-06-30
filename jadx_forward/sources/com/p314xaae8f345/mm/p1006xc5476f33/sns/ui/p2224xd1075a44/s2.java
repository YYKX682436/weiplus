package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public class s2 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2 f252798d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2();

    /* renamed from: a, reason: collision with root package name */
    public nm0.a f252799a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f252800b = 0;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f252801c;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2 s2Var = f252798d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return s2Var;
    }

    public nm0.a b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int b17 = i65.a.b(context, (int) (i65.a.q(context) * 15.0f));
        nm0.a aVar = this.f252799a;
        if (aVar == null || ((int) aVar.f419995l) != b17) {
            nm0.b a17 = nm0.b.a();
            a17.f419999a.f419995l = b17;
            int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77759x7b87af68);
            nm0.a aVar2 = a17.f419999a;
            aVar2.f419996m = color;
            aVar2.f419990g = 16;
            this.f252799a = aVar2;
        }
        nm0.a aVar3 = this.f252799a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return aVar3;
    }

    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        if (this.f252800b <= 0) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.rj().x;
            int dimension = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.i_) + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.i_));
            int dimension2 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aau);
            int dimension3 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            int i18 = ((i17 - dimension2) - dimension) - dimension3;
            this.f252800b = i18;
            if (i18 <= 0) {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                i17 = displayMetrics.widthPixels;
                this.f252800b = ((i17 - dimension2) - dimension) - dimension3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentPreloadTextViewConfig", "try again, screenWidth " + i17 + " textViewWidth " + this.f252800b + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
            }
            ca4.e1 e1Var = ca4.f1.f121430a;
            android.app.Activity activity = this.f252801c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTimelineUIContext", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            boolean z17 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTimelineUIContext", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (z17) {
                int s17 = e1Var.s(this.f252801c);
                if (s17 <= 0) {
                    s17 = this.f252800b;
                }
                this.f252800b = s17;
            } else if (com.p314xaae8f345.mm.ui.bk.v0() && com.p314xaae8f345.mm.ui.bk.y()) {
                if (fp.h.c(30) && com.p314xaae8f345.mm.ui.ee.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    this.f252800b = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aav);
                } else if ((com.p314xaae8f345.mm.ui.bk.N(this.f252801c.getTaskId()) || (com.p314xaae8f345.mm.ui.bk.O(this.f252801c.getContentResolver()) && !this.f252801c.isInMultiWindowMode())) && !com.p314xaae8f345.mm.ui.ee.b(this.f252801c.getTaskId())) {
                    this.f252800b = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aav);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentPreloadTextViewConfig", "screenWidth " + i17 + " textViewWidth " + this.f252800b + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
        }
        int i19 = this.f252800b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return i19;
    }
}
