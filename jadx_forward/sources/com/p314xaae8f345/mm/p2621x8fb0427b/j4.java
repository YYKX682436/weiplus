package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class j4 implements com.p314xaae8f345.mm.p2621x8fb0427b.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f276584a = new java.util.concurrent.ConcurrentHashMap();

    public j4(com.p314xaae8f345.mm.p2621x8fb0427b.i4 i4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.b8
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 get(java.lang.String str) {
        for (com.p314xaae8f345.mm.p2621x8fb0427b.b8 b8Var : this.f276584a.keySet()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = b8Var.get(str);
            if (z3Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[get] contact=" + z3Var.d1() + " listener=" + b8Var);
                return z3Var;
            }
        }
        java.util.Iterator it = ((fs.c) fs.g.f(com.p314xaae8f345.mm.p2621x8fb0427b.c8.class)).all().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.c8 c8Var = (com.p314xaae8f345.mm.p2621x8fb0427b.c8) ((fs.q) it.next()).get();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = c8Var.get(str);
            if (z3Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[get] contact=" + z3Var2.d1() + " listener=" + c8Var);
                return z3Var2;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.b8
    public int o0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        for (com.p314xaae8f345.mm.p2621x8fb0427b.b8 b8Var : this.f276584a.keySet()) {
            int o07 = b8Var.o0(z3Var, z17);
            if (o07 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[replace] ret=%s listener=%s", java.lang.Integer.valueOf(o07), b8Var);
                return o07;
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.p2621x8fb0427b.c8.class)).all()) {
            int o08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.c8) qVar.get()).o0(z3Var, z17);
            if (o08 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "[replace] ret=%s listener=%s", java.lang.Integer.valueOf(o08), qVar.get());
                return o08;
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.b8
    public void w0(final com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var, final com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.util.Iterator it = this.f276584a.keySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.b8) it.next()).w0(e8Var, z3Var);
        }
        fs.g.b(com.p314xaae8f345.mm.p2621x8fb0427b.c8.class, new fs.o() { // from class: com.tencent.mm.storage.j4$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.c8) nVar).w0(com.p314xaae8f345.mm.p2621x8fb0427b.e8.this, z3Var);
                return false;
            }
        });
    }
}
