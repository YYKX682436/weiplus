package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class EmoticonBoardReddotNotificationStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f56008d;

    /* renamed from: e, reason: collision with root package name */
    public int f56009e;

    /* renamed from: g, reason: collision with root package name */
    public int f56011g;

    /* renamed from: i, reason: collision with root package name */
    public int f56013i;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56010f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56012h = "";

    @Override // jx3.a
    public int g() {
        return 19435;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56008d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56009e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56010f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56011g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56012h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56013i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f56008d);
        stringBuffer.append("\r\nIsRed:");
        stringBuffer.append(this.f56009e);
        stringBuffer.append("\r\nEnterPid:");
        stringBuffer.append(this.f56010f);
        stringBuffer.append("\r\nIndex:");
        stringBuffer.append(this.f56011g);
        stringBuffer.append("\r\nPid:");
        stringBuffer.append(this.f56012h);
        stringBuffer.append("\r\nNewPage:");
        stringBuffer.append(this.f56013i);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct p(java.lang.String str) {
        this.f56012h = b("Pid", str, true);
        return this;
    }
}
