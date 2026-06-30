package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f70813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f70814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f70815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70817h;

    public u1(com.tencent.mm.modelbase.r1 r1Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18, java.lang.String str) {
        this.f70817h = r1Var;
        this.f70813d = m1Var;
        this.f70814e = i17;
        this.f70815f = i18;
        this.f70816g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        fs.g.c(com.tencent.mm.modelbase.j1.class, java.lang.Integer.valueOf(this.f70813d.getType()), new com.tencent.mm.modelbase.s1(this));
        fs.g.c(com.tencent.mm.modelbase.j1.class, -1, new com.tencent.mm.modelbase.t1(this));
        java.util.Set set = (java.util.Set) ((java.util.HashMap) this.f70817h.f70769i).get(java.lang.Integer.valueOf(this.f70813d.getType()));
        if (set != null && set.size() > 0) {
            java.util.HashSet hashSet = new java.util.HashSet();
            synchronized (set) {
                hashSet.addAll(set);
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.tencent.mm.modelbase.u0 u0Var = (com.tencent.mm.modelbase.u0) it.next();
                if (u0Var != null && set.contains(u0Var)) {
                    u0Var.onSceneEnd(this.f70814e, this.f70815f, this.f70816g, this.f70813d);
                }
            }
        }
        java.util.Set set2 = (java.util.Set) ((java.util.HashMap) this.f70817h.f70769i).get(-1);
        if (set2 == null || set2.size() <= 0) {
            return;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        synchronized (set2) {
            hashSet2.addAll(set2);
        }
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.modelbase.u0 u0Var2 = (com.tencent.mm.modelbase.u0) it6.next();
            if (u0Var2 != null && set2.contains(u0Var2)) {
                u0Var2.onSceneEnd(this.f70814e, this.f70815f, this.f70816g, this.f70813d);
            }
        }
    }
}
