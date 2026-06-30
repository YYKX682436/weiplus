package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class OpenIMOpenServiceForOtherLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59787d;

    /* renamed from: e, reason: collision with root package name */
    public long f59788e;

    /* renamed from: f, reason: collision with root package name */
    public long f59789f;

    /* renamed from: g, reason: collision with root package name */
    public long f59790g;

    @Override // jx3.a
    public int g() {
        return 27840;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59787d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59788e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59789f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59790g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f59787d);
        stringBuffer.append("\r\nAllowOrDisallow:");
        stringBuffer.append(this.f59788e);
        stringBuffer.append("\r\nSourceScene:");
        stringBuffer.append(this.f59789f);
        stringBuffer.append("\r\nContactType:");
        stringBuffer.append(this.f59790g);
        return stringBuffer.toString();
    }
}
