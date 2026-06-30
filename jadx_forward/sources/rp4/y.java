package rp4;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final rp4.y f480242a = new rp4.y();

    public final void a(java.lang.String videoPath, java.lang.String thumbPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        if (com.p314xaae8f345.mm.vfs.w6.j(thumbPath)) {
            com.p314xaae8f345.mm.vfs.w6.h(thumbPath);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxFileUtil", "");
        android.graphics.Bitmap p17 = ai3.d.p(videoPath);
        if (p17 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(dw3.c0.f325715a.f(p17, i17), 60, android.graphics.Bitmap.CompressFormat.JPEG, thumbPath, true);
        }
    }

    public final void b(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69219x922a682f(path);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxFileUtil", "time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
