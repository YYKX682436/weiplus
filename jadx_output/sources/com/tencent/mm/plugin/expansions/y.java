package com.tencent.mm.plugin.expansions;

/* loaded from: classes12.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f99778a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f99779b = new java.util.ArrayList();

    public static void a(java.lang.String str, java.lang.String str2) {
        ((java.util.ArrayList) f99779b).add(new android.util.Pair(str, str2));
    }

    public static void b(int i17, int i18) {
        com.tencent.mm.sdk.platformtools.o4.L().putInt("expansions_error_reason", i18);
        if (gm0.j1.i().f273208a.f273299d) {
            jx3.f.INSTANCE.idkeyStat(i17, i18, 1L, false);
            return;
        }
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey(i17, i18, 1);
        java.util.ArrayList arrayList = f99778a;
        synchronized (arrayList) {
            arrayList.add(iDKey);
        }
    }
}
