package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class wxa_expt_hitStruct extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public long f63228i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63223d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f63224e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f63225f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63226g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63227h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f63229j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f63230k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f63231l = 0;

    @Override // jx3.a
    public int g() {
        return 21627;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63223d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63224e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63225f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63226g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63227h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63228i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63229j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63230k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f63231l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f63223d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f63224e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f63225f);
        stringBuffer.append("\r\nlibVersion:");
        stringBuffer.append(this.f63226g);
        stringBuffer.append("\r\nlibUpdateTime:");
        stringBuffer.append(this.f63227h);
        stringBuffer.append("\r\nexptGroupId:");
        stringBuffer.append(this.f63228i);
        stringBuffer.append("\r\nexptParam:");
        stringBuffer.append(this.f63229j);
        stringBuffer.append("\r\nHitSrcType:");
        stringBuffer.append(this.f63230k);
        stringBuffer.append("\r\nAppUin:0\r\nJsDataType:");
        stringBuffer.append(this.f63231l);
        return stringBuffer.toString();
    }
}
