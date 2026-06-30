package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class TextStatusDoNotDisturbStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61198d;

    /* renamed from: e, reason: collision with root package name */
    public long f61199e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61200f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61201g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61202h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f61203i;

    @Override // jx3.a
    public int g() {
        return 28955;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61198d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61199e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61200f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61201g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61202h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61203i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f61198d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f61199e);
        stringBuffer.append("\r\nChatname:");
        stringBuffer.append(this.f61200f);
        stringBuffer.append("\r\nToUsername:");
        stringBuffer.append(this.f61201g);
        stringBuffer.append("\r\nToTextstatusID:");
        stringBuffer.append(this.f61202h);
        stringBuffer.append("\r\nUserRole:");
        stringBuffer.append(this.f61203i);
        return stringBuffer.toString();
    }
}
