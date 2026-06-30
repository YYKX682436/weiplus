package ed5;

/* loaded from: classes10.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f332917d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f332918e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f332919f = true;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f332920g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f332921h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f332922i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f332923m;

    public t() {
        this.f332920g = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20476x6754bcd2()) == 1;
        this.f332922i = new android.graphics.drawable.ColorDrawable(android.graphics.Color.argb(64, 255, 0, 0));
    }

    public final void d(android.view.ViewGroup viewGroup, android.view.View view) {
        int width = (viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
        if (width < 0) {
            width = 0;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(makeMeasureSpec, 0, layoutParams != null ? layoutParams.width : -1);
        int paddingTop = viewGroup.getPaddingTop() + viewGroup.getPaddingBottom();
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        view.measure(childMeasureSpec, android.view.ViewGroup.getChildMeasureSpec(makeMeasureSpec2, paddingTop, layoutParams2 != null ? layoutParams2.height : -2));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7903x73cebf37(android.graphics.Canvas r24, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r25, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r26) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ed5.t.mo7903x73cebf37(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.h3):void");
    }
}
