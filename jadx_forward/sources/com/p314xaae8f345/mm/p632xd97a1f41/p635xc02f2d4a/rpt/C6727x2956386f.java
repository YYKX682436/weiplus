package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MainSessionUnReadEntryReportStruct */
/* loaded from: classes11.dex */
public final class C6727x2956386f extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140652d;

    /* renamed from: e, reason: collision with root package name */
    public long f140653e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140654f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f140655g;

    /* renamed from: h, reason: collision with root package name */
    public long f140656h;

    @Override // jx3.a
    public int g() {
        return 28493;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,");
        stringBuffer.append(this.f140652d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140653e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f140654f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140655g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140656h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterTime:0\r\nChatType:0\r\nIsMute:0\r\nunread_msg_in:");
        stringBuffer.append(this.f140652d);
        stringBuffer.append("\r\nunread_sess_in:");
        stringBuffer.append(this.f140653e);
        stringBuffer.append("\r\nreport_page_id:0\r\nunread_sess_in_detail:");
        stringBuffer.append(this.f140654f);
        stringBuffer.append("\r\nUserGreyType:");
        stringBuffer.append(this.f140655g);
        stringBuffer.append("\r\nLogVersion:");
        stringBuffer.append(this.f140656h);
        return stringBuffer.toString();
    }
}
