package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCommentRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "j2", "I", "getCropTopLength", "()I", "setCropTopLength", "(I)V", "cropTopLength", "k2", "getFadeLength", "setFadeLength", "fadeLength", "Landroid/graphics/Paint;", "l2", "Ljz5/g;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "m2", "getGradientRectTop", "()Landroid/graphics/Rect;", "gradientRectTop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentRecyclerView */
/* loaded from: classes4.dex */
public final class C14306x285ebfd1 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 {

    /* renamed from: n2, reason: collision with root package name */
    public static final int[] f197364n2 = {0, -16777216};

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public int cropTopLength;

    /* renamed from: k2, reason: collision with root package name and from kotlin metadata */
    public int fadeLength;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g paint;

    /* renamed from: m2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g gradientRectTop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14306x285ebfd1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.cropTopLength = -1;
        this.fadeLength = -1;
        this.paint = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r3.f198160d);
        this.gradientRectTop = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.q3.f198132d);
    }

    /* renamed from: getGradientRectTop */
    private final android.graphics.Rect m57272xdf6ff14b() {
        return (android.graphics.Rect) this.gradientRectTop.mo141623x754a37bb();
    }

    /* renamed from: getPaint */
    private final android.graphics.Paint m57273x74f59ea8() {
        return (android.graphics.Paint) this.paint.mo141623x754a37bb();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.cropTopLength <= 0 || this.fadeLength <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop() + this.cropTopLength;
        int width = getWidth() - getPaddingRight();
        int i17 = this.fadeLength + paddingTop;
        m57272xdf6ff14b().set(paddingLeft, paddingTop, width, i17);
        float f17 = paddingLeft;
        m57273x74f59ea8().setShader(new android.graphics.LinearGradient(f17, paddingTop, f17, i17, f197364n2, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        canvas.drawRect(m57272xdf6ff14b(), m57273x74f59ea8());
        canvas.restoreToCount(saveLayer);
    }

    public final int getCropTopLength() {
        return this.cropTopLength;
    }

    public final int getFadeLength() {
        return this.fadeLength;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onDraw(android.graphics.Canvas c17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        super.onDraw(c17);
        if (this.cropTopLength > 0) {
            c17.clipRect(new android.graphics.Rect(0, this.cropTopLength, getWidth(), getHeight()));
        }
    }

    /* renamed from: setCropTopLength */
    public final void m57276xc68c3ea9(int i17) {
        this.cropTopLength = i17;
    }

    /* renamed from: setFadeLength */
    public final void m57277x99d43684(int i17) {
        this.fadeLength = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14306x285ebfd1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.cropTopLength = -1;
        this.fadeLength = -1;
        this.paint = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r3.f198160d);
        this.gradientRectTop = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.q3.f198132d);
    }
}
