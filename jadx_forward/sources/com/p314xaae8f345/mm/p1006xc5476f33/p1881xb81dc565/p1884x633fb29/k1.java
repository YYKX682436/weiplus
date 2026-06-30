package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class k1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.kd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 f231560a;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var) {
        this.f231560a = v0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.kd
    /* renamed from: onKeyDown */
    public boolean mo67037x1f03f0c2(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = this.f231560a;
        if (!v0Var.S.f382766b) {
            return false;
        }
        if (i17 != 25 && i17 != 24) {
            return false;
        }
        if (!v0Var.f231694d) {
            return true;
        }
        v0Var.X();
        return true;
    }
}
