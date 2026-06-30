package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPreloadDataStruct */
/* loaded from: classes2.dex */
public final class C6564xaf1ac362 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f139165f;

    /* renamed from: g, reason: collision with root package name */
    public int f139166g;

    /* renamed from: i, reason: collision with root package name */
    public long f139168i;

    /* renamed from: j, reason: collision with root package name */
    public int f139169j;

    /* renamed from: l, reason: collision with root package name */
    public long f139171l;

    /* renamed from: n, reason: collision with root package name */
    public long f139173n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139163d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139164e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139167h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f139170k = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f139172m = "";

    @Override // jx3.a
    public int g() {
        return 24123;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139163d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139164e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139165f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139166g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139167h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139168i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139169j);
        stringBuffer.append(",");
        stringBuffer.append(this.f139170k);
        stringBuffer.append(",");
        stringBuffer.append(this.f139171l);
        stringBuffer.append(",");
        stringBuffer.append(this.f139172m);
        stringBuffer.append(",");
        stringBuffer.append(this.f139173n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("opType:");
        stringBuffer.append(this.f139163d);
        stringBuffer.append("\r\nPreloadSource:");
        stringBuffer.append(this.f139164e);
        stringBuffer.append("\r\ntabType:");
        stringBuffer.append(this.f139165f);
        stringBuffer.append("\r\npullType:");
        stringBuffer.append(this.f139166g);
        stringBuffer.append("\r\nentranceRedDotObjectId:");
        stringBuffer.append(this.f139167h);
        stringBuffer.append("\r\nentranceRedDotScene:");
        stringBuffer.append(this.f139168i);
        stringBuffer.append("\r\nentranceRedDotPreloadFlag:");
        stringBuffer.append(this.f139169j);
        stringBuffer.append("\r\nserverConfig:");
        stringBuffer.append(this.f139170k);
        stringBuffer.append("\r\nrefreshPrefetchStatus:");
        stringBuffer.append(this.f139171l);
        stringBuffer.append("\r\nclearCacheSource:");
        stringBuffer.append(this.f139172m);
        stringBuffer.append("\r\ninnerVersion:");
        stringBuffer.append(this.f139173n);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6564xaf1ac362 p(java.lang.String str) {
        this.f139163d = b("opType", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6564xaf1ac362 q(java.lang.String str) {
        this.f139164e = b("PreloadSource", str, true);
        return this;
    }
}
