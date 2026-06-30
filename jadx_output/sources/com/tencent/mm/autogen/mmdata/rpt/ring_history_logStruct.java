package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class ring_history_logStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63154d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63155e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f63156f;

    @Override // jx3.a
    public int g() {
        return 25858;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63154d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63155e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63156f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f63154d);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f63155e);
        stringBuffer.append("\r\nfeedtype:");
        stringBuffer.append(this.f63156f);
        return stringBuffer.toString();
    }
}
