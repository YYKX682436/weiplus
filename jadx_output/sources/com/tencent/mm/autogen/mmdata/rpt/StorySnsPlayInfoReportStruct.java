package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StorySnsPlayInfoReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60973d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f60974e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60975f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f60976g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f60977h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60978i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60979j = "";

    @Override // jx3.a
    public int g() {
        return 16842;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60973d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60974e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60975f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60976g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60977h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60978i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60979j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterTime:");
        stringBuffer.append(this.f60973d);
        stringBuffer.append("\r\nPreviewEnterScene:");
        stringBuffer.append(this.f60974e);
        stringBuffer.append("\r\nWaitPlayVideoList:");
        stringBuffer.append(this.f60975f);
        stringBuffer.append("\r\nWaitPlayUinList:");
        stringBuffer.append(this.f60976g);
        stringBuffer.append("\r\nindex:");
        stringBuffer.append(this.f60977h);
        stringBuffer.append("\r\nWaitPlayVideoList1:");
        stringBuffer.append(this.f60978i);
        stringBuffer.append("\r\nWaitPlayVideoList2:");
        stringBuffer.append(this.f60979j);
        return stringBuffer.toString();
    }
}
