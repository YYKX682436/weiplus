package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185420f;

    public l3(android.view.View view, android.view.View view2, in5.s0 s0Var) {
        this.f185418d = view;
        this.f185419e = view2;
        this.f185420f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        android.view.View view = this.f185418d;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = this.f185419e.getMeasuredWidth();
            view.setLayoutParams(layoutParams);
            int dimensionPixelOffset = layoutParams.width - this.f185420f.f374654e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561248d8);
            if (dimensionPixelOffset <= 0 || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565376c75)) == null) {
                return;
            }
            textView.setMaxWidth(dimensionPixelOffset);
        }
    }
}
