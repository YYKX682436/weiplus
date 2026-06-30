package com.tencent.mm.plugin.appbrand.appcache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.j f75618e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.k f75619f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.k[] f75620g;

    /* renamed from: d, reason: collision with root package name */
    public final int f75621d;

    static {
        com.tencent.mm.plugin.appbrand.appcache.k kVar = new com.tencent.mm.plugin.appbrand.appcache.k("NONE", 0, -1);
        f75619f = kVar;
        com.tencent.mm.plugin.appbrand.appcache.k[] kVarArr = {kVar, new com.tencent.mm.plugin.appbrand.appcache.k("NOT_USED", 1, 0), new com.tencent.mm.plugin.appbrand.appcache.k("USED", 2, 1)};
        f75620g = kVarArr;
        rz5.b.a(kVarArr);
        f75618e = new com.tencent.mm.plugin.appbrand.appcache.j(null);
    }

    public k(java.lang.String str, int i17, int i18) {
        this.f75621d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.appcache.k valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.appcache.k) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.appcache.k.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.appcache.k[] values() {
        return (com.tencent.mm.plugin.appbrand.appcache.k[]) f75620g.clone();
    }
}
