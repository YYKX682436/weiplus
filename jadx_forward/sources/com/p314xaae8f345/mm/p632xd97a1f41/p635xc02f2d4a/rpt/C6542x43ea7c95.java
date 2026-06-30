package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderModifyStruct */
/* loaded from: classes10.dex */
public final class C6542x43ea7c95 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138951d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138952e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f138953f;

    @Override // jx3.a
    public int g() {
        return 33591;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138951d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138952e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138953f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feed_id:");
        stringBuffer.append(this.f138951d);
        stringBuffer.append("\r\nfeed_modify_info:");
        stringBuffer.append(this.f138952e);
        stringBuffer.append("\r\nmodify_ret:");
        stringBuffer.append(this.f138953f);
        return stringBuffer.toString();
    }
}
