package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class WCMomentsMenuActionReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f62078f;

    /* renamed from: d, reason: collision with root package name */
    public int f62076d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62077e = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f62079g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62080h = "";

    @Override // jx3.a
    public int g() {
        return 25260;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62076d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62077e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62078f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62079g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62080h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene_:");
        stringBuffer.append(this.f62076d);
        stringBuffer.append("\r\nsnsinfo_:");
        stringBuffer.append(this.f62077e);
        stringBuffer.append("\r\naction_:");
        stringBuffer.append(this.f62078f);
        stringBuffer.append("\r\nforwardInfo_:");
        stringBuffer.append(this.f62079g);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f62080h);
        return stringBuffer.toString();
    }
}
