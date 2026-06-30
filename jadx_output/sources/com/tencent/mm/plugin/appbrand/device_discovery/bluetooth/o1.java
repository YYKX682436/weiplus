package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class o1 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n1 f77939e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 f77940f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 f77941g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 f77942h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 f77943i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1[] f77944m;

    /* renamed from: d, reason: collision with root package name */
    public final int f77945d;

    static {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 o1Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_FOREGROUND_PATTERN, 0, 0);
        f77940f = o1Var;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 o1Var2 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1("BACKGROUND", 1, 1);
        f77941g = o1Var2;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 o1Var3 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1("SUSPEND", 2, 2);
        f77942h = o1Var3;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 o1Var4 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1("NOT_ALIVE", 3, 3);
        f77943i = o1Var4;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1[] o1VarArr = {o1Var, o1Var2, o1Var3, o1Var4};
        f77944m = o1VarArr;
        rz5.b.a(o1VarArr);
        f77939e = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n1(null);
    }

    public o1(java.lang.String str, int i17, int i18) {
        this.f77945d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1[] values() {
        return (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1[]) f77944m.clone();
    }
}
