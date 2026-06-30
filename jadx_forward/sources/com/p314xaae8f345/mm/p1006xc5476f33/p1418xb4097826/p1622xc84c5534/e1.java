package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1 f206537a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f206538b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f206539c = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1 a(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f206538b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (d1Var != null) {
            return d1Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1 d1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1();
        concurrentHashMap.put(java.lang.Long.valueOf(j17), d1Var2);
        return d1Var2;
    }

    public final void b(java.lang.Long l17) {
        if (l17 != null) {
            l17.longValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1 a17 = a(l17.longValue());
            if (!(a17.f206523c == 0)) {
                a17 = null;
            }
            if (a17 != null) {
                a17.f206523c = c01.id.c();
            } else {
                f206538b.remove(l17);
                b(l17);
            }
        }
    }

    public final void c(java.lang.Long l17) {
        if (l17 != null) {
            l17.longValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1 a17 = a(l17.longValue());
            if (!(a17.f206521a == 0)) {
                a17 = null;
            }
            if (a17 != null) {
                a17.f206521a = c01.id.c();
            } else {
                f206538b.remove(l17);
                c(l17);
            }
        }
    }
}
