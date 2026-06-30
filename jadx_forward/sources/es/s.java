package es;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f337807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es.t f337808e;

    public s(es.t tVar, boolean z17) {
        this.f337808e = tVar;
        this.f337807d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f337807d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        es.t tVar = this.f337808e;
        kd.c.c("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", valueOf, java.lang.Integer.valueOf(tVar.f337810b));
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab = tVar.f337811c;
        c10455x858f5ab.f146506t = z17;
        if (!z17) {
            c10455x858f5ab.f146509w = false;
        } else if (tVar.f337810b > 0) {
            es.k.b(0.0f);
        } else {
            es.k.b(1.0f);
        }
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab2 = tVar.f337811c;
        c10455x858f5ab2.getClass();
        kd.c.c("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", java.lang.Boolean.valueOf(z17));
        c10455x858f5ab2.f146507u = z17;
        if (z17) {
            com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab3 = tVar.f337811c;
            if (c10455x858f5ab3.f146510x) {
                int i17 = tVar.f337810b;
                if (i17 == 0) {
                    es.g.a(c10455x858f5ab3.f146499m, 200L, 0.0f, 0.0f, new es.p(this));
                } else {
                    es.g.a(c10455x858f5ab3.f146499m, 200L, i17, 0.0f, new es.r(this));
                    es.k.a(true, tVar.f337810b);
                }
            }
        }
        tVar.f337811c.f146510x = false;
    }
}
