package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct */
/* loaded from: classes2.dex */
public final class C6553x54ab9387 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139025e;

    /* renamed from: f, reason: collision with root package name */
    public long f139026f;

    /* renamed from: h, reason: collision with root package name */
    public long f139028h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139024d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139027g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f139029i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f139030j = "";

    @Override // jx3.a
    public int g() {
        return 22878;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139024d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139025e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139026f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139027g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139028h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139029i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139030j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f139024d);
        stringBuffer.append("\r\npickerScene:");
        stringBuffer.append(this.f139025e);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f139026f);
        stringBuffer.append("\r\neventCode:");
        stringBuffer.append(this.f139027g);
        stringBuffer.append("\r\ntabType:");
        stringBuffer.append(this.f139028h);
        stringBuffer.append("\r\nudfKv:");
        stringBuffer.append(this.f139029i);
        stringBuffer.append("\r\ntimeStampInMs:");
        stringBuffer.append(this.f139030j);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 p(java.lang.String str) {
        this.f139027g = b("eventCode", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 q(java.lang.String str) {
        this.f139024d = b("sessionid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 r(java.lang.String str) {
        this.f139030j = b("timeStampInMs", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 s(java.lang.String str) {
        this.f139029i = b("udfKv", str, true);
        return this;
    }
}
