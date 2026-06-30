package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f152346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f152348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152349g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.r1 f152350h;

    public u1(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18, java.lang.String str) {
        this.f152350h = r1Var;
        this.f152346d = m1Var;
        this.f152347e = i17;
        this.f152348f = i18;
        this.f152349g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        fs.g.c(com.p314xaae8f345.mm.p944x882e457a.j1.class, java.lang.Integer.valueOf(this.f152346d.mo808xfb85f7b0()), new com.p314xaae8f345.mm.p944x882e457a.s1(this));
        fs.g.c(com.p314xaae8f345.mm.p944x882e457a.j1.class, -1, new com.p314xaae8f345.mm.p944x882e457a.t1(this));
        java.util.Set set = (java.util.Set) ((java.util.HashMap) this.f152350h.f152302i).get(java.lang.Integer.valueOf(this.f152346d.mo808xfb85f7b0()));
        if (set != null && set.size() > 0) {
            java.util.HashSet hashSet = new java.util.HashSet();
            synchronized (set) {
                hashSet.addAll(set);
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = (com.p314xaae8f345.mm.p944x882e457a.u0) it.next();
                if (u0Var != null && set.contains(u0Var)) {
                    u0Var.mo815x76e0bfae(this.f152347e, this.f152348f, this.f152349g, this.f152346d);
                }
            }
        }
        java.util.Set set2 = (java.util.Set) ((java.util.HashMap) this.f152350h.f152302i).get(-1);
        if (set2 == null || set2.size() <= 0) {
            return;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        synchronized (set2) {
            hashSet2.addAll(set2);
        }
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = (com.p314xaae8f345.mm.p944x882e457a.u0) it6.next();
            if (u0Var2 != null && set2.contains(u0Var2)) {
                u0Var2.mo815x76e0bfae(this.f152347e, this.f152348f, this.f152349g, this.f152346d);
            }
        }
    }
}
