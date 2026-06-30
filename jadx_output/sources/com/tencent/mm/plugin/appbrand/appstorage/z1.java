package com.tencent.mm.plugin.appbrand.appstorage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.z1[] f76336d;

    static {
        com.tencent.mm.plugin.appbrand.appstorage.z1[] z1VarArr = {new com.tencent.mm.plugin.appbrand.appstorage.z1("APP", 0, 0), new com.tencent.mm.plugin.appbrand.appstorage.z1("GAME", 1, 0), new com.tencent.mm.plugin.appbrand.appstorage.z1("OPEN_DATA", 2, 1), new com.tencent.mm.plugin.appbrand.appstorage.z1("SINGLE_PAGE", 3, 2), new com.tencent.mm.plugin.appbrand.appstorage.z1("CACHE", 4, 3), new com.tencent.mm.plugin.appbrand.appstorage.z1("IDAAS", 5, 4)};
        f76336d = z1VarArr;
        rz5.b.a(z1VarArr);
    }

    public z1(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.z1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.appstorage.z1) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.appstorage.z1.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.z1[] values() {
        return (com.tencent.mm.plugin.appbrand.appstorage.z1[]) f76336d.clone();
    }
}
