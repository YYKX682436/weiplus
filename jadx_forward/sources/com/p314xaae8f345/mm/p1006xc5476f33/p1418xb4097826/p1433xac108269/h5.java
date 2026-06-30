package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes9.dex */
public final class h5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.g9 f183757a;

    public h5(zy2.g9 g9Var) {
        this.f183757a = g9Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i18 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        zy2.g9 g9Var = this.f183757a;
        if (i18 == 0 && (i17 = fVar.f152149b) == 0) {
            if (g9Var != null) {
                ((dk5.m5) g9Var).a(i18, i17, ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar.f152151d).m77035x76845fea());
                return f0Var;
            }
        } else if (g9Var != null) {
            ((dk5.m5) g9Var).a(i18, fVar.f152149b, null);
            return f0Var;
        }
        return null;
    }
}
