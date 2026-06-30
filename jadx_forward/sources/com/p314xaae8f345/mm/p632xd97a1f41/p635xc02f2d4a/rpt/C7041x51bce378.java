package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAQuotaControlReportStruct */
/* loaded from: classes7.dex */
public final class C7041x51bce378 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f143586e;

    /* renamed from: f, reason: collision with root package name */
    public long f143587f;

    /* renamed from: g, reason: collision with root package name */
    public long f143588g;

    /* renamed from: j, reason: collision with root package name */
    public long f143591j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143585d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143589h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143590i = "";

    @Override // jx3.a
    public int g() {
        return 31577;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143585d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143586e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143587f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143588g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143589h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143590i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143591j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f143585d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f143586e);
        stringBuffer.append("\r\nsavedSpaceSize:");
        stringBuffer.append(this.f143587f);
        stringBuffer.append("\r\nrealSpaceSize:");
        stringBuffer.append(this.f143588g);
        stringBuffer.append("\r\nfilePath:");
        stringBuffer.append(this.f143589h);
        stringBuffer.append("\r\nfileOp:");
        stringBuffer.append(this.f143590i);
        stringBuffer.append("\r\nsizeDiff:");
        stringBuffer.append(this.f143591j);
        return stringBuffer.toString();
    }
}
