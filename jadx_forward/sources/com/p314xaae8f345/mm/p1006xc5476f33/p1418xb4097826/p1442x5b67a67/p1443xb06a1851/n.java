package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p f186699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f186700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f186701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186702g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f186703h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p pVar, r45.qj2 qj2Var, long j17, java.lang.String str, long j18, java.lang.String str2) {
        super(1);
        this.f186699d = pVar;
        this.f186700e = qj2Var;
        this.f186701f = j17;
        this.f186702g = str;
        this.f186703h = j18;
        this.f186704i = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            int i17 = fVar.f152148a;
            java.lang.String str = "loadingView";
            java.lang.String str2 = "loadingLayout";
            int i18 = 0;
            r45.qj2 qj2Var = this.f186700e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p pVar = this.f186699d;
            if (i17 == 0 && fVar.f152149b == 0) {
                android.app.Activity context = pVar.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i.class)).O6((r45.qj2) ((r45.v81) fVar.f152151d).m75936x14adae67(1));
                android.widget.FrameLayout frameLayout = pVar.f186707w;
                if (frameLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                    throw null;
                }
                frameLayout.setVisibility(8);
                pVar.w7().setOnClickListener(null);
                com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                java.lang.String str3 = "native_drama_init_position";
                int intExtra = pVar.m158359x1e885992().getIntExtra("native_drama_init_position", 0);
                java.lang.String str4 = "native_drama_enter_promotion_comment_scene";
                int intExtra2 = pVar.m158359x1e885992().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
                java.util.LinkedList m75941xfb821914 = ((r45.v81) resp).m75941xfb821914(2);
                pVar.f186710z = m75941xfb821914;
                if (m75941xfb821914 != null) {
                    int i19 = 0;
                    for (java.lang.Object obj2 : m75941xfb821914) {
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.pj2 pj2Var = (r45.pj2) obj2;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        r45.ft4 ft4Var = (r45.ft4) pj2Var.m75936x14adae67(i18);
                        sb6.append(ft4Var != null ? ft4Var.m75939xb282bd08(i18) : i18);
                        sb6.append('-');
                        r45.ft4 ft4Var2 = (r45.ft4) pj2Var.m75936x14adae67(i18);
                        sb6.append(ft4Var2 != null ? ft4Var2.m75939xb282bd08(1) : 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.j(pVar, sb6.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.C13712xb8f11690 c13712xb8f11690 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.C13712xb8f11690();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putLong("native_drama_id", qj2Var.m75942xfb822ef2(0));
                        bundle.putLong("native_drama_object_id", this.f186701f);
                        bundle.putString("native_drama_object_dup_flag", this.f186702g);
                        bundle.putInt(str3, intExtra);
                        bundle.putLong("native_drama_enter_object_id", this.f186703h);
                        bundle.putInt(str4, intExtra2);
                        bundle.putString("native_drama_enter_dupflag", this.f186704i);
                        bundle.putByteArray("native_drama_range", pj2Var.mo14344x5f01b1f6());
                        c13712xb8f11690.mo7562xe26dab14(bundle);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.Q6(pVar, i19, jVar, c13712xb8f11690, false, 8, null);
                        pVar = pVar;
                        str4 = str4;
                        str3 = str3;
                        intExtra2 = intExtra2;
                        i19 = i27;
                        str = str;
                        i18 = 0;
                        qj2Var = qj2Var;
                        str2 = str2;
                    }
                }
                java.lang.String str5 = str;
                java.lang.String str6 = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p pVar2 = pVar;
                java.util.LinkedList linkedList = pVar2.f186710z;
                if (linkedList == null || linkedList.isEmpty()) {
                    android.widget.FrameLayout frameLayout2 = pVar2.f186707w;
                    if (frameLayout2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str6);
                        throw null;
                    }
                    frameLayout2.setVisibility(0);
                    android.view.View view = pVar2.f186708x;
                    if (view == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str5);
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View w76 = pVar2.w7();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(w76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    w76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(w76, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                pVar2.y7(intExtra);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.m(pVar, qj2Var);
                pVar.getClass();
                android.widget.FrameLayout frameLayout3 = pVar.f186707w;
                if (frameLayout3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                    throw null;
                }
                frameLayout3.setVisibility(0);
                android.view.View view2 = pVar.f186708x;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View w77 = pVar.w7();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(w77, arrayList4.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                w77.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(w77, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                pVar.w7().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.o(mVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
