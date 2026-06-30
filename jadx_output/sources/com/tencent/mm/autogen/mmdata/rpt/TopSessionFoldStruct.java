package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class TopSessionFoldStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61314d;

    /* renamed from: e, reason: collision with root package name */
    public long f61315e;

    @Override // jx3.a
    public int g() {
        return 23511;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61314d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61315e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("TopCount:");
        stringBuffer.append(this.f61314d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f61315e);
        return stringBuffer.toString();
    }
}
