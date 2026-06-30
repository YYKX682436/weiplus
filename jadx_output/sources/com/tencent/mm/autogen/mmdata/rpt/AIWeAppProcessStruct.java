package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class AIWeAppProcessStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f55006e;

    /* renamed from: i, reason: collision with root package name */
    public int f55010i;

    /* renamed from: k, reason: collision with root package name */
    public long f55012k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55005d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55007f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55008g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55009h = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f55011j = "";

    @Override // jx3.a
    public int g() {
        return 35653;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55005d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55006e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55007f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55008g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55009h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55010i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f55011j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55012k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f55005d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f55006e);
        stringBuffer.append("\r\ncmdId:");
        stringBuffer.append(this.f55007f);
        stringBuffer.append("\r\ncmdTaskId:");
        stringBuffer.append(this.f55008g);
        stringBuffer.append("\r\ncmdMethod:");
        stringBuffer.append(this.f55009h);
        stringBuffer.append("\r\ncmdRetCode:");
        stringBuffer.append(this.f55010i);
        stringBuffer.append("\r\nprocessTextType:0\r\nprocessTextContent:");
        stringBuffer.append(this.f55011j);
        stringBuffer.append("\r\ncost:");
        stringBuffer.append(this.f55012k);
        return stringBuffer.toString();
    }
}
