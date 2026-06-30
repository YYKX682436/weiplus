package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderModifyDistrictAlertStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f57416d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57417e = "";

    @Override // jx3.a
    public int g() {
        return 19431;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57416d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57417e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Username:");
        stringBuffer.append(this.f57416d);
        stringBuffer.append("\r\nAction:0\r\nSessionId:");
        stringBuffer.append(this.f57417e);
        return stringBuffer.toString();
    }
}
