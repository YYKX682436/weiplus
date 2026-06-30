package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MegaVideoHorizontalScreenActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59152d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59153e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f59154f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f59155g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59156h = "";

    @Override // jx3.a
    public int g() {
        return 21151;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59152d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59153e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f59154f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59155g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59156h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Feedid:");
        stringBuffer.append(this.f59152d);
        stringBuffer.append("\r\nLongVideoId:");
        stringBuffer.append(this.f59153e);
        stringBuffer.append("\r\nActionType:0\r\nOutcome:0\r\nsessionid:");
        stringBuffer.append(this.f59154f);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f59155g);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f59156h);
        return stringBuffer.toString();
    }
}
