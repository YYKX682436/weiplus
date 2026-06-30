package wm3;

/* loaded from: classes9.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm3.j f528801d;

    public h(wm3.j jVar) {
        this.f528801d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wm3.j jVar = this.f528801d;
        java.util.ArrayList arrayList = jVar.f528811n;
        arrayList.clear();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = jVar.m158354x19263085();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b) m158354x19263085 : null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = abstractActivityC21555x39071a9b != null ? abstractActivityC21555x39071a9b.m79336x8b97809d() : null;
        if (m79336x8b97809d != null) {
            java.util.Iterator it = ((java.util.List) ((jz5.n) jVar.f528810m).mo141623x754a37bb()).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.lang.ref.WeakReference) it.next()).get();
                if (c21560x1fce98fb != null) {
                    if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).q(c21560x1fce98fb.f279313q)) {
                        arrayList.add(new java.lang.ref.WeakReference(c21560x1fce98fb));
                    }
                }
            }
        }
        jVar.V6();
    }
}
