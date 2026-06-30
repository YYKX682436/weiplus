package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandTaskBar_CloseStruct */
/* loaded from: classes8.dex */
public final class C6317xcbf43d76 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136739d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f136740e;

    /* renamed from: f, reason: collision with root package name */
    public long f136741f;

    /* renamed from: g, reason: collision with root package name */
    public long f136742g;

    /* renamed from: h, reason: collision with root package name */
    public long f136743h;

    /* renamed from: i, reason: collision with root package name */
    public long f136744i;

    @Override // jx3.a
    public int g() {
        return 21929;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136739d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136740e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136741f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136742g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136743h);
        stringBuffer.append(",");
        stringBuffer.append(this.f136744i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("session_id:");
        stringBuffer.append(this.f136739d);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f136740e);
        stringBuffer.append("\r\nlive_duration:");
        stringBuffer.append(this.f136741f);
        stringBuffer.append("\r\npage_type:");
        stringBuffer.append(this.f136742g);
        stringBuffer.append("\r\npage:");
        stringBuffer.append(this.f136743h);
        stringBuffer.append("\r\nlive_duration_ms:");
        stringBuffer.append(this.f136744i);
        return stringBuffer.toString();
    }
}
