package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class dc extends dm.ed {

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f75496r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f75497s;

    static {
        l75.e0 initAutoDBInfo = dm.ed.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appcache.dc.class);
        f75496r = initAutoDBInfo;
        java.lang.String createSQLs = l75.n0.getCreateSQLs(initAutoDBInfo, "WxaVersionTemplateIdMapping");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        f75497s = new java.lang.String[]{createSQLs};
    }

    @Override // dm.ed, l75.f0
    public l75.e0 getDBInfo() {
        return f75496r;
    }
}
