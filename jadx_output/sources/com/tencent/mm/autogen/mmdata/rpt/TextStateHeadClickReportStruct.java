package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class TextStateHeadClickReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f61135e;

    /* renamed from: f, reason: collision with root package name */
    public long f61136f;

    /* renamed from: g, reason: collision with root package name */
    public long f61137g;

    /* renamed from: h, reason: collision with root package name */
    public long f61138h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61134d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61139i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f61140j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f61141k = "";

    @Override // jx3.a
    public int g() {
        return 22210;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61134d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61135e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61136f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61137g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61138h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61139i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61140j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61141k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ToUsername:");
        stringBuffer.append(this.f61134d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f61135e);
        stringBuffer.append("\r\nHasTextStatusIcon:");
        stringBuffer.append(this.f61136f);
        stringBuffer.append("\r\nActionResult:");
        stringBuffer.append(this.f61137g);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f61138h);
        stringBuffer.append("\r\nSceneExtInfo:");
        stringBuffer.append(this.f61139i);
        stringBuffer.append("\r\nToStatusID:");
        stringBuffer.append(this.f61140j);
        stringBuffer.append("\r\nToStatusIconID:");
        stringBuffer.append(this.f61141k);
        return stringBuffer.toString();
    }
}
