package com.tencent.mm.plugin.appbrand.report.quality;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class u1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.quality.u1 f88357d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.quality.u1 f88358e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.u1[] f88359f;

    static {
        com.tencent.mm.plugin.appbrand.report.quality.u1 u1Var = new com.tencent.mm.plugin.appbrand.report.quality.u1("START", 0);
        f88357d = u1Var;
        com.tencent.mm.plugin.appbrand.report.quality.u1 u1Var2 = new com.tencent.mm.plugin.appbrand.report.quality.u1("OK", 1);
        f88358e = u1Var2;
        com.tencent.mm.plugin.appbrand.report.quality.u1[] u1VarArr = {u1Var, u1Var2, new com.tencent.mm.plugin.appbrand.report.quality.u1("FAIL", 2)};
        f88359f = u1VarArr;
        rz5.b.a(u1VarArr);
    }

    public u1(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.report.quality.u1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.report.quality.u1) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.report.quality.u1.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.report.quality.u1[] values() {
        return (com.tencent.mm.plugin.appbrand.report.quality.u1[]) f88359f.clone();
    }
}
