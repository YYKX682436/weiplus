package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct */
/* loaded from: classes8.dex */
public final class C7127x99e920dc extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f144431e;

    /* renamed from: f, reason: collision with root package name */
    public long f144432f;

    /* renamed from: g, reason: collision with root package name */
    public long f144433g;

    /* renamed from: h, reason: collision with root package name */
    public long f144434h;

    /* renamed from: k, reason: collision with root package name */
    public long f144437k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144430d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f144435i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f144436j = "";

    @Override // jx3.a
    public int g() {
        return 21775;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144430d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144431e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144432f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144433g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144434h);
        stringBuffer.append(",");
        stringBuffer.append(this.f144435i);
        stringBuffer.append(",");
        stringBuffer.append(this.f144436j);
        stringBuffer.append(",");
        stringBuffer.append(this.f144437k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("session:");
        stringBuffer.append(this.f144430d);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f144431e);
        stringBuffer.append("\r\nscene_type:");
        stringBuffer.append(this.f144432f);
        stringBuffer.append("\r\nweapp_sum:");
        stringBuffer.append(this.f144433g);
        stringBuffer.append("\r\nweapp_index:");
        stringBuffer.append(this.f144434h);
        stringBuffer.append("\r\nweapp_id:");
        stringBuffer.append(this.f144435i);
        stringBuffer.append("\r\nweapp_name:");
        stringBuffer.append(this.f144436j);
        stringBuffer.append("\r\nopen_type:");
        stringBuffer.append(this.f144437k);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7127x99e920dc p(java.lang.String str) {
        this.f144430d = b("session", str, true);
        return this;
    }
}
