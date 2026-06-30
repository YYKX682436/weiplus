package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsSQLExecuteReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60714d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f60715e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60716f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60717g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60718h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f60719i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f60720j = -1;

    @Override // jx3.a
    public int g() {
        return 26209;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60714d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60715e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60716f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60717g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60718h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60719i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60720j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OriginDbCount:");
        stringBuffer.append(this.f60714d);
        stringBuffer.append("\r\nSqlType:");
        stringBuffer.append(this.f60715e);
        stringBuffer.append("\r\nExecuteTime:");
        stringBuffer.append(this.f60716f);
        stringBuffer.append("\r\nSql:");
        stringBuffer.append(this.f60717g);
        stringBuffer.append("\r\nStack:");
        stringBuffer.append(this.f60718h);
        stringBuffer.append("\r\nIsBeforeFirstTimeClean:");
        stringBuffer.append(this.f60719i);
        stringBuffer.append("\r\nIsMainThread:");
        stringBuffer.append(this.f60720j);
        return stringBuffer.toString();
    }
}
