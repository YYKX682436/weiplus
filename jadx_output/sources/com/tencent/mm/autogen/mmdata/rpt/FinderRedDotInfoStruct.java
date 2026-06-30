package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderRedDotInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f57700d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57701e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f57702f = "";

    @Override // jx3.a
    public int g() {
        return 0;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57700d);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f57701e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57702f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("TipsId:");
        stringBuffer.append(this.f57700d);
        stringBuffer.append("\r\nFinderSyncScene:0\r\nCtrlType:0\r\nPath:");
        stringBuffer.append(this.f57701e);
        stringBuffer.append("\r\nShowType:0\r\nUrl:");
        stringBuffer.append(this.f57702f);
        return stringBuffer.toString();
    }
}
