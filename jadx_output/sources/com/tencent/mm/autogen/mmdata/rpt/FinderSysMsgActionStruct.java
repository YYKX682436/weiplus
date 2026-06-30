package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class FinderSysMsgActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57889d;

    /* renamed from: e, reason: collision with root package name */
    public long f57890e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57891f = "";

    @Override // jx3.a
    public int g() {
        return 20849;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57889d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57890e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57891f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("msgType:");
        stringBuffer.append(this.f57889d);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f57890e);
        stringBuffer.append("\r\nmsgId:");
        stringBuffer.append(this.f57891f);
        return stringBuffer.toString();
    }
}
