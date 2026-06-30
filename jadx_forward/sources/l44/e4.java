package l44;

/* loaded from: classes4.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab4.u f397653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f397655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f397656h;

    public e4(java.lang.String str, ab4.u uVar, android.content.Context context, android.widget.Button button, int i17) {
        this.f397652d = str;
        this.f397653e = uVar;
        this.f397654f = context;
        this.f397655g = button;
        this.f397656h = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4");
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f397652d, null);
        if (J2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", "onDownloaded, bitmap == null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4");
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new l44.d4(this, J2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4");
        }
    }
}
