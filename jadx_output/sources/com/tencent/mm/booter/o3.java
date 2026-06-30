package com.tencent.mm.booter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public abstract class o3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.booter.o3 f63537e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.booter.o3 f63538f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.booter.o3 f63539g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.booter.o3[] f63540h;

    /* renamed from: d, reason: collision with root package name */
    public final int f63541d = java.lang.Math.min(4, java.lang.Runtime.getRuntime().availableProcessors());

    static {
        com.tencent.mm.booter.l3 l3Var = new com.tencent.mm.booter.l3("MAIN_PROCESS", 0);
        f63537e = l3Var;
        final java.lang.String str = "TOOL_PROCESS";
        final int i17 = 1;
        com.tencent.mm.booter.o3 o3Var = new com.tencent.mm.booter.o3(str, i17) { // from class: com.tencent.mm.booter.m3
            @Override // com.tencent.mm.booter.o3
            public ku5.c a(ku5.b bVar) {
                int i18 = this.f63541d;
                ku5.c cVar = bVar.f312551a;
                cVar.f312555b = i18 * 4;
                cVar.f312554a = i18 * 6;
                int h17 = h();
                ku5.c cVar2 = bVar.f312551a;
                cVar2.f312556c = h17;
                cVar2.f312557d = 259200000L;
                cVar2.f312559f = true;
                cVar2.f312558e = tu5.i.FS_POLICY;
                return cVar2;
            }

            public int h() {
                return (int) java.lang.Math.max(8.0f, this.f63541d * 1.5f);
            }
        };
        f63538f = o3Var;
        final java.lang.String str2 = "OTHER";
        final int i18 = 2;
        com.tencent.mm.booter.o3 o3Var2 = new com.tencent.mm.booter.o3(str2, i18) { // from class: com.tencent.mm.booter.n3
            @Override // com.tencent.mm.booter.o3
            public ku5.c a(ku5.b bVar) {
                int i19 = this.f63541d;
                ku5.c cVar = bVar.f312551a;
                cVar.f312555b = i19 * 4;
                cVar.f312554a = i19 * 6;
                int h17 = h();
                ku5.c cVar2 = bVar.f312551a;
                cVar2.f312556c = h17;
                cVar2.f312557d = 259200000L;
                cVar2.f312559f = true;
                cVar2.f312558e = tu5.i.FS_POLICY;
                return cVar2;
            }

            public int h() {
                return (int) java.lang.Math.max(8.0f, this.f63541d * 1.5f);
            }
        };
        f63539g = o3Var2;
        f63540h = new com.tencent.mm.booter.o3[]{l3Var, o3Var, o3Var2};
    }

    public o3(java.lang.String str, int i17, com.tencent.mm.booter.i3 i3Var) {
    }

    public static com.tencent.mm.booter.o3 valueOf(java.lang.String str) {
        return (com.tencent.mm.booter.o3) java.lang.Enum.valueOf(com.tencent.mm.booter.o3.class, str);
    }

    public static com.tencent.mm.booter.o3[] values() {
        return (com.tencent.mm.booter.o3[]) f63540h.clone();
    }

    public abstract ku5.c a(ku5.b bVar);
}
