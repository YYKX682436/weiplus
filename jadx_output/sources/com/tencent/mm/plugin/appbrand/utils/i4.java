package com.tencent.mm.plugin.appbrand.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class i4 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.i4 f90478d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.i4 f90479e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.i4 f90480f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.i4[] f90481g;

    static {
        com.tencent.mm.plugin.appbrand.utils.i4 i4Var = new com.tencent.mm.plugin.appbrand.utils.i4("REQUEST_FAIL", 0);
        f90478d = i4Var;
        com.tencent.mm.plugin.appbrand.utils.i4 i4Var2 = new com.tencent.mm.plugin.appbrand.utils.i4("GRANTED", 1);
        f90479e = i4Var2;
        com.tencent.mm.plugin.appbrand.utils.i4 i4Var3 = new com.tencent.mm.plugin.appbrand.utils.i4("DENIED", 2);
        f90480f = i4Var3;
        com.tencent.mm.plugin.appbrand.utils.i4[] i4VarArr = {i4Var, i4Var2, i4Var3};
        f90481g = i4VarArr;
        rz5.b.a(i4VarArr);
    }

    public i4(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.utils.i4 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.utils.i4) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.utils.i4.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.utils.i4[] values() {
        return (com.tencent.mm.plugin.appbrand.utils.i4[]) f90481g.clone();
    }
}
