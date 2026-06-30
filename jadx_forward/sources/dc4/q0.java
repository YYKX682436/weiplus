package dc4;

/* loaded from: classes4.dex */
public class q0 implements jb4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dc4.v0 f310344c;

    public q0(dc4.v0 v0Var, java.lang.String str, java.lang.String str2) {
        this.f310344c = v0Var;
        this.f310342a = str;
        this.f310343b = str2;
    }

    @Override // jb4.u
    public void a(boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
        if (str2 == null || !str2.equals(this.f310342a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
            return;
        }
        dc4.v0 v0Var = this.f310344c;
        if (bitmap != null) {
            dc4.v0.l(v0Var).setImageBitmap(bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "show progressView");
            dc4.v0.m(v0Var).setVisibility(0);
            dc4.v0.m(v0Var).a();
            java.lang.String str3 = this.f310343b;
            if (android.text.TextUtils.isEmpty(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "thumbUrl is empty");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "have no shot and thumb cache, start download thumb image");
                za4.t0.c(str3, false, 133, 0, new dc4.p0(this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
    }

    @Override // jb4.u
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
    }
}
