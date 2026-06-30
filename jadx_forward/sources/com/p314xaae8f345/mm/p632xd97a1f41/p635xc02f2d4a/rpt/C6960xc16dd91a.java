package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TextStatePublishExtInfoSizeStruct */
/* loaded from: classes11.dex */
public final class C6960xc16dd91a extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142675d;

    /* renamed from: e, reason: collision with root package name */
    public long f142676e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142677f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f142678g;

    /* renamed from: h, reason: collision with root package name */
    public long f142679h;

    @Override // jx3.a
    public int g() {
        return 29359;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142675d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142676e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142677f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142678g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142679h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExtInfoOriginalSize:");
        stringBuffer.append(this.f142675d);
        stringBuffer.append("\r\nExtInfoFinallSize:");
        stringBuffer.append(this.f142676e);
        stringBuffer.append("\r\nStatusJumpInfoType:");
        stringBuffer.append(this.f142677f);
        stringBuffer.append("\r\nFooterBusiBufSize:");
        stringBuffer.append(this.f142678g);
        stringBuffer.append("\r\nJumpInfoBusiBufSize:");
        stringBuffer.append(this.f142679h);
        return stringBuffer.toString();
    }
}
