package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct */
/* loaded from: classes3.dex */
public final class C6300x6832e2ea extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136582d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f136583e = "";

    @Override // jx3.a
    public int g() {
        return 30986;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136582d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136583e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f136582d);
        stringBuffer.append("\r\nActionData:");
        stringBuffer.append(this.f136583e);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea p(java.lang.String str) {
        this.f136582d = b("Action", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea q(java.lang.String str) {
        this.f136583e = b("ActionData", str, true);
        return this;
    }
}
