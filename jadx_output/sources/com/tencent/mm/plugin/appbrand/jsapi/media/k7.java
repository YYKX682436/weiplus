package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class k7 implements com.tencent.mm.plugin.appbrand.jsapi.media.l7 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.j7 f81904e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.k7 f81905f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.k7[] f81906g;

    /* renamed from: d, reason: collision with root package name */
    public final int f81907d;

    static {
        com.tencent.mm.plugin.appbrand.jsapi.media.k7 k7Var = new com.tencent.mm.plugin.appbrand.jsapi.media.k7("FRONT", 0, 1);
        f81905f = k7Var;
        com.tencent.mm.plugin.appbrand.jsapi.media.k7[] k7VarArr = {k7Var, new com.tencent.mm.plugin.appbrand.jsapi.media.k7("BACK", 1, 2)};
        f81906g = k7VarArr;
        rz5.b.a(k7VarArr);
        f81904e = new com.tencent.mm.plugin.appbrand.jsapi.media.j7(null);
    }

    public k7(java.lang.String str, int i17, int i18) {
        this.f81907d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.media.k7 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsapi.media.k7) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.jsapi.media.k7.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.media.k7[] values() {
        return (com.tencent.mm.plugin.appbrand.jsapi.media.k7[]) f81906g.clone();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.l7
    public /* bridge */ /* synthetic */ java.lang.String getName() {
        return name();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.l7
    public int h() {
        return this.f81907d;
    }
}
