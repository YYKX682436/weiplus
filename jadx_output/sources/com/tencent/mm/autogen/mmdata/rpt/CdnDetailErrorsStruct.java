package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class CdnDetailErrorsStruct extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public int f55593i;

    /* renamed from: d, reason: collision with root package name */
    public int f55588d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f55589e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f55590f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f55591g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55592h = "";

    /* renamed from: j, reason: collision with root package name */
    public long f55594j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f55595k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55596l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f55597m = 0;

    @Override // jx3.a
    public int g() {
        return 17473;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55588d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55589e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55590f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55591g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55592h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55593i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55594j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55595k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55596l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55597m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("optype:");
        stringBuffer.append(this.f55588d);
        stringBuffer.append("\r\nerrtype:");
        stringBuffer.append(this.f55589e);
        stringBuffer.append("\r\nerrcode:");
        stringBuffer.append(this.f55590f);
        stringBuffer.append("\r\nmapederror:");
        stringBuffer.append(this.f55591g);
        stringBuffer.append("\r\nfilekey:");
        stringBuffer.append(this.f55592h);
        stringBuffer.append("\r\nfiletype:");
        stringBuffer.append(this.f55593i);
        stringBuffer.append("\r\nTryWritenBytes:");
        stringBuffer.append(this.f55594j);
        stringBuffer.append("\r\nAvailableBytes:");
        stringBuffer.append(this.f55595k);
        stringBuffer.append("\r\nSystemErrorDescribe:");
        stringBuffer.append(this.f55596l);
        stringBuffer.append("\r\nCurrentFileSize:");
        stringBuffer.append(this.f55597m);
        return stringBuffer.toString();
    }
}
