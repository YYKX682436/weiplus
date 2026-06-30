package kn5;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn5.e f391319d;

    public d(kn5.e eVar) {
        this.f391319d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kn5.c cVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        kn5.e eVar = this.f391319d;
        boolean z17 = true;
        if (eVar.f391339z) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = eVar.f391328o;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.scrollBy(0, -eVar.B);
            }
            eVar.f391321e.postDelayed(this, 25L);
        } else if (eVar.A) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = eVar.f391328o;
            if (c1163xf1deaba43 != null) {
                c1163xf1deaba43.scrollBy(0, eVar.B);
            }
            eVar.f391321e.postDelayed(this, 25L);
        } else {
            z17 = false;
        }
        if (!z17 || (cVar = eVar.D) == null || (c1163xf1deaba4 = eVar.f391328o) == null) {
            return;
        }
        android.graphics.Rect rect = kn5.f.f391340a;
        eVar.e(kn5.f.a(c1163xf1deaba4, cVar.f391317a, cVar.f391318b));
    }
}
