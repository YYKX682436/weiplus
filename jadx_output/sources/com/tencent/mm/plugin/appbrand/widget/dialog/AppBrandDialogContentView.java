package com.tencent.mm.plugin.appbrand.widget.dialog;

/* loaded from: classes5.dex */
public class AppBrandDialogContentView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f91126d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.MotionEvent f91127e;

    public AppBrandDialogContentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91126d = new int[]{0, 0};
        this.f91127e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if (r0 != 6) goto L16;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1f
            int r0 = r3.getAction()
            if (r0 == 0) goto L19
            r1 = 1
            if (r0 == r1) goto L15
            r1 = 3
            if (r0 == r1) goto L15
            r1 = 5
            if (r0 == r1) goto L19
            r1 = 6
            if (r0 == r1) goto L15
            goto L1f
        L15:
            r0 = 0
            r2.f91127e = r0
            goto L1f
        L19:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3)
            r2.f91127e = r0
        L1f:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandDialogContentView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public android.view.MotionEvent getLastPointerDownTouchEvent() {
        return this.f91127e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.content.Context context = getContext();
        if (!com.tencent.mm.plugin.appbrand.utils.m3.b(context) && context.getResources().getConfiguration().orientation != 2) {
            super.onMeasure(i17, i18);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        int[] dialogMeasuredWidthHeight = this.f91126d;
        dialogMeasuredWidthHeight[0] = size;
        dialogMeasuredWidthHeight[1] = android.view.View.MeasureSpec.getSize(i18);
        android.content.Context context2 = getContext();
        android.util.DisplayMetrics dm6 = getContext().getResources().getDisplayMetrics();
        kotlin.jvm.internal.o.g(context2, "context");
        kotlin.jvm.internal.o.g(dialogMeasuredWidthHeight, "dialogMeasuredWidthHeight");
        kotlin.jvm.internal.o.g(dm6, "dm");
        if (com.tencent.mm.plugin.appbrand.utils.m3.b(context2) || context2.getResources().getConfiguration().orientation == 2) {
            int i19 = dialogMeasuredWidthHeight[0];
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480119ok);
            int max = java.lang.Math.max(dimensionPixelSize, context2.getResources().getDisplayMetrics().widthPixels / 2);
            if (i19 < dimensionPixelSize) {
                i19 = dimensionPixelSize;
            } else if (i19 > max) {
                i19 = max;
            }
            dialogMeasuredWidthHeight[0] = i19;
        }
        setMeasuredDimension(dialogMeasuredWidthHeight[0], dialogMeasuredWidthHeight[1]);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(dialogMeasuredWidthHeight[0], android.view.View.MeasureSpec.getMode(i17)), android.view.View.MeasureSpec.makeMeasureSpec(dialogMeasuredWidthHeight[1], android.view.View.MeasureSpec.getMode(i18)));
    }

    public AppBrandDialogContentView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91126d = new int[]{0, 0};
        this.f91127e = null;
    }
}
