package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatHbClickStruct */
/* loaded from: classes12.dex */
public final class C6366xdea69d8b extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137155d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f137156e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f137157f;

    /* renamed from: g, reason: collision with root package name */
    public long f137158g;

    @Override // jx3.a
    public int g() {
        return 18869;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137155d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137156e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137157f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137158g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f137155d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f137156e);
        stringBuffer.append("\r\nWeShiCount:");
        stringBuffer.append(this.f137157f);
        stringBuffer.append("\r\nClickTime:");
        stringBuffer.append(this.f137158g);
        return stringBuffer.toString();
    }
}
