package androidx.core.widget;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.core.widget.c f11083d;

    public b(androidx.core.widget.c cVar) {
        this.f11083d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.core.widget.c cVar = this.f11083d;
        if (cVar.f11099u) {
            boolean z17 = cVar.f11097s;
            androidx.core.widget.a aVar = cVar.f11085d;
            if (z17) {
                cVar.f11097s = false;
                aVar.getClass();
                long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                aVar.f11078e = currentAnimationTimeMillis;
                aVar.f11080g = -1L;
                aVar.f11079f = currentAnimationTimeMillis;
                aVar.f11081h = 0.5f;
            }
            if ((aVar.f11080g > 0 && android.view.animation.AnimationUtils.currentAnimationTimeMillis() > aVar.f11080g + ((long) aVar.f11082i)) || !cVar.e()) {
                cVar.f11099u = false;
                return;
            }
            boolean z18 = cVar.f11098t;
            android.view.View view = cVar.f11087f;
            if (z18) {
                cVar.f11098t = false;
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (aVar.f11079f == 0) {
                throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            float a17 = aVar.a(currentAnimationTimeMillis2);
            long j17 = currentAnimationTimeMillis2 - aVar.f11079f;
            aVar.f11079f = currentAnimationTimeMillis2;
            androidx.core.widget.l.b(((androidx.core.widget.k) cVar).f11103x, (int) (((float) j17) * (((-4.0f) * a17 * a17) + (a17 * 4.0f)) * aVar.f11077d));
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(view, this);
        }
    }
}
