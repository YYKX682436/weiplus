package com.tencent.mm.plugin.appbrand.appusage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class j6 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.i6 f76489e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.j6[] f76490f;

    /* renamed from: d, reason: collision with root package name */
    public final int f76491d;

    static {
        com.tencent.mm.plugin.appbrand.appusage.j6[] j6VarArr = {new com.tencent.mm.plugin.appbrand.appusage.j6("MODIFY_HISTORY_LIST", 0, 1), new com.tencent.mm.plugin.appbrand.appusage.j6("MODIFY_STAR_LIST", 1, 2), new com.tencent.mm.plugin.appbrand.appusage.j6("DELETE_HISTORY_LIST", 2, 3), new com.tencent.mm.plugin.appbrand.appusage.j6("DELETE_STAR_LIST", 3, 4)};
        f76490f = j6VarArr;
        rz5.b.a(j6VarArr);
        f76489e = new com.tencent.mm.plugin.appbrand.appusage.i6(null);
    }

    public j6(java.lang.String str, int i17, int i18) {
        this.f76491d = i18;
    }

    public static com.tencent.mm.plugin.appbrand.appusage.j6 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.appusage.j6) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.appusage.j6.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.appusage.j6[] values() {
        return (com.tencent.mm.plugin.appbrand.appusage.j6[]) f76490f.clone();
    }
}
