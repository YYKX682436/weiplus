package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.c5 f102058a = new com.tencent.mm.plugin.finder.assist.c5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f102059b = new java.util.concurrent.ConcurrentHashMap();

    public final jz5.o a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null);
        str2 = "";
        if (f07.size() >= 3) {
            java.lang.String str5 = (java.lang.String) kz5.n0.a0(f07, 0);
            if (str5 == null) {
                str5 = "";
            }
            str4 = (java.lang.String) kz5.n0.a0(f07, 1);
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str6 = (java.lang.String) kz5.n0.a0(f07, 2);
            str3 = str6 != null ? str6 : "";
            str2 = str5;
        } else {
            str3 = "";
            str4 = str3;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3u);
            kotlin.jvm.internal.o.f(str2, "getString(...)");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            str4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3v);
            kotlin.jvm.internal.o.f(str4, "getString(...)");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) && (str3 = cu2.f0.f222391a.d("FinderObjectDynamicItemKey_FinderSelfSeeTipsFav")) == null) {
            str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3t);
            kotlin.jvm.internal.o.f(str3, "getString(...)");
        }
        return new jz5.o(str2, str4, str3);
    }

    public final jz5.o b(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, yz5.l cgiBack) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        long id6 = feed.getFeedObject().getId();
        long j17 = 1000;
        long a17 = c01.id.a() / j17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f102059b;
        com.tencent.mm.plugin.finder.assist.z4 z4Var = (com.tencent.mm.plugin.finder.assist.z4) concurrentHashMap.get(java.lang.Long.valueOf(id6));
        boolean z17 = true;
        if (z4Var != null && (c01.id.a() / j17) - z4Var.f102748a < z4Var.f102749b) {
            z17 = false;
        }
        if (z17) {
            java.lang.String objectNonceId = feed.getFeedObject().getObjectNonceId();
            java.lang.String userName = feed.getFeedObject().getUserName();
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            new db2.g4(id6, objectNonceId, 3, i17, userName, false, null, null, 0L, null, false, true, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, feed.w(), null, 402642912, null).l().q(new com.tencent.mm.plugin.finder.assist.a5(feed, id6, a17)).h(new com.tencent.mm.plugin.finder.assist.b5(feed, cgiBack));
        } else {
            com.tencent.mm.plugin.finder.assist.z4 z4Var2 = (com.tencent.mm.plugin.finder.assist.z4) concurrentHashMap.get(java.lang.Long.valueOf(id6));
            if (z4Var2 != null) {
                com.tencent.mars.xlog.Log.w("Finder.ObjectStatusRefresher", "can't request. lastReqTime=" + a17 + " lastReqTime=" + z4Var2.f102748a + " waitTime=" + z4Var2.f102749b);
            }
        }
        return a(r26.n0.u0(feed.getFeedObject().getNotShareMsg()).toString());
    }
}
