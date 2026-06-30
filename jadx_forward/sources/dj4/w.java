package dj4;

/* loaded from: classes10.dex */
public abstract class w {
    public static final void a(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f394148d).g(new dj4.v(callback));
    }

    public static final android.graphics.Bitmap b(java.lang.String str) {
        android.graphics.Bitmap K = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K(str);
        if (K != null) {
            int width = K.getWidth();
            int height = K.getHeight();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l1.f274350a;
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u1.f274536a.f274566a;
            if (width > i17) {
                K = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(K, i17, K.getHeight(), true);
            } else if (height > i17) {
                K = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(K, K.getWidth(), i17, true);
            }
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        return a17 == 0 ? K : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(K, a17, 1.0f, 1.0f);
    }

    public static final void c(android.graphics.Bitmap bitmap, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (bitmap == null) {
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, path, false);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.StatusImgHandler", "save bitmap to image path:" + path + ", failed: " + e17);
        }
    }
}
