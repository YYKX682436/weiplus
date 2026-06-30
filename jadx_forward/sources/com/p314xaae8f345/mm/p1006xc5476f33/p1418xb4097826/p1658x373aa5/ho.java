package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ho implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f213794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f213795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f213796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.nw6 f213797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f213798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f213799i;

    public ho(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, int i18, r45.nw6 nw6Var, int i19, android.content.Context context) {
        this.f213794d = h0Var;
        this.f213795e = i17;
        this.f213796f = i18;
        this.f213797g = nw6Var;
        this.f213798h = i19;
        this.f213799i = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderEntry$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f213794d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) h0Var.f391656d)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", (java.lang.String) h0Var.f391656d);
            intent.putExtra("key_enter_profile_type", 40);
            intent.putExtra("key_entrance_type", this.f213795e);
            intent.putExtra("KEY_REF_COMMENTSCENE", 97);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"half_screen_source\":");
            int i17 = this.f213796f;
            sb6.append(i17);
            sb6.append('}');
            java.lang.String sb7 = sb6.toString();
            intent.putExtra("key_extra_info", sb7);
            intent.putExtra("CLIENT_KV_REPORTINFO", sb7);
            intent.putExtra("key_common_extra_info", sb7);
            intent.putExtra("key_half_screen_source", i17);
            r45.so2 so2Var = (r45.so2) this.f213797g.m75936x14adae67(8);
            if (so2Var != null) {
                intent.putExtra("key_poi_interaction_info", ot5.e.a(so2Var.mo14344x5f01b1f6()));
            }
            if (this.f213798h == 8) {
                intent.putExtra("key_entrance_type", 19);
            }
            java.lang.Object obj = h0Var.f391656d;
            android.content.Context context = this.f213799i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, xy2.c.e(context));
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(14, 2, b17 ? 33 : 32, intent);
            intent.putExtra("KEY_FINDER_SELF_FLAG", b17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f542005a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            e1Var.w(context, intent);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef95 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95();
            c6586xa056ef95.s(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
            c6586xa056ef95.p("97");
            c6586xa056ef95.t("{\"scene\":" + i17 + '}');
            c6586xa056ef95.q("fans_list_to_profile");
            c6586xa056ef95.k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6586xa056ef95);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderEntry$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
