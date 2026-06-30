package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class i4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 f206609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 k4Var) {
        super(0);
        this.f206609d = k4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.h hVar;
        r45.i16 V6;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.cl2 cl2Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 k4Var = this.f206609d;
        java.util.Iterator it = k4Var.B.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hVar = k4Var.f206638w;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            r45.vd6 d17 = k4Var.d1((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4) entry.getValue(), false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 n4Var = k4Var.f206640y;
            if (!(n4Var != null && ((java.lang.Number) entry.getKey()).longValue() == n4Var.f206686a)) {
                linkedList.add(d17);
            }
            hVar.d(18054, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4) entry.getValue());
        }
        k4Var.B = new java.util.HashMap();
        k4Var.e1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 n4Var2 = k4Var.f206640y;
        if (n4Var2 != null) {
            k4Var.a1(n4Var2, n4Var2.f206716p, true, c01.id.c());
            n4Var2.K(k4Var.f206821o);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u0 u0Var = k4Var.f206639x;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = u0Var.f206914f;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            u0Var.f206914f = null;
            u0Var.f206913e = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = n4Var2.f206692d;
            if ((c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (cl2Var = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null || !cl2Var.m75933x41a8a7f2(12)) ? false : true) {
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = k4Var.f206816g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                sc2.a8 a8Var = (sc2.a8) pf5.z.f435481a.a(activity).e(sc2.a8.class);
                long j17 = n4Var2.f206686a;
                if (a8Var == null || (V6 = a8Var.V6(j17)) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSingleFeedFlowReporter", "get native ad extra info failed, feedId: " + j17 + " cache not found");
                } else {
                    V6.set(11, kz5.n0.g0(n4Var2.R, ";", null, null, 0, null, null, 62, null));
                    n4Var2.f206715o0 = V6;
                }
            }
            r45.vd6 d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4.f206684r0.d(n4Var2, k4Var.f206817h);
            linkedList.add(d18);
            k4Var.b1(n4Var2, d18, false);
        }
        k4Var.f206640y = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s3.f206880c = null;
        if (!linkedList.isEmpty()) {
            k4Var.f206636u.addAll(linkedList);
            k4Var.R0();
        }
        k4Var.A = new java.util.HashSet();
        if (!hVar.b(0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = hVar.f206590b;
            for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
                int intValue = ((java.lang.Number) entry2.getKey()).intValue();
                int size = ((java.util.List) entry2.getValue()).size();
                java.lang.Iterable iterable = (java.lang.Iterable) entry2.getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : iterable) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g) obj).f206566b) {
                        arrayList.add(obj);
                    }
                }
                int size2 = arrayList.size();
                int i17 = size - size2;
                java.lang.String str = "logId:" + intValue + " -- allocateCount:" + size + " releasedCount:" + size2 + " unReleaseCount:" + i17;
                if (i17 > 0) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) entry2.getValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : iterable2) {
                        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g) obj2).f206566b) {
                            arrayList2.add(obj2);
                        }
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedReportWatcher", "not released logId:" + intValue + " -- " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g) it6.next()).f206567c);
                    }
                }
                sb6.append(str + '\n');
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedReportWatcher", hVar.a(hVar) + " calc result:\n" + ((java.lang.Object) sb6));
            concurrentHashMap.clear();
        }
        return jz5.f0.f384359a;
    }
}
