package ip3;

/* loaded from: classes5.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.i {
    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.t45 reportInfo, java.lang.String str5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        r45.pu6 pu6Var = new r45.pu6();
        r45.ru6 ru6Var = new r45.ru6();
        r45.xy4 xy4Var = new r45.xy4();
        xy4Var.set(0, str4);
        xy4Var.set(1, str2 == null ? "" : str2);
        xy4Var.set(2, str3 == null ? "" : str3);
        xy4Var.set(3, "");
        xy4Var.set(4, "");
        xy4Var.set(5, str5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiUploadOnlineOpenResource", "[param] palm_file_id:" + xy4Var.m75945x2fec8307(0) + ", palm_video_md5:" + xy4Var.m75945x2fec8307(5));
        r45.qu6 qu6Var = new r45.qu6();
        qu6Var.set(3, str == null ? "" : str);
        qu6Var.set(4, reportInfo);
        qu6Var.set(5, 3);
        qu6Var.set(6, xy4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiUploadOnlineOpenResource", "[param] session_id:" + qu6Var.m75945x2fec8307(3) + ", cdn_data_format:" + qu6Var.m75939xb282bd08(5));
        pu6Var.set(1, qu6Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = pu6Var;
        lVar.f152198b = ru6Var;
        lVar.f152199c = "/cgi-bin/mmpay-bin/industry/uploadonlineopenresource";
        lVar.f152200d = 29081;
        lVar.f152211o = 2;
        p(lVar.a());
    }
}
