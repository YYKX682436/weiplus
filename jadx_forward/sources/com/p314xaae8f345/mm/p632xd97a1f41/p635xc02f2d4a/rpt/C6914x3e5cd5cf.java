package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsWsLoadStruct */
/* loaded from: classes4.dex */
public final class C6914x3e5cd5cf extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142336d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f142337e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f142338f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f142339g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f142340h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f142341i = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f142342j = "";

    @Override // jx3.a
    public int g() {
        return 36016;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142336d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142337e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142338f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142339g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142340h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142341i);
        stringBuffer.append(",");
        stringBuffer.append(this.f142342j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReqStartTimeMs:");
        stringBuffer.append(this.f142336d);
        stringBuffer.append("\r\nReqEndTimeMs:");
        stringBuffer.append(this.f142337e);
        stringBuffer.append("\r\nUserWaitTimeMs:");
        stringBuffer.append(this.f142338f);
        stringBuffer.append("\r\nPageIndex:");
        stringBuffer.append(this.f142339g);
        stringBuffer.append("\r\nReqCount:");
        stringBuffer.append(this.f142340h);
        stringBuffer.append("\r\nRspCount:");
        stringBuffer.append(this.f142341i);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f142342j);
        return stringBuffer.toString();
    }
}
