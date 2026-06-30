package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct */
/* loaded from: classes7.dex */
public final class C7073x1992e4f7 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143807d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143808e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143809f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f143810g;

    /* renamed from: h, reason: collision with root package name */
    public long f143811h;

    @Override // jx3.a
    public int g() {
        return 18837;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143807d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143808e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143809f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143810g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143811h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f143807d);
        stringBuffer.append("\r\nPagePath:");
        stringBuffer.append(this.f143808e);
        stringBuffer.append("\r\nVideoUrl:");
        stringBuffer.append(this.f143809f);
        stringBuffer.append("\r\nEventId:");
        stringBuffer.append(this.f143810g);
        stringBuffer.append("\r\nEventNote:");
        stringBuffer.append(this.f143811h);
        return stringBuffer.toString();
    }
}
