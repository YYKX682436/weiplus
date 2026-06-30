package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct */
/* loaded from: classes10.dex */
public final class C6903xb8bbdc4e extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142225d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142226e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142227f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f142228g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f142229h;

    /* renamed from: i, reason: collision with root package name */
    public long f142230i;

    @Override // jx3.a
    public int g() {
        return 26531;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142225d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142226e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142227f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142228g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142229h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142230i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f142225d);
        stringBuffer.append("\r\nsnsfeedid:");
        stringBuffer.append(this.f142226e);
        stringBuffer.append("\r\nFinderPublishSessionId:");
        stringBuffer.append(this.f142227f);
        stringBuffer.append("\r\nMomentsPostSessionId:");
        stringBuffer.append(this.f142228g);
        stringBuffer.append("\r\nSendType:");
        stringBuffer.append(this.f142229h);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f142230i);
        return stringBuffer.toString();
    }
}
