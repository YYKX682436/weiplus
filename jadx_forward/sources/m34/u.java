package m34;

/* loaded from: classes4.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 f404909d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74) {
        this.f404909d = c17691x8fb37d74;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = this.f404909d;
        if (c17691x8fb37d74.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) c17691x8fb37d74.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = c17691x8fb37d74.f244046m;
            if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) f4Var).mo69274xd5e29286(displayMetrics.widthPixels);
            }
        }
        ((android.view.View) c17691x8fb37d74.f244046m).requestLayout();
        ((android.view.View) c17691x8fb37d74.f244046m).postInvalidate();
    }
}
