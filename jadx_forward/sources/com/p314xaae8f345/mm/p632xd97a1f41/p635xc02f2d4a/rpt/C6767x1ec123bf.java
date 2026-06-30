package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemPageBrowseStruct */
/* loaded from: classes8.dex */
public final class C6767x1ec123bf extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f140919f;

    /* renamed from: h, reason: collision with root package name */
    public long f140921h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140917d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140918e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140920g = "";

    @Override // jx3.a
    public int g() {
        return 21947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140917d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140918e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140919f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140920g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140921h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ContextId:");
        stringBuffer.append(this.f140917d);
        stringBuffer.append("\r\nItemId:");
        stringBuffer.append(this.f140918e);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f140919f);
        stringBuffer.append("\r\nItemSubId:");
        stringBuffer.append(this.f140920g);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f140921h);
        return stringBuffer.toString();
    }
}
