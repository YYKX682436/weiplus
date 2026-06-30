package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderPreloadDataStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f57632f;

    /* renamed from: g, reason: collision with root package name */
    public int f57633g;

    /* renamed from: i, reason: collision with root package name */
    public long f57635i;

    /* renamed from: j, reason: collision with root package name */
    public int f57636j;

    /* renamed from: l, reason: collision with root package name */
    public long f57638l;

    /* renamed from: n, reason: collision with root package name */
    public long f57640n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57630d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57631e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57634h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f57637k = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f57639m = "";

    @Override // jx3.a
    public int g() {
        return 24123;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57630d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57631e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57632f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57633g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57634h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57635i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57636j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57637k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57638l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57639m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57640n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("opType:");
        stringBuffer.append(this.f57630d);
        stringBuffer.append("\r\nPreloadSource:");
        stringBuffer.append(this.f57631e);
        stringBuffer.append("\r\ntabType:");
        stringBuffer.append(this.f57632f);
        stringBuffer.append("\r\npullType:");
        stringBuffer.append(this.f57633g);
        stringBuffer.append("\r\nentranceRedDotObjectId:");
        stringBuffer.append(this.f57634h);
        stringBuffer.append("\r\nentranceRedDotScene:");
        stringBuffer.append(this.f57635i);
        stringBuffer.append("\r\nentranceRedDotPreloadFlag:");
        stringBuffer.append(this.f57636j);
        stringBuffer.append("\r\nserverConfig:");
        stringBuffer.append(this.f57637k);
        stringBuffer.append("\r\nrefreshPrefetchStatus:");
        stringBuffer.append(this.f57638l);
        stringBuffer.append("\r\nclearCacheSource:");
        stringBuffer.append(this.f57639m);
        stringBuffer.append("\r\ninnerVersion:");
        stringBuffer.append(this.f57640n);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPreloadDataStruct p(java.lang.String str) {
        this.f57630d = b("opType", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderPreloadDataStruct q(java.lang.String str) {
        this.f57631e = b("PreloadSource", str, true);
        return this;
    }
}
