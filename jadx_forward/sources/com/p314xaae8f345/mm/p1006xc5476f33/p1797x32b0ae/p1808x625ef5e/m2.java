package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class m2 implements e70.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f225551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225552c;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.o2 o2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, java.lang.String str) {
        this.f225550a = k2Var;
        this.f225551b = c3712x3ed8a441;
        this.f225552c = str;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = this.f225550a;
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f225533e = currentTimeMillis;
            k2Var.f225534f = currentTimeMillis;
        }
        e70.t tVar2 = e70.t.f331388d;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f225551b;
        java.lang.String str2 = this.f225552c;
        if (tVar != tVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink, url is null, appId:%s errorType:%s errorCode:%d, info: %s, callback: %s", str2, tVar.toString(), java.lang.Integer.valueOf(i18), c3712x3ed8a441, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c != null) {
                if (c3712x3ed8a441 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c).mo25334x90b54003(c3712x3ed8a441, 1);
                    return;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c).mo25333x2fd71e(str2, 2);
                    return;
                }
            }
            return;
        }
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink success, resourceInfo list is null");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c != null) {
                if (c3712x3ed8a441 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c).mo25334x90b54003(c3712x3ed8a441, 1);
                    return;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c).mo25333x2fd71e(str2, 2);
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp %s ilink success, resourceInfo list size: %d", str, java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f83.b bVar = (f83.b) ((e70.u) it.next());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download ilink liteapp:%s resourceName:%s fileSize:%d url:%s", str2, bVar.t0(), java.lang.Integer.valueOf(bVar.f69721xf5421054), bVar.u0());
            oq1.q qVar = new oq1.q();
            qVar.f428879a = str2;
            qVar.f428882d = bVar.u0();
            java.lang.String field_md5 = bVar.f69716x4b6e68b9;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_md5, "field_md5");
            qVar.f428883e = field_md5;
            qVar.f428886h = bVar.f69721xf5421054;
            qVar.f428892n = bVar.t0();
            qVar.f428893o = bVar.f69724x8a60a7a5;
            qVar.f428884f = "";
            qVar.f428885g = "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "release", this.f225550a, null, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c);
        }
    }
}
