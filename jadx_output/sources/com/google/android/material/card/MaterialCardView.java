package com.google.android.material.card;

/* loaded from: classes13.dex */
public class MaterialCardView extends androidx.cardview.widget.CardView {

    /* renamed from: n, reason: collision with root package name */
    public final aa.a f44463n;

    public MaterialCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478345hc);
    }

    public int getStrokeColor() {
        return this.f44463n.f2476b;
    }

    public int getStrokeWidth() {
        return this.f44463n.f2477c;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f17) {
        super.setRadius(f17);
        this.f44463n.b();
    }

    public void setStrokeColor(int i17) {
        aa.a aVar = this.f44463n;
        aVar.f2476b = i17;
        aVar.b();
    }

    public void setStrokeWidth(int i17) {
        aa.a aVar = this.f44463n;
        aVar.f2477c = i17;
        aVar.b();
        aVar.a();
    }

    public MaterialCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434125o, i17, com.tencent.mm.R.style.f494753vb, new int[0]);
        aa.a aVar = new aa.a(this);
        this.f44463n = aVar;
        aVar.f2476b = d17.getColor(0, -1);
        aVar.f2477c = d17.getDimensionPixelSize(1, 0);
        aVar.b();
        aVar.a();
        d17.recycle();
    }
}
