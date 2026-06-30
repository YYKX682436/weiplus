package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class pf {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.of f82704e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.pf f82705f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pf[] f82706g;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.task.x0 f82707d;

    static {
        com.tencent.mm.plugin.appbrand.jsapi.pf pfVar = new com.tencent.mm.plugin.appbrand.jsapi.pf("APP", 0, com.tencent.mm.plugin.appbrand.task.x0.WASERVICE);
        f82705f = pfVar;
        com.tencent.mm.plugin.appbrand.jsapi.pf[] pfVarArr = {pfVar, new com.tencent.mm.plugin.appbrand.jsapi.pf("GAME", 1, com.tencent.mm.plugin.appbrand.task.x0.WAGAME)};
        f82706g = pfVarArr;
        rz5.b.a(pfVarArr);
        f82704e = new com.tencent.mm.plugin.appbrand.jsapi.of(null);
    }

    public pf(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.task.x0 x0Var) {
        this.f82707d = x0Var;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.pf valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsapi.pf) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.jsapi.pf.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.pf[] values() {
        return (com.tencent.mm.plugin.appbrand.jsapi.pf[]) f82706g.clone();
    }
}
