package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class ia {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f182716d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia f182713a = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f182714b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FavTypeOrderManager");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f182715c = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static int f182717e = -1;

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = f182714b.getString("fav_list_tag", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", "[getOrderTypeByLocalCache] content = " + string);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(string, "null cannot be cast to non-null type kotlin.String");
            java.util.Iterator it = r26.n0.f0(r26.i0.t(r26.i0.t(string, "[", "", false), "]", "", false), new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                arrayList.add(r26.n0.u0((java.lang.String) it.next()).toString());
            }
        }
        return arrayList;
    }

    public final boolean b() {
        return f182716d && f182715c.size() != 0;
    }
}
