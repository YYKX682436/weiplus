package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class WAAfterCloseGuideReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61878d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f61879e;

    /* renamed from: f, reason: collision with root package name */
    public long f61880f;

    @Override // jx3.a
    public int g() {
        return 31563;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61878d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61879e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61880f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f61878d);
        stringBuffer.append("\r\ndialogType:");
        stringBuffer.append(this.f61879e);
        stringBuffer.append("\r\nevent:");
        stringBuffer.append(this.f61880f);
        return stringBuffer.toString();
    }
}
