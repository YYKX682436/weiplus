package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FinderRedDotModelStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57703d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57704e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f57705f;

    @Override // jx3.a
    public int g() {
        return 35362;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57703d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57704e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57705f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("current_list:");
        stringBuffer.append(this.f57703d);
        stringBuffer.append("\r\noutput_list:");
        stringBuffer.append(this.f57704e);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f57705f);
        return stringBuffer.toString();
    }
}
