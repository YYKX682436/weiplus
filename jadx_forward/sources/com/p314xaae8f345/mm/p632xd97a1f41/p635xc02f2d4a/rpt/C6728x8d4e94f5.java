package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MainSessionUnReadReportStruct */
/* loaded from: classes11.dex */
public final class C6728x8d4e94f5 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140657d;

    /* renamed from: e, reason: collision with root package name */
    public long f140658e;

    /* renamed from: f, reason: collision with root package name */
    public long f140659f;

    /* renamed from: g, reason: collision with root package name */
    public long f140660g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140661h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f140662i;

    /* renamed from: j, reason: collision with root package name */
    public long f140663j;

    /* renamed from: k, reason: collision with root package name */
    public long f140664k;

    @Override // jx3.a
    public int g() {
        return 28030;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,0,");
        stringBuffer.append(this.f140657d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140658e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140659f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140660g);
        stringBuffer.append(",0,0,0,0,0,0,");
        stringBuffer.append(this.f140661h);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f140662i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140663j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140664k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExitTime:0\r\nEnterTime:0\r\nChatType:0\r\nIsMute:0\r\nunread_msg_in:");
        stringBuffer.append(this.f140657d);
        stringBuffer.append("\r\nunread_sess_in:");
        stringBuffer.append(this.f140658e);
        stringBuffer.append("\r\nunread_msg_out:");
        stringBuffer.append(this.f140659f);
        stringBuffer.append("\r\nunread_sess_out:");
        stringBuffer.append(this.f140660g);
        stringBuffer.append("\r\nrecv_msg:0\r\nrecv_sess:0\r\nclear_unread_msg:0\r\nenter_sess:0\r\ntop_sess_out:0\r\nreport_page_id:0\r\nunread_sess_out_detail:");
        stringBuffer.append(this.f140661h);
        stringBuffer.append("\r\nlowest_pos_out:0\r\nservice_is_folded:0\r\nUserGreyType:");
        stringBuffer.append(this.f140662i);
        stringBuffer.append("\r\nIsBirdView:");
        stringBuffer.append(this.f140663j);
        stringBuffer.append("\r\nLogVersion:");
        stringBuffer.append(this.f140664k);
        return stringBuffer.toString();
    }
}
