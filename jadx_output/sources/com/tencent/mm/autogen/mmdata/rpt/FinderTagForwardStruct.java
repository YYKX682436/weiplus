package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderTagForwardStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57906e;

    /* renamed from: f, reason: collision with root package name */
    public long f57907f;

    /* renamed from: i, reason: collision with root package name */
    public long f57910i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57905d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57908g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57909h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57911j = "";

    @Override // jx3.a
    public int g() {
        return 19187;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57905d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57906e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57907f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57908g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57909h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57910i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57911j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57905d);
        stringBuffer.append("\r\nForwardType:");
        stringBuffer.append(this.f57906e);
        stringBuffer.append("\r\nForwardResult:");
        stringBuffer.append(this.f57907f);
        stringBuffer.append("\r\nTag:");
        stringBuffer.append(this.f57908g);
        stringBuffer.append("\r\nTagId:");
        stringBuffer.append(this.f57909h);
        stringBuffer.append("\r\nIsPoi:0\r\nTagFeedCnt:");
        stringBuffer.append(this.f57910i);
        stringBuffer.append("\r\nForwardToUsr:");
        stringBuffer.append(this.f57911j);
        return stringBuffer.toString();
    }
}
