package com.tencent.mm.feature.chatrecordstts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b2 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.chatrecordstts.b2 f65364d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.feature.chatrecordstts.b2 f65365e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.feature.chatrecordstts.b2 f65366f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b2[] f65367g;

    static {
        com.tencent.mm.feature.chatrecordstts.b2 b2Var = new com.tencent.mm.feature.chatrecordstts.b2("IDLE", 0);
        f65364d = b2Var;
        com.tencent.mm.feature.chatrecordstts.b2 b2Var2 = new com.tencent.mm.feature.chatrecordstts.b2("RUNNING", 1);
        f65365e = b2Var2;
        com.tencent.mm.feature.chatrecordstts.b2 b2Var3 = new com.tencent.mm.feature.chatrecordstts.b2("PAUSED", 2);
        f65366f = b2Var3;
        com.tencent.mm.feature.chatrecordstts.b2[] b2VarArr = {b2Var, b2Var2, b2Var3};
        f65367g = b2VarArr;
        rz5.b.a(b2VarArr);
    }

    public b2(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.feature.chatrecordstts.b2 valueOf(java.lang.String str) {
        return (com.tencent.mm.feature.chatrecordstts.b2) java.lang.Enum.valueOf(com.tencent.mm.feature.chatrecordstts.b2.class, str);
    }

    public static com.tencent.mm.feature.chatrecordstts.b2[] values() {
        return (com.tencent.mm.feature.chatrecordstts.b2[]) f65367g.clone();
    }
}
