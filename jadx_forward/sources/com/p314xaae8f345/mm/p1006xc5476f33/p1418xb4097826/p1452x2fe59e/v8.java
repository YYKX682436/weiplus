package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class v8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 f192413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192414f;

    public v8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var, java.lang.String str) {
        this.f192412d = abstractC14490x69736cb5;
        this.f192413e = w8Var;
        this.f192414f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback$refreshMemberView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        boolean m59341xea59514a = this.f192412d.getFeedObject().m59341xea59514a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var = this.f192413e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0 c0Var = w8Var.f188502e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 t8Var = c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8) c0Var : null;
        int i17 = t8Var != null ? t8Var.M : 0;
        if (i17 == 1 || i17 == 2) {
            if (m59341xea59514a) {
                intent.putExtra("key_member_inlet_source", 1);
            } else {
                intent.putExtra("key_member_inlet_source", 3);
            }
        } else if (i17 == 3) {
            if (m59341xea59514a) {
                intent.putExtra("key_member_inlet_source", 2);
            } else {
                intent.putExtra("key_member_inlet_source", 4);
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Kk(w8Var.f188501d, intent, this.f192414f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback$refreshMemberView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
