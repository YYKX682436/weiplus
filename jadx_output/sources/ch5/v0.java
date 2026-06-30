package ch5;

/* loaded from: classes3.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f41628d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context) {
        super(0);
        this.f41628d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f41628d;
        com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity halfScreenTransparentActivity = context instanceof com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity ? (com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity) context : null;
        android.widget.FrameLayout frameLayout = halfScreenTransparentActivity != null ? (android.widget.FrameLayout) halfScreenTransparentActivity.findViewById(com.tencent.mm.R.id.jlt) : null;
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(-16777216);
        if (frameLayout != null) {
            frameLayout.addView(view, 0);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            view.setLayoutParams(layoutParams);
        }
        if (frameLayout != null) {
            return view;
        }
        return null;
    }
}
