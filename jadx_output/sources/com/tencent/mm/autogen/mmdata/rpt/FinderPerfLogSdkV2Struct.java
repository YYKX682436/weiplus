package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderPerfLogSdkV2Struct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f57479d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57480e = "";

    @Override // jx3.a
    public int g() {
        return 34937;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57479d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57480e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EventId:");
        stringBuffer.append(this.f57479d);
        stringBuffer.append("\r\nEventTime:0\r\nEventParams:");
        stringBuffer.append(this.f57480e);
        return stringBuffer.toString();
    }
}
