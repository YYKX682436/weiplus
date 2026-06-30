package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.t4 f184622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f184624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs f184625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184626h;

    public cs(so2.t4 t4Var, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs gsVar, in5.s0 s0Var) {
        this.f184622d = t4Var;
        this.f184623e = i17;
        this.f184624f = c19792x256d2725;
        this.f184625g = gsVar;
        this.f184626h = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.dm2 m76806xdef68064;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("topicId=");
        so2.t4 t4Var = this.f184622d;
        sb6.append(t4Var.f492142f);
        sb6.append(", objectIndex=");
        sb6.append(this.f184623e);
        sb6.append(", objectId=");
        sb6.append(this.f184624f.m76784x5db1b11());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlaySquareContainerConvert", sb6.toString());
        in5.s0 s0Var = this.f184626h;
        int i17 = this.f184623e;
        this.f184625g.getClass();
        try {
            android.content.Context context = s0Var.f3639x46306858.getContext();
            if (context instanceof android.app.Activity) {
                java.util.List list = t4Var.f492144h;
                long j17 = t4Var.f492142f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 0)));
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("topic_id", j17);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.a0(list, i17);
                intent.putExtra("from_object_id", c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.a0(list, i17);
                intent.putExtra("from_object_dup_flag", (c19792x256d27252 == null || (m76806xdef68064 = c19792x256d27252.m76806xdef68064()) == null) ? null : m76806xdef68064.m75945x2fec8307(62));
                java.lang.String str = t4Var.f492145i;
                if (str == null) {
                    str = "";
                }
                intent.putExtra("by_pass", str);
                intent.putExtra("single_comment_scene", 383);
                new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9().b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(new java.util.ArrayList(arrayList2), null, i17, null, null, 16, null), intent);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Zk((android.app.Activity) context, intent);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlaySquareContainerConvert", "跳转到单流页: topicId=" + j17 + ", objectIndex=" + i17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostPlaySquareContainerConvert", "Context is not Activity, cannot start activity");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostPlaySquareContainerConvert", "跳转单流页失败: " + e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
