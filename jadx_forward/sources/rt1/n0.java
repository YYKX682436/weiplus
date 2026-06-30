package rt1;

/* loaded from: classes.dex */
public final class n0 extends rl5.r {

    /* renamed from: p1, reason: collision with root package name */
    public final /* synthetic */ android.view.View f480991p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.view.View view, android.content.Context context) {
        super(context);
        this.f480991p1 = view;
    }

    @Override // rl5.r
    public boolean a() {
        android.view.ViewParent parent = this.f480991p1.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.a();
    }

    @Override // rl5.r
    public boolean n(int i17, int i18) {
        android.view.ViewParent parent = this.f480991p1.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.n(i17, i18);
    }
}
