package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolEditeLogStruct */
/* loaded from: classes11.dex */
public final class C6370x102f469 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f137182e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137181d = "";

    /* renamed from: f, reason: collision with root package name */
    public long f137183f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f137184g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f137185h = 0;

    @Override // jx3.a
    public int g() {
        return 19437;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137181d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137182e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137183f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137184g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137185h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomusrname:");
        stringBuffer.append(this.f137181d);
        stringBuffer.append("\r\nexitType:");
        stringBuffer.append(this.f137182e);
        stringBuffer.append("\r\nrole:");
        stringBuffer.append(this.f137183f);
        stringBuffer.append("\r\ntopBefore:");
        stringBuffer.append(this.f137184g);
        stringBuffer.append("\r\ntopAfter:");
        stringBuffer.append(this.f137185h);
        return stringBuffer.toString();
    }
}
