package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class z1 implements e70.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f f225628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef f225629d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f fVar, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef) {
        this.f225626a = k2Var;
        this.f225627b = abstractC3700xe41a2874;
        this.f225628c = fVar;
        this.f225629d = c3710x879b31ef;
    }

    @Override // e70.s
    public void a(java.util.List list, java.util.Map map, java.util.Map map2, java.util.List list2, java.util.Map map3, e70.t tVar, int i17, long j17) {
    }

    @Override // e70.s
    public java.util.Map b() {
        return null;
    }

    @Override // e70.s
    public void c(java.lang.String str, java.util.List list, int i17, e70.t tVar, int i18, long j17, java.lang.String str2) {
    }

    @Override // e70.s
    public void d(java.util.List list, java.util.Map map, java.util.List list2, java.util.Map map2, e70.t tVar, int i17, long j17, int i18, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
    }

    @Override // e70.s
    public void e(java.lang.String str, java.util.List list, int i17, e70.t tVar, int i18, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = this.f225626a;
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f225533e = currentTimeMillis;
            k2Var.f225534f = currentTimeMillis;
        }
        e70.t tVar2 = e70.t.f331388d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f fVar = this.f225628c;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef = this.f225629d;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225627b;
        if (tVar != tVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink error, url is null, errorType:%s, errorCode:%d, info: %s, callback: %s", tVar.toString(), java.lang.Integer.valueOf(i18), c3710x879b31ef, fVar);
            if (abstractC3700xe41a2874 != null) {
                if (tVar == e70.t.f331389e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink success, url is null, no need update");
                    abstractC3700xe41a2874.mo28872x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE_NO_NEED, "Ilink");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink error, url is null, errorType:%s, errorCode:%d", tVar.toString(), java.lang.Integer.valueOf(i18));
                    abstractC3700xe41a2874.mo28873x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE_FAILED, "Ilink", i18);
                }
            }
            if (fVar != null) {
                if (c3710x879b31ef != null) {
                    fVar.b(c3710x879b31ef, 1);
                    return;
                } else {
                    fVar.a(2);
                    return;
                }
            }
            return;
        }
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28872x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE_SUCCESS, "Ilink");
        }
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink success, resourceInfo list is null");
            if (fVar != null) {
                if (c3710x879b31ef != null) {
                    fVar.b(c3710x879b31ef, 1);
                    return;
                } else {
                    fVar.a(2);
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib ilink success, resourceInfo list size: %d", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f83.b bVar = (f83.b) ((e70.u) it.next());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download ilink liteapp baselib resourceName:%s fileSize:%d url:%s", bVar.t0(), java.lang.Integer.valueOf(bVar.f69721xf5421054), bVar.u0());
            oq1.q qVar = new oq1.q();
            qVar.f428879a = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466;
            qVar.f428882d = bVar.u0();
            java.lang.String field_md5 = bVar.f69716x4b6e68b9;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_md5, "field_md5");
            qVar.f428883e = field_md5;
            qVar.f428886h = bVar.f69721xf5421054;
            qVar.f428892n = bVar.t0();
            qVar.f428893o = bVar.f69724x8a60a7a5;
            qVar.f428884f = "";
            qVar.f428885g = "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.d(qVar, "release", this.f225626a, this.f225627b, this.f225628c);
        }
    }
}
