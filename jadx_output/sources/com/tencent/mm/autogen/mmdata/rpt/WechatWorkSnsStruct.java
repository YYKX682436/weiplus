package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class WechatWorkSnsStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62976d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62977e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62978f = "";

    @Override // jx3.a
    public int g() {
        return 18337;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f62976d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62977e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f62978f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpenimUin:0\r\nOptionType:");
        stringBuffer.append(this.f62976d);
        stringBuffer.append("\r\nOptionResult:");
        stringBuffer.append(this.f62977e);
        stringBuffer.append("\r\nSource:0\r\nClickAction:0\r\nOpenimUsername:");
        stringBuffer.append(this.f62978f);
        return stringBuffer.toString();
    }
}
