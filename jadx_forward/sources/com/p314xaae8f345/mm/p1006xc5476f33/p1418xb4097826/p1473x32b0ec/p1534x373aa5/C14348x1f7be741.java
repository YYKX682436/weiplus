package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveSkewView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveSkewView */
/* loaded from: classes3.dex */
public final class C14348x1f7be741 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final float f197630d;

    /* renamed from: e, reason: collision with root package name */
    public final float f197631e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f197632f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f197633g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Matrix f197634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14348x1f7be741(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f197634h = matrix;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vd2.x5.f517544f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f197630d = obtainStyledAttributes.getFloat(0, 0.0f);
            this.f197631e = obtainStyledAttributes.getFloat(1, 0.0f);
            this.f197632f = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        matrix.setSkew(this.f197630d, this.f197631e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r5.f197631e == 0.0f) == false) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            java.lang.String r0 = "canvas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r6.save()
            float r0 = r5.f197630d
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L13
            r0 = r2
            goto L14
        L13:
            r0 = r3
        L14:
            r4 = 0
            if (r0 == 0) goto L21
            float r0 = r5.f197631e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L52
        L21:
            android.graphics.drawable.Drawable r0 = r5.f197632f
            if (r0 == 0) goto L52
            android.graphics.Bitmap r1 = r5.f197633g
            if (r1 != 0) goto L52
            int r1 = r5.getMeasuredWidth()
            int r2 = r5.getMeasuredHeight()
            r0.setBounds(r3, r3, r1, r2)
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L4c
            if (r1 == 0) goto L3e
            r1 = r0
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            goto L3f
        L3e:
            r1 = r4
        L3f:
            if (r1 == 0) goto L4c
            int r2 = r5.getMeasuredWidth()
            int r3 = r5.getMeasuredHeight()
            r1.setSize(r2, r3)
        L4c:
            android.graphics.Bitmap r0 = pm0.v.n(r0)
            r5.f197633g = r0
        L52:
            android.graphics.Bitmap r0 = r5.f197633g
            if (r0 == 0) goto L5b
            android.graphics.Matrix r1 = r5.f197634h
            r6.drawBitmap(r0, r1, r4)
        L5b:
            super.onDraw(r6)
            r6.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14348x1f7be741.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14348x1f7be741(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
