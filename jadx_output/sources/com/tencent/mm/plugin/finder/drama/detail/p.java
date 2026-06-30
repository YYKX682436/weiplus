package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class p extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {
    public boolean A;

    /* renamed from: v, reason: collision with root package name */
    public r45.qj2 f105173v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f105174w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f105175x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f105176y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.LinkedList f105177z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.A = true;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void V6() {
        if (f7().isEmpty()) {
            com.tencent.mm.view.HardTouchableLayout h17 = c7().h();
            if (h17 == null) {
                return;
            }
            h17.setVisibility(8);
            return;
        }
        com.tencent.mm.view.HardTouchableLayout h18 = c7().h();
        if (h18 == null) {
            return;
        }
        h18.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new com.tencent.mm.plugin.finder.drama.detail.k(this);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.protobuf.f parseFrom = new r45.qj2().parseFrom(getIntent().getByteArrayExtra("native_drama_info"));
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNativeDramaInfo");
        this.f105173v = (r45.qj2) parseFrom;
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.f486087uk2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f105174w = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f105175x = findViewById2;
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f105176y = findViewById3;
        r45.qj2 qj2Var = this.f105173v;
        if (qj2Var != null) {
            x7(qj2Var);
        }
    }

    public final android.view.View w7() {
        android.view.View view = this.f105176y;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final void x7(r45.qj2 qj2Var) {
        android.widget.FrameLayout frameLayout = this.f105174w;
        java.lang.String str = null;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f105175x;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View w76 = w7();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(w76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        w76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(w76, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailTabUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        long longExtra = getIntent().getLongExtra("native_drama_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("native_drama_object_dup_flag");
        android.app.Activity context2 = getContext();
        com.tencent.mm.ui.vas.VASActivity vASActivity = context2 instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context2 : null;
        boolean z17 = (vASActivity != null ? vASActivity.getParentActivity() : null) instanceof com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI;
        long longExtra2 = getIntent().getLongExtra("native_drama_enter_object_id", 0L);
        int intExtra = getIntent().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
        java.lang.String stringExtra2 = getIntent().getStringExtra("native_drama_session_buffer");
        java.lang.String stringExtra3 = getIntent().getStringExtra("native_drama_enter_dupflag");
        if (z17 && intExtra != -1) {
            str = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra2, stringExtra3, intExtra);
        }
        km5.d T = pm0.v.T(new bq.s0(V6, qj2Var.getLong(0), longExtra, z17 ? longExtra2 : 0L, str, stringExtra2).l(), new com.tencent.mm.plugin.finder.drama.detail.n(this, qj2Var, longExtra, stringExtra, longExtra2, stringExtra3));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        T.f((com.tencent.mm.plugin.finder.ui.MMFinderUI) activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[LOOP:0: B:4:0x000c->B:15:0x0037, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[EDGE_INSN: B:16:0x003b->B:17:0x003b BREAK  A[LOOP:0: B:4:0x000c->B:15:0x0037], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y7(int r8) {
        /*
            r7 = this;
            java.util.LinkedList r0 = r7.f105177z
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            java.util.Iterator r0 = r0.iterator()
            r4 = r3
        Lc:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L3a
            java.lang.Object r5 = r0.next()
            r45.pj2 r5 = (r45.pj2) r5
            com.tencent.mm.protobuf.f r5 = r5.getCustom(r3)
            r45.ft4 r5 = (r45.ft4) r5
            if (r5 == 0) goto L33
            int r6 = r5.getInteger(r3)
            int r5 = r5.getInteger(r2)
            if (r8 > r5) goto L2e
            if (r6 > r8) goto L2e
            r5 = r2
            goto L2f
        L2e:
            r5 = r3
        L2f:
            if (r5 == 0) goto L33
            r5 = r2
            goto L34
        L33:
            r5 = r3
        L34:
            if (r5 == 0) goto L37
            goto L3b
        L37:
            int r4 = r4 + 1
            goto Lc
        L3a:
            r4 = r1
        L3b:
            r7.A = r2
            r5 = 0
            if (r4 != r1) goto L4a
            com.tencent.mm.plugin.finder.viewmodel.component.e80 r0 = new com.tencent.mm.plugin.finder.viewmodel.component.e80
            r0.<init>(r7, r3, r3)
            pm0.v.V(r5, r0)
            goto L52
        L4a:
            com.tencent.mm.plugin.finder.viewmodel.component.e80 r0 = new com.tencent.mm.plugin.finder.viewmodel.component.e80
            r0.<init>(r7, r4, r3)
            pm0.v.V(r5, r0)
        L52:
            java.util.List r0 = r7.Y6()
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r1 = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) r1
            java.lang.String r2 = "fragment"
            kotlin.jvm.internal.o.g(r1, r2)
            pf5.z r2 = pf5.z.f353948a
            pf5.v r1 = r2.b(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.drama.detail.c> r2 = com.tencent.mm.plugin.finder.drama.detail.c.class
            pf5.b0 r1 = r1.e(r2)
            com.tencent.mm.plugin.finder.drama.detail.c r1 = (com.tencent.mm.plugin.finder.drama.detail.c) r1
            if (r1 == 0) goto L5a
            r1.f105133f = r8
            androidx.recyclerview.widget.RecyclerView r1 = r1.f105131d
            if (r1 == 0) goto L5a
            androidx.recyclerview.widget.f2 r1 = r1.getAdapter()
            if (r1 == 0) goto L5a
            r1.notifyDataSetChanged()
            goto L5a
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.drama.detail.p.y7(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.A = true;
    }
}
