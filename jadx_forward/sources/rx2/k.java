package rx2;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.p f482510d;

    public k(rx2.p pVar) {
        this.f482510d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        rx2.p pVar = this.f482510d;
        android.view.View decorView = pVar.f482516d.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) decorView).addView(pVar.f482519g, layoutParams);
        pVar.f482519g.setVisibility(8);
    }
}
