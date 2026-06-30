package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DismissedChatroomInfoReportStruct */
/* loaded from: classes7.dex */
public final class C6395x66c11df3 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137393d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f137394e;

    @Override // jx3.a
    public int g() {
        return 24182;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137393d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137394e);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomUsername:");
        stringBuffer.append(this.f137393d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f137394e);
        stringBuffer.append("\r\nUserRole:0");
        return stringBuffer.toString();
    }
}
