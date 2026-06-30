package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class LivePhotoTecReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f58621f;

    /* renamed from: h, reason: collision with root package name */
    public int f58623h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58619d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f58620e = com.tencent.tinker.loader.shareutil.ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58622g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58624i = "";

    @Override // jx3.a
    public int g() {
        return 33708;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58619d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58620e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58621f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58622g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58623h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58624i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FunName:");
        stringBuffer.append(this.f58619d);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f58620e);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f58621f);
        stringBuffer.append("\r\nExtras:");
        stringBuffer.append(this.f58622g);
        stringBuffer.append("\r\nCoreVersion:");
        stringBuffer.append(this.f58623h);
        stringBuffer.append("\r\nSysVersion:");
        stringBuffer.append(this.f58624i);
        return stringBuffer.toString();
    }
}
