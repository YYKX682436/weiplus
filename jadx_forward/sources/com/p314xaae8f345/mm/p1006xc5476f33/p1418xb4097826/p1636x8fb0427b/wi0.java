package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class wi0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wi0 f209790d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wi0();

    public wi0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(1, "红点是否限频", null, null, 12, null);
        aVar.a("USERINFO_FINDER_TEST_RED_DOT_FACTOR_INT_SYNC", kz5.c0.i(1, 1000000000), kz5.c0.i("默认", "无限制"));
        aVar.f399278p = "常用";
        java.util.ArrayList arrayList = aVar.f399274i;
        if (arrayList == null || arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFakeConfig", "applyChosenDebugConfigFromAssist: please call bindDebugConfig first.");
        } else {
            com.p314xaae8f345.mm.p642xad8b531f.s b17 = com.p314xaae8f345.mm.p642xad8b531f.s.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFakeConfig", "Fail to get debugger, skip apply chosen item from assist key %s", ".com.tencent.mm.debug.finder.reddot.notimelimit");
            } else {
                java.lang.Integer c17 = b17.c(".com.tencent.mm.debug.finder.reddot.notimelimit");
                if (c17 == null || c17.intValue() < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderFakeConfig", "Assist does not specify value with key %s", ".com.tencent.mm.debug.finder.reddot.notimelimit");
                } else {
                    int intValue = c17.intValue();
                    java.util.ArrayList arrayList2 = aVar.f399274i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
                    if (intValue >= arrayList2.size()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFakeConfig", "Bad value %s from assist specified with key %s", c17, ".com.tencent.mm.debug.finder.reddot.notimelimit");
                    } else {
                        aVar.f399283e = c17.intValue();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFakeConfig", "Chosen item of debug config %s was override by assist with key %s", aVar.f399273h, ".com.tencent.mm.debug.finder.reddot.notimelimit");
                    }
                }
            }
        }
        return aVar;
    }
}
