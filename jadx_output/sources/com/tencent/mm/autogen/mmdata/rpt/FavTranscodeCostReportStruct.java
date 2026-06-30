package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FavTranscodeCostReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f56334d;

    /* renamed from: e, reason: collision with root package name */
    public int f56335e;

    /* renamed from: f, reason: collision with root package name */
    public int f56336f;

    /* renamed from: g, reason: collision with root package name */
    public int f56337g;

    /* renamed from: h, reason: collision with root package name */
    public int f56338h;

    @Override // jx3.a
    public int g() {
        return 36776;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56334d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56335e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56336f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56337g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56338h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("type:");
        stringBuffer.append(this.f56334d);
        stringBuffer.append("\r\nisSucc:");
        stringBuffer.append(this.f56335e);
        stringBuffer.append("\r\ncost:");
        stringBuffer.append(this.f56336f);
        stringBuffer.append("\r\nbeforeSize:");
        stringBuffer.append(this.f56337g);
        stringBuffer.append("\r\nafterSize:");
        stringBuffer.append(this.f56338h);
        return stringBuffer.toString();
    }
}
