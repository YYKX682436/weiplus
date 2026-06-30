package com.tencent.mm.feature.ecs.share;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.feature.ecs.share.u[] f66002d;

    static {
        com.tencent.mm.feature.ecs.share.u[] uVarArr = {new com.tencent.mm.feature.ecs.share.u(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0), new com.tencent.mm.feature.ecs.share.u("DIRECT", 1, 1)};
        f66002d = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.feature.ecs.share.u valueOf(java.lang.String str) {
        return (com.tencent.mm.feature.ecs.share.u) java.lang.Enum.valueOf(com.tencent.mm.feature.ecs.share.u.class, str);
    }

    public static com.tencent.mm.feature.ecs.share.u[] values() {
        return (com.tencent.mm.feature.ecs.share.u[]) f66002d.clone();
    }
}
