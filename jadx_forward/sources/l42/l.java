package l42;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5998x499615ec f397528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l42.n f397529e;

    public l(l42.n nVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5998x499615ec c5998x499615ec) {
        this.f397529e = nVar;
        this.f397528d = c5998x499615ec;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.tt ttVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5998x499615ec c5998x499615ec = this.f397528d;
        if (c5998x499615ec == null || (ttVar = c5998x499615ec.f136292g) == null) {
            return;
        }
        long j17 = ttVar.f89567a;
        if (j17 == 0) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionPageConfigChangeEvent configID : " + valueOf + ", isDel : " + this.f397528d.f136292g.f89569c);
        if (this.f397528d.f136292g.f89569c.booleanValue()) {
            t42.a.b(valueOf, 2, 0L);
        } else {
            t42.a.b(valueOf, 1, 0L);
        }
        synchronized (this.f397529e.f397532d) {
            if (this.f397528d.f136292g.f89569c.booleanValue()) {
                if (!((java.util.HashMap) this.f397529e.f397532d).containsKey(valueOf)) {
                    return;
                }
                s42.b bVar = (s42.b) ((java.util.HashMap) this.f397529e.f397532d).remove(valueOf);
                if (bVar != null && this.f397529e.f397537i != null) {
                    fs.g.b(l42.z.class, new l42.C29062x2e0101(bVar));
                }
            } else {
                if (u46.l.e(this.f397528d.f136292g.f89568b)) {
                    return;
                }
                final s42.b bVar2 = (s42.b) ((java.util.HashMap) this.f397529e.f397532d).get(valueOf);
                if (bVar2 != null && u46.l.c(bVar2.f484476m, this.f397528d.f136292g.f89568b)) {
                    ((l42.d) this.f397529e.f397537i).getClass();
                    fs.g.b(l42.z.class, new fs.o() { // from class: l42.d$$b
                        @Override // fs.o
                        public final boolean a(fs.n nVar) {
                            ((p30.a) ((l42.z) nVar)).getClass();
                            g42.f Bi = g42.f.Bi();
                            Bi.getClass();
                            s42.b bVar3 = s42.b.this;
                            if (bVar3 == null) {
                                return false;
                            }
                            if (g42.i.g()) {
                                Bi.f350262o.mo50293x3498a0(new g42.e(Bi, bVar3));
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingMgr", "[EdgeComputingMgr] onScriptConfigSame sameConfig : " + bVar3.f484464a);
                            return false;
                        }
                    });
                    return;
                }
                s42.b f17 = this.f397529e.f397536h.f(valueOf, this.f397528d.f136292g.f89568b);
                if (f17 == null) {
                    return;
                }
                ((java.util.HashMap) this.f397529e.f397532d).put(f17.f484464a, f17);
                if (this.f397529e.f397537i != null) {
                    fs.g.b(l42.z.class, new l42.C29063x2e0102(f17));
                }
            }
            this.f397529e.Ni();
            l42.n.wi(this.f397529e);
        }
    }
}
