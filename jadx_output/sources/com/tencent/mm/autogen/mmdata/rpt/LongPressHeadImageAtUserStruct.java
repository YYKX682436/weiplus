package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class LongPressHeadImageAtUserStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58695d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f58696e;

    /* renamed from: f, reason: collision with root package name */
    public long f58697f;

    @Override // jx3.a
    public int g() {
        return 22595;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58695d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58696e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58697f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f58695d);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f58696e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f58697f);
        return stringBuffer.toString();
    }
}
