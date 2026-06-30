package lr1;

/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static long f402179d;

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.c0 f402176a = new lr1.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f402177b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final r01.a3 f402178c = new r01.a3(300000);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Queue f402180e = new java.util.LinkedList();

    public final void a(java.util.LinkedList items, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(items)) {
            return;
        }
        r45.fj fjVar = new r45.fj();
        int min = java.lang.Math.min(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.MPDataLogic").o("BizAppMsgRelatedInfoRefreshIntervalSec", 300), 86400);
        int i18 = min > 0 ? min : 300;
        r01.a3 a3Var = f402178c;
        a3Var.f449554a = i18 * 1000;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = items.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = f402177b;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            if (!concurrentHashMap.contains(((r45.u9) next).f468679d)) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            java.lang.String str = ((r45.u9) next2).f468679d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (true ^ a3Var.b(str)) {
                arrayList2.add(next2);
            }
        }
        java.util.List K0 = kz5.n0.K0(arrayList2, java.lang.Math.max(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.MPDataLogic").o("BizAppMsgRelatedInfoMaxUrlCount", 10), 2));
        java.util.LinkedList<r45.u9> linkedList = fjVar.f455924d;
        linkedList.addAll(K0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo size=" + linkedList.size());
        fjVar.f455925e = i17;
        for (r45.u9 u9Var : linkedList) {
            concurrentHashMap.put(u9Var.f468679d, 1);
            java.lang.String ClientId = u9Var.f468679d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ClientId, "ClientId");
            a3Var.a(ClientId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = fjVar;
        lVar.f152198b = new r45.gj();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/timeline/bizappmsgrelatedinfo";
        lVar.f152200d = 2864;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new lr1.b0(fjVar, i17));
    }

    public final java.lang.String b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return "_mpdata_" + com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.n(url);
    }

    public final boolean c(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String[] strArr = {"__biz", "mid", "idx"};
        for (int i17 = 0; i17 < 3; i17++) {
            if (hy4.i.f(url, strArr[i17]) == null) {
                return true;
            }
        }
        return false;
    }
}
