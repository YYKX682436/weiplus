package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct */
/* loaded from: classes8.dex */
public final class C6760x897d68ec extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public long f140879i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140874d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f140875e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f140876f = 2;

    /* renamed from: g, reason: collision with root package name */
    public long f140877g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140878h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f140880j = "";

    @Override // jx3.a
    public int g() {
        return 20559;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140874d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140875e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140876f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140877g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140878h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140879i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140880j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("HasConfirmed:");
        stringBuffer.append(this.f140874d);
        stringBuffer.append("\r\nOper:");
        stringBuffer.append(this.f140875e);
        stringBuffer.append("\r\nHasSideNote:");
        stringBuffer.append(this.f140876f);
        stringBuffer.append("\r\nFinalShareCount:");
        stringBuffer.append(this.f140877g);
        stringBuffer.append("\r\nFinalShareCountByType:");
        stringBuffer.append(this.f140878h);
        stringBuffer.append("\r\nForwardScene:");
        stringBuffer.append(this.f140879i);
        stringBuffer.append("\r\nToUsername:");
        stringBuffer.append(this.f140880j);
        return stringBuffer.toString();
    }
}
