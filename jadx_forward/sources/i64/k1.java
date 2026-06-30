package i64;

/* loaded from: classes4.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f370745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.l1 f370746e;

    public k1(i64.l1 l1Var, android.graphics.Bitmap bitmap) {
        this.f370746e = l1Var;
        this.f370745d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        i64.l1 l1Var = this.f370746e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
        android.graphics.Bitmap bitmap = this.f370745d;
        if (bitmap != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "setImageToImageView set bitmap, exp=" + th6.toString());
            }
            if (!bitmap.isRecycled()) {
                i64.m1 m1Var = l1Var.f370761m;
                i64.m1 m1Var2 = i64.m1.f370771c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = m1Var.f370773b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                r2Var.put(l1Var.f370758g, bitmap);
                i64.m1 m1Var3 = l1Var.f370761m;
                android.widget.ImageView imageView = l1Var.f370760i;
                java.lang.String str = l1Var.f370758g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                m1Var3.a(imageView, str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsTimelineAdResourceMgr", "decode bitmap failed!!! Is the bitmap file valid?");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
    }
}
