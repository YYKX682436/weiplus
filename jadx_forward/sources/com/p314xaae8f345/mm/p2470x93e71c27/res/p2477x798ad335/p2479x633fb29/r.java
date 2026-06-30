package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f271236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v f271237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271238f;

    public r(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.s sVar, java.util.List list, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar, java.lang.String str) {
        this.f271236d = list;
        this.f271237e = vVar;
        this.f271238f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f271236d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.h) it.next()).getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if ("CheckResUpdate".equals(this.f271237e.f271261f)) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
                boolean z18 = l0Var.f271219e;
                java.lang.String str = this.f271238f;
                if (!(z18 ? ((java.util.concurrent.ConcurrentHashMap) l0Var.f271216b.f271225b).containsKey(str) : false)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.a(str);
                }
            }
        }
    }
}
