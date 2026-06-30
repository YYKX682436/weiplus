package bc4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f100703a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f100704b = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    public final android.util.Size a(java.lang.String path) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (!com.p314xaae8f345.mm.vfs.w6.j(path)) {
            android.util.Size size = new android.util.Size(0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
            return size;
        }
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(path);
        android.util.Size size2 = n07 != null ? new android.util.Size(n07.outWidth, n07.outHeight) : new android.util.Size(0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        return size2;
    }

    public final void b(android.widget.ImageView targetView, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtFooterImageLoader", "loadImage >> path: " + str);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f100703a;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        targetView.post(new bc4.c(str, targetView, this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
    }
}
