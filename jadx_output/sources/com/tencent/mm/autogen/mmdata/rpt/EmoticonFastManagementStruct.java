package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class EmoticonFastManagementStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f56032d;

    /* renamed from: e, reason: collision with root package name */
    public int f56033e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56034f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56035g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f56036h;

    @Override // jx3.a
    public int g() {
        return 19434;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56032d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56033e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56034f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56035g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56036h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f56032d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f56033e);
        stringBuffer.append("\r\nPid:");
        stringBuffer.append(this.f56034f);
        stringBuffer.append("\r\nMd5:");
        stringBuffer.append(this.f56035g);
        stringBuffer.append("\r\nIndex:");
        stringBuffer.append(this.f56036h);
        return stringBuffer.toString();
    }
}
