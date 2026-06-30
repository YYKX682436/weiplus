package com.tencent.mm.plugin.appbrand.wxassistant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.a3 f92136e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.b3 f92137f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.b3 f92138g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.b3[] f92139h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f92140i;

    /* renamed from: d, reason: collision with root package name */
    public final int f92141d;

    static {
        com.tencent.mm.plugin.appbrand.wxassistant.b3 b3Var = new com.tencent.mm.plugin.appbrand.wxassistant.b3("None", 0, 0);
        f92137f = b3Var;
        com.tencent.mm.plugin.appbrand.wxassistant.b3 b3Var2 = new com.tencent.mm.plugin.appbrand.wxassistant.b3("Running", 1, 1);
        com.tencent.mm.plugin.appbrand.wxassistant.b3 b3Var3 = new com.tencent.mm.plugin.appbrand.wxassistant.b3("InterruptByUser", 2, 2);
        f92138g = b3Var3;
        com.tencent.mm.plugin.appbrand.wxassistant.b3[] b3VarArr = {b3Var, b3Var2, b3Var3, new com.tencent.mm.plugin.appbrand.wxassistant.b3("CloseByCDP", 3, 3), new com.tencent.mm.plugin.appbrand.wxassistant.b3("Pause", 4, 4), new com.tencent.mm.plugin.appbrand.wxassistant.b3("EndJumpOtherPage", 5, 5)};
        f92139h = b3VarArr;
        f92140i = rz5.b.a(b3VarArr);
        f92136e = new com.tencent.mm.plugin.appbrand.wxassistant.a3(null);
    }

    public b3(java.lang.String str, int i17, int i18) {
        this.f92141d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.wxassistant.b3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.wxassistant.b3) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.wxassistant.b3.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.wxassistant.b3[] values() {
        return (com.tencent.mm.plugin.appbrand.wxassistant.b3[]) f92139h.clone();
    }
}
