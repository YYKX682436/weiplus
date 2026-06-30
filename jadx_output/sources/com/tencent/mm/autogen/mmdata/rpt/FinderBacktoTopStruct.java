package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderBacktoTopStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56516d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56517e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56518f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f56519g;

    /* renamed from: h, reason: collision with root package name */
    public long f56520h;

    /* renamed from: i, reason: collision with root package name */
    public long f56521i;

    @Override // jx3.a
    public int g() {
        return 19995;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56516d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56517e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56518f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56519g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56520h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56521i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Sessionid:");
        stringBuffer.append(this.f56516d);
        stringBuffer.append("\r\nContextid:");
        stringBuffer.append(this.f56517e);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f56518f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f56519g);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f56520h);
        stringBuffer.append("\r\nHasWording:");
        stringBuffer.append(this.f56521i);
        return stringBuffer.toString();
    }
}
