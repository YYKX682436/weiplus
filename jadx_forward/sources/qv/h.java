package qv;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f448393a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f448394b;

    /* renamed from: c, reason: collision with root package name */
    public static final i35.e f448395c;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f448394b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5710xe74f28d8>(a0Var) { // from class: com.tencent.mm.feature.biz.BizContactObserver$followBizListener$1
            {
                this.f39173x3fe91575 = 1301753576;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5710xe74f28d8 c5710xe74f28d8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5710xe74f28d8 event = c5710xe74f28d8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.util.Set set = qv.h.f448393a;
                am.uj ujVar = event.f136030g;
                java.lang.String str = ujVar.f89635a;
                boolean z17 = true;
                if (str == null ? false : ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).k2()) {
                    java.util.Set set2 = qv.h.f448393a;
                    if (set2 != null) {
                        java.lang.String username = ujVar.f89635a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                        ((java.util.HashSet) set2).add(username);
                    }
                    rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
                    java.lang.String str2 = ujVar.f89635a;
                    ((vw.m2) k3Var).getClass();
                    yw.h1 h1Var = yw.h1.f547865a;
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        if (g95.e.f351334a.c(str2) > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed create time has been fetched");
                        } else {
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(str2);
                            h1Var.e(linkedList);
                        }
                    }
                }
                return false;
            }
        };
        f448395c = qv.g.f448392d;
    }
}
