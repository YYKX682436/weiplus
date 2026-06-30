package l42;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5999x77bc6a4f f397530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f397531e;

    public m(l42.n nVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5999x77bc6a4f c5999x77bc6a4f) {
        this.f397531e = nVar;
        this.f397530d = c5999x77bc6a4f;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.ut utVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5999x77bc6a4f c5999x77bc6a4f = this.f397530d;
        if (c5999x77bc6a4f == null || (utVar = c5999x77bc6a4f.f136293g) == null) {
            return;
        }
        long j17 = utVar.f89668a;
        if (j17 == 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent configID : " + valueOf + ", isDel : " + this.f397530d.f136293g.f89670c);
        if (this.f397530d.f136293g.f89670c.booleanValue()) {
            t42.a.b(valueOf, 9, 0L);
        } else {
            t42.a.b(valueOf, 8, 0L);
        }
        synchronized (this.f397531e.f397533e) {
            if (this.f397530d.f136293g.f89670c.booleanValue()) {
                if (!((java.util.HashMap) this.f397531e.f397533e).containsKey(valueOf)) {
                    return;
                }
                s42.c cVar = (s42.c) ((java.util.HashMap) this.f397531e.f397533e).remove(valueOf);
                if (cVar != null && this.f397531e.f397537i != null) {
                    fs.g.b(l42.z.class, new l42.C29061x2e0100(cVar));
                }
            } else {
                if (u46.l.e(this.f397530d.f136293g.f89669b)) {
                    return;
                }
                final s42.c cVar2 = (s42.c) ((java.util.HashMap) this.f397531e.f397533e).get(valueOf);
                if (cVar2 != null && u46.l.c(cVar2.f484484g, this.f397530d.f136293g.f89669b)) {
                    ((l42.d) this.f397531e.f397537i).getClass();
                    fs.g.b(l42.z.class, new fs.o() { // from class: l42.d$$c
                        @Override // fs.o
                        public final boolean a(fs.n nVar) {
                            ((p30.a) ((l42.z) nVar)).getClass();
                            g42.f.Bi().getClass();
                            s42.c cVar3 = s42.c.this;
                            if (cVar3 == null) {
                                return false;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingMgr", "[EdgeComputingMgr] onSqlConfigSame sameConfig : " + cVar3.f484478a);
                            return false;
                        }
                    });
                    return;
                }
                s42.c g17 = this.f397531e.f397536h.g(valueOf, this.f397530d.f136293g.f89669b);
                if (g17 == null) {
                    return;
                }
                ((java.util.HashMap) this.f397531e.f397533e).put(g17.f484478a, g17);
                if (this.f397531e.f397537i != null) {
                    fs.g.b(l42.z.class, new l42.C29058x2e00fd(g17));
                }
            }
            this.f397531e.Ri();
        }
    }
}
