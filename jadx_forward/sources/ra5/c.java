package ra5;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f475090d;

    public c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f475090d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f475090d;
        view.setSelected(false);
        android.graphics.drawable.Drawable drawable = view.getContext().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560846vt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
        view.setBackground(drawable);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(240);
        ofInt.addUpdateListener(new ra5.a(drawable));
        ofInt.setDuration(100L);
        ofInt.addListener(new ra5.b(drawable, this));
        ofInt.start();
    }
}
