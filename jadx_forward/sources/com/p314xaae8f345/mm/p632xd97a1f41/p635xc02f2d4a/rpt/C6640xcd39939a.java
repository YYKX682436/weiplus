package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupNoticeInfoStruct */
/* loaded from: classes12.dex */
public final class C6640xcd39939a extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139923e;

    /* renamed from: f, reason: collision with root package name */
    public long f139924f;

    /* renamed from: g, reason: collision with root package name */
    public long f139925g;

    /* renamed from: i, reason: collision with root package name */
    public long f139927i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139922d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139926h = "";

    @Override // jx3.a
    public int g() {
        return 24947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139922d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139923e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139924f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139925g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139926h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139927i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f139922d);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f139923e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f139924f);
        stringBuffer.append("\r\nNoticeType:");
        stringBuffer.append(this.f139925g);
        stringBuffer.append("\r\nNoticeId:");
        stringBuffer.append(this.f139926h);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f139927i);
        return stringBuffer.toString();
    }
}
