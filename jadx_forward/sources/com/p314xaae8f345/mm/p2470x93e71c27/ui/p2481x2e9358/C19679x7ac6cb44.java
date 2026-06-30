package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChattingUILayout */
/* loaded from: classes11.dex */
public class C19679x7ac6cb44 extends com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415 {

    /* renamed from: n, reason: collision with root package name */
    public int f271670n;

    /* renamed from: o, reason: collision with root package name */
    public int f271671o;

    /* renamed from: p, reason: collision with root package name */
    public int f271672p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f271673q;

    public C19679x7ac6cb44(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f271670n = 0;
        this.f271671o = 0;
        this.f271672p = 0;
        this.f271673q = new android.graphics.Paint(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22601x66cbd65e, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f271672p > 0 && com.p314xaae8f345.mm.ui.b4.c(getContext())) {
            canvas.drawRect(0.0f, getMeasuredHeight() - this.f271672p, getMeasuredWidth(), getMeasuredHeight(), this.f271673q);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect rect) {
        rect.toString();
        getFitsSystemWindows();
        rect.bottom += this.f271670n;
        rect.right += this.f271671o;
        if (com.p314xaae8f345.mm.ui.b4.c(getContext()) && getFitsSystemWindows()) {
            this.f271672p = rect.bottom;
            android.graphics.Paint paint = this.f271673q;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        }
        return super.fitSystemWindows(rect);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415
    /* renamed from: getPanelView */
    public java.util.List<android.view.View> mo66217xa7118813() {
        return new java.util.ArrayList();
    }
}
