package fq1;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f347032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f347033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f347034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f347035g;

    public b(android.view.View view, int i17, int i18, android.view.View view2) {
        this.f347032d = view;
        this.f347033e = i17;
        this.f347034f = i18;
        this.f347035g = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f347032d;
        view.getHitRect(rect);
        int b17 = i65.a.b(view.getContext(), this.f347033e);
        int b18 = i65.a.b(view.getContext(), this.f347034f);
        rect.left += b17;
        rect.top += b18;
        rect.right += b17;
        rect.bottom += b18;
        this.f347035g.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
