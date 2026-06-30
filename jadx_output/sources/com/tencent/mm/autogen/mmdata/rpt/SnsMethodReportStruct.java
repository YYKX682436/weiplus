package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsMethodReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60611d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60612e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f60613f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f60614g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f60615h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f60616i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f60617j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f60618k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f60619l = -1;

    /* renamed from: m, reason: collision with root package name */
    public final int f60620m = -1;

    @Override // jx3.a
    public int g() {
        return 26080;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60611d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60612e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60613f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60614g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60615h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60616i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60617j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60618k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60619l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60620m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CpuInfo:");
        stringBuffer.append(this.f60611d);
        stringBuffer.append("\r\nFeedType:");
        stringBuffer.append(this.f60612e);
        stringBuffer.append("\r\nCreateViewCost:");
        stringBuffer.append(this.f60613f);
        stringBuffer.append("\r\nFillContentCost:");
        stringBuffer.append(this.f60614g);
        stringBuffer.append("\r\nReuse:");
        stringBuffer.append(this.f60615h);
        stringBuffer.append("\r\nGetViewCost:");
        stringBuffer.append(this.f60616i);
        stringBuffer.append("\r\nSystemFps:");
        stringBuffer.append(this.f60617j);
        stringBuffer.append("\r\nIsAd:");
        stringBuffer.append(this.f60618k);
        stringBuffer.append("\r\nRecyclerView:");
        stringBuffer.append(this.f60619l);
        stringBuffer.append("\r\nSwitchThreadCost:");
        stringBuffer.append(this.f60620m);
        return stringBuffer.toString();
    }
}
