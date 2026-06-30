package nl5;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.h f419799d;

    public e(nl5.h hVar) {
        this.f419799d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        nl5.h hVar = this.f419799d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (hVar.f419815k) {
                if (android.os.SystemClock.uptimeMillis() - hVar.f419819o > 500) {
                    hVar.c();
                } else {
                    android.widget.TextView textView = hVar.f419805a;
                    int[] iArr = hVar.f419820p;
                    textView.getLocationInWindow(iArr);
                    int i17 = iArr[1];
                    if (i17 == hVar.f419818n) {
                        hVar.c();
                    } else {
                        hVar.f419818n = i17;
                        textView.postDelayed(hVar.f419823s, 16L);
                    }
                }
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            hVar.a();
        }
    }
}
