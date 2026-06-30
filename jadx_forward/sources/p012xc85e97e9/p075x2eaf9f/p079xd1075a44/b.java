package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p075x2eaf9f.p079xd1075a44.c f92616d;

    public b(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.c cVar) {
        this.f92616d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.c cVar = this.f92616d;
        if (cVar.f92632u) {
            boolean z17 = cVar.f92630s;
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a aVar = cVar.f92618d;
            if (z17) {
                cVar.f92630s = false;
                aVar.getClass();
                long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                aVar.f92611e = currentAnimationTimeMillis;
                aVar.f92613g = -1L;
                aVar.f92612f = currentAnimationTimeMillis;
                aVar.f92614h = 0.5f;
            }
            if ((aVar.f92613g > 0 && android.view.animation.AnimationUtils.currentAnimationTimeMillis() > aVar.f92613g + ((long) aVar.f92615i)) || !cVar.e()) {
                cVar.f92632u = false;
                return;
            }
            boolean z18 = cVar.f92631t;
            android.view.View view = cVar.f92620f;
            if (z18) {
                cVar.f92631t = false;
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (aVar.f92612f == 0) {
                throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            float a17 = aVar.a(currentAnimationTimeMillis2);
            long j17 = currentAnimationTimeMillis2 - aVar.f92612f;
            aVar.f92612f = currentAnimationTimeMillis2;
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.l.b(((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.k) cVar).f92636x, (int) (((float) j17) * (((-4.0f) * a17 * a17) + (a17 * 4.0f)) * aVar.f92610d));
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(view, this);
        }
    }
}
