package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAAfterCloseGuideReportStruct */
/* loaded from: classes3.dex */
public final class C7024x8fa42fff extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143411d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f143412e;

    /* renamed from: f, reason: collision with root package name */
    public long f143413f;

    @Override // jx3.a
    public int g() {
        return 31563;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143411d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143412e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143413f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f143411d);
        stringBuffer.append("\r\ndialogType:");
        stringBuffer.append(this.f143412e);
        stringBuffer.append("\r\nevent:");
        stringBuffer.append(this.f143413f);
        return stringBuffer.toString();
    }
}
