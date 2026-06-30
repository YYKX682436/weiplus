package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ii implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li f188567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cd2.c f188568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f188569f;

    public ii(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar, cd2.c cVar, int i17) {
        this.f188567d = liVar;
        this.f188568e = cVar;
        this.f188569f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f188567d;
        if (itemId == liVar.f188838r) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar = liVar.f188827d;
            byte[] bArr = (byte[]) uhVar.f190720i.get(java.lang.Integer.valueOf(uhVar.f190716e));
            if (bArr == null) {
                bArr = new byte[0];
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
            az2.c cVar = az2.f.f97658d;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = liVar.f188830g;
            az2.f a17 = az2.c.a(cVar, abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 200L, null, 8, null);
            a17.a();
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String str = (java.lang.String) ((jz5.n) uhVar.f190722n).mo141623x754a37bb();
            cd2.c cVar2 = this.f188568e;
            cq.j1.e((cq.k) c17, str, cVar2.i(), null, cVar2.l(), cVar2.a(), b17, cVar2.p(), cVar2.o(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fi(a17, cVar2, liVar, this.f188569f), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gi(a17, cVar2, liVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hi(a17));
        }
    }
}
