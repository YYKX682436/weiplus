package com.tencent.mm.plugin.appbrand.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e4 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.e4 f90421d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.e4 f90422e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.e4 f90423f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.e4[] f90424g;

    static {
        com.tencent.mm.plugin.appbrand.utils.e4 e4Var = new com.tencent.mm.plugin.appbrand.utils.e4("UNSPECIFIED", 0);
        f90421d = e4Var;
        com.tencent.mm.plugin.appbrand.utils.e4 e4Var2 = new com.tencent.mm.plugin.appbrand.utils.e4("PORTRAIT", 1);
        f90422e = e4Var2;
        com.tencent.mm.plugin.appbrand.utils.e4 e4Var3 = new com.tencent.mm.plugin.appbrand.utils.e4("LANDSCAPE", 2);
        f90423f = e4Var3;
        com.tencent.mm.plugin.appbrand.utils.e4[] e4VarArr = {e4Var, e4Var2, e4Var3};
        f90424g = e4VarArr;
        rz5.b.a(e4VarArr);
    }

    public e4(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.utils.e4 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.utils.e4) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.utils.e4.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.utils.e4[] values() {
        return (com.tencent.mm.plugin.appbrand.utils.e4[]) f90424g.clone();
    }
}
