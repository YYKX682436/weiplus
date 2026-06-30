package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class o implements dp1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p f174867a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p pVar) {
        this.f174867a = pVar;
    }

    @Override // dp1.v
    public void a(android.view.MotionEvent motionEvent) {
        this.f174867a.f174874c = motionEvent.getRawX();
    }

    @Override // dp1.v
    public void c(int i17, int i18) {
    }

    @Override // dp1.v
    public boolean d(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // dp1.v
    public int e() {
        return 0;
    }

    @Override // dp1.v
    /* renamed from: enableSwipeBack */
    public boolean mo54081xd71108fe() {
        return false;
    }

    @Override // dp1.v
    public void f(float f17) {
        mp1.h hVar = this.f174867a.f174873b;
        if (f17 >= 0.1f) {
            float f18 = f17 * 2.0f;
            r2 = f18 >= 0.0f ? f18 : 0.0f;
            if (r2 > 1.0f) {
                r2 = 1.0f;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.x4) hVar).f174797a;
        gp1.v vVar = s4Var.f174669h;
        if (vVar != null) {
            vVar.k(s4Var.f174665d, r2);
        }
    }

    @Override // dp1.v
    public boolean g() {
        return false;
    }

    @Override // dp1.v
    public int h(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p pVar = this.f174867a;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.x4) pVar.f174873b).f174797a;
            gp1.v vVar = s4Var.f174669h;
            if (vVar != null) {
                vVar.k(s4Var.f174665d, 0.0f);
            }
            return 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.x4) pVar.f174873b).f174797a;
        gp1.v vVar2 = s4Var2.f174669h;
        if (vVar2 != null) {
            vVar2.k(s4Var2.f174665d, 1.0f);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.x4) pVar.f174873b).a(pVar.f174874c);
        return 1;
    }
}
