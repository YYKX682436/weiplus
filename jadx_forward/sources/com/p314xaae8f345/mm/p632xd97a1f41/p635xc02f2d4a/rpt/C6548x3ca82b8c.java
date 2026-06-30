package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPageEnterStatStruct */
/* loaded from: classes10.dex */
public final class C6548x3ca82b8c extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f138992f;

    /* renamed from: h, reason: collision with root package name */
    public long f138994h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138990d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138991e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138993g = "";

    @Override // jx3.a
    public int g() {
        return 29492;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138990d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138991e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138992f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138993g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138994h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ToPage:");
        stringBuffer.append(this.f138990d);
        stringBuffer.append("\r\nFromUI:");
        stringBuffer.append(this.f138991e);
        stringBuffer.append("\r\nfromCommentScene:");
        stringBuffer.append(this.f138992f);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f138993g);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f138994h);
        return stringBuffer.toString();
    }
}
