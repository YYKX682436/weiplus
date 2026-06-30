package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5;

/* renamed from: com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView */
/* loaded from: classes4.dex */
public class C18393x3e165bd9 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f252183d;

    /* renamed from: e, reason: collision with root package name */
    public int f252184e;

    /* renamed from: f, reason: collision with root package name */
    public int f252185f;

    /* renamed from: g, reason: collision with root package name */
    public int f252186g;

    /* renamed from: h, reason: collision with root package name */
    public int f252187h;

    /* renamed from: i, reason: collision with root package name */
    public int f252188i;

    public C18393x3e165bd9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252183d = new android.graphics.Paint();
        this.f252184e = 0;
        this.f252185f = 0;
        this.f252186g = 0;
        this.f252187h = 0;
        this.f252188i = 0;
        this.f252185f = com.p314xaae8f345.mm.ui.zk.a(getContext(), 4);
        this.f252186g = com.p314xaae8f345.mm.ui.zk.a(getContext(), 2);
    }

    public void a(int i17) {
        this.f252184e = i17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f252184e > 0) {
            int measuredWidth = getMeasuredWidth() / 2;
            int i17 = this.f252184e;
            if (i17 > 1) {
                int i18 = this.f252186g;
                measuredWidth -= (((i18 + i18) * i17) + ((i17 - 1) * this.f252185f)) / 2;
            }
            for (int i19 = 0; i19 < this.f252184e; i19++) {
                android.graphics.Paint paint = this.f252183d;
                if (i19 == 0) {
                    if (this.f252187h != 0) {
                        paint.setColor(getContext().getResources().getColor(this.f252187h));
                    } else {
                        paint.setColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880));
                    }
                } else if (this.f252188i != 0) {
                    paint.setColor(getContext().getResources().getColor(this.f252188i));
                } else {
                    paint.setColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741));
                }
                int measuredHeight = getMeasuredHeight() - (getPaddingBottom() + getPaddingTop());
                int i27 = this.f252185f;
                int i28 = this.f252186g;
                canvas.drawCircle(((i27 + i28 + i28) * i19) + measuredWidth, getPaddingTop() + (measuredHeight / 2), this.f252186g, paint);
            }
        }
    }

    public C18393x3e165bd9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f252183d = new android.graphics.Paint();
        this.f252184e = 0;
        this.f252185f = 0;
        this.f252186g = 0;
        this.f252187h = 0;
        this.f252188i = 0;
        this.f252185f = com.p314xaae8f345.mm.ui.zk.a(getContext(), 4);
        this.f252186g = com.p314xaae8f345.mm.ui.zk.a(getContext(), 2);
    }
}
