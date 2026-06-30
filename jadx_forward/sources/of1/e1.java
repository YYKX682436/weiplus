package of1;

/* loaded from: classes7.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f426441d;

    public e1(of1.w1 w1Var) {
        this.f426441d = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        of1.x1 m151214xc72aebdf;
        java.lang.Object m151214xc72aebdf2;
        java.util.ArrayList m151212x3906f789;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o4 o4Var;
        of1.w1 w1Var = this.f426441d;
        if (w1Var.f426569g) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "destroy hash[%d]", java.lang.Integer.valueOf(w1Var.hashCode()));
        m151214xc72aebdf = this.f426441d.m151214xc72aebdf();
        of1.v0 v0Var = (of1.v0) m151214xc72aebdf;
        v0Var.D0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 h4Var = v0Var.f426556b2;
        h4Var.f264450b.mo48814x2efc64();
        h4Var.f264449a.m43072x2efc64();
        h4Var.f264451c = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4.f264448j = null;
        of1.v vVar = v0Var.Y1;
        if (vVar != null) {
            while (true) {
                java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = vVar.f269026d;
                if (concurrentSkipListSet.isEmpty()) {
                    break;
                } else {
                    ((com.p314xaae8f345.p3210x3857dc.z) concurrentSkipListSet.pollFirst()).a();
                }
            }
            vVar.t();
        }
        if (v0Var.Z1 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = v0Var.W1;
            if (oVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m151232xaf156f4a = ((of1.w1) oVar).m151232xaf156f4a();
            if (m151232xaf156f4a != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = m151232xaf156f4a.mo32091x9a3f0ba2();
                if (mo32091x9a3f0ba2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.SafeScreenShotRecordSwitcher", "get, runtime is null");
                    o4Var = null;
                } else {
                    o4Var = mo32091x9a3f0ba2.T1;
                }
                if (o4Var != null) {
                    yz5.l lVar = v0Var.Z1;
                    if (lVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotRecordRuntimeSwitchValueChangedCallback");
                        throw null;
                    }
                    o4Var.f172059d.remove(lVar);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = v0Var.f426555a2;
        if (c19231x33dc2abd == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("transHelper");
            throw null;
        }
        c19231x33dc2abd.f263284q.mo48814x2efc64();
        this.f426441d.f426578s.mo120194xc77ccada();
        m151214xc72aebdf2 = this.f426441d.m151214xc72aebdf();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) m151214xc72aebdf2).y1();
        this.f426441d.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f426441d.f426578s;
        if (!c22633x83752a59.f292909y) {
            c22633x83752a59.mo52095x5cd39ffa();
        }
        this.f426441d.f426583x.clear();
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.a.f165403a;
        of1.w1 webview = this.f426441d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        android.util.SparseArray sparseArray2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.a.f165403a;
        synchronized (sparseArray2) {
            sparseArray2.remove(webview.m151220xb3e199bb());
        }
        of1.w1 w1Var2 = this.f426441d;
        synchronized (w1Var2.f426584y) {
            m151212x3906f789 = w1Var2.m151212x3906f789();
            m151212x3906f789.clear();
        }
        this.f426441d.f426569g = true;
    }
}
