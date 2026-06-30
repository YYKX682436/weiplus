package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class localSearchWidgetClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f63124d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f63125e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f63126f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f63127g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f63128h = "";

    @Override // jx3.a
    public int g() {
        return 16033;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f63124d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f63125e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f63126f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63127g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63128h);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:0\r\nsearchid:");
        stringBuffer.append(this.f63124d);
        stringBuffer.append("\r\nbusinesstype:0\r\ndocid:");
        stringBuffer.append(this.f63125e);
        stringBuffer.append("\r\ntimestampInMs:0\r\nexpand2:");
        stringBuffer.append(this.f63126f);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f63127g);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f63128h);
        stringBuffer.append("\r\nresultsubtype:0");
        return stringBuffer.toString();
    }
}
