package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class OpenimDimissionSucceedStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59815d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59816e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59817f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59818g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59819h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f59820i = 0;

    @Override // jx3.a
    public int g() {
        return 19942;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59815d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59816e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59817f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59818g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59819h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59820i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ResignationWorkUsername:");
        stringBuffer.append(this.f59815d);
        stringBuffer.append("\r\nTakeOverWorkUsername:");
        stringBuffer.append(this.f59816e);
        stringBuffer.append("\r\nWorkEnterpriseDescId:");
        stringBuffer.append(this.f59817f);
        stringBuffer.append("\r\nWorkEnterpriseName:");
        stringBuffer.append(this.f59818g);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f59819h);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f59820i);
        return stringBuffer.toString();
    }
}
