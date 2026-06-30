package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class SnsPostSyncFinderPostStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60692d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60693e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60694f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f60695g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f60696h;

    /* renamed from: i, reason: collision with root package name */
    public long f60697i;

    @Override // jx3.a
    public int g() {
        return 26531;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60692d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60693e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60694f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60695g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60696h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60697i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f60692d);
        stringBuffer.append("\r\nsnsfeedid:");
        stringBuffer.append(this.f60693e);
        stringBuffer.append("\r\nFinderPublishSessionId:");
        stringBuffer.append(this.f60694f);
        stringBuffer.append("\r\nMomentsPostSessionId:");
        stringBuffer.append(this.f60695g);
        stringBuffer.append("\r\nSendType:");
        stringBuffer.append(this.f60696h);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f60697i);
        return stringBuffer.toString();
    }
}
