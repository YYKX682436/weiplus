package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44;

/* renamed from: com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout */
/* loaded from: classes5.dex */
public class C13381xc5ae2ce0 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final float f180072d;

    /* renamed from: e, reason: collision with root package name */
    public final float f180073e;

    /* renamed from: f, reason: collision with root package name */
    public float f180074f;

    /* renamed from: g, reason: collision with root package name */
    public float f180075g;

    /* renamed from: h, reason: collision with root package name */
    public float f180076h;

    /* renamed from: i, reason: collision with root package name */
    public float f180077i;

    /* renamed from: m, reason: collision with root package name */
    public final float f180078m;

    /* renamed from: n, reason: collision with root package name */
    public final float f180079n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f180080o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f180081p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f180082q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f180083r;

    public C13381xc5ae2ce0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13381xc5ae2ce0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setScaleActionStatusCallback */
    public void m54872x9c932055(m22.a0 a0Var) {
    }

    /* renamed from: setScaleChild */
    public void m54873x8d873ff4(android.view.View view) {
        this.f180080o = view;
    }

    public C13381xc5ae2ce0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180072d = 3.0f;
        this.f180073e = 0.5f;
        this.f180074f = 1.0f;
        this.f180075g = 1.0f;
        this.f180076h = 0.0f;
        this.f180077i = 0.0f;
        this.f180078m = 6.0f;
        this.f180079n = 0.3f;
        this.f180081p = false;
        this.f180083r = false;
    }
}
