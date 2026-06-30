package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class VASPerformanceStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61541d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61542e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f61543f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f61544g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f61545h;

    /* renamed from: i, reason: collision with root package name */
    public long f61546i;

    /* renamed from: j, reason: collision with root package name */
    public long f61547j;

    @Override // jx3.a
    public int g() {
        return 24933;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61541d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61542e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61543f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61544g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61545h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61546i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61547j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SrcPageName:");
        stringBuffer.append(this.f61541d);
        stringBuffer.append("\r\nDestPageName:");
        stringBuffer.append(this.f61542e);
        stringBuffer.append("\r\nSrcPageType:");
        stringBuffer.append(this.f61543f);
        stringBuffer.append("\r\nDestPageType:");
        stringBuffer.append(this.f61544g);
        stringBuffer.append("\r\nStart2OnCreateCost:");
        stringBuffer.append(this.f61545h);
        stringBuffer.append("\r\nStart2AnimBeginCost:");
        stringBuffer.append(this.f61546i);
        stringBuffer.append("\r\nStart2AnimEndCost:");
        stringBuffer.append(this.f61547j);
        return stringBuffer.toString();
    }
}
