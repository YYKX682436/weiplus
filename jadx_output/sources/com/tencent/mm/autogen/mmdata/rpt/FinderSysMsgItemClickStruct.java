package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class FinderSysMsgItemClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57892d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f57893e;

    /* renamed from: f, reason: collision with root package name */
    public long f57894f;

    @Override // jx3.a
    public int g() {
        return 19947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57892d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57893e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57894f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57892d);
        stringBuffer.append("\r\nRedDotCount:");
        stringBuffer.append(this.f57893e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f57894f);
        return stringBuffer.toString();
    }
}
