package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class y7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f166965a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f166966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f166967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f166968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f166969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f166970f;

    public y7(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, r45.y50 y50Var, yz5.l lVar) {
        this.f166967c = z17;
        this.f166968d = c12566x87f2d8b7;
        this.f166969e = y50Var;
        this.f166970f = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        this.f166970f.mo146xb9724478(request);
        int[] iArr = qq5.a.f447530d;
        int i18 = request.f166386f;
        if (!kz5.z.F(iArr, i18)) {
            if (kz5.z.F(qq5.a.f447528b, i18)) {
                i();
                j(i18);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6 w6Var = request.f166388h;
        boolean z17 = w6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6;
        java.lang.String str2 = request.f166384d;
        if (!z17) {
            i();
            h(2, str2, 0);
            j(i18);
            return;
        }
        int a17 = w6Var.a();
        int[] A = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().A(request.h().m49244x9616526c(), 0);
        if (A == null) {
            i();
            h(2, str2, a17);
            j(i18);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = A.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                break;
            }
            int i27 = A[i19];
            if (!(i27 == w6Var.a())) {
                arrayList.add(java.lang.Integer.valueOf(i27));
            }
            i19++;
        }
        if (!arrayList.isEmpty()) {
            i();
            h(4, str2, a17);
            j(i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3
    public void b() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "onAllPkgDownloaded isLaunch:%b", java.lang.Boolean.valueOf(this.f166967c));
        if (!this.f166966b || !this.f166967c || (copyOnWriteArrayList = this.f166965a) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "mStageList size:%d", java.lang.Integer.valueOf(this.f166965a.size()));
        java.util.Iterator it = this.f166965a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t7 t7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t7) it.next();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7107x1eea093d c7107x1eea093d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7107x1eea093d();
            f(c7107x1eea093d, this.f166968d);
            c7107x1eea093d.f144253k = c7107x1eea093d.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.c(null, 1, null), true);
            c7107x1eea093d.f144250h = c7107x1eea093d.b("Provider", t7Var.f166694b, true);
            c7107x1eea093d.f144251i = t7Var.f166695c;
            c7107x1eea093d.f144252j = t7Var.f166693a;
            c7107x1eea093d.k();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        int i17 = request.f166386f;
        if (i17 == 0) {
            k(12);
            return;
        }
        if (i17 == 4) {
            k(14);
            return;
        }
        if (i17 == 6) {
            k(1);
            return;
        }
        if (i17 == 12) {
            k(3);
            return;
        }
        if (i17 == 13) {
            k(5);
        } else if (i17 == 22) {
            k(8);
        } else {
            if (i17 != 23) {
                return;
            }
            k(10);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6 w6Var = request.f166388h;
        boolean z17 = w6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u6;
        int[] iArr = qq5.a.f447530d;
        java.lang.String str = request.f166384d;
        int i17 = request.f166386f;
        if (z17 && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u6) w6Var).f166757b && kz5.z.F(iArr, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "onPkgCached, will update plugin(" + str + ") to latest in background...");
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w7(request, this.f166969e, this.f166968d, this, response));
        }
        if (kz5.z.F(iArr, i17)) {
            h(3, str, response.f166425a.mo49191x1c82a56c());
            pq5.h.a().i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x7(request, response)).B();
        }
        g(this.f166968d, request, response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (kz5.z.F(qq5.a.f447530d, request.f166386f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k6.b(request.f166384d, response.f166425a.mo49191x1c82a56c());
        }
    }

    public final void h(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "addPluginStage stage:%d,provider:%s,version:%d", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t7 t7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t7(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        t7Var.f166694b = str;
        t7Var.f166693a = i17;
        t7Var.f166695c = i18;
        this.f166965a.add(t7Var);
    }

    public final void i() {
        if (this.f166966b) {
            return;
        }
        this.f166966b = true;
        h(1, "", 0);
    }

    public final void j(int i17) {
        if (i17 == 0) {
            k(11);
            return;
        }
        if (i17 == 4) {
            k(13);
            return;
        }
        if (i17 == 6) {
            k(0);
            return;
        }
        if (i17 == 12) {
            k(2);
            return;
        }
        if (i17 == 13) {
            k(4);
        } else if (i17 == 22) {
            k(7);
        } else {
            if (i17 != 23) {
                return;
            }
            k(9);
        }
    }

    public final void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1027L, i17, 1L, false);
    }
}
