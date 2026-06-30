package xk3;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f536576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f536577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f536578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xk3.o f536580h;

    public l(android.widget.FrameLayout frameLayout, com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, java.lang.String str, xk3.o oVar) {
        this.f536576d = frameLayout;
        this.f536577e = c21405x85fc1ce0;
        this.f536578f = c22699x3dcdb352;
        this.f536579g = str;
        this.f536580h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredWidth = (int) (this.f536576d.getMeasuredWidth() * 0.75d);
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = this.f536577e;
        c21405x85fc1ce0.setVisibility(0);
        this.f536578f.setVisibility(8);
        c21405x85fc1ce0.setLayoutParams(new android.widget.FrameLayout.LayoutParams(measuredWidth, measuredWidth, 17));
        n11.a.b().g(this.f536579g, c21405x85fc1ce0);
        this.f536580h.getClass();
        if (c21405x85fc1ce0 != null) {
            c21405x85fc1ce0.setOutlineProvider(new xk3.n(true, true, 4.0f));
        }
        if (c21405x85fc1ce0 != null) {
            c21405x85fc1ce0.setClipToOutline(true);
        }
        c21405x85fc1ce0.invalidate();
    }
}
