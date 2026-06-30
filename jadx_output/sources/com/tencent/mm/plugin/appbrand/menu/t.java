package com.tencent.mm.plugin.appbrand.menu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.t[] f85989d;

    static {
        com.tencent.mm.plugin.appbrand.menu.t[] tVarArr = {new com.tencent.mm.plugin.appbrand.menu.t("GameLiveStateChangeEndReason_Unkown", 0), new com.tencent.mm.plugin.appbrand.menu.t("GameLiveStateChangeEndReason_WeAppMenu", 1), new com.tencent.mm.plugin.appbrand.menu.t("GameLiveStateChangeEndReason_WeAppExit", 2), new com.tencent.mm.plugin.appbrand.menu.t("GameLiveStateChangeEndReason_JsApi", 3), new com.tencent.mm.plugin.appbrand.menu.t("GameLiveStateChangeEndReason_Finder", 4)};
        f85989d = tVarArr;
        rz5.b.a(tVarArr);
    }

    public t(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.menu.t valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.menu.t) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.menu.t.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.menu.t[] values() {
        return (com.tencent.mm.plugin.appbrand.menu.t[]) f85989d.clone();
    }
}
