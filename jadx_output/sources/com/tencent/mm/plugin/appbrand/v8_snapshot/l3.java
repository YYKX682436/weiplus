package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l3 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.k3 f90770f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.l3 f90771g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.l3 f90772h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.l3 f90773i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.l3[] f90774m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f90775d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f90776e;

    static {
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.l3("APP", 0, "app", false, 2, null);
        f90771g = l3Var;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var2 = new com.tencent.mm.plugin.appbrand.v8_snapshot.l3("GAME", 1, "game", false, 2, null);
        f90772h = l3Var2;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var3 = new com.tencent.mm.plugin.appbrand.v8_snapshot.l3("NODE", 2, "node", true);
        f90773i = l3Var3;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3[] l3VarArr = {l3Var, l3Var2, l3Var3};
        f90774m = l3VarArr;
        rz5.b.a(l3VarArr);
        f90770f = new com.tencent.mm.plugin.appbrand.v8_snapshot.k3(null);
    }

    public l3(java.lang.String str, int i17, java.lang.String str2, boolean z17) {
        this.f90775d = str2;
        this.f90776e = z17;
    }

    public static com.tencent.mm.plugin.appbrand.v8_snapshot.l3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.v8_snapshot.l3) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.v8_snapshot.l3.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.v8_snapshot.l3[] values() {
        return (com.tencent.mm.plugin.appbrand.v8_snapshot.l3[]) f90774m.clone();
    }

    public /* synthetic */ l3(java.lang.String str, int i17, java.lang.String str2, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, str2, (i18 & 2) != 0 ? false : z17);
    }
}
