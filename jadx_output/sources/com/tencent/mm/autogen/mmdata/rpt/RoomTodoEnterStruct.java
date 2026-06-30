package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class RoomTodoEnterStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60090e;

    /* renamed from: f, reason: collision with root package name */
    public long f60091f;

    /* renamed from: g, reason: collision with root package name */
    public long f60092g;

    /* renamed from: h, reason: collision with root package name */
    public long f60093h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60089d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60094i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60095j = "";

    @Override // jx3.a
    public int g() {
        return 19443;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60089d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60090e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60091f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60092g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60093h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60094i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60095j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomId:");
        stringBuffer.append(this.f60089d);
        stringBuffer.append("\r\nrole:");
        stringBuffer.append(this.f60090e);
        stringBuffer.append("\r\nmsgType:");
        stringBuffer.append(this.f60091f);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f60092g);
        stringBuffer.append("\r\nexit:");
        stringBuffer.append(this.f60093h);
        stringBuffer.append("\r\ntodoid:");
        stringBuffer.append(this.f60094i);
        stringBuffer.append("\r\nappusername:");
        stringBuffer.append(this.f60095j);
        return stringBuffer.toString();
    }
}
