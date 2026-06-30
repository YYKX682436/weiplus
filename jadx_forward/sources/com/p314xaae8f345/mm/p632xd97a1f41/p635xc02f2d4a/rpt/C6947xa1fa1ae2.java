package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct */
/* loaded from: classes4.dex */
public final class C6947xa1fa1ae2 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142526d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142527e;

    /* renamed from: f, reason: collision with root package name */
    public long f142528f;

    /* renamed from: g, reason: collision with root package name */
    public long f142529g;

    /* renamed from: h, reason: collision with root package name */
    public long f142530h;

    @Override // jx3.a
    public int g() {
        return 20205;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142526d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142527e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142528f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142529g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142530h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f142526d);
        stringBuffer.append("\r\nPullStartTimeStamp:");
        stringBuffer.append(this.f142527e);
        stringBuffer.append("\r\nPullEndTimeStamp:");
        stringBuffer.append(this.f142528f);
        stringBuffer.append("\r\nIsSuccess:");
        stringBuffer.append(this.f142529g);
        stringBuffer.append("\r\nFailedType:");
        stringBuffer.append(this.f142530h);
        return stringBuffer.toString();
    }
}
