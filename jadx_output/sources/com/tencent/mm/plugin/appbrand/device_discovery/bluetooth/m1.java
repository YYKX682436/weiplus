package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class m1 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 f77919e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 f77920f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 f77921g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 f77922h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 f77923i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 f77924m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 f77925n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1[] f77926o;

    /* renamed from: d, reason: collision with root package name */
    public final int f77927d;

    static {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 m1Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1("SET_MONITORED_BLUETOOTH_DEVICE", 0, 1);
        f77919e = m1Var;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 m1Var2 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1("DELETE_MONITORED_BLUETOOTH_DEVICE", 1, 2);
        f77920f = m1Var2;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 m1Var3 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1("MONITORED_BLUETOOTH_DEVICE_FOUND", 2, 3);
        f77921g = m1Var3;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 m1Var4 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1("START_WE_APP", 3, 4);
        f77922h = m1Var4;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 m1Var5 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1("START_WE_APP_SUCCESS", 4, 5);
        f77923i = m1Var5;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 m1Var6 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1("START_WE_APP_FAILURE", 5, 6);
        f77924m = m1Var6;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 m1Var7 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1("DISPATCH_ON_MONITORED_BLUETOOTH_DEVICE_FOUND", 6, 7);
        f77925n = m1Var7;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1[] m1VarArr = {m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6, m1Var7};
        f77926o = m1VarArr;
        rz5.b.a(m1VarArr);
    }

    public m1(java.lang.String str, int i17, int i18) {
        this.f77927d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1[] values() {
        return (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1[]) f77926o.clone();
    }
}
