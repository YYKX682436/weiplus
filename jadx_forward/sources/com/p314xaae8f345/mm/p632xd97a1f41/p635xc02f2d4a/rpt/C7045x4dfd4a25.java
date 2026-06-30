package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCMomentsMenuActionReportStruct */
/* loaded from: classes4.dex */
public final class C7045x4dfd4a25 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f143611f;

    /* renamed from: d, reason: collision with root package name */
    public int f143609d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143610e = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f143612g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143613h = "";

    @Override // jx3.a
    public int g() {
        return 25260;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143609d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143610e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143611f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143612g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143613h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene_:");
        stringBuffer.append(this.f143609d);
        stringBuffer.append("\r\nsnsinfo_:");
        stringBuffer.append(this.f143610e);
        stringBuffer.append("\r\naction_:");
        stringBuffer.append(this.f143611f);
        stringBuffer.append("\r\nforwardInfo_:");
        stringBuffer.append(this.f143612g);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f143613h);
        return stringBuffer.toString();
    }
}
