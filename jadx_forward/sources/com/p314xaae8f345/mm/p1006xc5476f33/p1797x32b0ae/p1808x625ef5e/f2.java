package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class f2 implements e70.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f225472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225474e;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, java.lang.String str) {
        this.f225474e = g1Var;
        this.f225470a = k2Var;
        this.f225471b = abstractC3700xe41a2874;
        this.f225472c = c3712x3ed8a441;
        this.f225473d = str;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = this.f225470a;
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f225533e = currentTimeMillis;
            k2Var.f225534f = currentTimeMillis;
        }
        e70.t tVar2 = e70.t.f331388d;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f225472c;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225471b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225474e;
        java.lang.String str2 = this.f225473d;
        if (tVar != tVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink, url is null, appId:%s errorType:%s errorCode:%d, info: %s, callback: %s", str2, tVar.toString(), java.lang.Integer.valueOf(i18), c3712x3ed8a441, g1Var.f225482c);
            if (abstractC3700xe41a2874 != null) {
                if (tVar == e70.t.f331389e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink success, url is null, no need update");
                    abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_NO_NEED, "Ilink");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink error, url is null, errorType:%s, errorCode:%d", tVar.toString(), java.lang.Integer.valueOf(i18));
                    abstractC3700xe41a2874.mo28893x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_FAILED, "Ilink", i18);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = g1Var.f225482c;
            if (hVar != null) {
                if (c3712x3ed8a441 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar).mo25334x90b54003(c3712x3ed8a441, 1);
                    return;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar).mo25333x2fd71e(str2, 2);
                    return;
                }
            }
            return;
        }
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_SUCCESS, "Ilink");
        }
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp: %s ilink success, resourceInfo list is null", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar2 = g1Var.f225482c;
            if (hVar2 != null) {
                if (c3712x3ed8a441 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar2).mo25334x90b54003(c3712x3ed8a441, 1);
                    return;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar2).mo25333x2fd71e(str2, 2);
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp ilink success, resourceInfo list size: %d", java.lang.Integer.valueOf(list.size()));
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "release", this.f225470a, this.f225471b, g1Var.f225482c);
        }
    }
}
