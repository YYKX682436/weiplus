package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class GroupUpgradeGuideFlowStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58397e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58396d = "";

    /* renamed from: f, reason: collision with root package name */
    public long f58398f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58399g = 0;

    @Override // jx3.a
    public int g() {
        return 19353;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58396d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58397e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58398f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58399g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Roomid:");
        stringBuffer.append(this.f58396d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f58397e);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f58398f);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f58399g);
        return stringBuffer.toString();
    }
}
