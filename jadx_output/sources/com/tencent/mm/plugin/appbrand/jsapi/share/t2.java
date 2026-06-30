package com.tencent.mm.plugin.appbrand.jsapi.share;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class t2 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.share.s2 f83248e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.share.t2 f83249f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.share.t2 f83250g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.share.t2 f83251h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.t2[] f83252i;

    /* renamed from: d, reason: collision with root package name */
    public final int f83253d;

    static {
        com.tencent.mm.plugin.appbrand.jsapi.share.t2 t2Var = new com.tencent.mm.plugin.appbrand.jsapi.share.t2("SUCCESS", 0, 0);
        f83249f = t2Var;
        com.tencent.mm.plugin.appbrand.jsapi.share.t2 t2Var2 = new com.tencent.mm.plugin.appbrand.jsapi.share.t2("CANCEL", 1, 1);
        f83250g = t2Var2;
        com.tencent.mm.plugin.appbrand.jsapi.share.t2 t2Var3 = new com.tencent.mm.plugin.appbrand.jsapi.share.t2("FAIL", 2, 2);
        f83251h = t2Var3;
        com.tencent.mm.plugin.appbrand.jsapi.share.t2[] t2VarArr = {t2Var, t2Var2, t2Var3};
        f83252i = t2VarArr;
        rz5.b.a(t2VarArr);
        f83248e = new com.tencent.mm.plugin.appbrand.jsapi.share.s2(null);
    }

    public t2(java.lang.String str, int i17, int i18) {
        this.f83253d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.share.t2 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsapi.share.t2) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.jsapi.share.t2.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.share.t2[] values() {
        return (com.tencent.mm.plugin.appbrand.jsapi.share.t2[]) f83252i.clone();
    }
}
