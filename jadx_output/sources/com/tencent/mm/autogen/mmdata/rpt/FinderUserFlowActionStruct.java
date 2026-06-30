package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FinderUserFlowActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57961d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57962e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57963f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57964g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57965h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57966i = "";

    @Override // jx3.a
    public int g() {
        return 23462;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57961d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57962e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57963f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57964g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57965h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57966i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("biz_id:");
        stringBuffer.append(this.f57961d);
        stringBuffer.append("\r\nflow_id:");
        stringBuffer.append(this.f57962e);
        stringBuffer.append("\r\nevent_id:");
        stringBuffer.append(this.f57963f);
        stringBuffer.append("\r\nevent_time:");
        stringBuffer.append(this.f57964g);
        stringBuffer.append("\r\nfinderuin:");
        stringBuffer.append(this.f57965h);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f57966i);
        return stringBuffer.toString();
    }
}
