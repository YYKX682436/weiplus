package com.tencent.mm.plugin.appbrand.jsapi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class o7 implements com.tencent.mm.plugin.appbrand.jsapi.media.l7 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.n7 f81966e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.o7 f81967f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.o7 f81968g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.o7[] f81969h;

    /* renamed from: d, reason: collision with root package name */
    public final int f81970d;

    static {
        com.tencent.mm.plugin.appbrand.jsapi.media.o7 o7Var = new com.tencent.mm.plugin.appbrand.jsapi.media.o7("ALBUM", 0, 1);
        f81967f = o7Var;
        com.tencent.mm.plugin.appbrand.jsapi.media.o7 o7Var2 = new com.tencent.mm.plugin.appbrand.jsapi.media.o7("CAMERA", 1, 2);
        f81968g = o7Var2;
        com.tencent.mm.plugin.appbrand.jsapi.media.o7[] o7VarArr = {o7Var, o7Var2};
        f81969h = o7VarArr;
        rz5.b.a(o7VarArr);
        f81966e = new com.tencent.mm.plugin.appbrand.jsapi.media.n7(null);
    }

    public o7(java.lang.String str, int i17, int i18) {
        this.f81970d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.media.o7 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsapi.media.o7) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.jsapi.media.o7.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.media.o7[] values() {
        return (com.tencent.mm.plugin.appbrand.jsapi.media.o7[]) f81969h.clone();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.l7
    public /* bridge */ /* synthetic */ java.lang.String getName() {
        return name();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.l7
    public int h() {
        return this.f81970d;
    }
}
