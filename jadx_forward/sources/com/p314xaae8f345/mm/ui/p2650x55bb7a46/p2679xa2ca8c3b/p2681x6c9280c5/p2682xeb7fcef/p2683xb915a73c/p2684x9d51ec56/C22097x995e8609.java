package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionOverlayView;", "Landroid/view/View;", "Ljf5/q0;", "d", "Ljf5/q0;", "getSelectionManager", "()Ljf5/q0;", "setSelectionManager", "(Ljf5/q0;)V", "selectionManager", "", "Ljf5/f0;", "Landroid/graphics/PointF;", "e", "Ljava/util/Map;", "getContentOffsets", "()Ljava/util/Map;", "setContentOffsets", "(Ljava/util/Map;)V", "contentOffsets", "", "value", "getHighlightColor", "()I", "setHighlightColor", "(I)V", "highlightColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.SelectionOverlayView */
/* loaded from: classes14.dex */
public final class C22097x995e8609 extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public jf5.q0 selectionManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public java.util.Map contentOffsets;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f286231f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f286232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22097x995e8609(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.contentOffsets = kz5.q0.f395534d;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f286231f = paint;
        this.f286232g = new android.graphics.Rect();
    }

    /* renamed from: getContentOffsets */
    public final java.util.Map<jf5.f0, android.graphics.PointF> m80157xa77a147d() {
        return this.contentOffsets;
    }

    /* renamed from: getHighlightColor */
    public final int m80158xbd65005() {
        return this.f286231f.getColor();
    }

    public final jf5.q0 getSelectionManager() {
        return this.selectionManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156 A[LOOP:1: B:24:0x0150->B:26:0x0156, LOOP_END] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22097x995e8609.onDraw(android.graphics.Canvas):void");
    }

    /* renamed from: setContentOffsets */
    public final void m80160x6f707c89(java.util.Map<jf5.f0, ? extends android.graphics.PointF> map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<set-?>");
        this.contentOffsets = map;
    }

    /* renamed from: setHighlightColor */
    public final void m80161xd3ccb811(int i17) {
        android.graphics.Paint paint = this.f286231f;
        if (paint.getColor() != i17) {
            paint.setColor(i17);
            invalidate();
        }
    }

    /* renamed from: setSelectionManager */
    public final void m80162x9c119d03(jf5.q0 q0Var) {
        this.selectionManager = q0Var;
    }
}
