package com.tencent.mm.plugin.finder.feed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qz {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.qz f108857d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.qz f108858e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.qz f108859f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.qz[] f108860g;

    static {
        com.tencent.mm.plugin.finder.feed.qz qzVar = new com.tencent.mm.plugin.finder.feed.qz("Valid", 0);
        f108857d = qzVar;
        com.tencent.mm.plugin.finder.feed.qz qzVar2 = new com.tencent.mm.plugin.finder.feed.qz("TeenMode", 1);
        f108858e = qzVar2;
        com.tencent.mm.plugin.finder.feed.qz qzVar3 = new com.tencent.mm.plugin.finder.feed.qz("ConfigForbidden", 2);
        f108859f = qzVar3;
        com.tencent.mm.plugin.finder.feed.qz[] qzVarArr = {qzVar, qzVar2, qzVar3};
        f108860g = qzVarArr;
        rz5.b.a(qzVarArr);
    }

    public qz(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.qz valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.qz) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.qz.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.qz[] values() {
        return (com.tencent.mm.plugin.finder.feed.qz[]) f108860g.clone();
    }

    public final boolean h() {
        return this == f108858e || this == f108859f;
    }

    public final so2.g5 i() {
        return this == f108858e ? so2.g5.f410364f : so2.g5.f410365g;
    }
}
