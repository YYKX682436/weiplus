package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class EffectRenderReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55955d;

    /* renamed from: e, reason: collision with root package name */
    public int f55956e;

    /* renamed from: f, reason: collision with root package name */
    public long f55957f;

    /* renamed from: g, reason: collision with root package name */
    public long f55958g;

    /* renamed from: h, reason: collision with root package name */
    public int f55959h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f55960i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f55961j = 0;

    @Override // jx3.a
    public int g() {
        return 23689;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55955d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55956e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55957f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55958g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55959h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55960i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55961j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f55955d);
        stringBuffer.append("\r\nRenderType:");
        stringBuffer.append(this.f55956e);
        stringBuffer.append("\r\nCreateCost:");
        stringBuffer.append(this.f55957f);
        stringBuffer.append("\r\nRenderCost:");
        stringBuffer.append(this.f55958g);
        stringBuffer.append("\r\nSizeError:");
        stringBuffer.append(this.f55959h);
        stringBuffer.append("\r\nInputError:");
        stringBuffer.append(this.f55960i);
        stringBuffer.append("\r\nOutputError:");
        stringBuffer.append(this.f55961j);
        return stringBuffer.toString();
    }
}
