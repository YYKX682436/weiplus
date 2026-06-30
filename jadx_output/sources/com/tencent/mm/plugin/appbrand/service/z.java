package com.tencent.mm.plugin.appbrand.service;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.z f88839e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.z f88840f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.service.z[] f88841g;

    /* renamed from: d, reason: collision with root package name */
    public final int f88842d;

    static {
        com.tencent.mm.plugin.appbrand.service.z zVar = new com.tencent.mm.plugin.appbrand.service.z("Expose", 0, 1);
        f88839e = zVar;
        com.tencent.mm.plugin.appbrand.service.z zVar2 = new com.tencent.mm.plugin.appbrand.service.z("Click", 1, 2);
        f88840f = zVar2;
        com.tencent.mm.plugin.appbrand.service.z[] zVarArr = {zVar, zVar2};
        f88841g = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17, int i18) {
        this.f88842d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.service.z valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.service.z) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.service.z.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.service.z[] values() {
        return (com.tencent.mm.plugin.appbrand.service.z[]) f88841g.clone();
    }
}
