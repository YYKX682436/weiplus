package ch5;

/* loaded from: classes3.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f123161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context) {
        super(0);
        this.f123161d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f123161d;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962 activityC22413xb8aa5962 = context instanceof com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962 ? (com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962) context : null;
        android.widget.FrameLayout frameLayout = activityC22413xb8aa5962 != null ? (android.widget.FrameLayout) activityC22413xb8aa5962.findViewById(com.p314xaae8f345.mm.R.id.jlt) : null;
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
