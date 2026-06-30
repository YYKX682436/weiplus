package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SwitchTaskStruct */
/* loaded from: classes7.dex */
public final class C6950xc5df1c2e extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142552d;

    /* renamed from: e, reason: collision with root package name */
    public long f142553e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142554f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142555g = "";

    @Override // jx3.a
    public int g() {
        return 24071;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142552d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142553e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142554f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142555g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f142552d);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f142553e);
        stringBuffer.append("\r\nItemId:");
        stringBuffer.append(this.f142554f);
        stringBuffer.append("\r\nItemSessionId:");
        stringBuffer.append(this.f142555g);
        return stringBuffer.toString();
    }
}
