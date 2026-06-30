package com.tencent.mm.blink;

/* loaded from: classes11.dex */
public class FirstScreenFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public nm.l f63232d;

    public FirstScreenFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f63232d != null) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postAtFrontOfQueue(new nm.k(this));
        }
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        super.setPadding(i17, i18, i19, i27);
    }

    public FirstScreenFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
