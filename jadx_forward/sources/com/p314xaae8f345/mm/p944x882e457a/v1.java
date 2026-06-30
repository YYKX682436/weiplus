package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f152355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f152358g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.r1 f152359h;

    public v1(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f152359h = r1Var;
        this.f152355d = i17;
        this.f152356e = i18;
        this.f152357f = str;
        this.f152358g = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = (java.util.Set) ((java.util.HashMap) this.f152359h.f152302i).get(-1);
        if (set == null || set.size() <= 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        synchronized (set) {
            hashSet.addAll(set);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = (com.p314xaae8f345.mm.p944x882e457a.u0) it.next();
            if (u0Var != null && set.contains(u0Var)) {
                u0Var.mo815x76e0bfae(this.f152355d, this.f152356e, this.f152357f, this.f152358g);
            }
        }
    }
}
