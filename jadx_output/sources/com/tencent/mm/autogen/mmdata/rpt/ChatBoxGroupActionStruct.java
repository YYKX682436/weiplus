package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class ChatBoxGroupActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55598d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f55599e;

    /* renamed from: f, reason: collision with root package name */
    public long f55600f;

    @Override // jx3.a
    public int g() {
        return 24200;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55598d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55599e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55600f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomUsername:");
        stringBuffer.append(this.f55598d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f55599e);
        stringBuffer.append("\r\nopenStatus:");
        stringBuffer.append(this.f55600f);
        return stringBuffer.toString();
    }
}
