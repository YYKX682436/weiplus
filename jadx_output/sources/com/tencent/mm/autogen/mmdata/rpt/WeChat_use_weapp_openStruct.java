package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class WeChat_use_weapp_openStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f62898e;

    /* renamed from: f, reason: collision with root package name */
    public long f62899f;

    /* renamed from: g, reason: collision with root package name */
    public long f62900g;

    /* renamed from: h, reason: collision with root package name */
    public long f62901h;

    /* renamed from: k, reason: collision with root package name */
    public long f62904k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62897d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62902i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62903j = "";

    @Override // jx3.a
    public int g() {
        return 21775;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62897d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62898e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62899f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62900g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62901h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62902i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62903j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62904k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("session:");
        stringBuffer.append(this.f62897d);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f62898e);
        stringBuffer.append("\r\nscene_type:");
        stringBuffer.append(this.f62899f);
        stringBuffer.append("\r\nweapp_sum:");
        stringBuffer.append(this.f62900g);
        stringBuffer.append("\r\nweapp_index:");
        stringBuffer.append(this.f62901h);
        stringBuffer.append("\r\nweapp_id:");
        stringBuffer.append(this.f62902i);
        stringBuffer.append("\r\nweapp_name:");
        stringBuffer.append(this.f62903j);
        stringBuffer.append("\r\nopen_type:");
        stringBuffer.append(this.f62904k);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct p(java.lang.String str) {
        this.f62897d = b("session", str, true);
        return this;
    }
}
