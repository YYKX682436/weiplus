package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct */
/* loaded from: classes7.dex */
public final class C7072x6cf4c688 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.g f143804f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143802d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f143803e = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f143805g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143806h = 0;

    @Override // jx3.a
    public int g() {
        return 17688;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143802d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143803e);
        stringBuffer.append(",");
        cm.g gVar = this.f143804f;
        stringBuffer.append(gVar != null ? gVar.f124618d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143805g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143806h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f143802d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143803e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143804f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143805g);
        stringBuffer.append("\r\nFileAllocSize:");
        stringBuffer.append(this.f143806h);
        return stringBuffer.toString();
    }
}
