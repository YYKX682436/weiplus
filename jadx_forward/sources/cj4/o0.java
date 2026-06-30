package cj4;

/* loaded from: classes5.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f123541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f123542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f123543f;

    public o0(android.widget.TextView textView, int i17, android.view.View view) {
        this.f123541d = textView;
        this.f123542e = i17;
        this.f123543f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.TextView textView = this.f123541d;
        textView.getHitRect(rect);
        int i17 = rect.top;
        int i18 = this.f123542e;
        rect.top = i17 - i18;
        rect.bottom += i18;
        rect.left -= i18;
        rect.right += i18;
        this.f123543f.setTouchDelegate(new android.view.TouchDelegate(rect, textView));
    }
}
