package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class MagicCardRuntimeKVStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59075d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59076e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59077f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59078g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59079h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59080i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59081j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59082k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f59083l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f59084m = "";

    @Override // jx3.a
    public int g() {
        return 30450;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59075d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59076e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59077f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59078g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59079h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59080i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59081j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59082k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59083l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59084m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("bizType:");
        stringBuffer.append(this.f59075d);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f59076e);
        stringBuffer.append("\r\nsubType:");
        stringBuffer.append(this.f59077f);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f59078g);
        stringBuffer.append("\r\nbizName:");
        stringBuffer.append(this.f59079h);
        stringBuffer.append("\r\nframeSetRootPath:");
        stringBuffer.append(this.f59080i);
        stringBuffer.append("\r\nframeSetName:");
        stringBuffer.append(this.f59081j);
        stringBuffer.append("\r\nextInfoStr1:");
        stringBuffer.append(this.f59082k);
        stringBuffer.append("\r\nextInfoStr2:");
        stringBuffer.append(this.f59083l);
        stringBuffer.append("\r\nextInfoStr3:");
        stringBuffer.append(this.f59084m);
        return stringBuffer.toString();
    }
}
