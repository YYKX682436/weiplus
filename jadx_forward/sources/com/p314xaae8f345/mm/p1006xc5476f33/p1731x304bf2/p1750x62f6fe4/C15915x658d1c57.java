package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4;

/* renamed from: com.tencent.mm.plugin.game.media.TextViewWithBottomLine */
/* loaded from: classes5.dex */
public class C15915x658d1c57 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f221632g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f221633h;

    public C15915x658d1c57(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public final void b() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f221632g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f221632g.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f221633h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f221633h) {
            canvas.drawRoundRect(0.0f, getHeight() - com.p314xaae8f345.mm.ui.zk.a(getContext(), 2), getWidth(), getHeight(), com.p314xaae8f345.mm.ui.zk.a(getContext(), 1), com.p314xaae8f345.mm.ui.zk.a(getContext(), 1), this.f221632g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z17) {
        this.f221633h = z17;
        if (z17) {
            setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        } else {
            setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        }
        invalidate();
    }

    public C15915x658d1c57(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }
}
