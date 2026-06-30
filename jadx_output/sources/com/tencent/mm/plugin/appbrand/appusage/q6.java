package com.tencent.mm.plugin.appbrand.appusage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class q6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.p6 f76545d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.q6 f76546e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.q6 f76547f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.q6[] f76548g;

    static {
        com.tencent.mm.plugin.appbrand.appusage.q6 q6Var = new com.tencent.mm.plugin.appbrand.appusage.q6("ENTRANCE_ID_NONE", 0);
        com.tencent.mm.plugin.appbrand.appusage.q6 q6Var2 = new com.tencent.mm.plugin.appbrand.appusage.q6("ENTRANCE_ID_NEARBY", 1);
        f76546e = q6Var2;
        com.tencent.mm.plugin.appbrand.appusage.q6 q6Var3 = new com.tencent.mm.plugin.appbrand.appusage.q6("ENTRANCE_ID_LIVE", 2);
        f76547f = q6Var3;
        com.tencent.mm.plugin.appbrand.appusage.q6[] q6VarArr = {q6Var, q6Var2, q6Var3, new com.tencent.mm.plugin.appbrand.appusage.q6("ENTRANCE_ID_FRIENDS_USING", 3)};
        f76548g = q6VarArr;
        rz5.b.a(q6VarArr);
        f76545d = new com.tencent.mm.plugin.appbrand.appusage.p6(null);
    }

    public q6(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.appusage.q6 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.appusage.q6) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.appusage.q6.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.appusage.q6[] values() {
        return (com.tencent.mm.plugin.appbrand.appusage.q6[]) f76548g.clone();
    }
}
