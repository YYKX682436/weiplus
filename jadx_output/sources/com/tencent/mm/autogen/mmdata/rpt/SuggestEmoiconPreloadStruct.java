package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SuggestEmoiconPreloadStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60993d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60994e;

    /* renamed from: f, reason: collision with root package name */
    public long f60995f;

    /* renamed from: g, reason: collision with root package name */
    public long f60996g;

    /* renamed from: h, reason: collision with root package name */
    public long f60997h;

    @Override // jx3.a
    public int g() {
        return 20205;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60993d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60994e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60995f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60996g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60997h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f60993d);
        stringBuffer.append("\r\nPullStartTimeStamp:");
        stringBuffer.append(this.f60994e);
        stringBuffer.append("\r\nPullEndTimeStamp:");
        stringBuffer.append(this.f60995f);
        stringBuffer.append("\r\nIsSuccess:");
        stringBuffer.append(this.f60996g);
        stringBuffer.append("\r\nFailedType:");
        stringBuffer.append(this.f60997h);
        return stringBuffer.toString();
    }
}
