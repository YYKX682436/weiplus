package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b2 f264293e;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b2 b2Var, int i17) {
        this.f264293e = b2Var;
        this.f264292d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        hy4.b bVar = hy4.b.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b2 b2Var = this.f264293e;
        if (this.f264292d == 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) b2Var.f264320a).d();
            java.lang.String str = b2Var.f264321b;
            bVar.a(str == null ? "" : str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a, 0, 1, 0, 0, b2Var.f264322c);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) b2Var.f264320a).b(b2Var.f264323d, 9);
            java.lang.String str2 = b2Var.f264321b;
            bVar.a(str2 == null ? "" : str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a, 1, 1, 0, 0, b2Var.f264322c);
        }
        bVar.b(1, (int) (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a), b2Var.f264322c);
    }
}
