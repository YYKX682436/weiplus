package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class ChatSpecialAttentionLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55663d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55664e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f55665f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55666g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55667h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f55668i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f55669j = 0;

    @Override // jx3.a
    public int g() {
        return 23492;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55663d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55664e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55665f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55666g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55667h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55668i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55669j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f55663d);
        stringBuffer.append("\r\nroomUsername:");
        stringBuffer.append(this.f55664e);
        stringBuffer.append("\r\nListCount:");
        stringBuffer.append(this.f55665f);
        stringBuffer.append("\r\naddList:");
        stringBuffer.append(this.f55666g);
        stringBuffer.append("\r\ndelList:");
        stringBuffer.append(this.f55667h);
        stringBuffer.append("\r\naddCount:");
        stringBuffer.append(this.f55668i);
        stringBuffer.append("\r\ndelCount:");
        stringBuffer.append(this.f55669j);
        return stringBuffer.toString();
    }
}
