package com.tencent.mm.feature.avatar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.avatar.g f65157d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.feature.avatar.g f65158e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.feature.avatar.g f65159f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.feature.avatar.g[] f65160g;

    static {
        com.tencent.mm.feature.avatar.g gVar = new com.tencent.mm.feature.avatar.g("DISPATCH_HD_AVATAR", 0);
        f65157d = gVar;
        com.tencent.mm.feature.avatar.g gVar2 = new com.tencent.mm.feature.avatar.g("DISPATCH_NOT_HD_AVATAR", 1);
        f65158e = gVar2;
        com.tencent.mm.feature.avatar.g gVar3 = new com.tencent.mm.feature.avatar.g("DISPATCH_NOTHING", 2);
        f65159f = gVar3;
        com.tencent.mm.feature.avatar.g[] gVarArr = {gVar, gVar2, gVar3};
        f65160g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.feature.avatar.g valueOf(java.lang.String str) {
        return (com.tencent.mm.feature.avatar.g) java.lang.Enum.valueOf(com.tencent.mm.feature.avatar.g.class, str);
    }

    public static com.tencent.mm.feature.avatar.g[] values() {
        return (com.tencent.mm.feature.avatar.g[]) f65160g.clone();
    }
}
