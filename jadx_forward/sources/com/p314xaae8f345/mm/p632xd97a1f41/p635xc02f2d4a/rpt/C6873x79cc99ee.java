package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SightAutoDownloadAndPlaySettingStruct */
/* loaded from: classes11.dex */
public final class C6873x79cc99ee extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f141913d;

    /* renamed from: e, reason: collision with root package name */
    public int f141914e;

    /* renamed from: f, reason: collision with root package name */
    public int f141915f;

    /* renamed from: g, reason: collision with root package name */
    public int f141916g;

    /* renamed from: h, reason: collision with root package name */
    public int f141917h;

    /* renamed from: i, reason: collision with root package name */
    public int f141918i;

    @Override // jx3.a
    public int g() {
        return 17504;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141913d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141914e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141915f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141916g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141917h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f141918i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportScene:");
        stringBuffer.append(this.f141913d);
        stringBuffer.append("\r\nResourceAutoDownload:");
        stringBuffer.append(this.f141914e);
        stringBuffer.append("\r\nImageSaveLocal:");
        stringBuffer.append(this.f141915f);
        stringBuffer.append("\r\nSightSaveLocal:");
        stringBuffer.append(this.f141916g);
        stringBuffer.append("\r\nSightAutoPlay:");
        stringBuffer.append(this.f141917h);
        stringBuffer.append("\r\nVoiceImproveQuality:0\r\nImageIdentify:");
        stringBuffer.append(this.f141918i);
        return stringBuffer.toString();
    }
}
