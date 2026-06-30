package com.tencent.mm.plugin.emoji.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class z4 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.ui.y4 f98575e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.ui.z4 f98576f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.ui.z4 f98577g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.ui.z4 f98578h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.emoji.ui.z4[] f98579i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f98580m;

    /* renamed from: d, reason: collision with root package name */
    public final int f98581d;

    static {
        com.tencent.mm.plugin.emoji.ui.z4 z4Var = new com.tencent.mm.plugin.emoji.ui.z4("IMAGE", 0, 0);
        f98576f = z4Var;
        com.tencent.mm.plugin.emoji.ui.z4 z4Var2 = new com.tencent.mm.plugin.emoji.ui.z4("GIF", 1, 1);
        f98577g = z4Var2;
        com.tencent.mm.plugin.emoji.ui.z4 z4Var3 = new com.tencent.mm.plugin.emoji.ui.z4("VIDEO", 2, 2);
        f98578h = z4Var3;
        com.tencent.mm.plugin.emoji.ui.z4[] z4VarArr = {z4Var, z4Var2, z4Var3};
        f98579i = z4VarArr;
        f98580m = rz5.b.a(z4VarArr);
        f98575e = new com.tencent.mm.plugin.emoji.ui.y4(null);
    }

    public z4(java.lang.String str, int i17, int i18) {
        this.f98581d = i18;
    }

    public static com.tencent.mm.plugin.emoji.ui.z4 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.emoji.ui.z4) java.lang.Enum.valueOf(com.tencent.mm.plugin.emoji.ui.z4.class, str);
    }

    public static com.tencent.mm.plugin.emoji.ui.z4[] values() {
        return (com.tencent.mm.plugin.emoji.ui.z4[]) f98579i.clone();
    }
}
