package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderTraceActionStruct */
/* loaded from: classes10.dex */
public final class C6598xd584abea extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139466e;

    /* renamed from: h, reason: collision with root package name */
    public long f139469h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139465d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139467f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139468g = "";

    @Override // jx3.a
    public int g() {
        return 19433;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139465d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139466e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139467f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139468g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139469h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f139465d);
        stringBuffer.append("\r\nActionTime:");
        stringBuffer.append(this.f139466e);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f139467f);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f139468g);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f139469h);
        return stringBuffer.toString();
    }
}
