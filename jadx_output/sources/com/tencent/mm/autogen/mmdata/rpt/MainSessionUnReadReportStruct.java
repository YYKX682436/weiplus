package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class MainSessionUnReadReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59124d;

    /* renamed from: e, reason: collision with root package name */
    public long f59125e;

    /* renamed from: f, reason: collision with root package name */
    public long f59126f;

    /* renamed from: g, reason: collision with root package name */
    public long f59127g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59128h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f59129i;

    /* renamed from: j, reason: collision with root package name */
    public long f59130j;

    /* renamed from: k, reason: collision with root package name */
    public long f59131k;

    @Override // jx3.a
    public int g() {
        return 28030;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,0,");
        stringBuffer.append(this.f59124d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59125e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59126f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59127g);
        stringBuffer.append(",0,0,0,0,0,0,");
        stringBuffer.append(this.f59128h);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f59129i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59130j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59131k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExitTime:0\r\nEnterTime:0\r\nChatType:0\r\nIsMute:0\r\nunread_msg_in:");
        stringBuffer.append(this.f59124d);
        stringBuffer.append("\r\nunread_sess_in:");
        stringBuffer.append(this.f59125e);
        stringBuffer.append("\r\nunread_msg_out:");
        stringBuffer.append(this.f59126f);
        stringBuffer.append("\r\nunread_sess_out:");
        stringBuffer.append(this.f59127g);
        stringBuffer.append("\r\nrecv_msg:0\r\nrecv_sess:0\r\nclear_unread_msg:0\r\nenter_sess:0\r\ntop_sess_out:0\r\nreport_page_id:0\r\nunread_sess_out_detail:");
        stringBuffer.append(this.f59128h);
        stringBuffer.append("\r\nlowest_pos_out:0\r\nservice_is_folded:0\r\nUserGreyType:");
        stringBuffer.append(this.f59129i);
        stringBuffer.append("\r\nIsBirdView:");
        stringBuffer.append(this.f59130j);
        stringBuffer.append("\r\nLogVersion:");
        stringBuffer.append(this.f59131k);
        return stringBuffer.toString();
    }
}
