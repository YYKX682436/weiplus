package ck1;

/* loaded from: classes4.dex */
public final class w extends rl5.r {

    /* renamed from: p1, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42392p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.view.View view, android.content.Context context) {
        super(context);
        this.f42392p1 = view;
    }

    @Override // rl5.r
    public boolean m() {
        android.view.View view = this.f42392p1;
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        view.setBackgroundResource(com.tencent.mm.R.drawable.f480835dt);
        return n(0, 0);
    }

    @Override // rl5.r, android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.View view = this.f42392p1;
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        view.setBackgroundResource(com.tencent.mm.R.color.a9e);
        super.onDismiss();
    }
}
