package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes2.dex */
public final class z2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f197303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2 f197304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f197305f;

    public z2(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2 u2Var, int[] iArr) {
        this.f197303d = textView;
        this.f197304e = u2Var;
        this.f197305f = iArr;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        float width;
        float height;
        float f17;
        float f18;
        android.widget.TextView textView = this.f197303d;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        int ordinal = this.f197304e.ordinal();
        if (ordinal != 0) {
            height = 0.0f;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    f17 = 0.0f;
                    f18 = 0.0f;
                } else {
                    f18 = textView.getHeight();
                    f17 = 0.0f;
                }
                textView.getPaint().setShader(new android.graphics.LinearGradient(0.0f, 0.0f, f17, f18, this.f197305f, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                return true;
            }
            width = textView.getWidth();
        } else {
            width = textView.getWidth();
            height = textView.getHeight();
        }
        f17 = width;
        f18 = height;
        textView.getPaint().setShader(new android.graphics.LinearGradient(0.0f, 0.0f, f17, f18, this.f197305f, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }
}
