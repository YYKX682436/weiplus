package com.tencent.mm.plugin.finder.assist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class d3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.d3 f102076e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.d3 f102077f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.assist.d3[] f102078g;

    /* renamed from: d, reason: collision with root package name */
    public final int f102079d;

    static {
        com.tencent.mm.plugin.finder.assist.d3 d3Var = new com.tencent.mm.plugin.finder.assist.d3("None", 0, 0);
        com.tencent.mm.plugin.finder.assist.d3 d3Var2 = new com.tencent.mm.plugin.finder.assist.d3("Above", 1, 1);
        f102076e = d3Var2;
        com.tencent.mm.plugin.finder.assist.d3 d3Var3 = new com.tencent.mm.plugin.finder.assist.d3("Below", 2, 2);
        f102077f = d3Var3;
        com.tencent.mm.plugin.finder.assist.d3[] d3VarArr = {d3Var, d3Var2, d3Var3};
        f102078g = d3VarArr;
        rz5.b.a(d3VarArr);
    }

    public d3(java.lang.String str, int i17, int i18) {
        this.f102079d = i18;
    }

    public static com.tencent.mm.plugin.finder.assist.d3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.assist.d3) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.assist.d3.class, str);
    }

    public static com.tencent.mm.plugin.finder.assist.d3[] values() {
        return (com.tencent.mm.plugin.finder.assist.d3[]) f102078g.clone();
    }

    public final int h() {
        return this.f102079d;
    }
}
