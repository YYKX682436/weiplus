package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoIPRenderProfilerReportStruct */
/* loaded from: classes.dex */
public final class C7004xaf8efd48 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f143180d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f143181e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f143182f = "";

    @Override // jx3.a
    public int g() {
        return 24089;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143180d);
        stringBuffer.append(",0,0,0,0,0,0,");
        stringBuffer.append(this.f143181e);
        stringBuffer.append(",0,0,0,0,0,0,0,0,0,");
        stringBuffer.append(this.f143182f);
        stringBuffer.append(",0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("voipInfo:");
        stringBuffer.append(this.f143180d);
        stringBuffer.append("\r\ngpuMemoryGL:0\r\ngpuMemoryEGL:0\r\ngpuMemoryGFX:0\r\nmemoryTotal:0\r\nopenCameraCost:0\r\ncameraFps:0\r\ncameraResolution:");
        stringBuffer.append(this.f143181e);
        stringBuffer.append("\r\nisVoipBeauty:0\r\nlocalRenderCost:0\r\nlocalRenderFps:0\r\nremoteRenderSoftCost:0\r\nremoteRenderSoftFps:0\r\nremoteRenderHardCost:0\r\nremoteRenderHardFps:0\r\nencoderFunc:0\r\nencoderCost:0\r\nencoderSize:");
        stringBuffer.append(this.f143182f);
        stringBuffer.append("\r\npixelReadFunc:0\r\npixelReadCost:0\r\ncpuLoad:0");
        return stringBuffer.toString();
    }
}
