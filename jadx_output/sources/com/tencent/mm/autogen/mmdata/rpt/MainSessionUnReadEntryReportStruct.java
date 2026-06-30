package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class MainSessionUnReadEntryReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59119d;

    /* renamed from: e, reason: collision with root package name */
    public long f59120e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59121f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f59122g;

    /* renamed from: h, reason: collision with root package name */
    public long f59123h;

    @Override // jx3.a
    public int g() {
        return 28493;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,");
        stringBuffer.append(this.f59119d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59120e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59121f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59122g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59123h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterTime:0\r\nChatType:0\r\nIsMute:0\r\nunread_msg_in:");
        stringBuffer.append(this.f59119d);
        stringBuffer.append("\r\nunread_sess_in:");
        stringBuffer.append(this.f59120e);
        stringBuffer.append("\r\nreport_page_id:0\r\nunread_sess_in_detail:");
        stringBuffer.append(this.f59121f);
        stringBuffer.append("\r\nUserGreyType:");
        stringBuffer.append(this.f59122g);
        stringBuffer.append("\r\nLogVersion:");
        stringBuffer.append(this.f59123h);
        return stringBuffer.toString();
    }
}
