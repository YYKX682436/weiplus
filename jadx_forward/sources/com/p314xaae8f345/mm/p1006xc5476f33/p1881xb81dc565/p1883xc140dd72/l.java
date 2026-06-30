package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f231215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c f231216f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar, int i17, java.lang.Object obj) {
        this.f231216f = cVar;
        this.f231214d = i17;
        this.f231215e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = this.f231216f.f231047a;
        if (v0Var != null) {
            v0Var.F(this.f231214d, this.f231215e);
        }
    }
}
