package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class AppBrandTaskBar_ClickStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f55195e;

    /* renamed from: f, reason: collision with root package name */
    public long f55196f;

    /* renamed from: h, reason: collision with root package name */
    public long f55198h;

    /* renamed from: k, reason: collision with root package name */
    public long f55201k;

    /* renamed from: m, reason: collision with root package name */
    public long f55203m;

    /* renamed from: n, reason: collision with root package name */
    public long f55204n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55194d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55197g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55199i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f55200j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55202l = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f55205o = "";

    @Override // jx3.a
    public int g() {
        return 21931;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55194d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55195e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55196f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55197g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55198h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55199i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f55200j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55201k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55202l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55203m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55204n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55205o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("session_id:");
        stringBuffer.append(this.f55194d);
        stringBuffer.append("\r\npage_type:");
        stringBuffer.append(this.f55195e);
        stringBuffer.append("\r\npage_feed_index:");
        stringBuffer.append(this.f55196f);
        stringBuffer.append("\r\ncontent_id:");
        stringBuffer.append(this.f55197g);
        stringBuffer.append("\r\npage:");
        stringBuffer.append(this.f55198h);
        stringBuffer.append("\r\nicon_appid:");
        stringBuffer.append(this.f55199i);
        stringBuffer.append("\r\nif_dym:0\r\ndym_msg:");
        stringBuffer.append(this.f55200j);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f55201k);
        stringBuffer.append("\r\nextra_data:");
        stringBuffer.append(this.f55202l);
        stringBuffer.append("\r\nclick_timestamp:");
        stringBuffer.append(this.f55203m);
        stringBuffer.append("\r\nis_refresh:");
        stringBuffer.append(this.f55204n);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f55205o);
        return stringBuffer.toString();
    }
}
