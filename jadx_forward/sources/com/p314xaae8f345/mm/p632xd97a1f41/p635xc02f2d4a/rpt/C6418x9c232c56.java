package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonRepairInfoStruct */
/* loaded from: classes12.dex */
public final class C6418x9c232c56 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137598d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f137599e;

    /* renamed from: f, reason: collision with root package name */
    public int f137600f;

    /* renamed from: g, reason: collision with root package name */
    public int f137601g;

    /* renamed from: h, reason: collision with root package name */
    public int f137602h;

    @Override // jx3.a
    public int g() {
        return 30178;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137598d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137599e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137600f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137601g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137602h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ProductId:");
        stringBuffer.append(this.f137598d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f137599e);
        stringBuffer.append("\r\nOriginCount:");
        stringBuffer.append(this.f137600f);
        stringBuffer.append("\r\nBeforeCount:");
        stringBuffer.append(this.f137601g);
        stringBuffer.append("\r\nRepairedCount:");
        stringBuffer.append(this.f137602h);
        return stringBuffer.toString();
    }
}
