package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ib implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f185188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f185190h;

    public ib(android.view.View view, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17) {
        this.f185186d = view;
        this.f185187e = s0Var;
        this.f185188f = qeVar;
        this.f185189g = abstractC14490x69736cb5;
        this.f185190h = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public final void mo889xb349b3ab() {
        this.f185186d.setTag(java.lang.Boolean.FALSE);
        in5.s0 s0Var = this.f185187e;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Vj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), abstractC14490x69736cb5.w(), 2, 3L, "", V6, 0L, null, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) eVar).Ai(context2, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk5Var.f464665d = 1;
            pk5Var.f464673o = (int) (android.os.SystemClock.elapsedRealtime() - pk5Var.f464676r);
            pk5Var.f464670i = 1;
        }
        l35.a aVar = l35.a.f396976a;
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        aVar.a(context3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183940b = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206966b = 0L;
        android.content.Context context4 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
        if (c15447x4ebc90c2 != null) {
            c15447x4ebc90c2.c7(s0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f185188f;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d = qeVar.f185891f.getF204176d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f185189g;
        x3Var.c(f204176d, "menu_outside", abstractC14490x69736cb52.mo2128x1ed62e84(), this.f185190h);
        x3Var.d(qeVar.f185891f.getF204176d(), abstractC14490x69736cb52.mo2128x1ed62e84(), this.f185190h);
    }
}
