package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xa extends com.tencent.mm.plugin.finder.feed.a1 implements ym5.l1 {
    public final jz5.g A;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f111049u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f111050v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f111051w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f111052x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f111053y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f111054z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(com.tencent.mm.ui.MMActivity context, int i17, int i18, android.view.View parent, androidx.fragment.app.Fragment fragment) {
        super(context, 0, i17, false, i18, false, 32, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f111049u = parent;
        this.f111050v = fragment;
        tu2.b bVar = new tu2.b();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        bVar.f422133c = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127789ka).getValue()).r()).intValue() == 0;
        bVar.f422131a = false;
        jz5.g b17 = jz5.h.b(new com.tencent.mm.plugin.finder.feed.wa(i17, i18));
        this.f111051w = b17;
        this.f111052x = new com.tencent.mm.plugin.finder.storage.f80(context, bVar, i17, (cw2.f8) ((jz5.n) b17).getValue());
        this.f111053y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ua(context));
        this.f111054z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.pa(context));
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.va(context));
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View A() {
        return this.f111049u;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public float F() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Pa).getValue()).r()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026f  */
    @Override // com.tencent.mm.plugin.finder.feed.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(androidx.recyclerview.widget.f2 r44, android.view.View r45, int r46) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.xa.K(androidx.recyclerview.widget.f2, android.view.View, int):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean Q(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return holder.getItemViewType() == -7 || holder.getItemViewType() == -1;
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
        com.tencent.mars.xlog.Log.i("FinderFollowFeedUIContract.ViewCallback", "[onOverStop]");
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public com.tencent.mm.plugin.finder.storage.vj0 q() {
        return this.f111052x;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void r(java.util.ArrayList data) {
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar;
        kotlin.jvm.internal.o.g(data, "data");
        super.r(data);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f106180m;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.d0x, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout.setRefreshHeaderView(inflate);
        int dimension = (int) this.f111049u.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi);
        int floatValue = (int) ((java.lang.Number) ((jz5.n) this.A).getValue()).floatValue();
        this.f106180m.setLimitTopRequest(dimension - floatValue);
        this.f106180m.setRefreshTargetY(floatValue - dimension);
        this.f106180m.setDamping(1.7f);
        cw2.f8 f8Var = (cw2.f8) ((jz5.n) this.f111051w).getValue();
        if (f8Var != null) {
            f8Var.J0(mMActivity, null, new com.tencent.mm.plugin.finder.feed.sa(this), true);
        }
        android.view.View l17 = l(com.tencent.mm.R.id.m6h);
        android.view.ViewGroup.LayoutParams layoutParams = l17 != null ? l17.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = ((java.lang.Number) ((jz5.n) this.f111053y).getValue()).intValue() + ((java.lang.Number) ((jz5.n) this.f111054z).getValue()).intValue();
        }
        int color = mMActivity.getResources().getColor(com.tencent.mm.R.color.f478512u);
        android.view.View l18 = l(com.tencent.mm.R.id.nuv);
        if (l18 != null) {
            l18.setBackgroundColor(color);
        }
        android.view.View l19 = l(com.tencent.mm.R.id.ghf);
        if (l19 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(l19, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(l19, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View f213435x = this.f106180m.getF213435x();
        if (f213435x == null || (mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) f213435x.findViewById(com.tencent.mm.R.id.m6l)) == null) {
            return;
        }
        mMProcessBar.setBackgroundResource(com.tencent.mm.R.drawable.avk);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        return new com.tencent.mm.plugin.finder.feed.ra();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f111052x.d(context);
    }
}
