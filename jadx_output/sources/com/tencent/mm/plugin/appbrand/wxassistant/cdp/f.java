package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.cdp.f f92176e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.cdp.f f92177f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.cdp.f f92178g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.cdp.f[] f92179h;

    /* renamed from: d, reason: collision with root package name */
    public final int f92180d;

    static {
        com.tencent.mm.plugin.appbrand.wxassistant.cdp.f fVar = new com.tencent.mm.plugin.appbrand.wxassistant.cdp.f("Pending", 0, 0);
        f92176e = fVar;
        com.tencent.mm.plugin.appbrand.wxassistant.cdp.f fVar2 = new com.tencent.mm.plugin.appbrand.wxassistant.cdp.f("Running", 1, 1);
        f92177f = fVar2;
        com.tencent.mm.plugin.appbrand.wxassistant.cdp.f fVar3 = new com.tencent.mm.plugin.appbrand.wxassistant.cdp.f("Completed", 2, 2);
        f92178g = fVar3;
        com.tencent.mm.plugin.appbrand.wxassistant.cdp.f[] fVarArr = {fVar, fVar2, fVar3};
        f92179h = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f92180d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.wxassistant.cdp.f valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.wxassistant.cdp.f) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.wxassistant.cdp.f.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.wxassistant.cdp.f[] values() {
        return (com.tencent.mm.plugin.appbrand.wxassistant.cdp.f[]) f92179h.clone();
    }
}
