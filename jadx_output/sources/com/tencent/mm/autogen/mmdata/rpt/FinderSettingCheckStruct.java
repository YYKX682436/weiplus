package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class FinderSettingCheckStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57813d;

    /* renamed from: e, reason: collision with root package name */
    public long f57814e;

    @Override // jx3.a
    public int g() {
        return 19952;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57813d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57814e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f57813d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f57814e);
        return stringBuffer.toString();
    }
}
