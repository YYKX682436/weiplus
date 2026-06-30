package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class AndroidFinderLivePostReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55049d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55050e = "";

    @Override // jx3.a
    public int g() {
        return 30986;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55049d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55050e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f55049d);
        stringBuffer.append("\r\nActionData:");
        stringBuffer.append(this.f55050e);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct p(java.lang.String str) {
        this.f55049d = b("Action", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct q(java.lang.String str) {
        this.f55050e = b("ActionData", str, true);
        return this;
    }
}
