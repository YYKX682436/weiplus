package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851;

/* loaded from: classes2.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 {
    public boolean A;

    /* renamed from: v, reason: collision with root package name */
    public r45.qj2 f186706v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f186707w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f186708x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f186709y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.LinkedList f186710z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.A = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void V6() {
        if (f7().isEmpty()) {
            com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h17 = c7().h();
            if (h17 == null) {
                return;
            }
            h17.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h18 = c7().h();
        if (h18 == null) {
            return;
        }
        h18.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.k(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.qj2().mo11468x92b714fd(m158359x1e885992().getByteArrayExtra("native_drama_info"));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNativeDramaInfo");
        this.f186706v = (r45.qj2) mo11468x92b714fd;
        android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f567620uk2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f186707w = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.oai);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f186708x = findViewById2;
        android.view.View findViewById3 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.oav);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f186709y = findViewById3;
        r45.qj2 qj2Var = this.f186706v;
        if (qj2Var != null) {
            x7(qj2Var);
        }
    }

    public final android.view.View w7() {
        android.view.View view = this.f186709y;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
        throw null;
    }

    public final void x7(r45.qj2 qj2Var) {
        android.widget.FrameLayout frameLayout = this.f186707w;
        java.lang.String str = null;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f186708x;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        long longExtra = m158359x1e885992().getLongExtra("native_drama_object_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("native_drama_object_dup_flag");
        android.app.Activity m80379x76847179 = m80379x76847179();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m80379x76847179 : null;
        boolean z17 = (abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81193x1252e2cf() : null) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f;
        long longExtra2 = m158359x1e885992().getLongExtra("native_drama_enter_object_id", 0L);
        int intExtra = m158359x1e885992().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("native_drama_session_buffer");
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("native_drama_enter_dupflag");
        if (z17 && intExtra != -1) {
            str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(longExtra2, stringExtra3, intExtra);
        }
        km5.d T = pm0.v.T(new bq.s0(V6, qj2Var.m75942xfb822ef2(0), longExtra, z17 ? longExtra2 : 0L, str, stringExtra2).l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.n(this, qj2Var, longExtra, stringExtra, longExtra2, stringExtra3));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        T.f((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085);
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
            java.util.LinkedList r0 = r7.f186710z
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
            com.tencent.mm.protobuf.f r5 = r5.m75936x14adae67(r3)
            r45.ft4 r5 = (r45.ft4) r5
            if (r5 == 0) goto L33
            int r6 = r5.m75939xb282bd08(r3)
            int r5 = r5.m75939xb282bd08(r2)
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
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) r1
            java.lang.String r2 = "fragment"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            pf5.z r2 = pf5.z.f435481a
            pf5.v r1 = r2.b(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.drama.detail.c> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.c.class
            pf5.b0 r1 = r1.e(r2)
            com.tencent.mm.plugin.finder.drama.detail.c r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.c) r1
            if (r1 == 0) goto L5a
            r1.f186666f = r8
            androidx.recyclerview.widget.RecyclerView r1 = r1.f186664d
            if (r1 == 0) goto L5a
            androidx.recyclerview.widget.f2 r1 = r1.mo7946xf939df19()
            if (r1 == 0) goto L5a
            r1.m8146xced61ae5()
            goto L5a
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.p.y7(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.A = true;
    }
}
