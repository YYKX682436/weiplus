package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class StoryUploadReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f60985d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f60986e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f60987f = "";

    @Override // jx3.a
    public int g() {
        return 16664;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60985d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60986e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60987f);
        stringBuffer.append(",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FileUrl:");
        stringBuffer.append(this.f60985d);
        stringBuffer.append("\r\nVideoMd5:");
        stringBuffer.append(this.f60986e);
        stringBuffer.append("\r\nTid:");
        stringBuffer.append(this.f60987f);
        stringBuffer.append("\r\nUploadStartTime:0\r\nUploadEndTime:0\r\nOriginSize:0\r\nOriginDuration:0\r\nOriginVideoBitrate:0\r\nOriginAudioBitrate:0\r\nOriginFps:0\r\nOriginWidth:0\r\nOriginHeight:0\r\nCPSize:0\r\nCPDuration:0\r\nCPVideoBitrate:0\r\nCPAudioBitrate:0\r\nCPFps:0\r\nCPWidth:0\r\nCPHight:0\r\nSendSource:0\r\nOriginAudioChannel:0\r\nNetWorkType:0");
        return stringBuffer.toString();
    }
}
