package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class VideoDownloadReporterStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f61585d;

    /* renamed from: e, reason: collision with root package name */
    public int f61586e;

    /* renamed from: g, reason: collision with root package name */
    public long f61588g;

    /* renamed from: h, reason: collision with root package name */
    public int f61589h;

    /* renamed from: j, reason: collision with root package name */
    public int f61591j;

    /* renamed from: k, reason: collision with root package name */
    public long f61592k;

    /* renamed from: l, reason: collision with root package name */
    public long f61593l;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61587f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61590i = "";

    @Override // jx3.a
    public int g() {
        return 25022;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61585d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61586e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61587f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61588g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61589h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61590i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61591j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61592k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61593l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MsgType:");
        stringBuffer.append(this.f61585d);
        stringBuffer.append("\r\nVideoSource:");
        stringBuffer.append(this.f61586e);
        stringBuffer.append("\r\nFildID:");
        stringBuffer.append(this.f61587f);
        stringBuffer.append("\r\nOverwriteMsgID:");
        stringBuffer.append(this.f61588g);
        stringBuffer.append("\r\nChatType:");
        stringBuffer.append(this.f61589h);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f61590i);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f61591j);
        stringBuffer.append("\r\nFileSize:");
        stringBuffer.append(this.f61592k);
        stringBuffer.append("\r\nDownloadSize:");
        stringBuffer.append(this.f61593l);
        return stringBuffer.toString();
    }
}
