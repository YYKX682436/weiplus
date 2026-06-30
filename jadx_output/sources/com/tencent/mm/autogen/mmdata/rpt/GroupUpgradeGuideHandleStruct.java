package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class GroupUpgradeGuideHandleStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58400d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f58401e;

    @Override // jx3.a
    public int g() {
        return 19352;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58400d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58401e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Roomid:");
        stringBuffer.append(this.f58400d);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f58401e);
        return stringBuffer.toString();
    }
}
