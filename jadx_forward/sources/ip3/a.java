package ip3;

/* loaded from: classes5.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.t45 reportInfo, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        r45.t10 t10Var = new r45.t10();
        r45.v10 v10Var = new r45.v10();
        r45.xy4 xy4Var = new r45.xy4();
        xy4Var.set(0, str4);
        xy4Var.set(1, str2 == null ? "" : str2);
        xy4Var.set(2, str3 == null ? "" : str3);
        xy4Var.set(3, str5);
        xy4Var.set(4, str6);
        xy4Var.set(5, str7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiOpenPalmOpenResource", "[param] palm_file_id:" + xy4Var.m75945x2fec8307(0) + ", palm_image_md5:" + xy4Var.m75945x2fec8307(3) + ", palm_liveness_image_md5:" + xy4Var.m75945x2fec8307(4) + ", palm_video_md5:" + xy4Var.m75945x2fec8307(5));
        r45.u10 u10Var = new r45.u10();
        u10Var.set(0, str == null ? "" : str);
        u10Var.set(4, reportInfo);
        u10Var.set(5, 3);
        u10Var.set(6, xy4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiOpenPalmOpenResource", "[param] sid:" + u10Var.m75945x2fec8307(0) + ", cdn_data_format:" + u10Var.m75939xb282bd08(5));
        t10Var.set(1, u10Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = t10Var;
        lVar.f152198b = v10Var;
        lVar.f152199c = "/cgi-bin/mmpay-bin/industry/checkpalmuseronlineopenresource";
        lVar.f152200d = 5086;
        lVar.f152211o = 2;
        p(lVar.a());
    }
}
