package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderVstStruct */
/* loaded from: classes10.dex */
public final class C6608x4048ce66 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f139617g;

    /* renamed from: i, reason: collision with root package name */
    public long f139619i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139614d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139615e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139616f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139618h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f139620j = "";

    @Override // jx3.a
    public int g() {
        return 23898;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139614d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139615e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139616f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139617g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139618h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139619i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139620j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f139614d);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f139615e);
        stringBuffer.append("\r\nevent_id:");
        stringBuffer.append(this.f139616f);
        stringBuffer.append("\r\nevent_time:");
        stringBuffer.append(this.f139617g);
        stringBuffer.append("\r\nvst_type:");
        stringBuffer.append(this.f139618h);
        stringBuffer.append("\r\nduration:");
        stringBuffer.append(this.f139619i);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f139620j);
        return stringBuffer.toString();
    }
}
