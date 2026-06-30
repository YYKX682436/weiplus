package com.tencent.mm.modelbase;

/* loaded from: classes.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f70823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f70825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70826h;

    public v1(com.tencent.mm.modelbase.r1 r1Var, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        this.f70826h = r1Var;
        this.f70822d = i17;
        this.f70823e = i18;
        this.f70824f = str;
        this.f70825g = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = (java.util.Set) ((java.util.HashMap) this.f70826h.f70769i).get(-1);
        if (set == null || set.size() <= 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        synchronized (set) {
            hashSet.addAll(set);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.modelbase.u0 u0Var = (com.tencent.mm.modelbase.u0) it.next();
            if (u0Var != null && set.contains(u0Var)) {
                u0Var.onSceneEnd(this.f70822d, this.f70823e, this.f70824f, this.f70825g);
            }
        }
    }
}
