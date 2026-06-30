package im2;

/* loaded from: classes3.dex */
public final class k extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f373940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp1.v f373941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fo0.n f373942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f373943h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c f373944i;

    public k(gp1.v vVar, fo0.n nVar, mn0.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c c14221x14e9402c) {
        this.f373941f = vVar;
        this.f373942g = nVar;
        this.f373943h = b0Var;
        this.f373944i = c14221x14e9402c;
    }

    @Override // ug5.h
    public void a(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.a(animation, performer);
        this.f373940e = true;
        h(performer.f509192b, performer);
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.g(context, performer);
        android.view.View view = this.f373942g.f346360n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.live.core.view.FluentSwitchRelativeLayout");
        mo0.a aVar = (mo0.a) view;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614(context2);
        aVar.addView(c10850xc00cf614);
        mn0.y yVar = (mn0.y) this.f373943h;
        yVar.Q(0);
        yVar.O(c10850xc00cf614, new im2.j(aVar, this, performer));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c fragment = this.f373944i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).U6();
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var == null || w0Var.O() == null) {
            return;
        }
        fo0.c cVar = fo0.c.f346331a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d;
        if (c12886x91aa2b6d != null) {
            performer.f("key_ball_info", c12886x91aa2b6d);
            gp1.v vVar = this.f373941f;
            if (vVar != null) {
                vVar.k(c12886x91aa2b6d, 0.001f);
            }
        }
    }

    public final void h(android.view.View view, ug5.v vVar) {
        gp1.v vVar2;
        java.lang.Object d17 = vVar.d("key_ball_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) d17 : null;
        if (c12886x91aa2b6d != null && (vVar2 = this.f373941f) != null) {
            vVar2.k(c12886x91aa2b6d, 1.0f);
        }
        if (view != null) {
            view.post(new im2.h(vVar));
        } else {
            vVar.b(false);
        }
    }
}
