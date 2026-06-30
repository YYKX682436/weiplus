package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public enum b {
    RELEASE(0),
    DEVELOP(1),
    TRIAL(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f82194d;

    b(int i17) {
        this.f82194d = i17;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b a(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b bVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return bVar;
        }
        for (com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b bVar2 : values()) {
            if (bVar2.name().toLowerCase().equals(str)) {
                return bVar2;
            }
        }
        return bVar;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b b(int i17) {
        for (com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b bVar : values()) {
            if (bVar.f82194d == i17) {
                return bVar;
            }
        }
        return RELEASE;
    }
}
