package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatBoxSessionActionStruct */
/* loaded from: classes11.dex */
public final class C6364x7a000d2e extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137134d;

    /* renamed from: e, reason: collision with root package name */
    public long f137135e;

    /* renamed from: f, reason: collision with root package name */
    public long f137136f;

    @Override // jx3.a
    public int g() {
        return 24201;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137134d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137135e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137136f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f137134d);
        stringBuffer.append("\r\nredType:");
        stringBuffer.append(this.f137135e);
        stringBuffer.append("\r\ngrayStatus:");
        stringBuffer.append(this.f137136f);
        return stringBuffer.toString();
    }
}
