package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103887f;

    public l3(android.view.View view, android.view.View view2, in5.s0 s0Var) {
        this.f103885d = view;
        this.f103886e = view2;
        this.f103887f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        android.view.View view = this.f103885d;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = this.f103886e.getMeasuredWidth();
            view.setLayoutParams(layoutParams);
            int dimensionPixelOffset = layoutParams.width - this.f103887f.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479715d8);
            if (dimensionPixelOffset <= 0 || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483843c75)) == null) {
                return;
            }
            textView.setMaxWidth(dimensionPixelOffset);
        }
    }
}
