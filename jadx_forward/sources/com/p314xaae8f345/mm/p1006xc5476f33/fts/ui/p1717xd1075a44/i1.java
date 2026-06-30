package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes15.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f219814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 f219815e;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 c15622xdd86a927, int i17) {
        this.f219815e = c15622xdd86a927;
        this.f219814d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var = this.f219815e.f219758s;
        int i17 = x0Var.f219892o;
        int i18 = this.f219814d;
        x0Var.f219889l = i18 < 10;
        x0Var.invalidateSelf();
        x0Var.f219892o = i18;
    }
}
