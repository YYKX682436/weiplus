package pa3;

/* loaded from: classes5.dex */
public final class e extends dp1.a {

    /* renamed from: m, reason: collision with root package name */
    public final android.app.Activity f434514m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.app.Activity activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f434514m = activity;
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo50328x12501425() {
        return pa3.w.b(pa3.w.f434545a, mo50330x8c409d27(), java.lang.Integer.valueOf(mo50330x8c409d27().getWidth()), java.lang.Integer.valueOf(mo50330x8c409d27().getHeight()), null, 8, null);
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getContentView */
    public android.view.View mo50329xc2a54588() {
        android.app.Activity activity = this.f434514m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ext.ui.SwipeBackActivity");
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab = ((com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) activity).f146491d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c10455x858f5ab, "getSwipeBackLayout(...)");
        return c10455x858f5ab;
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getMaskView */
    public android.view.View mo50330x8c409d27() {
        android.view.ViewGroup a17 = a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getRootView(...)");
        return a17;
    }

    @Override // dp1.u, dp1.x
    public boolean p() {
        return true;
    }

    @Override // dp1.u, dp1.x
    public boolean t() {
        return true;
    }
}
