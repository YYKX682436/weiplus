package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class AndroidSendMsgFailStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f55078e;

    /* renamed from: f, reason: collision with root package name */
    public long f55079f;

    /* renamed from: g, reason: collision with root package name */
    public long f55080g;

    /* renamed from: i, reason: collision with root package name */
    public int f55082i;

    /* renamed from: m, reason: collision with root package name */
    public int f55086m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55077d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55081h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f55083j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55084k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55085l = "";

    @Override // jx3.a
    public int g() {
        return 28340;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55077d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55078e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55079f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55080g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55081h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55082i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55083j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55084k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55085l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55086m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("LocalId:");
        stringBuffer.append(this.f55077d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f55078e);
        stringBuffer.append("\r\nSubType:");
        stringBuffer.append(this.f55079f);
        stringBuffer.append("\r\nCreateTime:");
        stringBuffer.append(this.f55080g);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f55081h);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f55082i);
        stringBuffer.append("\r\nErrMsg:");
        stringBuffer.append(this.f55083j);
        stringBuffer.append("\r\nRev:");
        stringBuffer.append(this.f55084k);
        stringBuffer.append("\r\nProcessStatus:");
        stringBuffer.append(this.f55085l);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f55086m);
        return stringBuffer.toString();
    }
}
