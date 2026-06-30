package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/MvFrameListView;", "Landroid/view/View;", "", "value", "i", "I", "getDrawStart", "()I", "setDrawStart", "(I)V", "drawStart", "m", "getDrawEnd", "setDrawEnd", "drawEnd", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvFrameListView */
/* loaded from: classes10.dex */
public final class C16707x92645a7 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f233537d;

    /* renamed from: e, reason: collision with root package name */
    public kp4.a f233538e;

    /* renamed from: f, reason: collision with root package name */
    public qm3.i f233539f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f233540g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f233541h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int drawStart;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int drawEnd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16707x92645a7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f233537d = paint;
        this.f233541h = new android.graphics.Rect();
        this.drawStart = -1;
        this.drawEnd = -1;
        paint.setAntiAlias(true);
        setBackgroundColor(385875967);
    }

    public final int getDrawEnd() {
        return this.drawEnd;
    }

    public final int getDrawStart() {
        return this.drawStart;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r11.a() == true) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16707x92645a7.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int width = this.f233541h.width();
        kp4.a aVar = this.f233538e;
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(width * (aVar != null ? aVar.f392604a : 0), 1073741824), i18);
    }

    /* renamed from: setDrawEnd */
    public final void m67400x23443635(int i17) {
        this.drawEnd = i17;
        invalidate();
    }

    /* renamed from: setDrawStart */
    public final void m67401x63d7833c(int i17) {
        this.drawStart = i17;
        invalidate();
    }
}
