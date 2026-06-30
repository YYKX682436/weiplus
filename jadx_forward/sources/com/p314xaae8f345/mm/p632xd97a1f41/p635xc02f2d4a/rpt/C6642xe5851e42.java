package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupUpgradeGuideFlowStruct */
/* loaded from: classes12.dex */
public final class C6642xe5851e42 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139930e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139929d = "";

    /* renamed from: f, reason: collision with root package name */
    public long f139931f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f139932g = 0;

    @Override // jx3.a
    public int g() {
        return 19353;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139929d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139930e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139931f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139932g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Roomid:");
        stringBuffer.append(this.f139929d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f139930e);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f139931f);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f139932g);
        return stringBuffer.toString();
    }
}
