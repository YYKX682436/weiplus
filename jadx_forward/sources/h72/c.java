package h72;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.d f360953e;

    public c(h72.d dVar, int i17) {
        this.f360953e = dVar;
        this.f360952d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13514xca0b073c c13514xca0b073c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13514xca0b073c c13514xca0b073c2;
        try {
            try {
                ei3.m mVar = this.f360953e.f360954d.f361000a;
                if (mVar != null) {
                    mVar.mo127748x6761d4f();
                }
            } catch (java.lang.Exception e17) {
                h72.s sVar = this.f360953e.f360954d;
                java.lang.Object[] objArr = {e17.getMessage()};
                h72.s sVar2 = h72.s.f360997r;
                sVar.i("MicroMsg.FaceVideoRecorder", "hy: onError, reset mediaRecorder error: %s", objArr);
            }
            h72.s.c(this.f360953e.f360954d);
            synchronized (this.f360953e.f360954d.f361001b) {
                this.f360953e.f360954d.f361003d = h72.q.INITIALIZED;
            }
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13514xca0b073c.class) {
                c13514xca0b073c = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13514xca0b073c.f181483e;
            }
            if (c13514xca0b073c != null) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13514xca0b073c.class) {
                    c13514xca0b073c2 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13514xca0b073c.f181483e;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.d(c13514xca0b073c2.f181484d, 2, this.f360952d);
            }
        } catch (java.lang.Throwable th6) {
            h72.s.c(this.f360953e.f360954d);
            throw th6;
        }
    }
}
