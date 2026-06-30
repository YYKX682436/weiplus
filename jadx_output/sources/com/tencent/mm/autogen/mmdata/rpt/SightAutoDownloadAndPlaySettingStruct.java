package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class SightAutoDownloadAndPlaySettingStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60380d;

    /* renamed from: e, reason: collision with root package name */
    public int f60381e;

    /* renamed from: f, reason: collision with root package name */
    public int f60382f;

    /* renamed from: g, reason: collision with root package name */
    public int f60383g;

    /* renamed from: h, reason: collision with root package name */
    public int f60384h;

    /* renamed from: i, reason: collision with root package name */
    public int f60385i;

    @Override // jx3.a
    public int g() {
        return 17504;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60380d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60381e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60382f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60383g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60384h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60385i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportScene:");
        stringBuffer.append(this.f60380d);
        stringBuffer.append("\r\nResourceAutoDownload:");
        stringBuffer.append(this.f60381e);
        stringBuffer.append("\r\nImageSaveLocal:");
        stringBuffer.append(this.f60382f);
        stringBuffer.append("\r\nSightSaveLocal:");
        stringBuffer.append(this.f60383g);
        stringBuffer.append("\r\nSightAutoPlay:");
        stringBuffer.append(this.f60384h);
        stringBuffer.append("\r\nVoiceImproveQuality:0\r\nImageIdentify:");
        stringBuffer.append(this.f60385i);
        return stringBuffer.toString();
    }
}
