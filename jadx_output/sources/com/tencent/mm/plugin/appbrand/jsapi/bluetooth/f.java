package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f f80063d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f f80064e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f f80065f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f[] f80066g;

    static {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f("REJECTED", 0);
        f80063d = fVar;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f fVar2 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f("ACCEPTED_IN_FOREGROUND", 1);
        f80064e = fVar2;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f fVar3 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f("ALWAYS_ACCEPTED", 2);
        f80065f = fVar3;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f[] fVarArr = {fVar, fVar2, fVar3};
        f80066g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f[] values() {
        return (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f[]) f80066g.clone();
    }
}
