package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class ShareMsgClipStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60342d;

    /* renamed from: e, reason: collision with root package name */
    public int f60343e;

    /* renamed from: f, reason: collision with root package name */
    public int f60344f;

    /* renamed from: g, reason: collision with root package name */
    public int f60345g;

    @Override // jx3.a
    public int g() {
        return 18617;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60342d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60343e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60344f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60345g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("msgId:");
        stringBuffer.append(this.f60342d);
        stringBuffer.append("\r\nselectLen:");
        stringBuffer.append(this.f60343e);
        stringBuffer.append("\r\ntotalLen:");
        stringBuffer.append(this.f60344f);
        stringBuffer.append("\r\nclipLen:");
        stringBuffer.append(this.f60345g);
        return stringBuffer.toString();
    }
}
