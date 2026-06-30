package com.p314xaae8f345.mm.p642xad8b531f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public abstract class o3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.o3 f145070e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.o3 f145071f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.o3 f145072g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.o3[] f145073h;

    /* renamed from: d, reason: collision with root package name */
    public final int f145074d = java.lang.Math.min(4, java.lang.Runtime.getRuntime().availableProcessors());

    static {
        com.p314xaae8f345.mm.p642xad8b531f.l3 l3Var = new com.p314xaae8f345.mm.p642xad8b531f.l3("MAIN_PROCESS", 0);
        f145070e = l3Var;
        final java.lang.String str = "TOOL_PROCESS";
        final int i17 = 1;
        com.p314xaae8f345.mm.p642xad8b531f.o3 o3Var = new com.p314xaae8f345.mm.p642xad8b531f.o3(str, i17) { // from class: com.tencent.mm.booter.m3
            @Override // com.p314xaae8f345.mm.p642xad8b531f.o3
            public ku5.c a(ku5.b bVar) {
                int i18 = this.f145074d;
                ku5.c cVar = bVar.f394084a;
                cVar.f394088b = i18 * 4;
                cVar.f394087a = i18 * 6;
                int h17 = h();
                ku5.c cVar2 = bVar.f394084a;
                cVar2.f394089c = h17;
                cVar2.f394090d = 259200000L;
                cVar2.f394092f = true;
                cVar2.f394091e = tu5.i.FS_POLICY;
                return cVar2;
            }

            public int h() {
                return (int) java.lang.Math.max(8.0f, this.f145074d * 1.5f);
            }
        };
        f145071f = o3Var;
        final java.lang.String str2 = "OTHER";
        final int i18 = 2;
        com.p314xaae8f345.mm.p642xad8b531f.o3 o3Var2 = new com.p314xaae8f345.mm.p642xad8b531f.o3(str2, i18) { // from class: com.tencent.mm.booter.n3
            @Override // com.p314xaae8f345.mm.p642xad8b531f.o3
            public ku5.c a(ku5.b bVar) {
                int i19 = this.f145074d;
                ku5.c cVar = bVar.f394084a;
                cVar.f394088b = i19 * 4;
                cVar.f394087a = i19 * 6;
                int h17 = h();
                ku5.c cVar2 = bVar.f394084a;
                cVar2.f394089c = h17;
                cVar2.f394090d = 259200000L;
                cVar2.f394092f = true;
                cVar2.f394091e = tu5.i.FS_POLICY;
                return cVar2;
            }

            public int h() {
                return (int) java.lang.Math.max(8.0f, this.f145074d * 1.5f);
            }
        };
        f145072g = o3Var2;
        f145073h = new com.p314xaae8f345.mm.p642xad8b531f.o3[]{l3Var, o3Var, o3Var2};
    }

    public o3(java.lang.String str, int i17, com.p314xaae8f345.mm.p642xad8b531f.i3 i3Var) {
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p642xad8b531f.o3 m43425xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.p642xad8b531f.o3) java.lang.Enum.valueOf(com.p314xaae8f345.mm.p642xad8b531f.o3.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.p642xad8b531f.o3[] m43426xcee59d22() {
        return (com.p314xaae8f345.mm.p642xad8b531f.o3[]) f145073h.clone();
    }

    public abstract ku5.c a(ku5.b bVar);
}
