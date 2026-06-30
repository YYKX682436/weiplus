package mz3;

/* loaded from: classes12.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(oz3.e ocrReportRequest, fk0.a aVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ocrReportRequest, "ocrReportRequest");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/scan_qrcode_event_report_cgi";
        lVar.f152200d = 8887;
        lVar.f152198b = new r45.yu5();
        r45.xu5 xu5Var = new r45.xu5();
        xu5Var.f471960e = ocrReportRequest.f431790a;
        xu5Var.f471963h = ocrReportRequest.f431792c;
        xu5Var.f471959d = ocrReportRequest.f431793d;
        xu5Var.f471964i = (aVar == null || (str = aVar.f344792a) == null) ? "" : str;
        xu5Var.f471965m = aVar != null ? aVar.f344793b : -1;
        xu5Var.f471966n = (aVar != null ? java.lang.Float.valueOf(aVar.f344794c) : 0).toString();
        xu5Var.f471967o = aVar != null ? aVar.f344795d : -1;
        xu5Var.f471968p = (aVar != null ? java.lang.Float.valueOf(aVar.f344796e) : 0).toString();
        java.lang.String str2 = ocrReportRequest.f431795f;
        xu5Var.f471962g = str2 != null ? str2 : "";
        xu5Var.f471961f = ocrReportRequest.f431791b;
        lVar.f152197a = xu5Var;
        p(lVar.a());
    }
}
