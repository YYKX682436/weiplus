package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FinderCreateButtonClickStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f56694e;

    /* renamed from: f, reason: collision with root package name */
    public long f56695f;

    /* renamed from: h, reason: collision with root package name */
    public long f56697h;

    /* renamed from: i, reason: collision with root package name */
    public long f56698i;

    /* renamed from: j, reason: collision with root package name */
    public long f56699j;

    /* renamed from: k, reason: collision with root package name */
    public long f56700k;

    /* renamed from: l, reason: collision with root package name */
    public long f56701l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56693d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56696g = "";

    @Override // jx3.a
    public int g() {
        return 19815;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56693d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56694e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56695f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56696g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56697h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56698i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56699j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56700k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56701l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f56693d);
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(this.f56694e);
        stringBuffer.append("\r\nFailReason:");
        stringBuffer.append(this.f56695f);
        stringBuffer.append("\r\nFailReasonWording:");
        stringBuffer.append(this.f56696g);
        stringBuffer.append("\r\nHasAvatar:");
        stringBuffer.append(this.f56697h);
        stringBuffer.append("\r\nHasNickName:");
        stringBuffer.append(this.f56698i);
        stringBuffer.append("\r\nHasSignature:0\r\nHasSex:");
        stringBuffer.append(this.f56699j);
        stringBuffer.append("\r\nHasLocation:");
        stringBuffer.append(this.f56700k);
        stringBuffer.append("\r\nHasCheckAgreement:0\r\ncreatescene:");
        stringBuffer.append(this.f56701l);
        return stringBuffer.toString();
    }
}
