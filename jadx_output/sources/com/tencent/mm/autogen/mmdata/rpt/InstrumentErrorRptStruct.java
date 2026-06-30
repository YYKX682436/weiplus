package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class InstrumentErrorRptStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f58509d;

    @Override // jx3.a
    public int g() {
        return 25017;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58509d);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ErrorType:");
        stringBuffer.append(this.f58509d);
        return stringBuffer.toString();
    }
}
