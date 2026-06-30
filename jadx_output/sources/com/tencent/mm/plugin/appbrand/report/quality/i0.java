package com.tencent.mm.plugin.appbrand.report.quality;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class i0 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.quality.h0 f88205f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.i0[] f88206g;

    /* renamed from: d, reason: collision with root package name */
    public final int f88207d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.b0 f88208e;

    static {
        final com.tencent.mm.plugin.appbrand.report.quality.d0 d0Var = com.tencent.mm.plugin.appbrand.report.quality.d0.f88161a;
        com.tencent.mm.plugin.appbrand.report.quality.i0 i0Var = new com.tencent.mm.plugin.appbrand.report.quality.i0("AppServiceV8Lite", 0, 1, new com.tencent.mm.plugin.appbrand.report.quality.b0(d0Var) { // from class: com.tencent.mm.plugin.appbrand.report.quality.y

            /* renamed from: a, reason: collision with root package name */
            public final jz5.g f88382a;

            {
                kotlin.jvm.internal.o.g(d0Var, "enableResolver");
                this.f88382a = jz5.h.b(new com.tencent.mm.plugin.appbrand.report.quality.x(d0Var));
            }

            @Override // com.tencent.mm.plugin.appbrand.report.quality.b0
            public boolean isEnable() {
                return ((java.lang.Boolean) ((jz5.n) this.f88382a).getValue()).booleanValue();
            }
        });
        final com.tencent.mm.plugin.appbrand.report.quality.e0 e0Var = com.tencent.mm.plugin.appbrand.report.quality.e0.f88179a;
        com.tencent.mm.plugin.appbrand.report.quality.i0[] i0VarArr = {i0Var, new com.tencent.mm.plugin.appbrand.report.quality.i0("XWebV8Lite", 1, 2, new com.tencent.mm.plugin.appbrand.report.quality.b0(e0Var) { // from class: com.tencent.mm.plugin.appbrand.report.quality.y

            /* renamed from: a, reason: collision with root package name */
            public final jz5.g f88382a;

            {
                kotlin.jvm.internal.o.g(e0Var, "enableResolver");
                this.f88382a = jz5.h.b(new com.tencent.mm.plugin.appbrand.report.quality.x(e0Var));
            }

            @Override // com.tencent.mm.plugin.appbrand.report.quality.b0
            public boolean isEnable() {
                return ((java.lang.Boolean) ((jz5.n) this.f88382a).getValue()).booleanValue();
            }
        }), new com.tencent.mm.plugin.appbrand.report.quality.i0("VideoUseSysPlayer", 2, 4, com.tencent.mm.plugin.appbrand.report.quality.f0.f88182a), new com.tencent.mm.plugin.appbrand.report.quality.i0("AppServiceV8SnapshotMarkNotNeed", 3, 8, com.tencent.mm.plugin.appbrand.report.quality.g0.f88191a)};
        f88206g = i0VarArr;
        rz5.b.a(i0VarArr);
        f88205f = new com.tencent.mm.plugin.appbrand.report.quality.h0(null);
    }

    public i0(java.lang.String str, int i17, int i18, com.tencent.mm.plugin.appbrand.report.quality.b0 b0Var) {
        this.f88207d = i18;
        this.f88208e = b0Var;
    }

    public static com.tencent.mm.plugin.appbrand.report.quality.i0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.report.quality.i0) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.report.quality.i0.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.report.quality.i0[] values() {
        return (com.tencent.mm.plugin.appbrand.report.quality.i0[]) f88206g.clone();
    }
}
