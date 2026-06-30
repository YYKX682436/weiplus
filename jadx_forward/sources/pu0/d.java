package pu0;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pu0.e f439945d;

    public d(pu0.e eVar) {
        this.f439945d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pu0.e eVar = this.f439945d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            synchronized (eVar.f439947b) {
                gp.d dVar = eVar.f439946a;
                if (dVar != null) {
                    dVar.release();
                }
                eVar.f439946a = null;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }
}
