package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class ring_author_clickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63152d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f63153e;

    @Override // jx3.a
    public int g() {
        return 25447;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63152d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63153e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feedid:");
        stringBuffer.append(this.f63152d);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f63153e);
        return stringBuffer.toString();
    }
}
