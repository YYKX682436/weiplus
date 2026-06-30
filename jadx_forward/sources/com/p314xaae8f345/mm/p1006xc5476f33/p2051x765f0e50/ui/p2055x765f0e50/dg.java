package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes9.dex */
public class dg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f242478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f242479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f242480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a f242481g;

    public dg(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a activityC17433xf2c8f56a, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe, boolean z17, boolean z18) {
        this.f242481g = activityC17433xf2c8f56a;
        this.f242478d = c21541x1c1b08fe;
        this.f242479e = z17;
        this.f242480f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f242478d;
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.O(false);
        }
        if (this.f242479e) {
            return;
        }
        this.f242481g.g7(this.f242480f, 2097152L, 50);
    }
}
