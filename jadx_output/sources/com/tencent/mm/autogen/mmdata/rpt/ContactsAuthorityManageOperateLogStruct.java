package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class ContactsAuthorityManageOperateLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55753d;

    /* renamed from: e, reason: collision with root package name */
    public long f55754e;

    /* renamed from: f, reason: collision with root package name */
    public long f55755f;

    /* renamed from: g, reason: collision with root package name */
    public long f55756g;

    /* renamed from: h, reason: collision with root package name */
    public long f55757h;

    /* renamed from: i, reason: collision with root package name */
    public long f55758i;

    /* renamed from: j, reason: collision with root package name */
    public long f55759j;

    /* renamed from: k, reason: collision with root package name */
    public long f55760k;

    @Override // jx3.a
    public int g() {
        return 22666;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55753d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55754e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55755f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55756g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55757h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55758i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55759j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55760k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f55753d);
        stringBuffer.append("\r\nbiz_type:");
        stringBuffer.append(this.f55754e);
        stringBuffer.append("\r\nauth_type:");
        stringBuffer.append(this.f55755f);
        stringBuffer.append("\r\nselection_type:");
        stringBuffer.append(this.f55756g);
        stringBuffer.append("\r\nselection_count:");
        stringBuffer.append(this.f55757h);
        stringBuffer.append("\r\nselection_fri_count:");
        stringBuffer.append(this.f55758i);
        stringBuffer.append("\r\norigin_list_fri_count:");
        stringBuffer.append(this.f55759j);
        stringBuffer.append("\r\nsubmit_fri_count:");
        stringBuffer.append(this.f55760k);
        return stringBuffer.toString();
    }
}
