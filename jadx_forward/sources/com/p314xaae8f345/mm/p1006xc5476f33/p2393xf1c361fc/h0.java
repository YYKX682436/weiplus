package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class h0 implements su4.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 f263068a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var) {
        this.f263068a = q0Var;
    }

    @Override // su4.j1
    public void a(su4.d2 d2Var) {
        su4.z1 z1Var;
        byte[] bArr;
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "handleCallback %s", d2Var);
        if (d2Var == null) {
            return;
        }
        int intValue = ((java.lang.Integer) d2Var.f494388d).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p0) d2Var.f494389e;
        if (p0Var == null || (z1Var = p0Var.f263117c) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.FTSWebViewLogic", "onSceneEnd netResult invalid");
            return;
        }
        int i18 = p0Var.f263116b;
        int i19 = p0Var.f263115a;
        if (i19 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.FTSWebViewLogic", "onSceneEnd errType %d,errCode %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
            return;
        }
        su4.c cVar = new su4.c();
        cVar.f494357a = z1Var.f494684h;
        r45.th4 th4Var = z1Var.f494682f;
        cVar.f494360d = th4Var.f467972e;
        cVar.f494359c = th4Var.f467971d;
        cVar.f494361e = java.lang.System.currentTimeMillis() / 1000;
        cVar.f494362f = z1Var.f494682f.f467973f;
        cVar.f494358b = z1Var.f494683g;
        java.lang.String a17 = su4.c.a(ys3.l.a(), cVar.f494357a, cVar.f494358b, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "NetSceneWebSearchGuide cgi data %s getCacheFileName:%s, bizCacheObj.lastCacheSecond:%d", cVar.f494359c, a17, java.lang.Long.valueOf(cVar.f494361e));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f494359c)) {
            int i27 = cVar.f494357a;
            if (i27 == 103) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "Processing hot search data for scene: %d, requestId: %s", java.lang.Integer.valueOf(i27), z1Var.f494686m);
                try {
                    rv4.q.f482077a.c(cVar.f494359c);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "Hot search data processed successfully");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.FTSWebViewLogic", "Failed to process hot search data", e17);
                }
            } else {
                java.lang.Object obj = d2Var.f494390f;
                if (obj instanceof java.lang.Integer) {
                    int intValue2 = ((java.lang.Integer) obj).intValue();
                    ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Zi(intValue2, 0, cVar.f494359c, 0, z1Var.f494686m);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "onTeachSearchDataReady2, %d", java.lang.Integer.valueOf(intValue2));
                }
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Zi(intValue, 0, cVar.f494359c, 0, z1Var.f494686m);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "onTeachSearchDataReady, %d, %s", java.lang.Integer.valueOf(intValue), cVar.f494359c);
            }
        }
        this.f263068a.f263127g.put(a17, cVar);
        if (cVar.f494360d == 0) {
            java.lang.String a18 = ys3.l.a();
            int i28 = cVar.f494357a;
            int i29 = cVar.f494358b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BizCacheObj", "delete biz cache %d %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a18, su4.c.a(a18, i28, i29, true));
            if (r6Var.m()) {
                r6Var.l();
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(a18, su4.c.a(a18, i28, i29, false));
            if (r6Var2.m()) {
                r6Var2.l();
            }
        } else {
            java.lang.String a19 = ys3.l.a();
            r45.qh4 qh4Var = new r45.qh4();
            qh4Var.f465528d = cVar.f494357a;
            qh4Var.f465529e = cVar.f494359c;
            qh4Var.f465530f = cVar.f494360d;
            qh4Var.f465531g = cVar.f494361e;
            qh4Var.f465532h = cVar.f494362f;
            qh4Var.f465533i = cVar.f494358b;
            try {
                bArr = qh4Var.mo14344x5f01b1f6();
            } catch (java.io.IOException unused) {
                bArr = null;
            }
            if (bArr != null) {
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(a19, su4.c.a(a19, cVar.f494357a, cVar.f494358b, true));
                if (!r6Var3.s().m()) {
                    r6Var3.s().J();
                }
                if (r6Var3.m()) {
                    r6Var3.l();
                }
                com.p314xaae8f345.mm.vfs.w6.S(r6Var3.o(), bArr, 0, bArr.length);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BizCacheObj", "save bizCacheFile %s %d", r6Var3.o(), java.lang.Integer.valueOf(bArr.length));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BizCacheObj", "save bizCacheFile fail");
            }
        }
        int i37 = cVar.f494357a;
        if (i37 == 20 && (i17 = cVar.f494358b) == 0) {
            su4.k3.b(i37, 1, cVar.f494362f, i17, 2, cVar.b(), 1);
        } else {
            su4.k3.b(i37, 1, cVar.f494362f, cVar.f494358b, 1, "", 0);
        }
    }
}
