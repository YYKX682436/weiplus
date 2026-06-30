package com.tencent.mm.plugin.finder.convert;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c3 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.b3 f103016g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.c3 f103017h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.convert.c3[] f103018i;

    /* renamed from: d, reason: collision with root package name */
    public final float f103019d;

    /* renamed from: e, reason: collision with root package name */
    public final int f103020e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103021f;

    static {
        com.tencent.mm.plugin.finder.convert.c3 c3Var = new com.tencent.mm.plugin.finder.convert.c3("RATIO_4_3", 0, 1.3333334f, com.tencent.mm.R.dimen.f479664c2, com.tencent.mm.R.dimen.f479657bu);
        com.tencent.mm.plugin.finder.convert.c3 c3Var2 = new com.tencent.mm.plugin.finder.convert.c3("RATIO_3_4", 1, 0.75f, com.tencent.mm.R.dimen.f479657bu, com.tencent.mm.R.dimen.f479664c2);
        com.tencent.mm.plugin.finder.convert.c3 c3Var3 = new com.tencent.mm.plugin.finder.convert.c3("RATIO_1_1", 2, 1.0f, com.tencent.mm.R.dimen.f479657bu, com.tencent.mm.R.dimen.f479657bu);
        com.tencent.mm.plugin.finder.convert.c3 c3Var4 = new com.tencent.mm.plugin.finder.convert.c3("RATIO_16_9", 3, 1.7777778f, com.tencent.mm.R.dimen.f479664c2, com.tencent.mm.R.dimen.f479734dr);
        f103017h = c3Var4;
        com.tencent.mm.plugin.finder.convert.c3[] c3VarArr = {c3Var, c3Var2, c3Var3, c3Var4, new com.tencent.mm.plugin.finder.convert.c3("RATIO_9_16", 4, 0.5625f, com.tencent.mm.R.dimen.f479734dr, com.tencent.mm.R.dimen.f479664c2)};
        f103018i = c3VarArr;
        rz5.b.a(c3VarArr);
        f103016g = new com.tencent.mm.plugin.finder.convert.b3(null);
    }

    public c3(java.lang.String str, int i17, float f17, int i18, int i19) {
        this.f103019d = f17;
        this.f103020e = i18;
        this.f103021f = i19;
    }

    public static com.tencent.mm.plugin.finder.convert.c3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.convert.c3) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.convert.c3.class, str);
    }

    public static com.tencent.mm.plugin.finder.convert.c3[] values() {
        return (com.tencent.mm.plugin.finder.convert.c3[]) f103018i.clone();
    }

    public final float h() {
        return this.f103019d;
    }
}
