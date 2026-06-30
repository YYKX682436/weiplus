package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class WeNoteMenuOperationStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62914d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62915e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f62916f;

    /* renamed from: g, reason: collision with root package name */
    public int f62917g;

    @Override // jx3.a
    public int g() {
        return 26791;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62914d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62915e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62916f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62917g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionID:");
        stringBuffer.append(this.f62914d);
        stringBuffer.append("\r\nnoteid:");
        stringBuffer.append(this.f62915e);
        stringBuffer.append("\r\npicStatus:");
        stringBuffer.append(this.f62916f);
        stringBuffer.append("\r\nOperationType:");
        stringBuffer.append(this.f62917g);
        return stringBuffer.toString();
    }
}
