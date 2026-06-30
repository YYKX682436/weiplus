package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f202684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.r f202685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f202686f;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.r rVar, in5.s0 s0Var) {
        this.f202684d = abstractC14490x69736cb5;
        this.f202685e = rVar;
        this.f202686f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/convert/MemberVideoConvert$refreshPosterMedia$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f202684d;
        if (feed.getFeedObject().getMediaType() == 4) {
            boolean m59338xecb5e178 = feed.getFeedObject().m59338xecb5e178();
            in5.s0 s0Var = this.f202686f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.r rVar = this.f202685e;
            if (m59338xecb5e178) {
                android.content.Intent intent = new android.content.Intent();
                rVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9 y9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                feed.getFeedObject().m59358xc5f6eaef(0);
                arrayList2.add(feed);
                y9Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(arrayList2, null, 0, null, null, 16, null), intent);
                r45.kb4 kb4Var = new r45.kb4();
                kb4Var.m75941xfb821914(0).addAll(feed.getFeedObject().m59264x7efe73ec());
                bu2.j jVar = bu2.j.f106067a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = feed.getFeedObject();
                bu2.i iVar = bu2.i.f106054b;
                jVar.n(feedObject, bu2.i.f106061i);
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Sj(context, intent, feed.getFeedObject().m59251x5db1b11(), feed.getFeedObject().m59276x6c285d75(), kb4Var, null);
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                java.util.ArrayList<so2.j5> d17 = kz5.c0.d(feed);
                rVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9 y9Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (so2.j5 j5Var : d17) {
                    if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && j5Var.h() != -17) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59358xc5f6eaef(0);
                        arrayList3.add(j5Var);
                    }
                }
                y9Var2.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(arrayList3, null, 0, null, null, 16, null), intent2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                android.content.Context context2 = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                i0Var.Tj(context2, intent2, rVar.f411923g, "", 1, rVar.f411925i, "", 0, 0, 0, 0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/convert/MemberVideoConvert$refreshPosterMedia$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
