package kk3;

/* loaded from: classes8.dex */
public interface d {
    static /* synthetic */ void a(kk3.d dVar, android.graphics.Bitmap bitmap, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAnimationEnd");
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        dVar.b(bitmap, i17);
    }

    static /* synthetic */ void c(kk3.d dVar, android.graphics.Bitmap bitmap, boolean z17, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAnimationStart");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        dVar.d(bitmap, z17, i17);
    }

    static /* synthetic */ void f(kk3.d dVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAnimationCancel");
        }
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        dVar.e(i17);
    }

    void b(android.graphics.Bitmap bitmap, int i17);

    void d(android.graphics.Bitmap bitmap, boolean z17, int i17);

    void e(int i17);
}
