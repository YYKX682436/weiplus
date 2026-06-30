package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class ModifyAliasLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59238d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59239e;

    /* renamed from: f, reason: collision with root package name */
    public long f59240f;

    /* renamed from: g, reason: collision with root package name */
    public long f59241g;

    @Override // jx3.a
    public int g() {
        return 19818;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59238d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59239e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59240f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59241g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f59238d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f59239e);
        stringBuffer.append("\r\nerrortype:");
        stringBuffer.append(this.f59240f);
        stringBuffer.append("\r\npageid:");
        stringBuffer.append(this.f59241g);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct p(java.lang.String str) {
        this.f59238d = b("sessionid", str, true);
        return this;
    }
}
