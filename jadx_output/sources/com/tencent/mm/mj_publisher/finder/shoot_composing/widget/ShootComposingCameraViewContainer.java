package com.tencent.mm.mj_publisher.finder.shoot_composing.widget;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\n\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/widget/ShootComposingCameraViewContainer;", "Landroid/widget/FrameLayout;", "Lay0/b;", "d", "Lay0/b;", "getScaleMode", "()Lay0/b;", "setScaleMode", "(Lay0/b;)V", "scaleMode", "Lay0/a;", "e", "Lay0/a;", "getAspectRatio", "()Lay0/a;", "setAspectRatio", "(Lay0/a;)V", "aspectRatio", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ShootComposingCameraViewContainer extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ay0.b scaleMode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ay0.a aspectRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShootComposingCameraViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.scaleMode = ay0.b.f15196d;
        this.aspectRatio = ay0.a.f15194d;
    }

    public final ay0.a getAspectRatio() {
        return this.aspectRatio;
    }

    public final ay0.b getScaleMode() {
        return this.scaleMode;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            int measuredWidth2 = childAt.getMeasuredWidth();
            int measuredHeight2 = childAt.getMeasuredHeight();
            int i29 = (measuredWidth - measuredWidth2) / 2;
            int i37 = (measuredHeight - measuredHeight2) / 2;
            childAt.layout(i29, i37, measuredWidth2 + i29, measuredHeight2 + i37);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r9 = getChildCount();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r1 >= r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        getChildAt(r1).measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (r0 * r8), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((int) (r2 * r8), 1073741824));
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r8 > r9) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r8 < r9) goto L14;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r8 = r7.getMeasuredWidth()
            int r9 = r7.getMeasuredHeight()
            ay0.a r0 = r7.aspectRatio
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L21
            if (r0 != r1) goto L1b
            r0 = 1077936128(0x40400000, float:3.0)
            r2 = 1082130432(0x40800000, float:4.0)
            goto L25
        L1b:
            jz5.j r8 = new jz5.j
            r8.<init>()
            throw r8
        L21:
            r0 = 1091567616(0x41100000, float:9.0)
            r2 = 1098907648(0x41800000, float:16.0)
        L25:
            ay0.b r3 = r7.scaleMode
            int r3 = r3.ordinal()
            if (r3 == 0) goto L3f
            if (r3 != r1) goto L39
            float r8 = (float) r8
            float r8 = r8 / r0
            float r9 = (float) r9
            float r9 = r9 / r2
            int r1 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r1 >= 0) goto L48
        L37:
            r8 = r9
            goto L48
        L39:
            jz5.j r8 = new jz5.j
            r8.<init>()
            throw r8
        L3f:
            float r8 = (float) r8
            float r8 = r8 / r0
            float r9 = (float) r9
            float r9 = r9 / r2
            int r1 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r1 <= 0) goto L48
            goto L37
        L48:
            int r9 = r7.getChildCount()
            r1 = 0
        L4d:
            if (r1 >= r9) goto L69
            android.view.View r3 = r7.getChildAt(r1)
            float r4 = r0 * r8
            int r4 = (int) r4
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            float r6 = r2 * r8
            int r6 = (int) r6
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r5)
            r3.measure(r4, r5)
            int r1 = r1 + 1
            goto L4d
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.shoot_composing.widget.ShootComposingCameraViewContainer.onMeasure(int, int):void");
    }

    public final void setAspectRatio(ay0.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.aspectRatio = aVar;
    }

    public final void setScaleMode(ay0.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<set-?>");
        this.scaleMode = bVar;
    }
}
