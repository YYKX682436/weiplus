package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class DiscoverViewEntranceSettingStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55837d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f55838e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f55839f;

    @Override // jx3.a
    public int g() {
        return 15185;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55837d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55838e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55839f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EntranceID:");
        stringBuffer.append(this.f55837d);
        stringBuffer.append("\r\nSettingEvent:");
        stringBuffer.append(this.f55838e);
        stringBuffer.append("\r\nsettingMethod:");
        stringBuffer.append(this.f55839f);
        return stringBuffer.toString();
    }
}
