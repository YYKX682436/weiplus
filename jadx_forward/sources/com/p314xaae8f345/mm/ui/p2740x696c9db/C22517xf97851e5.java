package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.PressAlphaImageView */
/* loaded from: classes2.dex */
public class C22517xf97851e5 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 {

    /* renamed from: r, reason: collision with root package name */
    public float f291671r;

    public C22517xf97851e5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291671r = 0.7f;
        super.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.b8(this));
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        iz5.a.g(null, false);
    }

    /* renamed from: setPressAlpha */
    public void m81093x8a4754dd(float f17) {
        this.f291671r = f17;
    }
}
