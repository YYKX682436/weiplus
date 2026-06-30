package rb2;

/* loaded from: classes.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475378f;

    public z(android.view.View view, android.view.View view2, in5.s0 s0Var) {
        this.f475376d = view;
        this.f475377e = view2;
        this.f475378f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        android.view.View view = this.f475376d;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = this.f475377e.getMeasuredWidth();
            view.setLayoutParams(layoutParams);
            int dimensionPixelOffset = layoutParams.width - this.f475378f.f374654e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561248d8);
            if (dimensionPixelOffset <= 0 || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565376c75)) == null) {
                return;
            }
            textView.setMaxWidth(dimensionPixelOffset);
        }
    }
}
