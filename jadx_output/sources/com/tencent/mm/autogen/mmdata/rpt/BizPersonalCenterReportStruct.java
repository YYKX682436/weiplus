package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class BizPersonalCenterReportStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f55405h;

    /* renamed from: i, reason: collision with root package name */
    public long f55406i;

    /* renamed from: j, reason: collision with root package name */
    public long f55407j;

    /* renamed from: k, reason: collision with root package name */
    public long f55408k;

    /* renamed from: d, reason: collision with root package name */
    public long f55401d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f55402e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f55403f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f55404g = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f55409l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f55410m = "";

    @Override // jx3.a
    public int g() {
        return 27213;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55401d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55402e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55403f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55404g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55405h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55406i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55407j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55408k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55409l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55410m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionType:");
        stringBuffer.append(this.f55401d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f55402e);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f55403f);
        stringBuffer.append("\r\nRedPointNum:");
        stringBuffer.append(this.f55404g);
        stringBuffer.append("\r\nBizuin:");
        stringBuffer.append(this.f55405h);
        stringBuffer.append("\r\nisGuardianMode:");
        stringBuffer.append(this.f55406i);
        stringBuffer.append("\r\nhasSmallPoint:");
        stringBuffer.append(this.f55407j);
        stringBuffer.append("\r\nenterSessionId:");
        stringBuffer.append(this.f55408k);
        stringBuffer.append("\r\nenterFromNotifyTips:");
        stringBuffer.append(this.f55409l);
        stringBuffer.append("\r\nwording:");
        stringBuffer.append(this.f55410m);
        return stringBuffer.toString();
    }
}
