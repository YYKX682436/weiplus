package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.detail.p f105166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f105167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f105168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105169g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f105170h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105171i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.drama.detail.p pVar, r45.qj2 qj2Var, long j17, java.lang.String str, long j18, java.lang.String str2) {
        super(1);
        this.f105166d = pVar;
        this.f105167e = qj2Var;
        this.f105168f = j17;
        this.f105169g = str;
        this.f105170h = j18;
        this.f105171i = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            int i17 = fVar.f70615a;
            java.lang.String str = "loadingView";
            java.lang.String str2 = "loadingLayout";
            int i18 = 0;
            r45.qj2 qj2Var = this.f105167e;
            com.tencent.mm.plugin.finder.drama.detail.p pVar = this.f105166d;
            if (i17 == 0 && fVar.f70616b == 0) {
                android.app.Activity context = pVar.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.finder.drama.detail.i) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.drama.detail.i.class)).O6((r45.qj2) ((r45.v81) fVar.f70618d).getCustom(1));
                android.widget.FrameLayout frameLayout = pVar.f105174w;
                if (frameLayout == null) {
                    kotlin.jvm.internal.o.o("loadingLayout");
                    throw null;
                }
                frameLayout.setVisibility(8);
                pVar.w7().setOnClickListener(null);
                com.tencent.mm.protobuf.f resp = fVar.f70618d;
                kotlin.jvm.internal.o.f(resp, "resp");
                java.lang.String str3 = "native_drama_init_position";
                int intExtra = pVar.getIntent().getIntExtra("native_drama_init_position", 0);
                java.lang.String str4 = "native_drama_enter_promotion_comment_scene";
                int intExtra2 = pVar.getIntent().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
                java.util.LinkedList list = ((r45.v81) resp).getList(2);
                pVar.f105177z = list;
                if (list != null) {
                    int i19 = 0;
                    for (java.lang.Object obj2 : list) {
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.pj2 pj2Var = (r45.pj2) obj2;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        r45.ft4 ft4Var = (r45.ft4) pj2Var.getCustom(i18);
                        sb6.append(ft4Var != null ? ft4Var.getInteger(i18) : i18);
                        sb6.append('-');
                        r45.ft4 ft4Var2 = (r45.ft4) pj2Var.getCustom(i18);
                        sb6.append(ft4Var2 != null ? ft4Var2.getInteger(1) : 0);
                        com.tencent.mm.plugin.finder.drama.detail.j jVar = new com.tencent.mm.plugin.finder.drama.detail.j(pVar, sb6.toString());
                        com.tencent.mm.plugin.finder.drama.detail.FinderNativeDramaDetailEpisodeFragment finderNativeDramaDetailEpisodeFragment = new com.tencent.mm.plugin.finder.drama.detail.FinderNativeDramaDetailEpisodeFragment();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putLong("native_drama_id", qj2Var.getLong(0));
                        bundle.putLong("native_drama_object_id", this.f105168f);
                        bundle.putString("native_drama_object_dup_flag", this.f105169g);
                        bundle.putInt(str3, intExtra);
                        bundle.putLong("native_drama_enter_object_id", this.f105170h);
                        bundle.putInt(str4, intExtra2);
                        bundle.putString("native_drama_enter_dupflag", this.f105171i);
                        bundle.putByteArray("native_drama_range", pj2Var.toByteArray());
                        finderNativeDramaDetailEpisodeFragment.setArguments(bundle);
                        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.Q6(pVar, i19, jVar, finderNativeDramaDetailEpisodeFragment, false, 8, null);
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
                com.tencent.mm.plugin.finder.drama.detail.p pVar2 = pVar;
                java.util.LinkedList linkedList = pVar2.f105177z;
                if (linkedList == null || linkedList.isEmpty()) {
                    android.widget.FrameLayout frameLayout2 = pVar2.f105174w;
                    if (frameLayout2 == null) {
                        kotlin.jvm.internal.o.o(str6);
                        throw null;
                    }
                    frameLayout2.setVisibility(0);
                    android.view.View view = pVar2.f105175x;
                    if (view == null) {
                        kotlin.jvm.internal.o.o(str5);
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
                com.tencent.mm.plugin.finder.drama.detail.m mVar = new com.tencent.mm.plugin.finder.drama.detail.m(pVar, qj2Var);
                pVar.getClass();
                android.widget.FrameLayout frameLayout3 = pVar.f105174w;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.o.o("loadingLayout");
                    throw null;
                }
                frameLayout3.setVisibility(0);
                android.view.View view2 = pVar.f105175x;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("loadingView");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
                pVar.w7().setOnClickListener(new com.tencent.mm.plugin.finder.drama.detail.o(mVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
