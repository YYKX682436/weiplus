package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes12.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.d0 f291159a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f291160b;

    static {
        com.p314xaae8f345.mm.ui.p2731xc84c5534.d0 d0Var = new com.p314xaae8f345.mm.ui.p2731xc84c5534.d0();
        f291159a = d0Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291252d, new com.p314xaae8f345.mm.ui.p2731xc84c5534.u(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291253e, new com.p314xaae8f345.mm.ui.p2731xc84c5534.v(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291254f, new com.p314xaae8f345.mm.ui.p2731xc84c5534.w(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291255g, new com.p314xaae8f345.mm.ui.p2731xc84c5534.x(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291256h, new com.p314xaae8f345.mm.ui.p2731xc84c5534.y(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291257i, new com.p314xaae8f345.mm.ui.p2731xc84c5534.z(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291258m, new com.p314xaae8f345.mm.ui.p2731xc84c5534.a0(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291259n, new com.p314xaae8f345.mm.ui.p2731xc84c5534.b0(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291260o, new com.p314xaae8f345.mm.ui.p2731xc84c5534.c0(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291261p, new com.p314xaae8f345.mm.ui.p2731xc84c5534.s(d0Var));
        concurrentHashMap.put(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291262q, new com.p314xaae8f345.mm.ui.p2731xc84c5534.t(d0Var));
        f291160b = concurrentHashMap;
    }

    public final void a(java.util.HashMap hashMap, com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar) {
        hashMap.put("html_has_js", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2731xc84c5534.f0.a(((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).fj(oVar.f291239a, false))));
    }

    public final dy1.r b() {
        return (dy1.r) i95.n0.c(dy1.r.class);
    }

    public final java.util.HashMap c(com.p314xaae8f345.mm.ui.p2731xc84c5534.o filePreviewReportParams) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePreviewReportParams, "filePreviewReportParams");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = filePreviewReportParams.f291239a;
        int i18 = 1;
        if (f9Var.Z1() == 0) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.q[] qVarArr = com.p314xaae8f345.mm.ui.p2731xc84c5534.q.f291264d;
            i17 = 1;
        } else {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.q[] qVarArr2 = com.p314xaae8f345.mm.ui.p2731xc84c5534.q.f291264d;
            i17 = 2;
        }
        hashMap.put("upload_download_source", java.lang.Integer.valueOf(i17));
        hashMap.put("file_extension", filePreviewReportParams.f291240b);
        hashMap.put("msgsvrid", java.lang.Long.valueOf(f9Var.I0()));
        if (f9Var.A0() == 1) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.f[] fVarArr = com.p314xaae8f345.mm.ui.p2731xc84c5534.f.f291169d;
        } else {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.f[] fVarArr2 = com.p314xaae8f345.mm.ui.p2731xc84c5534.f.f291169d;
            i18 = 2;
        }
        hashMap.put("send_source", java.lang.Integer.valueOf(i18));
        hashMap.put("data_item_Id", filePreviewReportParams.f291241c);
        hashMap.put("msg_client_id", f9Var.Q0() + '_' + f9Var.m124847x74d37ac6());
        hashMap.put("file_size", java.lang.Long.valueOf(filePreviewReportParams.f291242d));
        return hashMap;
    }

    public final void d(com.p314xaae8f345.mm.ui.p2731xc84c5534.p type, com.p314xaae8f345.mm.ui.p2731xc84c5534.o filePreviewReportParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePreviewReportParams, "filePreviewReportParams");
        pm0.v.O("MicroMsg.File.FilePreviewReporter", new com.p314xaae8f345.mm.ui.p2731xc84c5534.r(type, filePreviewReportParams));
    }
}
