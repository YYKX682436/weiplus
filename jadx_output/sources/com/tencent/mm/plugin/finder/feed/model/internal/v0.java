package com.tencent.mm.plugin.finder.feed.model.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.internal.v0 f108060d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.v0[] f108061e;

    static {
        com.tencent.mm.plugin.finder.feed.model.internal.v0 v0Var = new com.tencent.mm.plugin.finder.feed.model.internal.v0("GREEDY", 0);
        com.tencent.mm.plugin.finder.feed.model.internal.v0 v0Var2 = new com.tencent.mm.plugin.finder.feed.model.internal.v0("NORMAL", 1);
        f108060d = v0Var2;
        com.tencent.mm.plugin.finder.feed.model.internal.v0[] v0VarArr = {v0Var, v0Var2};
        f108061e = v0VarArr;
        rz5.b.a(v0VarArr);
    }

    public v0(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.feed.model.internal.v0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.feed.model.internal.v0) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.feed.model.internal.v0.class, str);
    }

    public static com.tencent.mm.plugin.finder.feed.model.internal.v0[] values() {
        return (com.tencent.mm.plugin.finder.feed.model.internal.v0[]) f108061e.clone();
    }
}
