package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class finder_live_fluent_reportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f63101d;

    /* renamed from: e, reason: collision with root package name */
    public int f63102e;

    /* renamed from: f, reason: collision with root package name */
    public int f63103f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63104g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63105h = "";

    @Override // jx3.a
    public int g() {
        return 30147;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63101d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63102e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63103f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63104g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63105h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("type:");
        stringBuffer.append(this.f63101d);
        stringBuffer.append("\r\nversion:");
        stringBuffer.append(this.f63102e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f63103f);
        stringBuffer.append("\r\nresult:");
        stringBuffer.append(this.f63104g);
        stringBuffer.append("\r\nextraJson:");
        stringBuffer.append(this.f63105h);
        return stringBuffer.toString();
    }
}
