package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSysMsgActionStruct */
/* loaded from: classes9.dex */
public final class C6591x10d87825 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f139422d;

    /* renamed from: e, reason: collision with root package name */
    public long f139423e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139424f = "";

    @Override // jx3.a
    public int g() {
        return 20849;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139422d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139423e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139424f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("msgType:");
        stringBuffer.append(this.f139422d);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f139423e);
        stringBuffer.append("\r\nmsgId:");
        stringBuffer.append(this.f139424f);
        return stringBuffer.toString();
    }
}
