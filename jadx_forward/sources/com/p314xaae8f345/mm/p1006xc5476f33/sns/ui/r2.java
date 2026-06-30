package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class r2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f251905c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f251906d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f251907e;

    public r2(android.widget.ImageView iv6, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iv6, "iv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f251905c = iv6;
        this.f251906d = path;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public java.lang.Object a(java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        java.lang.String[] params = (java.lang.String[]) objArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        int nj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.nj();
        int nj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.nj();
        this.f251907e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(this.f251906d, nj6, nj7, true);
        this.f251907e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(this.f251907e, com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(r3).m43592x7a249f0b());
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        return bool;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public java.util.concurrent.ExecutorService b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExecutor", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        java.util.concurrent.ExecutorService ij6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.ij();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ij6, "getMediaExecutor(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExecutor", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        return ij6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public void c(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        super.c(java.lang.Boolean.valueOf(booleanValue));
        if (ca4.z0.f(this.f251907e)) {
            this.f251905c.setImageBitmap(this.f251907e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
    }
}
