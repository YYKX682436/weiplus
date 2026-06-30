package com.p314xaae8f345.mm.p638x597af5c;

/* renamed from: com.tencent.mm.blink.FirstScreenFrameLayout */
/* loaded from: classes11.dex */
public class C7182xc7dc863b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public nm.l f144765d;

    public C7182xc7dc863b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f144765d != null) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50294x9395cba4(new nm.k(this));
        }
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        super.setPadding(i17, i18, i19, i27);
    }

    public C7182xc7dc863b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
