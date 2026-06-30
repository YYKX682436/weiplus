package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class EmoticonBoardExpandStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56005d;

    /* renamed from: e, reason: collision with root package name */
    public long f56006e;

    /* renamed from: f, reason: collision with root package name */
    public long f56007f;

    @Override // jx3.a
    public int g() {
        return 27327;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56005d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56006e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56007f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionTS:");
        stringBuffer.append(this.f56005d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f56006e);
        stringBuffer.append("\r\ntabindex:");
        stringBuffer.append(this.f56007f);
        return stringBuffer.toString();
    }
}
