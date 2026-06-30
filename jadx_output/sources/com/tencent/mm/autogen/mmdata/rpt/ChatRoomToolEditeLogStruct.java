package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class ChatRoomToolEditeLogStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f55649e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55648d = "";

    /* renamed from: f, reason: collision with root package name */
    public long f55650f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f55651g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f55652h = 0;

    @Override // jx3.a
    public int g() {
        return 19437;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55648d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55649e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55650f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55651g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55652h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomusrname:");
        stringBuffer.append(this.f55648d);
        stringBuffer.append("\r\nexitType:");
        stringBuffer.append(this.f55649e);
        stringBuffer.append("\r\nrole:");
        stringBuffer.append(this.f55650f);
        stringBuffer.append("\r\ntopBefore:");
        stringBuffer.append(this.f55651g);
        stringBuffer.append("\r\ntopAfter:");
        stringBuffer.append(this.f55652h);
        return stringBuffer.toString();
    }
}
