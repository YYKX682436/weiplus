package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ring_history_logStruct */
/* loaded from: classes12.dex */
public final class C7168x9f0cf5ff extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f144687d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144688e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f144689f;

    @Override // jx3.a
    public int g() {
        return 25858;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144687d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144688e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144689f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f144687d);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f144688e);
        stringBuffer.append("\r\nfeedtype:");
        stringBuffer.append(this.f144689f);
        return stringBuffer.toString();
    }
}
