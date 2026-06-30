package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class SwitchTaskStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61019d;

    /* renamed from: e, reason: collision with root package name */
    public long f61020e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61021f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61022g = "";

    @Override // jx3.a
    public int g() {
        return 24071;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61019d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61020e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61021f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61022g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f61019d);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f61020e);
        stringBuffer.append("\r\nItemId:");
        stringBuffer.append(this.f61021f);
        stringBuffer.append("\r\nItemSessionId:");
        stringBuffer.append(this.f61022g);
        return stringBuffer.toString();
    }
}
