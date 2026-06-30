package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class MultiTaskItemAddStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f59379e;

    /* renamed from: f, reason: collision with root package name */
    public long f59380f;

    /* renamed from: g, reason: collision with root package name */
    public long f59381g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59378d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59382h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59383i = "";

    @Override // jx3.a
    public int g() {
        return 21935;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59378d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59379e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59380f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59381g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59382h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59383i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ItemId:");
        stringBuffer.append(this.f59378d);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f59379e);
        stringBuffer.append("\r\nAddType:");
        stringBuffer.append(this.f59380f);
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(this.f59381g);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f59382h);
        stringBuffer.append("\r\nItemSubId:");
        stringBuffer.append(this.f59383i);
        return stringBuffer.toString();
    }
}
