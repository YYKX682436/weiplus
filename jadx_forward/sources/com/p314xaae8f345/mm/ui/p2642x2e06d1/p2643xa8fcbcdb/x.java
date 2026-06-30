package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class x implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b f279389a;

    public x(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b) {
        this.f279389a = abstractActivityC21555x39071a9b;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, java.lang.Object obj) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var2;
        android.content.SharedPreferences sharedPreferences;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b = this.f279389a;
        z17 = abstractActivityC21555x39071a9b.f39409x6e3c4ff1;
        if (!z17 && c21560x1fce98fb.r() && c21560x1fce98fb.f279316t) {
            abstractActivityC21555x39071a9b.f39409x6e3c4ff1 = true;
            if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                c21541x1c1b08fe.O(c21541x1c1b08fe.N());
                if (c21541x1c1b08fe.f279318v) {
                    sharedPreferences = abstractActivityC21555x39071a9b.f279295sp;
                    sharedPreferences.edit().putBoolean(c21560x1fce98fb.f279313q, c21541x1c1b08fe.N()).commit();
                }
                abstractActivityC21555x39071a9b.f39408x5b2a3d2 = true;
                z18 = true;
            } else {
                z18 = false;
            }
            h0Var = abstractActivityC21555x39071a9b.f39403xbb6ca34f;
            abstractActivityC21555x39071a9b.mo69080x80434d2e(h0Var, c21560x1fce98fb);
            if (z18) {
                h0Var2 = abstractActivityC21555x39071a9b.f39403xbb6ca34f;
                h0Var2.notifyDataSetChanged();
            }
            abstractActivityC21555x39071a9b.f39409x6e3c4ff1 = false;
            if (z18) {
                return true;
            }
        }
        return false;
    }
}
