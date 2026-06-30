package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class AppBrandWidgetReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55264d;

    /* renamed from: e, reason: collision with root package name */
    public int f55265e;

    /* renamed from: f, reason: collision with root package name */
    public int f55266f;

    @Override // jx3.a
    public int g() {
        return 26449;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55264d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55265e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55266f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("widget_id:");
        stringBuffer.append(this.f55264d);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f55265e);
        stringBuffer.append("\r\napp_num:");
        stringBuffer.append(this.f55266f);
        return stringBuffer.toString();
    }
}
