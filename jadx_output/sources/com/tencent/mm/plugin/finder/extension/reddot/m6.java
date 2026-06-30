package com.tencent.mm.plugin.finder.extension.reddot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.m6 f105707d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.m6[] f105708e;

    static {
        com.tencent.mm.plugin.finder.extension.reddot.m6 m6Var = new com.tencent.mm.plugin.finder.extension.reddot.m6("SAME_DAY", 0);
        f105707d = m6Var;
        com.tencent.mm.plugin.finder.extension.reddot.m6[] m6VarArr = {m6Var, new com.tencent.mm.plugin.finder.extension.reddot.m6("SAME_HOUR", 1), new com.tencent.mm.plugin.finder.extension.reddot.m6("SAME_MINUTE", 2)};
        f105708e = m6VarArr;
        rz5.b.a(m6VarArr);
    }

    public m6(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.extension.reddot.m6 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.extension.reddot.m6) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.extension.reddot.m6.class, str);
    }

    public static com.tencent.mm.plugin.finder.extension.reddot.m6[] values() {
        return (com.tencent.mm.plugin.finder.extension.reddot.m6[]) f105708e.clone();
    }
}
