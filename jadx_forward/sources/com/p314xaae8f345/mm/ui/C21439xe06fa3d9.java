package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.SplashImageView */
/* loaded from: classes5.dex */
public class C21439xe06fa3d9 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f278622d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.ne f278623e;

    public C21439xe06fa3d9(android.content.Context context) {
        super(context);
        setBackgroundDrawable(getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cgq));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundDrawable(getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cgq));
        if (this.f278622d) {
            return;
        }
        this.f278622d = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ne neVar = this.f278623e;
        if (neVar != null) {
            ((com.p314xaae8f345.mm.ui.C21440xfcb6d020) neVar).c();
        }
    }

    /* renamed from: setOnDrawListener */
    public void m78821x4ac79299(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ne neVar) {
        this.f278623e = neVar;
    }

    public C21439xe06fa3d9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cgq));
    }

    public C21439xe06fa3d9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setBackgroundDrawable(getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cgq));
    }
}
