package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class LiveRecordRelatedStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58649d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58650e = "";

    @Override // jx3.a
    public int g() {
        return 24671;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58649d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58650e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Event:");
        stringBuffer.append(this.f58649d);
        stringBuffer.append("\r\nParams:");
        stringBuffer.append(this.f58650e);
        return stringBuffer.toString();
    }
}
