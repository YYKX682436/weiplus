package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsVideoPublishLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60794d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f60795e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f60796f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f60797g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60798h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f60799i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f60800j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f60801k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f60802l = 0;

    @Override // jx3.a
    public int g() {
        return 26179;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60794d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60795e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60796f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60797g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60798h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60799i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60800j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60801k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60802l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f60794d);
        stringBuffer.append("\r\nresult:");
        stringBuffer.append(this.f60795e);
        stringBuffer.append("\r\nusertype:");
        stringBuffer.append(this.f60796f);
        stringBuffer.append("\r\nmediaEditPageCnt:");
        stringBuffer.append(this.f60797g);
        stringBuffer.append("\r\nmediaEditPlayTime:");
        stringBuffer.append(this.f60798h);
        stringBuffer.append("\r\neditPagePlayCnt:");
        stringBuffer.append(this.f60799i);
        stringBuffer.append("\r\neditPagePlayTime:");
        stringBuffer.append(this.f60800j);
        stringBuffer.append("\r\nmuxTime:");
        stringBuffer.append(this.f60801k);
        stringBuffer.append("\r\nfakePublishTime:");
        stringBuffer.append(this.f60802l);
        return stringBuffer.toString();
    }
}
