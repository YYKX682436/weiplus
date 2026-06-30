package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AIWeAppProcessStruct */
/* loaded from: classes7.dex */
public final class C6291xfbc1bbb9 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f136539e;

    /* renamed from: i, reason: collision with root package name */
    public int f136543i;

    /* renamed from: k, reason: collision with root package name */
    public long f136545k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136538d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f136540f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f136541g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f136542h = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f136544j = "";

    @Override // jx3.a
    public int g() {
        return 35653;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136538d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136539e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136540f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136541g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136542h);
        stringBuffer.append(",");
        stringBuffer.append(this.f136543i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f136544j);
        stringBuffer.append(",");
        stringBuffer.append(this.f136545k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f136538d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f136539e);
        stringBuffer.append("\r\ncmdId:");
        stringBuffer.append(this.f136540f);
        stringBuffer.append("\r\ncmdTaskId:");
        stringBuffer.append(this.f136541g);
        stringBuffer.append("\r\ncmdMethod:");
        stringBuffer.append(this.f136542h);
        stringBuffer.append("\r\ncmdRetCode:");
        stringBuffer.append(this.f136543i);
        stringBuffer.append("\r\nprocessTextType:0\r\nprocessTextContent:");
        stringBuffer.append(this.f136544j);
        stringBuffer.append("\r\ncost:");
        stringBuffer.append(this.f136545k);
        return stringBuffer.toString();
    }
}
