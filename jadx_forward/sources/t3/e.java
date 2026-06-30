package t3;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b f496889d;

    public e(p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b bVar) {
        this.f496889d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View d17;
        int width;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b bVar = this.f496889d;
        int i17 = bVar.f92705b.f92667o;
        int i18 = bVar.f92704a;
        boolean z17 = i18 == 3;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = bVar.f92707d;
        if (z17) {
            d17 = c1097xe647fb9b.d(3);
            width = (d17 != null ? -d17.getWidth() : 0) + i17;
        } else {
            d17 = c1097xe647fb9b.d(5);
            width = c1097xe647fb9b.getWidth() - i17;
        }
        if (d17 != null) {
            if (((!z17 || d17.getLeft() >= width) && (z17 || d17.getLeft() <= width)) || c1097xe647fb9b.g(d17) != 0) {
                return;
            }
            p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) d17.getLayoutParams();
            bVar.f92705b.u(d17, width, d17.getTop());
            layoutParams.f92697c = true;
            c1097xe647fb9b.invalidate();
            android.view.View d18 = c1097xe647fb9b.d(i18 == 3 ? 5 : 3);
            if (d18 != null) {
                c1097xe647fb9b.b(d18);
            }
            if (c1097xe647fb9b.f92691w) {
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = c1097xe647fb9b.getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                c1097xe647fb9b.getChildAt(i19).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            c1097xe647fb9b.f92691w = true;
        }
    }
}
