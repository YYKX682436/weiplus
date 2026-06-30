package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class EmoticonRepairInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56065d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f56066e;

    /* renamed from: f, reason: collision with root package name */
    public int f56067f;

    /* renamed from: g, reason: collision with root package name */
    public int f56068g;

    /* renamed from: h, reason: collision with root package name */
    public int f56069h;

    @Override // jx3.a
    public int g() {
        return 30178;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56065d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56066e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56067f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56068g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56069h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ProductId:");
        stringBuffer.append(this.f56065d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f56066e);
        stringBuffer.append("\r\nOriginCount:");
        stringBuffer.append(this.f56067f);
        stringBuffer.append("\r\nBeforeCount:");
        stringBuffer.append(this.f56068g);
        stringBuffer.append("\r\nRepairedCount:");
        stringBuffer.append(this.f56069h);
        return stringBuffer.toString();
    }
}
