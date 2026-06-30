package jx0;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f383923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f383924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f383925f;

    public q(android.view.View view, int i17, android.view.View view2) {
        this.f383923d = view;
        this.f383924e = i17;
        this.f383925f = view2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view2 = this.f383923d;
        view2.getHitRect(rect);
        int i39 = rect.top;
        int i47 = this.f383924e;
        rect.top = i39 - i47;
        rect.left -= i47;
        rect.bottom += i47;
        rect.right += i47;
        this.f383925f.setTouchDelegate(new android.view.TouchDelegate(rect, view2));
    }
}
