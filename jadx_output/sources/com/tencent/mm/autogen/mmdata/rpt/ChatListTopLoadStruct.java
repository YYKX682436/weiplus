package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class ChatListTopLoadStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55638d;

    /* renamed from: e, reason: collision with root package name */
    public int f55639e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55640f = "";

    @Override // jx3.a
    public int g() {
        return 29750;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55638d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55639e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55640f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f55638d);
        stringBuffer.append("\r\nCost:");
        stringBuffer.append(this.f55639e);
        stringBuffer.append("\r\nExt:");
        stringBuffer.append(this.f55640f);
        return stringBuffer.toString();
    }
}
