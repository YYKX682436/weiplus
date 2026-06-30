package bc4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.r2 f19170a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f19171b = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    public final android.util.Size a(java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        kotlin.jvm.internal.o.g(path, "path");
        if (!com.tencent.mm.vfs.w6.j(path)) {
            android.util.Size size = new android.util.Size(0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
            return size;
        }
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(path);
        android.util.Size size2 = n07 != null ? new android.util.Size(n07.outWidth, n07.outHeight) : new android.util.Size(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        return size2;
    }

    public final void b(android.widget.ImageView targetView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtFooterImageLoader", "loadImage >> path: " + str);
        kotlinx.coroutines.r2 r2Var = this.f19170a;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        targetView.post(new bc4.c(str, targetView, this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
    }
}
