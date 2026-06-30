package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WordDictBuildReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62984d;

    /* renamed from: e, reason: collision with root package name */
    public long f62985e;

    /* renamed from: f, reason: collision with root package name */
    public long f62986f;

    @Override // jx3.a
    public int g() {
        return 20734;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62984d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62985e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62986f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("WordCount:");
        stringBuffer.append(this.f62984d);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f62985e);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f62986f);
        return stringBuffer.toString();
    }
}
