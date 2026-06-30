package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MentionedFeedFilterStruct */
/* loaded from: classes.dex */
public final class C6736x2d5034 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f140706d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f140707e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f140708f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f140709g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f140710h = "";

    @Override // jx3.a
    public int g() {
        return 22657;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140706d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140707e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f140708f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140709g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140710h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f140706d);
        stringBuffer.append("\r\nfindercontextid:");
        stringBuffer.append(this.f140707e);
        stringBuffer.append("\r\nevent_code:0\r\nevent_time:");
        stringBuffer.append(this.f140708f);
        stringBuffer.append("\r\neid:");
        stringBuffer.append(this.f140709g);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f140710h);
        return stringBuffer.toString();
    }
}
