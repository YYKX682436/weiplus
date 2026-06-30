package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJTemplateInfo f69905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f69907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f69908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.e5 f69909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.tencent.maas.model.MJTemplateInfo mJTemplateInfo, n0.v2 v2Var, yz5.l lVar, yz5.l lVar2, com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var) {
        super(2);
        this.f69905d = mJTemplateInfo;
        this.f69906e = v2Var;
        this.f69907f = lVar;
        this.f69908g = lVar2;
        this.f69909h = e5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        z0.p pVar = z0.p.f468921d;
        z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
        yz5.l lVar = this.f69907f;
        yz5.l lVar2 = this.f69908g;
        com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var = this.f69909h;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(e17);
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
        n0.i5.a(y0Var2, c17, u1.f.f423590e);
        n0.i5.a(y0Var2, fVar, u1.f.f423589d);
        n0.i5.a(y0Var2, sVar, u1.f.f423591f);
        n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a17).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(852929689);
        java.lang.Object y17 = y0Var2.y();
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var2.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var2.o(false);
        com.tencent.maas.model.MJTemplateInfo mJTemplateInfo = this.f69905d;
        n0.d2.f(mJTemplateInfo.getTemplateID(), new com.tencent.mm.mj_template.sns.compose.widget.a4(mJTemplateInfo, v2Var, null), y0Var2, 64);
        y0Var2.U(852930109);
        if (((com.tencent.mm.plugin.gif.b) v2Var.getValue()) == null) {
            com.tencent.mm.mj_template.sns.compose.widget.q4.l(y0Var2, 0);
        }
        y0Var2.o(false);
        y0Var2.U(-754954056);
        if (((com.tencent.mm.plugin.gif.b) v2Var.getValue()) != null) {
            com.tencent.mm.plugin.gif.b bVar = (com.tencent.mm.plugin.gif.b) v2Var.getValue();
            y0Var2.U(852930331);
            boolean e18 = y0Var2.e(bVar);
            java.lang.Object y18 = y0Var2.y();
            if (e18 || y18 == obj4) {
                java.lang.String templateID = mJTemplateInfo.getTemplateID();
                kotlin.jvm.internal.o.f(templateID, "getTemplateID(...)");
                com.tencent.mm.plugin.gif.b bVar2 = (com.tencent.mm.plugin.gif.b) v2Var.getValue();
                kotlin.jvm.internal.o.d(bVar2);
                android.graphics.drawable.Drawable mutate = bVar2.mutate();
                kotlin.jvm.internal.o.f(mutate, "mutate(...)");
                y18 = new sz0.c(templateID, mutate);
                y0Var2.g0(y18);
            }
            sz0.c cVar = (sz0.c) y18;
            y0Var2.o(false);
            n0.v2 v2Var2 = this.f69906e;
            if (((java.lang.Boolean) v2Var2.getValue()).booleanValue()) {
                if (cVar.f413917o) {
                    cVar.f413917o = false;
                    android.graphics.drawable.Drawable drawable = cVar.f413914i;
                    if (drawable instanceof com.tencent.mm.plugin.gif.u) {
                        ((com.tencent.mm.plugin.gif.u) drawable).d();
                    }
                    if (drawable instanceof com.tencent.mm.plugin.gif.k) {
                        ((com.tencent.mm.plugin.gif.k) drawable).d();
                    }
                }
            } else if (!cVar.f413917o) {
                cVar.f413917o = true;
                android.graphics.drawable.Drawable drawable2 = cVar.f413914i;
                if (drawable2 instanceof com.tencent.mm.plugin.gif.u) {
                    ((com.tencent.mm.plugin.gif.u) drawable2).f142190d = false;
                }
                if (drawable2 instanceof com.tencent.mm.plugin.gif.k) {
                    ((com.tencent.mm.plugin.gif.k) drawable2).f142137d = false;
                }
            }
            s1.p pVar2 = s1.o.f402044a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            z17 = false;
            a0.q1.a(cVar, null, s1.h1.a(a0.b.c(pVar, rz0.a.b(com.tencent.mm.R.color.adu, context), null, 2, null), new com.tencent.mm.mj_template.sns.compose.widget.b4(lVar, lVar2, e5Var, mJTemplateInfo, v2Var2)), null, pVar2, 0.0f, null, y0Var2, 24632, 104);
        } else {
            z17 = false;
        }
        y0Var2.o(z17);
        y0Var2.o(z17);
        y0Var2.o(z17);
        y0Var2.o(true);
        y0Var2.o(z17);
        y0Var2.o(z17);
        return jz5.f0.f302826a;
    }
}
