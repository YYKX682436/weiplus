package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class localSearchComfirmActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63121d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f63122e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63123f = "";

    @Override // jx3.a
    public int g() {
        return 15776;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63121d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63122e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63123f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionScene:");
        stringBuffer.append(this.f63121d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f63122e);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f63123f);
        return stringBuffer.toString();
    }
}
