package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class o implements dp1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.p f93334a;

    public o(com.tencent.mm.plugin.ball.ui.p pVar) {
        this.f93334a = pVar;
    }

    @Override // dp1.v
    public void a(android.view.MotionEvent motionEvent) {
        this.f93334a.f93341c = motionEvent.getRawX();
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
    public boolean enableSwipeBack() {
        return false;
    }

    @Override // dp1.v
    public void f(float f17) {
        mp1.h hVar = this.f93334a.f93340b;
        if (f17 >= 0.1f) {
            float f18 = f17 * 2.0f;
            r2 = f18 >= 0.0f ? f18 : 0.0f;
            if (r2 > 1.0f) {
                r2 = 1.0f;
            }
        }
        com.tencent.mm.plugin.ball.service.s4 s4Var = ((com.tencent.mm.plugin.ball.service.x4) hVar).f93264a;
        gp1.v vVar = s4Var.f93136h;
        if (vVar != null) {
            vVar.k(s4Var.f93132d, r2);
        }
    }

    @Override // dp1.v
    public boolean g() {
        return false;
    }

    @Override // dp1.v
    public int h(boolean z17) {
        com.tencent.mm.plugin.ball.ui.p pVar = this.f93334a;
        if (!z17) {
            com.tencent.mm.plugin.ball.service.s4 s4Var = ((com.tencent.mm.plugin.ball.service.x4) pVar.f93340b).f93264a;
            gp1.v vVar = s4Var.f93136h;
            if (vVar != null) {
                vVar.k(s4Var.f93132d, 0.0f);
            }
            return 1;
        }
        com.tencent.mm.plugin.ball.service.s4 s4Var2 = ((com.tencent.mm.plugin.ball.service.x4) pVar.f93340b).f93264a;
        gp1.v vVar2 = s4Var2.f93136h;
        if (vVar2 != null) {
            vVar2.k(s4Var2.f93132d, 1.0f);
        }
        ((com.tencent.mm.plugin.ball.service.x4) pVar.f93340b).a(pVar.f93341c);
        return 1;
    }
}
