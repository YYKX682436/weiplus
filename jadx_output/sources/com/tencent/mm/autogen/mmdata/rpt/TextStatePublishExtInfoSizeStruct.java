package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class TextStatePublishExtInfoSizeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61142d;

    /* renamed from: e, reason: collision with root package name */
    public long f61143e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61144f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f61145g;

    /* renamed from: h, reason: collision with root package name */
    public long f61146h;

    @Override // jx3.a
    public int g() {
        return 29359;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61142d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61143e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61144f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61145g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61146h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExtInfoOriginalSize:");
        stringBuffer.append(this.f61142d);
        stringBuffer.append("\r\nExtInfoFinallSize:");
        stringBuffer.append(this.f61143e);
        stringBuffer.append("\r\nStatusJumpInfoType:");
        stringBuffer.append(this.f61144f);
        stringBuffer.append("\r\nFooterBusiBufSize:");
        stringBuffer.append(this.f61145g);
        stringBuffer.append("\r\nJumpInfoBusiBufSize:");
        stringBuffer.append(this.f61146h);
        return stringBuffer.toString();
    }
}
