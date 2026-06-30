package com.tencent.mm.plugin.emoji.ui.v3.widget.preview;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/widget/preview/PreviewRelativeEmotionRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class PreviewRelativeEmotionRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public final gn5.b f98514b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f98515c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f98516d2;

    /* renamed from: e2, reason: collision with root package name */
    public float f98517e2;

    /* renamed from: f2, reason: collision with root package name */
    public float f98518f2;

    /* renamed from: g2, reason: collision with root package name */
    public final int f98519g2;

    /* renamed from: h2, reason: collision with root package name */
    public final long f98520h2;

    /* renamed from: i2, reason: collision with root package name */
    public final boolean f98521i2;

    /* renamed from: j2, reason: collision with root package name */
    public final java.lang.Runnable f98522j2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewRelativeEmotionRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r1 != 3) goto L26;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r7, r0)
            boolean r0 = r6.f98521i2
            if (r0 != 0) goto Le
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        Le:
            int r1 = r7.getActionMasked()
            java.lang.Runnable r2 = r6.f98522j2
            r3 = 3
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L5b
            if (r1 == r5) goto L56
            r0 = 2
            if (r1 == r0) goto L21
            if (r1 == r3) goto L56
            goto L78
        L21:
            r7.getX()
            r7.getY()
            boolean r0 = r6.f98515c2
            if (r0 == 0) goto L78
            boolean r0 = r6.f98516d2
            if (r0 != 0) goto L78
            float r0 = r6.f98517e2
            float r1 = r7.getX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r6.f98519g2
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L50
            float r0 = r6.f98518f2
            float r4 = r7.getY()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L78
        L50:
            r6.f98516d2 = r5
            r6.removeCallbacks(r2)
            goto L78
        L56:
            r6.f98515c2 = r4
            r6.f98516d2 = r4
            goto L78
        L5b:
            r6.f98515c2 = r5
            r6.f98516d2 = r4
            float r1 = r7.getX()
            r6.f98517e2 = r1
            float r1 = r7.getY()
            r6.f98518f2 = r1
            r7.getX()
            r7.getY()
            if (r0 == 0) goto L78
            long r0 = r6.f98520h2
            r6.postDelayed(r2, r0)
        L78:
            int r0 = r7.getActionMasked()
            if (r0 == r3) goto L84
            int r0 = r7.getActionMasked()
            if (r0 != r5) goto L8e
        L84:
            r6.removeCallbacks(r2)
            gn5.b r0 = r6.f98514b2
            if (r0 == 0) goto L8e
            r0.c()
        L8e:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.v3.widget.preview.PreviewRelativeEmotionRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return super.onInterceptTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewRelativeEmotionRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98521i2 = true;
        this.f98522j2 = new l22.a(this);
        this.f98514b2 = new gn5.o(context, -1);
        this.f98520h2 = android.view.ViewConfiguration.getLongPressTimeout();
        this.f98519g2 = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
