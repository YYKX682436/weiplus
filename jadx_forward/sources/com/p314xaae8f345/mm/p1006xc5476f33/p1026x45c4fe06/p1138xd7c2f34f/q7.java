package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class q7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3 {
    public final void f(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7107x1eea093d c7107x1eea093d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c7107x1eea093d, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        c7107x1eea093d.f144246d = c7107x1eea093d.b("AppId", session.f169668e, true);
        c7107x1eea093d.f144247e = session.f169672i;
        int i17 = session.f169669f;
        c7107x1eea093d.f144248f = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.f0.demo : cm.f0.debug : cm.f0.release;
        c7107x1eea093d.f144249g = session.f169670g;
        c7107x1eea093d.f144254l = c7107x1eea093d.b("InstanceId", session.f169667d, true);
        c7107x1eea093d.f144255m = session.f169671h;
    }

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 reportQualitySession, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportQualitySession, "reportQualitySession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s6 s6Var = response.f166426b;
        boolean z17 = s6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 interfaceC11654xe38d2811 = response.f166425a;
        if (!z17 || ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q6) s6Var).f166611a == 0) {
            if ((s6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q6) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q6) s6Var).f166611a == 0) {
                s81.b bVar = (s81.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(s81.b.class);
                java.lang.String str = reportQualitySession.f169667d;
                java.lang.String str2 = request.f166384d;
                int mo49191x1c82a56c = interfaceC11654xe38d2811.mo49191x1c82a56c();
                int i17 = request.f166386f;
                java.lang.String str3 = request.f166385e;
                bVar.getClass();
                pm0.v.L("MicroMsg.AppBrand.PredownloadGetCodeStatStorage__report", true, new s81.a(bVar, str, str2, mo49191x1c82a56c, i17, str3));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7099x1142698f c7099x1142698f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7099x1142698f();
        c7099x1142698f.f144132d = c7099x1142698f.b("InstanceId", reportQualitySession.f169667d, true);
        c7099x1142698f.f144133e = c7099x1142698f.b("AppId", reportQualitySession.f169668e, true);
        c7099x1142698f.f144134f = reportQualitySession.f169672i;
        c7099x1142698f.f144135g = reportQualitySession.f169669f;
        c7099x1142698f.f144136h = reportQualitySession.f169671h;
        c7099x1142698f.f144137i = c7099x1142698f.b("md5", interfaceC11654xe38d2811.mo49188x6476c63b(), true);
        c7099x1142698f.f144138j = c7099x1142698f.b("moduleName", request.f166385e, true);
        c7099x1142698f.f144139k = request.f166386f;
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q6) s6Var).f166611a;
        if (i18 == 1) {
            c7099x1142698f.f144140l = 1L;
        } else if (i18 == 2) {
            c7099x1142698f.f144140l = 2L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6 w6Var = request.f166388h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6 v6Var = w6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6) w6Var : null;
            c7099x1142698f.f144141m = c7099x1142698f.b("resue_reason", v6Var != null ? java.lang.Long.valueOf(v6Var.f166797b).toString() : null, true);
        }
        c7099x1142698f.k();
    }
}
