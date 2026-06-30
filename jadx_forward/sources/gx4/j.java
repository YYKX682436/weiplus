package gx4;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f f358954d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f) {
        this.f358954d = c19350xc6738d4f;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f = this.f358954d;
        float f17 = (((float) (currentTimeMillis - c19350xc6738d4f.f265512r)) * 1.0f) / 200.0f;
        if (f17 > 1.0f) {
            android.graphics.Point point = c19350xc6738d4f.f265511q;
            c19350xc6738d4f.c(point.x, point.y);
            c19350xc6738d4f.onAnimationEnd();
            return;
        }
        c19350xc6738d4f.f265507m.mo50297x7c4d7ca2(c19350xc6738d4f.f265515u, 5L);
        android.graphics.Point point2 = c19350xc6738d4f.f265510p;
        int i17 = point2.x;
        android.graphics.Point point3 = c19350xc6738d4f.f265511q;
        int i18 = point2.y;
        c19350xc6738d4f.c(i17 + ((int) (((point3.x * 1.0f) - i17) * f17)), i18 + ((int) (((point3.y * 1.0f) - i18) * f17)));
    }
}
