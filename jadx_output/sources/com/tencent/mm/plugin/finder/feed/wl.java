package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wl extends com.tencent.mm.plugin.finder.feed.a1 {
    public final int A;
    public final r45.gk4 B;
    public android.view.View C;
    public com.tencent.mm.plugin.finder.profile.filter.q D;
    public final int E;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f110996u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f110997v;

    /* renamed from: w, reason: collision with root package name */
    public final int f110998w;

    /* renamed from: x, reason: collision with root package name */
    public final int f110999x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f111000y;

    /* renamed from: z, reason: collision with root package name */
    public final int f111001z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wl(com.tencent.mm.ui.MMActivity r14, int r15, int r16, boolean r17, java.lang.String r18, java.lang.String r19, int r20, int r21, java.lang.String r22, int r23, int r24, r45.gk4 r25, int r26, kotlin.jvm.internal.i r27) {
        /*
            r13 = this;
            r9 = r13
            r10 = r18
            r11 = r19
            r12 = r22
            r0 = r26 & 8
            if (r0 == 0) goto Le
            r0 = 0
            r4 = r0
            goto L10
        Le:
            r4 = r17
        L10:
            java.lang.String r0 = "context"
            r1 = r14
            kotlin.jvm.internal.o.g(r14, r0)
            java.lang.String r0 = "finderAuthorUsername"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "finderMemberTicket"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "memberTitle"
            kotlin.jvm.internal.o.g(r12, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r13
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f110996u = r10
            r9.f110997v = r11
            r0 = r20
            r9.f110998w = r0
            r0 = r21
            r9.f110999x = r0
            r9.f111000y = r12
            r0 = r23
            r9.f111001z = r0
            r0 = r24
            r9.A = r0
            r0 = r25
            r9.B = r0
            r0 = 10000002(0x989682, float:1.4012987E-38)
            r9.E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.wl.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, r45.gk4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void J(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = holder.getItemViewType() == this.E;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(z().f107156e, intent, a07, null, 4, null);
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f444181d, getRecyclerView(), ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId(), z().f107156e.getDataListJustForAdapter(), null, 8, null), 14, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i0Var.Tj(context, intent, this.f110996u, this.f110997v, this.f110998w, this.f110999x, this.f111000y, java.lang.Integer.valueOf(this.f111001z), java.lang.Integer.valueOf(this.A), 0, 0);
            com.tencent.mm.ui.MMActivity activity = this.f106174d;
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            long itemId = j5Var.getItemId();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            java.lang.String w17 = baseFinderFeed.w();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f106180m.getRecyclerView();
            java.lang.String jSONObject = baseFinderFeed.getUdfKv().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, itemId, w17, recyclerView, 0, r26.i0.t(jSONObject, ",", ";", false), i17, null, 144, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void r(java.util.ArrayList data) {
        android.view.View m17;
        kotlin.jvm.internal.o.g(data, "data");
        super.r(data);
        r45.gk4 gk4Var = this.B;
        if (gk4Var != null) {
            this.D = new com.tencent.mm.plugin.finder.profile.filter.b(this.f106174d, new com.tencent.mm.plugin.finder.profile.filter.g(gk4Var), this.f110996u);
        }
        com.tencent.mm.plugin.finder.profile.filter.q qVar = this.D;
        if ((qVar != null ? qVar.getView() : null) == null) {
            com.tencent.mm.plugin.finder.profile.filter.q qVar2 = this.D;
            if (qVar2 != null && qVar2.hasData()) {
                androidx.recyclerview.widget.f2 adapter = getRecyclerView().getAdapter();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                if (wxRecyclerAdapter == null || ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                    return;
                }
                com.tencent.mm.plugin.finder.profile.filter.q qVar3 = this.D;
                if (qVar3 != null && (m17 = com.tencent.mm.plugin.finder.profile.filter.q.m(qVar3, 0, 1, null)) != null) {
                    in5.n0.U(wxRecyclerAdapter, m17, this.E, false, 4, null);
                }
                com.tencent.mm.plugin.finder.profile.filter.q qVar4 = this.D;
                if (qVar4 != null) {
                    qVar4.l();
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        android.view.View view = this.C;
        return view == null ? this.f106174d.findViewById(com.tencent.mm.R.id.f484229dg3) : view;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        ((com.tencent.mm.plugin.finder.storage.jj0) this.f106184q).getClass();
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f106184q.d(context);
    }
}
