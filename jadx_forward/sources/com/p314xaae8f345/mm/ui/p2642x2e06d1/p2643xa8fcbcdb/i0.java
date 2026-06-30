package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class i0 implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b f279364a;

    public i0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b abstractC21556x9c39960b) {
        this.f279364a = abstractC21556x9c39960b;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b abstractC21556x9c39960b = this.f279364a;
        if (!abstractC21556x9c39960b.f279300g && c21560x1fce98fb.r() && c21560x1fce98fb.f279316t) {
            abstractC21556x9c39960b.f279300g = true;
            if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                c21541x1c1b08fe.O(c21541x1c1b08fe.N());
                if (c21541x1c1b08fe.f279318v) {
                    abstractC21556x9c39960b.f279299f.edit().putBoolean(c21560x1fce98fb.f279313q, c21541x1c1b08fe.N()).commit();
                }
                abstractC21556x9c39960b.getClass();
                z17 = true;
            } else {
                z17 = false;
            }
            if (c21560x1fce98fb.f279313q != null) {
                abstractC21556x9c39960b.n0(abstractC21556x9c39960b.f279297d, c21560x1fce98fb, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n0.OnChange);
            }
            if (z17) {
                abstractC21556x9c39960b.f279297d.notifyDataSetChanged();
            }
            abstractC21556x9c39960b.f279300g = false;
            if (z17) {
                return true;
            }
        }
        return false;
    }
}
