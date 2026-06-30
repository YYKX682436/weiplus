package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class MultitalkScreenFunctionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59420d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f59421e;

    /* renamed from: f, reason: collision with root package name */
    public long f59422f;

    /* renamed from: g, reason: collision with root package name */
    public long f59423g;

    /* renamed from: h, reason: collision with root package name */
    public long f59424h;

    /* renamed from: i, reason: collision with root package name */
    public long f59425i;

    /* renamed from: j, reason: collision with root package name */
    public long f59426j;

    @Override // jx3.a
    public int g() {
        return 21344;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59420d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59421e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59422f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59423g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59424h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59425i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59426j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MultitalkGroupId:");
        stringBuffer.append(this.f59420d);
        stringBuffer.append("\r\nScreeningType:");
        stringBuffer.append(this.f59421e);
        stringBuffer.append("\r\nActiontype:");
        stringBuffer.append(this.f59422f);
        stringBuffer.append("\r\nUsertype:");
        stringBuffer.append(this.f59423g);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f59424h);
        stringBuffer.append("\r\nroomid:");
        stringBuffer.append(this.f59425i);
        stringBuffer.append("\r\nroomkey:");
        stringBuffer.append(this.f59426j);
        return stringBuffer.toString();
    }
}
