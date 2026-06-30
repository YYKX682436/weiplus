package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct */
/* loaded from: classes10.dex */
public final class C6994x9b8047dd extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143081d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f143082e;

    /* renamed from: f, reason: collision with root package name */
    public long f143083f;

    @Override // jx3.a
    public int g() {
        return 24979;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143081d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143082e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143083f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ToUsername:");
        stringBuffer.append(this.f143081d);
        stringBuffer.append("\r\nReason:");
        stringBuffer.append(this.f143082e);
        stringBuffer.append("\r\nReasonDetail:");
        stringBuffer.append(this.f143083f);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6994x9b8047dd p(java.lang.String str) {
        this.f143081d = b("ToUsername", str, true);
        return this;
    }
}
