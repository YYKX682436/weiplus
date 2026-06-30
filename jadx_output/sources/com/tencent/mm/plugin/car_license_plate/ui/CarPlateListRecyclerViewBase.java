package com.tencent.mm.plugin.car_license_plate.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarPlateListRecyclerViewBase;", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class CarPlateListRecyclerViewBase extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {
    public CarPlateListRecyclerViewBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.o() == true) goto L8;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.n2 r0 = r3.getItemAnimator()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.o()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L13
            return r1
        L13:
            boolean r4 = super.dispatchTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.car_license_plate.ui.CarPlateListRecyclerViewBase.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.o() == true) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.n2 r0 = r3.getItemAnimator()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.o()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L13
            return r1
        L13:
            boolean r4 = super.onInterceptTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.car_license_plate.ui.CarPlateListRecyclerViewBase.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.o() == true) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.n2 r0 = r3.getItemAnimator()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.o()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L13
            return r1
        L13:
            boolean r4 = super.onTouchEvent(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L18
            goto L24
        L18:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r4)
            r0 = 3
            r4.setAction(r0)
            boolean r4 = super.onTouchEvent(r4)
        L24:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.car_license_plate.ui.CarPlateListRecyclerViewBase.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public CarPlateListRecyclerViewBase(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
