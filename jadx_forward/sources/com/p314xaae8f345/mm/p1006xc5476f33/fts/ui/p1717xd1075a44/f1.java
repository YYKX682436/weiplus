package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes15.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f219802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 f219803e;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 c15622xdd86a927, boolean z17) {
        this.f219803e = c15622xdd86a927;
        this.f219802d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var = this.f219803e.f219758s;
        if (!this.f219802d) {
            x0Var.f219891n = 3;
        }
        int i17 = x0Var.f219892o;
        x0Var.f219889l = true;
        x0Var.invalidateSelf();
        x0Var.f219892o = 0;
    }
}
