package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f184987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f184989g;

    public g5(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176) {
        this.f184986d = s0Var;
        this.f184987e = q6Var;
        this.f184988f = view;
        this.f184989g = c15258xcd50c176;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f184986d;
        so2.z0 z0Var = (so2.z0) s0Var.f374658i;
        if (z0Var != null && z0Var.F) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var = this.f184987e;
            if (q6Var.f185875g) {
                q6Var.C(s0Var, z0Var);
                android.view.View commentHeaderLayout = this.f184988f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(commentHeaderLayout, "$commentHeaderLayout");
                long j17 = z0Var.E.f66939xc8a07680;
                q6Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, commentHeaderLayout, "desc_expand_collapse", "view_clk", false, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(j17)), new jz5.l("is_expand", 0)), null, 40, null);
            } else {
                this.f184989g.i();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
