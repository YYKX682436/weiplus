package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class FaceDetectInterfaceCalledResultStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56162d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56163e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f56164f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56165g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f56166h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f56167i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f56168j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f56169k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f56170l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f56171m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f56172n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f56173o = 0;

    @Override // jx3.a
    public int g() {
        return 14560;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56162d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56163e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56164f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56165g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56166h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56167i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56168j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56169k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56170l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56171m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56172n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56173o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("calledSessionId:");
        stringBuffer.append(this.f56162d);
        stringBuffer.append("\r\nfunctionName:");
        stringBuffer.append(this.f56163e);
        stringBuffer.append("\r\ninterfaceType:0\r\nbusinessType:");
        stringBuffer.append(this.f56164f);
        stringBuffer.append("\r\nappId:");
        stringBuffer.append(this.f56165g);
        stringBuffer.append("\r\nisFaceDetectVerifySuccess:");
        stringBuffer.append(this.f56166h);
        stringBuffer.append("\r\ntotalTime:");
        stringBuffer.append(this.f56167i);
        stringBuffer.append("\r\nfaceDetectCount:");
        stringBuffer.append(this.f56168j);
        stringBuffer.append("\r\nBeginFaceTime:");
        stringBuffer.append(this.f56169k);
        stringBuffer.append("\r\nBeginLivenessTime:");
        stringBuffer.append(this.f56170l);
        stringBuffer.append("\r\nBeginVerifyTime:");
        stringBuffer.append(this.f56171m);
        stringBuffer.append("\r\nExitFaceTime:");
        stringBuffer.append(this.f56172n);
        stringBuffer.append("\r\nCheckAliveType:");
        stringBuffer.append(this.f56173o);
        return stringBuffer.toString();
    }
}
