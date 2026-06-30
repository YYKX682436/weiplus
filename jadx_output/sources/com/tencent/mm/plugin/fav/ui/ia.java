package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class ia {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f101183d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.fav.ui.ia f101180a = new com.tencent.mm.plugin.fav.ui.ia();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f101181b = com.tencent.mm.sdk.platformtools.o4.M("FavTypeOrderManager");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f101182c = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static int f101184e = -1;

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = f101181b.getString("fav_list_tag", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTypeOrderManager", "[getOrderTypeByLocalCache] content = " + string);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            kotlin.jvm.internal.o.e(string, "null cannot be cast to non-null type kotlin.String");
            java.util.Iterator it = r26.n0.f0(r26.i0.t(r26.i0.t(string, "[", "", false), "]", "", false), new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                arrayList.add(r26.n0.u0((java.lang.String) it.next()).toString());
            }
        }
        return arrayList;
    }

    public final boolean b() {
        return f101183d && f101182c.size() != 0;
    }
}
