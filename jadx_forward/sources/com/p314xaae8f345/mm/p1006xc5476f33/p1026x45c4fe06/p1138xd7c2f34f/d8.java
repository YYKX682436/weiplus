package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class d8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f166101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f166102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f166103c;

    public d8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, r45.y50 y50Var, yz5.l lVar) {
        this.f166101a = c12566x87f2d8b7;
        this.f166102b = y50Var;
        this.f166103c = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        this.f166103c.mo146xb9724478(request);
        if (kz5.z.F(qq5.a.f447530d, request.f166386f)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7107x1eea093d c7107x1eea093d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7107x1eea093d();
            f(c7107x1eea093d, this.f166101a);
            c7107x1eea093d.f144253k = c7107x1eea093d.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.c(null, 1, null), true);
            c7107x1eea093d.f144250h = c7107x1eea093d.b("Provider", request.f166384d, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6 w6Var = request.f166388h;
            if (w6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6) {
                c7107x1eea093d.f144251i = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6) w6Var).f166796a;
                int[] A = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().A(request.h().m49244x9616526c(), 0);
                if (A == null) {
                    c7107x1eea093d.f144252j = 2L;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int length = A.length;
                    for (int i18 = 0; i18 < length; i18++) {
                        int i19 = A[i18];
                        if (!(i19 == w6Var.a())) {
                            arrayList.add(java.lang.Integer.valueOf(i19));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        c7107x1eea093d.f144252j = 4L;
                    }
                }
            } else {
                c7107x1eea093d.f144251i = 0L;
                c7107x1eea093d.f144252j = 2L;
            }
            c7107x1eea093d.k();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6 w6Var = request.f166388h;
        boolean z17 = w6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u6;
        int[] iArr = qq5.a.f447530d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7 = this.f166101a;
        int i17 = request.f166386f;
        java.lang.String str = request.f166384d;
        if (z17 && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u6) w6Var).f166757b && kz5.z.F(iArr, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.defaultBatchReporter", "onPkgCached, will update plugin(" + str + ") to latest in background...");
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c8(request, c12566x87f2d8b7, this.f166102b, c12566x87f2d8b7.f169667d, this, response));
        }
        if (kz5.z.F(iArr, i17)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7107x1eea093d c7107x1eea093d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7107x1eea093d();
            f(c7107x1eea093d, c12566x87f2d8b7);
            c7107x1eea093d.f144253k = c7107x1eea093d.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.c(null, 1, null), true);
            c7107x1eea093d.f144250h = c7107x1eea093d.b("Provider", str, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 interfaceC11654xe38d2811 = response.f166425a;
            c7107x1eea093d.f144251i = interfaceC11654xe38d2811.mo49191x1c82a56c();
            c7107x1eea093d.f144252j = 3L;
            c7107x1eea093d.k();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k6.b(str, interfaceC11654xe38d2811.mo49191x1c82a56c());
        }
        g(c12566x87f2d8b7, request, response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (kz5.z.F(qq5.a.f447530d, request.f166386f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k6.b(request.f166384d, response.f166425a.mo49191x1c82a56c());
        }
    }
}
