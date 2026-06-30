package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderPickerDataReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57492e;

    /* renamed from: f, reason: collision with root package name */
    public long f57493f;

    /* renamed from: h, reason: collision with root package name */
    public long f57495h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57491d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57494g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57496i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57497j = "";

    @Override // jx3.a
    public int g() {
        return 22878;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57491d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57492e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57493f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57494g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57495h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57496i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57497j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f57491d);
        stringBuffer.append("\r\npickerScene:");
        stringBuffer.append(this.f57492e);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f57493f);
        stringBuffer.append("\r\neventCode:");
        stringBuffer.append(this.f57494g);
        stringBuffer.append("\r\ntabType:");
        stringBuffer.append(this.f57495h);
        stringBuffer.append("\r\nudfKv:");
        stringBuffer.append(this.f57496i);
        stringBuffer.append("\r\ntimeStampInMs:");
        stringBuffer.append(this.f57497j);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct p(java.lang.String str) {
        this.f57494g = b("eventCode", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct q(java.lang.String str) {
        this.f57491d = b("sessionid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct r(java.lang.String str) {
        this.f57497j = b("timeStampInMs", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct s(java.lang.String str) {
        this.f57496i = b("udfKv", str, true);
        return this;
    }
}
