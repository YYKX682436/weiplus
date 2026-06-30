package com.tencent.mm.minigame;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.minigame.k0 f69087e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.minigame.k0 f69088f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.minigame.k0[] f69089g;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69090d;

    static {
        com.tencent.mm.minigame.k0 k0Var = new com.tencent.mm.minigame.k0("FORCE_SHOW", 0, true);
        f69087e = k0Var;
        com.tencent.mm.minigame.p0 p0Var = com.tencent.mm.minigame.p0.f69132a;
        com.tencent.mm.minigame.k0 k0Var2 = new com.tencent.mm.minigame.k0("SHOW_IN_DEBUG", 1, false);
        com.tencent.mm.minigame.k0 k0Var3 = new com.tencent.mm.minigame.k0("NOT_SHOW", 2, false);
        f69088f = k0Var3;
        com.tencent.mm.minigame.k0[] k0VarArr = {k0Var, k0Var2, k0Var3};
        f69089g = k0VarArr;
        rz5.b.a(k0VarArr);
    }

    public k0(java.lang.String str, int i17, boolean z17) {
        this.f69090d = z17;
    }

    public static com.tencent.mm.minigame.k0 valueOf(java.lang.String str) {
        return (com.tencent.mm.minigame.k0) java.lang.Enum.valueOf(com.tencent.mm.minigame.k0.class, str);
    }

    public static com.tencent.mm.minigame.k0[] values() {
        return (com.tencent.mm.minigame.k0[]) f69089g.clone();
    }
}
