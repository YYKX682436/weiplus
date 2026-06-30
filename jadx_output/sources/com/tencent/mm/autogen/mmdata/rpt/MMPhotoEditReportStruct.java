package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class MMPhotoEditReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f58847d;

    /* renamed from: e, reason: collision with root package name */
    public int f58848e;

    /* renamed from: f, reason: collision with root package name */
    public int f58849f;

    /* renamed from: g, reason: collision with root package name */
    public int f58850g;

    /* renamed from: h, reason: collision with root package name */
    public int f58851h;

    /* renamed from: j, reason: collision with root package name */
    public int f58853j;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58852i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58854k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58855l = "";

    @Override // jx3.a
    public int g() {
        return 35176;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58847d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58848e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58849f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58850g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58851h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58852i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58853j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58854k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58855l);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("inSampleSize:");
        stringBuffer.append(this.f58847d);
        stringBuffer.append("\r\noriginWidth:");
        stringBuffer.append(this.f58848e);
        stringBuffer.append("\r\noriginHeight:");
        stringBuffer.append(this.f58849f);
        stringBuffer.append("\r\ndecodeWidth:");
        stringBuffer.append(this.f58850g);
        stringBuffer.append("\r\ndecodeHeight:");
        stringBuffer.append(this.f58851h);
        stringBuffer.append("\r\nmemoryRatio:");
        stringBuffer.append(this.f58852i);
        stringBuffer.append("\r\navailMemory:");
        stringBuffer.append(this.f58853j);
        stringBuffer.append("\r\ntotalMemory:");
        stringBuffer.append(this.f58854k);
        stringBuffer.append("\r\nextInfo:");
        stringBuffer.append(this.f58855l);
        stringBuffer.append("\r\nextCode:0");
        return stringBuffer.toString();
    }
}
