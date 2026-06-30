package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.s f270965d = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.s();

    @Override // java.lang.Runnable
    public final void run() {
        for (java.util.Map.Entry entry : com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270736g.entrySet()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            java.lang.String bizUserName = (java.lang.String) entry.getKey();
            java.lang.String finderFeedExportId = (java.lang.String) entry.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUserName, "bizUserName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderFeedExportId, "finderFeedExportId");
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 86400000);
            if (!b0Var.n(bizUserName, finderFeedExportId)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270732c;
                int o17 = v3Var.o("date-" + currentTimeMillis + "-expose-live-bar-" + bizUserName, 0) + 1;
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).A("date-" + currentTimeMillis + "-expose-live-bar-" + bizUserName, o17);
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270732c.i()).D("live_bar_expose-exportId-" + ((java.lang.String) entry.getKey()), (java.lang.String) entry.getValue());
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270736g.clear();
    }
}
