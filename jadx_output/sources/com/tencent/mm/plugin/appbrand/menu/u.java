package com.tencent.mm.plugin.appbrand.menu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.u[] f85992d;

    static {
        com.tencent.mm.plugin.appbrand.menu.u[] uVarArr = {new com.tencent.mm.plugin.appbrand.menu.u("GameLiveStateChangeEvent_End", 0), new com.tencent.mm.plugin.appbrand.menu.u("GameLiveStateChangeEvent_Start", 1), new com.tencent.mm.plugin.appbrand.menu.u("GameLiveStateChangeEvent_PreStart", 2), new com.tencent.mm.plugin.appbrand.menu.u("GameLiveStateChangeEvent_Cancel", 3), new com.tencent.mm.plugin.appbrand.menu.u("GameLiveStateChangeEvent_MenuClick", 4)};
        f85992d = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.menu.u valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.menu.u) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.menu.u.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.menu.u[] values() {
        return (com.tencent.mm.plugin.appbrand.menu.u[]) f85992d.clone();
    }
}
