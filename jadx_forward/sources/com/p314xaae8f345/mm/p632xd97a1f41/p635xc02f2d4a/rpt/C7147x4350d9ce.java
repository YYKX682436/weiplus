package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxImeSendFailedReportStruct */
/* loaded from: classes9.dex */
public final class C7147x4350d9ce extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144531d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144532e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f144533f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f144534g;

    @Override // jx3.a
    public int g() {
        return 28540;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144531d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144532e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144533f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144534g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("currentImePacketName:");
        stringBuffer.append(this.f144531d);
        stringBuffer.append("\r\ncurrentImePacketNameMd5:");
        stringBuffer.append(this.f144532e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f144533f);
        stringBuffer.append("\r\nemojiMd5Empty:");
        stringBuffer.append(this.f144534g);
        return stringBuffer.toString();
    }
}
