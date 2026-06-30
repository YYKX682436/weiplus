package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c5 f183591a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f183592b = new java.util.concurrent.ConcurrentHashMap();

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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3u);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3v);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getString(...)");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && (str3 = cu2.f0.f303924a.d("FinderObjectDynamicItemKey_FinderSelfSeeTipsFav")) == null) {
            str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3t);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getString(...)");
        }
        return new jz5.o(str2, str4, str3);
    }

    public final jz5.o b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, int i17, yz5.l cgiBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        long m59251x5db1b11 = feed.getFeedObject().m59251x5db1b11();
        long j17 = 1000;
        long a17 = c01.id.a() / j17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f183592b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z4 z4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z4) concurrentHashMap.get(java.lang.Long.valueOf(m59251x5db1b11));
        boolean z17 = true;
        if (z4Var != null && (c01.id.a() / j17) - z4Var.f184281a < z4Var.f184282b) {
            z17 = false;
        }
        if (z17) {
            java.lang.String m59276x6c285d75 = feed.getFeedObject().m59276x6c285d75();
            java.lang.String m59299x6bf53a6c = feed.getFeedObject().m59299x6bf53a6c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            new db2.g4(m59251x5db1b11, m59276x6c285d75, 3, i17, m59299x6bf53a6c, false, null, null, 0L, null, false, true, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, feed.w(), null, 402642912, null).l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a5(feed, m59251x5db1b11, a17)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b5(feed, cgiBack));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z4 z4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z4) concurrentHashMap.get(java.lang.Long.valueOf(m59251x5db1b11));
            if (z4Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ObjectStatusRefresher", "can't request. lastReqTime=" + a17 + " lastReqTime=" + z4Var2.f184281a + " waitTime=" + z4Var2.f184282b);
            }
        }
        return a(r26.n0.u0(feed.getFeedObject().m59275xc67ab1df()).toString());
    }
}
