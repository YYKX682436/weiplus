package com.tencent.mm.plugin.emoji.ui.widget;

/* loaded from: classes5.dex */
public class ScaleRelativeLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final float f98539d;

    /* renamed from: e, reason: collision with root package name */
    public final float f98540e;

    /* renamed from: f, reason: collision with root package name */
    public float f98541f;

    /* renamed from: g, reason: collision with root package name */
    public float f98542g;

    /* renamed from: h, reason: collision with root package name */
    public float f98543h;

    /* renamed from: i, reason: collision with root package name */
    public float f98544i;

    /* renamed from: m, reason: collision with root package name */
    public final float f98545m;

    /* renamed from: n, reason: collision with root package name */
    public final float f98546n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f98547o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f98548p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f98549q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f98550r;

    public ScaleRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setScaleActionStatusCallback(m22.a0 a0Var) {
    }

    public void setScaleChild(android.view.View view) {
        this.f98547o = view;
    }

    public ScaleRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f98539d = 3.0f;
        this.f98540e = 0.5f;
        this.f98541f = 1.0f;
        this.f98542g = 1.0f;
        this.f98543h = 0.0f;
        this.f98544i = 0.0f;
        this.f98545m = 6.0f;
        this.f98546n = 0.3f;
        this.f98548p = false;
        this.f98550r = false;
    }
}
