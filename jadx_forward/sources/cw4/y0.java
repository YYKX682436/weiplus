package cw4;

/* loaded from: classes8.dex */
public final class y0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f305838a;

    public y0(java.lang.ref.WeakReference weakWebViewTransHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakWebViewTransHelper, "weakWebViewTransHelper");
        this.f305838a = weakWebViewTransHelper;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "page commit");
        java.lang.ref.WeakReference weakReference = this.f305838a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd) weakReference.get();
        boolean z17 = false;
        if (c19231x33dc2abd2 != null && c19231x33dc2abd2.f263281n) {
            z17 = true;
        }
        if (z17 && (c19231x33dc2abd = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd) weakReference.get()) != null) {
            c19231x33dc2abd.m74135xac0b38b1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd) weakReference.get();
        if (c19231x33dc2abd3 != null) {
            c19231x33dc2abd3.d(c27816xac2547f9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd) weakReference.get();
        if (c19231x33dc2abd4 != null) {
            c19231x33dc2abd4.c().d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "page start");
        java.lang.ref.WeakReference weakReference = this.f305838a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd) weakReference.get();
        boolean z17 = false;
        if (c19231x33dc2abd2 != null && !c19231x33dc2abd2.f263281n) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd) weakReference.get();
        if (((c19231x33dc2abd3 == null || (j0Var = c19231x33dc2abd3.f263278h) == null) ? null : (cw4.p0) j0Var.mo3195x754a37bb()) != cw4.p0.f305798f || (c19231x33dc2abd = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd) weakReference.get()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd.a(c19231x33dc2abd);
    }
}
