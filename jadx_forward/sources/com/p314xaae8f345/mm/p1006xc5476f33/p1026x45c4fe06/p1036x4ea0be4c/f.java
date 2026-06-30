package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes7.dex */
public class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 f158356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f158357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 f158358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cd7 f158359e;

    public f(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 u1Var, r45.cd7 cd7Var) {
        this.f158355a = i17;
        this.f158356b = o0Var;
        this.f158357c = j17;
        this.f158358d = u1Var;
        this.f158359e = cd7Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        int i19;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var;
        if (java.lang.Thread.currentThread().getId() == gm0.j1.e().c()) {
            ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.backgroundfetch.f$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.f.this.a(i17, i18, str, oVar);
                }
            });
            return;
        }
        int i27 = (i17 == 0 && i18 == 0 && oVar != null && (oVar.f152244b.f152233a instanceof r45.dd7)) ? 1 : 0;
        if (this.f158355a != 0 || (o0Var = this.f158356b) == null) {
            i19 = i27;
        } else {
            o0Var.f158413p = java.lang.System.currentTimeMillis() - this.f158357c;
            this.f158356b.f158416s = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var2 = this.f158356b;
            o0Var2.f158417t = i27;
            if (i27 != 0) {
                java.util.LinkedList linkedList = ((r45.dd7) oVar.f152244b.f152233a).f453870d;
                o0Var2.f158418u = linkedList != null ? linkedList.size() : 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var3 = this.f158356b;
            if (o0Var3.f158412o == 0) {
                o0Var3.f158412o = o0Var3.f158409l + o0Var3.f158410m + o0Var3.f158411n;
            }
            if (o0Var3.f158414q == 0) {
                o0Var3.f158414q = o0Var3.f158412o + o0Var3.f158413p;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            i19 = i27;
            g0Var.mo68478xbd3cda5f(35253, g0Var.w(o0Var3.f158398a, o0Var3.f158399b, o0Var3.f158400c, java.lang.Integer.valueOf(o0Var3.f158401d), java.lang.Integer.valueOf(o0Var3.f158402e), java.lang.Integer.valueOf(o0Var3.f158403f), java.lang.Integer.valueOf(o0Var3.f158404g), o0Var3.f158405h, java.lang.Integer.valueOf(o0Var3.f158406i), java.lang.Integer.valueOf(o0Var3.f158407j), java.lang.Integer.valueOf(o0Var3.f158408k), java.lang.Long.valueOf(o0Var3.f158409l), java.lang.Long.valueOf(o0Var3.f158410m), java.lang.Long.valueOf(o0Var3.f158411n), java.lang.Long.valueOf(o0Var3.f158412o), java.lang.Long.valueOf(o0Var3.f158413p), java.lang.Long.valueOf(o0Var3.f158414q), java.lang.Long.valueOf(o0Var3.f158415r), java.lang.Long.valueOf(o0Var3.f158416s), java.lang.Integer.valueOf(o0Var3.f158417t), java.lang.Integer.valueOf(o0Var3.f158418u)));
        }
        if (i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data fail:request fail");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 u1Var = this.f158358d;
            int i28 = this.f158355a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t0) u1Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi fail, type(%d)", java.lang.Integer.valueOf(i28));
            return;
        }
        r45.dd7 dd7Var = (r45.dd7) oVar.f152244b.f152233a;
        java.util.LinkedList linkedList2 = dd7Var.f453870d;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data fail:data is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 u1Var2 = this.f158358d;
            int i29 = this.f158355a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t0) u1Var2).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi fail, type(%d)", java.lang.Integer.valueOf(i29));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 u1Var3 = this.f158358d;
        java.util.LinkedList<r45.zc> linkedList3 = dd7Var.f453870d;
        java.util.LinkedList<r45.yc> linkedList4 = this.f158359e.f453024d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t0) u1Var3;
        t0Var.getClass();
        if (linkedList3 == null || linkedList3.isEmpty()) {
            return;
        }
        for (r45.zc zcVar : linkedList3) {
            java.lang.String str3 = null;
            if (zcVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zcVar.f473432d) && linkedList4 != null && !linkedList4.isEmpty()) {
                for (r45.yc ycVar : linkedList4) {
                    if (zcVar.f473432d.equalsIgnoreCase(ycVar.f472488d)) {
                        break;
                    }
                }
            }
            ycVar = null;
            if (zcVar.f473434f != 0 || ycVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi success, but app(%s) failed to fetch data", zcVar.f473432d);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zcVar.f473432d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zcVar.f473433e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, no username or data in response");
            } else {
                long c17 = c01.id.c();
                java.lang.String str4 = zcVar.f473432d;
                java.lang.String str5 = zcVar.f473433e;
                int i37 = ycVar.f472489e;
                r45.lb5 lb5Var = ycVar.f472490f;
                java.lang.String m75945x2fec8307 = (lb5Var == null || !lb5Var.m75948xb7047368(0)) ? null : ycVar.f472490f.m75945x2fec8307(0);
                r45.lb5 lb5Var2 = ycVar.f472490f;
                if (lb5Var2 != null && lb5Var2.m75948xb7047368(1)) {
                    str3 = ycVar.f472490f.m75945x2fec8307(1);
                }
                r45.lb5 lb5Var3 = ycVar.f472490f;
                int m75939xb282bd08 = (lb5Var3 == null || !lb5Var3.m75948xb7047368(2)) ? 1000 : ycVar.f472490f.m75939xb282bd08(2);
                int i38 = zcVar.f473435g;
                java.lang.String str6 = m75945x2fec8307;
                if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1.class)).L3(str4, i37, str5, str6, str3, m75939xb282bd08, c17, i38)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, save data fail");
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ycVar.f472492h)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df839 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839();
                    c11725x4c3df839.f158310d = str4;
                    c11725x4c3df839.f158311e = i37;
                    c11725x4c3df839.f158314h = str5;
                    c11725x4c3df839.f158312f = str6;
                    c11725x4c3df839.f158313g = str3;
                    c11725x4c3df839.f158315i = m75939xb282bd08;
                    c11725x4c3df839.f158316m = c17;
                    c11725x4c3df839.f158317n = i38;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData success, send data event to app(%s), appId:%s, updateTime:%d", ycVar.f472488d, ycVar.f472492h, java.lang.Long.valueOf(c17));
                    if (!android.text.TextUtils.isEmpty(t0Var.f158427a) && (j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.j((str2 = t0Var.f158427a))) != null) {
                        j17.C1 = c11725x4c3df839;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "stashBackFetchDataResponseForInstanceId, instanceId:%s, appId:%s, updateTime:%d", str2, j17.f166908r, java.lang.Long.valueOf(c11725x4c3df839.f158316m));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(ycVar.f472492h, c11725x4c3df839);
                }
            }
        }
    }
}
