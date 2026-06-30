package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.f1 f9567d;

    public e1(androidx.appcompat.widget.f1 f1Var) {
        this.f9567d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.widget.f1 f1Var = this.f9567d;
        f1Var.a();
        android.view.View view = f1Var.f9579g;
        if (view.isEnabled() && !view.isLongClickable() && f1Var.c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            f1Var.f9582m = true;
        }
    }
}
