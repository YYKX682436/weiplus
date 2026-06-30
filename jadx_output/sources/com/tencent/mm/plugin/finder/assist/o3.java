package com.tencent.mm.plugin.finder.assist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.o3 f102423e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.o3 f102424f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.assist.o3[] f102425g;

    /* renamed from: d, reason: collision with root package name */
    public final int f102426d;

    static {
        com.tencent.mm.plugin.finder.assist.o3 o3Var = new com.tencent.mm.plugin.finder.assist.o3("Unknown", 0, 0);
        com.tencent.mm.plugin.finder.assist.o3 o3Var2 = new com.tencent.mm.plugin.finder.assist.o3("ThanksButton", 1, 1);
        f102423e = o3Var2;
        com.tencent.mm.plugin.finder.assist.o3 o3Var3 = new com.tencent.mm.plugin.finder.assist.o3("Other", 2, 2);
        f102424f = o3Var3;
        com.tencent.mm.plugin.finder.assist.o3[] o3VarArr = {o3Var, o3Var2, o3Var3};
        f102425g = o3VarArr;
        rz5.b.a(o3VarArr);
    }

    public o3(java.lang.String str, int i17, int i18) {
        this.f102426d = i18;
    }

    public static com.tencent.mm.plugin.finder.assist.o3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.assist.o3) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.assist.o3.class, str);
    }

    public static com.tencent.mm.plugin.finder.assist.o3[] values() {
        return (com.tencent.mm.plugin.finder.assist.o3[]) f102425g.clone();
    }
}
