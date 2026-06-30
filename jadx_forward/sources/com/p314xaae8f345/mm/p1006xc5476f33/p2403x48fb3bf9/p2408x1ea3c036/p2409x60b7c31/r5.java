package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public abstract class r5 extends sd.c {
    @Override // sd.c
    public void a(sd.b bVar) {
        java.lang.String name = getClass().getName();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(name, "gamelog.jsapi, webview, invoke", null);
        if (c() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19270x19357e76 c19270x19357e76 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19270x19357e76();
            c19270x19357e76.f263763f = bVar;
            c19270x19357e76.f263765h = getClass().getName();
            c19270x19357e76.f263764g = bVar.f488130b.f426039c.toString();
            c19270x19357e76.d();
            return;
        }
        if (c() != 2) {
            e(bVar);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p5 p5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p5(this, bVar);
        bundle.putString("jsapi_name", getClass().getName());
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bVar.f488130b.f426039c.toString());
        if (bVar.f488130b.f426039c.optLong("liteCallbackId", 0L) != 0) {
            new sw4.k().a(((sd.a) bVar.f488129a).mo64555x76847179(), bundle, p5Var);
        } else {
            sw4.g.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((sd.a) bVar.f488129a).mo64555x76847179(), bundle, sw4.k.class, p5Var);
        }
    }

    public abstract int c();

    public abstract void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var);

    public abstract void e(sd.b bVar);
}
