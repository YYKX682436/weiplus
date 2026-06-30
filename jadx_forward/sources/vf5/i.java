package vf5;

/* loaded from: classes.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f517953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f517954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f517955f;

    public i(android.view.View view, int i17, int i18) {
        this.f517953d = view;
        this.f517954e = i17;
        this.f517955f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f517953d;
        int paddingBottom = view.getPaddingBottom();
        if (paddingBottom == 0) {
            paddingBottom = this.f517954e;
        }
        int i17 = paddingBottom + this.f517955f;
        if (i17 < 0) {
            i17 = 0;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i17);
    }
}
