package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes12.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f181311a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f181312b = new java.util.ArrayList();

    public static void a(java.lang.String str, java.lang.String str2) {
        ((java.util.ArrayList) f181312b).add(new android.util.Pair(str, str2));
    }

    public static void b(int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("expansions_error_reason", i18);
        if (gm0.j1.i().f354741a.f354832d) {
            jx3.f.INSTANCE.mo68477x336bdfd8(i17, i18, 1L, false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(i17, i18, 1);
        java.util.ArrayList arrayList = f181311a;
        synchronized (arrayList) {
            arrayList.add(c4582x424c344);
        }
    }
}
