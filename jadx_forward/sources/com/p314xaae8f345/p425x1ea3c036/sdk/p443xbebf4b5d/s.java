package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d;

/* loaded from: classes7.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129218b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.t f129219c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 f129220d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f129221e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f129222f;

    /* renamed from: g, reason: collision with root package name */
    public final long f129223g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f129224h;

    public s(java.lang.String appId, int i17, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.t status, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 initConfig, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        this.f129217a = appId;
        this.f129218b = i17;
        this.f129219c = status;
        this.f129220d = initConfig;
        this.f129221e = z17;
        this.f129222f = status == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.t.f129226e || status == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.t.f129227f;
        this.f129223g = java.lang.System.currentTimeMillis();
        this.f129224h = "";
    }

    /* renamed from: toString */
    public java.lang.String m32243x9616526c() {
        return "LuggageMiniProgramRecord(appId='" + this.f129217a + "', debugType=" + this.f129218b + ", instanceId=" + this.f129224h + ", status=" + this.f129219c + ", isPersistent=" + this.f129221e + ", preRendered=" + this.f129222f + ", startingTimestamp=" + this.f129223g + ')';
    }
}
