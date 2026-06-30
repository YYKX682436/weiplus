package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WAQuotaControlReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f62053e;

    /* renamed from: f, reason: collision with root package name */
    public long f62054f;

    /* renamed from: g, reason: collision with root package name */
    public long f62055g;

    /* renamed from: j, reason: collision with root package name */
    public long f62058j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62052d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62056h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62057i = "";

    @Override // jx3.a
    public int g() {
        return 31577;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62052d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62053e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62054f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62055g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62056h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62057i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62058j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f62052d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f62053e);
        stringBuffer.append("\r\nsavedSpaceSize:");
        stringBuffer.append(this.f62054f);
        stringBuffer.append("\r\nrealSpaceSize:");
        stringBuffer.append(this.f62055g);
        stringBuffer.append("\r\nfilePath:");
        stringBuffer.append(this.f62056h);
        stringBuffer.append("\r\nfileOp:");
        stringBuffer.append(this.f62057i);
        stringBuffer.append("\r\nsizeDiff:");
        stringBuffer.append(this.f62058j);
        return stringBuffer.toString();
    }
}
