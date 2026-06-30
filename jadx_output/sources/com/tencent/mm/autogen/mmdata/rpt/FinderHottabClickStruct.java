package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderHottabClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56937d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56938e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56939f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56940g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f56941h;

    /* renamed from: i, reason: collision with root package name */
    public long f56942i;

    /* renamed from: j, reason: collision with root package name */
    public long f56943j;

    /* renamed from: k, reason: collision with root package name */
    public long f56944k;

    /* renamed from: l, reason: collision with root package name */
    public long f56945l;

    @Override // jx3.a
    public int g() {
        return 19998;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56937d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56938e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56939f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56940g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56941h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56942i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56943j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56944k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56945l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f56937d);
        stringBuffer.append("\r\nSessionid:");
        stringBuffer.append(this.f56938e);
        stringBuffer.append("\r\nContextid:");
        stringBuffer.append(this.f56939f);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f56940g);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f56941h);
        stringBuffer.append("\r\nactionTimeStamp:");
        stringBuffer.append(this.f56942i);
        stringBuffer.append("\r\nmessageType:");
        stringBuffer.append(this.f56943j);
        stringBuffer.append("\r\nfeedIndex:");
        stringBuffer.append(this.f56944k);
        stringBuffer.append("\r\nisfloat:0\r\ninnerVersion:");
        stringBuffer.append(this.f56945l);
        return stringBuffer.toString();
    }
}
