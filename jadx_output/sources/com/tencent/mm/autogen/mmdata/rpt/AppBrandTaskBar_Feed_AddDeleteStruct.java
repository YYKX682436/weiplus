package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class AppBrandTaskBar_Feed_AddDeleteStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f55214f;

    /* renamed from: g, reason: collision with root package name */
    public long f55215g;

    /* renamed from: i, reason: collision with root package name */
    public long f55217i;

    /* renamed from: j, reason: collision with root package name */
    public long f55218j;

    /* renamed from: k, reason: collision with root package name */
    public long f55219k;

    /* renamed from: l, reason: collision with root package name */
    public long f55220l;

    /* renamed from: o, reason: collision with root package name */
    public long f55223o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55212d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55213e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55216h = "";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f55221m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f55222n = "";

    @Override // jx3.a
    public int g() {
        return 21926;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55212d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55213e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55214f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55215g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55216h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55217i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55218j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55219k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55220l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55221m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55222n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55223o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("session_id:");
        stringBuffer.append(this.f55212d);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f55213e);
        stringBuffer.append("\r\naction_channel:");
        stringBuffer.append(this.f55214f);
        stringBuffer.append("\r\ncontent_type:");
        stringBuffer.append(this.f55215g);
        stringBuffer.append("\r\ncontent_id:");
        stringBuffer.append(this.f55216h);
        stringBuffer.append("\r\nlive_duration:");
        stringBuffer.append(this.f55217i);
        stringBuffer.append("\r\npage:");
        stringBuffer.append(this.f55218j);
        stringBuffer.append("\r\nindex_from:");
        stringBuffer.append(this.f55219k);
        stringBuffer.append("\r\nindex_to:");
        stringBuffer.append(this.f55220l);
        stringBuffer.append("\r\ndym_msg:");
        stringBuffer.append(this.f55221m);
        stringBuffer.append("\r\napp_username:");
        stringBuffer.append(this.f55222n);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f55223o);
        return stringBuffer.toString();
    }
}
