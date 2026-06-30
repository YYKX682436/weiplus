package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class CircleSearchKvReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f55682e;

    /* renamed from: f, reason: collision with root package name */
    public int f55683f;

    /* renamed from: g, reason: collision with root package name */
    public long f55684g;

    /* renamed from: h, reason: collision with root package name */
    public int f55685h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55681d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55686i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f55687j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f55688k = "";

    @Override // jx3.a
    public int g() {
        return 33399;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55681d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55682e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55683f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55684g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55685h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55686i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55687j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55688k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f55681d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f55682e);
        stringBuffer.append("\r\nentrances:");
        stringBuffer.append(this.f55683f);
        stringBuffer.append("\r\naction_timestampms:");
        stringBuffer.append(this.f55684g);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f55685h);
        stringBuffer.append("\r\naction_value:");
        stringBuffer.append(this.f55686i);
        stringBuffer.append("\r\nsearchid:");
        stringBuffer.append(this.f55687j);
        stringBuffer.append("\r\nrequestid:");
        stringBuffer.append(this.f55688k);
        return stringBuffer.toString();
    }
}
