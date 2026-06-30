package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct */
/* loaded from: classes11.dex */
public final class C6363x8f18fad7 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137131d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f137132e;

    /* renamed from: f, reason: collision with root package name */
    public long f137133f;

    @Override // jx3.a
    public int g() {
        return 24200;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137131d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137132e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137133f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomUsername:");
        stringBuffer.append(this.f137131d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f137132e);
        stringBuffer.append("\r\nopenStatus:");
        stringBuffer.append(this.f137133f);
        return stringBuffer.toString();
    }
}
