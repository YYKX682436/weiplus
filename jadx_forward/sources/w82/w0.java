package w82;

/* loaded from: classes5.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f525474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525475f;

    public w0(android.view.View view, int i17, android.view.View view2) {
        this.f525473d = view;
        this.f525474e = i17;
        this.f525475f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f525473d;
        view.getHitRect(rect);
        int i17 = rect.top;
        int i18 = this.f525474e;
        rect.top = i17 - i18;
        rect.bottom += i18;
        rect.left -= i18;
        rect.right += i18;
        this.f525475f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
