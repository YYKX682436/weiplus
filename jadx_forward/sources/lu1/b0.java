package lu1;

/* loaded from: classes9.dex */
public abstract class b0 {
    public static final android.graphics.Point a(android.view.View anchor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        int[] iArr = new int[2];
        anchor.getLocationOnScreen(iArr);
        int width = iArr[0] + (anchor.getWidth() / 2);
        int i17 = iArr[1];
        int height = anchor.getHeight() + i17;
        int i18 = i17 >= 0 ? i17 : 0;
        if (height > com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels) {
            height = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels;
        }
        return new android.graphics.Point(width, (i18 + height) / 2);
    }

    public static final void b(android.widget.ImageView imageView, java.lang.String url, float f17, boolean z17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        yo0.f fVar = new yo0.f();
        java.lang.String m17 = xt1.q.m(url);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getPictureStoragePath(...)");
        fVar.f545612c = m17;
        fVar.f545611b = true;
        fVar.f545620k = z17;
        fVar.f545614e = i18;
        fVar.f545615f = i19;
        fVar.f545610a = true;
        yo0.i a17 = fVar.a();
        vo0.e eVar = vo0.e.f520000a;
        vo0.e.f520001b.c(url, imageView, a17);
    }

    public static /* synthetic */ void c(android.widget.ImageView imageView, java.lang.String str, float f17, boolean z17, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            f17 = 0.0f;
        }
        float f18 = f17;
        boolean z18 = (i27 & 8) != 0 ? false : z17;
        if ((i27 & 16) != 0) {
            i17 = -1;
        }
        b(imageView, str, f18, z18, i17, (i27 & 32) != 0 ? 0 : i18, (i27 & 64) != 0 ? 0 : i19);
    }
}
