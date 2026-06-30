package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f91100d;

    public e1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f1Var) {
        this.f91100d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f1Var = this.f91100d;
        f1Var.a();
        android.view.View view = f1Var.f91112g;
        if (view.isEnabled() && !view.isLongClickable() && f1Var.c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            f1Var.f91115m = true;
        }
    }
}
