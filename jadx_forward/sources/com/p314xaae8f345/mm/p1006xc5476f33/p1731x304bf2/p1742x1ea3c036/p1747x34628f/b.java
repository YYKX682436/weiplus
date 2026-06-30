package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 {
    public b(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        this.f263719t.setVisibility(8);
        this.M.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w0(this));
        me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab = this.f488189m;
        if (c29141x858f5ab != null) {
            c29141x858f5ab.m147199x8e764904(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, sd.k
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameInsertWebPage", "onBackground");
        B("onPause");
        this.f263713p.mo74095xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, sd.k
    public void f() {
        if (this.V) {
            return;
        }
        this.V = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameInsertWebPage", "onDestroy");
        B("onDestroy");
        this.B.f264202j = null;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264159a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264161c.remove(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264162d.remove(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.a(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar = this.f263711J;
        dVar.f264929p = true;
        dVar.f264915b.clear();
        this.f488188i.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, sd.k
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameInsertWebPage", "onForeground");
        B("onResume");
        this.f263713p.mo74096x57429eec();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public boolean n() {
        return false;
    }
}
