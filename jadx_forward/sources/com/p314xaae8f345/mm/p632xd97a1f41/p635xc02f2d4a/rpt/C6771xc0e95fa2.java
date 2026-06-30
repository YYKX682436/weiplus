package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct */
/* loaded from: classes11.dex */
public final class C6771xc0e95fa2 extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public long f140965i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140960d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140961e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140962f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140963g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140964h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f140966j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f140967k = "";

    @Override // jx3.a
    public int g() {
        return 24576;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140960d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140961e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140962f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140963g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140964h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140965i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140966j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140967k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f140960d);
        stringBuffer.append("\r\nSongName:");
        stringBuffer.append(this.f140961e);
        stringBuffer.append("\r\nSinger:");
        stringBuffer.append(this.f140962f);
        stringBuffer.append("\r\nWebUrl:");
        stringBuffer.append(this.f140963g);
        stringBuffer.append("\r\nDataUrl:");
        stringBuffer.append(this.f140964h);
        stringBuffer.append("\r\nLength:");
        stringBuffer.append(this.f140965i);
        stringBuffer.append("\r\nPlayTrace:");
        stringBuffer.append(this.f140966j);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f140967k);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 p(java.lang.String str) {
        this.f140966j = b("PlayTrace", str, true);
        return this;
    }
}
