package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct */
/* loaded from: classes4.dex */
public final class C6751x48475a11 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140800d;

    /* renamed from: e, reason: collision with root package name */
    public long f140801e;

    /* renamed from: f, reason: collision with root package name */
    public long f140802f;

    @Override // jx3.a
    public int g() {
        return 17560;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140800d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140801e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140802f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportType:");
        stringBuffer.append(this.f140800d);
        stringBuffer.append("\r\nMediaType:");
        stringBuffer.append(this.f140801e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f140802f);
        return stringBuffer.toString();
    }
}
