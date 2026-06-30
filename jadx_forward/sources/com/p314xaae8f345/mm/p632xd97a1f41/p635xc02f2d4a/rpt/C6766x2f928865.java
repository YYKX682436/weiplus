package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemAddStruct */
/* loaded from: classes8.dex */
public final class C6766x2f928865 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f140912e;

    /* renamed from: f, reason: collision with root package name */
    public long f140913f;

    /* renamed from: g, reason: collision with root package name */
    public long f140914g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140911d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140915h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140916i = "";

    @Override // jx3.a
    public int g() {
        return 21935;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140911d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140912e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140913f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140914g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140915h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140916i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ItemId:");
        stringBuffer.append(this.f140911d);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f140912e);
        stringBuffer.append("\r\nAddType:");
        stringBuffer.append(this.f140913f);
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(this.f140914g);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f140915h);
        stringBuffer.append("\r\nItemSubId:");
        stringBuffer.append(this.f140916i);
        return stringBuffer.toString();
    }
}
