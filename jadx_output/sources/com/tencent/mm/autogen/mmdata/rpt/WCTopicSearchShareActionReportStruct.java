package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class WCTopicSearchShareActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62168d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62169e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f62170f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62171g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f62172h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62173i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62174j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62175k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f62176l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62177m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f62178n;

    /* renamed from: o, reason: collision with root package name */
    public long f62179o;

    @Override // jx3.a
    public int g() {
        return 20997;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62168d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62169e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62170f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62171g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62172h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62173i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62174j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62175k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62176l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62177m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62178n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62179o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f62168d);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f62169e);
        stringBuffer.append("\r\nResultType:");
        stringBuffer.append(this.f62170f);
        stringBuffer.append("\r\nResultQuery:");
        stringBuffer.append(this.f62171g);
        stringBuffer.append("\r\nShareScene:");
        stringBuffer.append(this.f62172h);
        stringBuffer.append("\r\nShareSceneId:");
        stringBuffer.append(this.f62173i);
        stringBuffer.append("\r\nShareSessionId:");
        stringBuffer.append(this.f62174j);
        stringBuffer.append("\r\nShareSearchId:");
        stringBuffer.append(this.f62175k);
        stringBuffer.append("\r\nShareRequestId:");
        stringBuffer.append(this.f62176l);
        stringBuffer.append("\r\nShareDocId:");
        stringBuffer.append(this.f62177m);
        stringBuffer.append("\r\nShareBizType:");
        stringBuffer.append(this.f62178n);
        stringBuffer.append("\r\nShareSubType:");
        stringBuffer.append(this.f62179o);
        return stringBuffer.toString();
    }
}
