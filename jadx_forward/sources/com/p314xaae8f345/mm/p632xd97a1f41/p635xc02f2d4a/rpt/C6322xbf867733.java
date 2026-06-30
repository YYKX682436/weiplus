package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct */
/* loaded from: classes7.dex */
public final class C6322xbf867733 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136797d;

    /* renamed from: e, reason: collision with root package name */
    public int f136798e;

    /* renamed from: f, reason: collision with root package name */
    public int f136799f;

    @Override // jx3.a
    public int g() {
        return 26449;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136797d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136798e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136799f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("widget_id:");
        stringBuffer.append(this.f136797d);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f136798e);
        stringBuffer.append("\r\napp_num:");
        stringBuffer.append(this.f136799f);
        return stringBuffer.toString();
    }
}
