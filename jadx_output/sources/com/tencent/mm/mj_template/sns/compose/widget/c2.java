package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.b4 f69896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f69897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f69898f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f69899g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f69900h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(androidx.compose.ui.platform.b4 b4Var, com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, yz5.a aVar, yz5.p pVar, yz5.l lVar) {
        super(2);
        this.f69896d = b4Var;
        this.f69897e = t2Var;
        this.f69898f = aVar;
        this.f69899g = pVar;
        this.f69900h = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        int i17 = z0.t.f468922q1;
        z0.t g17 = d0.a3.g(d0.a2.h(d0.a3.f(z0.p.f468921d, 0.0f, 1, null), 1 * 8, 0.0f, 2, null), 520);
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(483445369);
        java.lang.Object y17 = y0Var2.y();
        int i18 = n0.o.f333629a;
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            y17 = new c0.p();
            y0Var2.g0(y17);
        }
        c0.o oVar2 = (c0.o) y17;
        y0Var2.o(false);
        y0Var2.U(483445416);
        androidx.compose.ui.platform.b4 b4Var = this.f69896d;
        boolean e17 = y0Var2.e(b4Var);
        java.lang.Object y18 = y0Var2.y();
        if (e17 || y18 == obj4) {
            y18 = new com.tencent.mm.mj_template.sns.compose.widget.a2(b4Var);
            y0Var2.g0(y18);
        }
        y0Var2.o(false);
        z0.t c17 = a0.d0.c(g17, oVar2, null, false, null, null, (yz5.a) y18, 28, null);
        y0Var2.U(-483455358);
        d0.l lVar = d0.p.f225186d;
        int i19 = z0.d.f468903a;
        s1.t0 a17 = d0.j0.a(lVar, z0.a.f468900l, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(c17);
        if (!(y0Var2.f333761b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar);
        } else {
            y0Var2.i0();
        }
        y0Var2.f333784y = false;
        n0.i5.a(y0Var2, a17, u1.f.f423590e);
        n0.i5.a(y0Var2, fVar, u1.f.f423589d);
        n0.i5.a(y0Var2, sVar, u1.f.f423591f);
        n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-1163856341);
        com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var = this.f69897e;
        java.lang.String music_id = ((r45.k96) ((com.tencent.mm.mj_template.sns.compose.widget.e1) ((n0.q4) t2Var.f70241n).getValue()).f69938a).f378517d;
        kotlin.jvm.internal.o.f(music_id, "music_id");
        com.tencent.mm.mj_template.sns.compose.widget.o2.h(music_id, this.f69898f, new com.tencent.mm.mj_template.sns.compose.widget.b2(this.f69899g, t2Var, this.f69900h), y0Var2, 0);
        com.tencent.mm.mj_template.sns.compose.widget.o2.g(t2Var, y0Var2, 8);
        com.tencent.mm.mj_template.sns.compose.widget.o2.f(t2Var, y0Var2, 8);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
