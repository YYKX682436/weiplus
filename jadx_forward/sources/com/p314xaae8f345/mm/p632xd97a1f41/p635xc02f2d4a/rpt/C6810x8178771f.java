package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PanelEnterActionStruct */
/* loaded from: classes5.dex */
public final class C6810x8178771f extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f141371g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141368d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f141369e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141370f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f141372h = "";

    @Override // jx3.a
    public int g() {
        return 19959;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141368d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141369e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141370f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141371g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141372h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RoomName:");
        stringBuffer.append(this.f141368d);
        stringBuffer.append("\r\nIsRedDot:");
        stringBuffer.append(this.f141369e);
        stringBuffer.append("\r\nAppList:");
        stringBuffer.append(this.f141370f);
        stringBuffer.append("\r\nPanelPage:");
        stringBuffer.append(this.f141371g);
        stringBuffer.append("\r\nHasReddotAppList:");
        stringBuffer.append(this.f141372h);
        return stringBuffer.toString();
    }
}
