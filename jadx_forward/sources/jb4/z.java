package jb4;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f380391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933 f380393f;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933 c17931xd3691933, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f380393f = c17931xd3691933;
        this.f380391d = bitmap;
        this.f380392e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateImage in GLThread, bmp.w=");
        android.graphics.Bitmap bitmap = this.f380391d;
        sb6.append(bitmap == null ? 0 : bitmap.getWidth());
        sb6.append(", h=");
        sb6.append(bitmap == null ? 0 : bitmap.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933 c17931xd3691933 = this.f380393f;
        jb4.e0 g17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933.g(c17931xd3691933);
        g17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = g17.f380328j;
            if (i17 != 0) {
                android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereRender", "delete old texture");
            }
            int b17 = jb4.f0.b(bitmap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereRender", "updateImage, oldId=" + g17.f380328j + ", newId=" + b17 + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            g17.f380328j = b17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereRender", "updateImage, exp:" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        c17931xd3691933.d();
        if (c17931xd3691933.V != null) {
            c17931xd3691933.I.post(new jb4.y(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3");
    }
}
