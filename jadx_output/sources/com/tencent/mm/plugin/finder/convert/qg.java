package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qg extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.pz f104380e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.xh f104381f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.js f104382g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.x4 f104383h;

    /* renamed from: i, reason: collision with root package name */
    public in5.s0 f104384i;

    /* renamed from: m, reason: collision with root package name */
    public in5.s0 f104385m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f104386n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f104387o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderHomeTabMoreInterestDividerBubbleView f104388p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView f104389q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView f104390r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.hb f104391s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f104392t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderPostRemindLayout f104393u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f104394v;

    public qg(com.tencent.mm.plugin.finder.feed.pz presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f104380e = presenter;
        this.f104381f = new com.tencent.mm.plugin.finder.convert.xh();
        this.f104382g = new com.tencent.mm.plugin.finder.convert.js();
        this.f104383h = new com.tencent.mm.plugin.finder.convert.x4();
        this.f104387o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f104394v = jz5.h.b(com.tencent.mm.plugin.finder.convert.pg.f104262d);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487838h;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        this.f104382g.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a17 = ym5.x.a(recyclerView.getContext(), 6.0f);
        android.content.Context context = holder.f293121e;
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(context);
        com.tencent.mm.plugin.finder.convert.xh xhVar = this.f104381f;
        xhVar.getClass();
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.f487840j, (android.view.ViewGroup) view, false);
        android.view.LayoutInflater b18 = com.tencent.mm.ui.id.b(context);
        com.tencent.mm.plugin.finder.convert.js jsVar = this.f104382g;
        jsVar.getClass();
        android.view.View view2 = holder.itemView;
        kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View inflate2 = b18.inflate(com.tencent.mm.R.layout.f487841k, (android.view.ViewGroup) view2, false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.jto);
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = a17;
            layoutParams2.bottomMargin = a17;
            findViewById.setBackgroundResource(com.tencent.mm.R.drawable.f481491ue);
        }
        android.view.View findViewById2 = inflate2.findViewById(com.tencent.mm.R.id.jto);
        if (findViewById2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = a17;
            layoutParams4.bottomMargin = a17;
            findViewById2.setBackgroundResource(com.tencent.mm.R.drawable.f481491ue);
        }
        android.view.View view3 = holder.itemView;
        kotlin.jvm.internal.o.e(view3, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) view3).addView(inflate);
        android.view.View view4 = holder.itemView;
        kotlin.jvm.internal.o.e(view4, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) view4).addView(inflate2);
        if (this.f104380e.f108762p == 4) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            if (this.f104390r == null) {
                android.view.ViewParent parent = mMActivity.findViewById(com.tencent.mm.R.id.f487570p16).getParent();
                android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
                if (frameLayout != null) {
                    com.tencent.mm.ui.MMActivity mMActivity2 = context instanceof com.tencent.mm.ui.MMActivity ? mMActivity : null;
                    if (mMActivity2 != null) {
                        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.f105399x, mMActivity2, q(1, mMActivity2));
                        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.f105397w, mMActivity2, q(3, mMActivity2));
                        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.B, mMActivity2, q(35, mMActivity2));
                    }
                    com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = new com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView(mMActivity);
                    android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams5.gravity = 49;
                    finderHomeTabRedDotTipsBubbleView.setLayoutParams(layoutParams5);
                    frameLayout.addView(finderHomeTabRedDotTipsBubbleView);
                    finderHomeTabRedDotTipsBubbleView.setVisibilityListener(new com.tencent.mm.plugin.finder.convert.bg(finderHomeTabRedDotTipsBubbleView, this, holder));
                    finderHomeTabRedDotTipsBubbleView.a(false);
                    r(holder, false, false);
                    this.f104390r = finderHomeTabRedDotTipsBubbleView;
                }
            }
            recyclerView.i(new com.tencent.mm.plugin.finder.convert.jg(recyclerView, holder, this));
        }
        in5.s0 s0Var = new in5.s0(inflate);
        s0Var.f293126m = recyclerView;
        this.f104384i = s0Var;
        in5.s0 s0Var2 = new in5.s0(inflate2);
        s0Var2.f293126m = recyclerView;
        this.f104385m = s0Var2;
        in5.s0 s0Var3 = this.f104384i;
        if (s0Var3 == null) {
            kotlin.jvm.internal.o.o("feedMsgNotifyHolder");
            throw null;
        }
        xhVar.i(recyclerView, s0Var3, -5);
        in5.s0 s0Var4 = this.f104385m;
        if (s0Var4 != null) {
            jsVar.i(recyclerView, s0Var4, -6);
        } else {
            kotlin.jvm.internal.o.o("privateMsgNotifyHolder");
            throw null;
        }
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        this.f104387o.removeCallbacksAndMessages(null);
        this.f104382g.j(recyclerView);
    }

    public final boolean n() {
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f104390r;
        if (finderHomeTabRedDotTipsBubbleView != null && finderHomeTabRedDotTipsBubbleView.getVisibility() == 0) {
            return true;
        }
        com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView = this.f104392t;
        if (finderPopupBubbleView != null && finderPopupBubbleView.getVisibility() == 0) {
            return true;
        }
        com.tencent.mm.plugin.finder.view.FinderHomeTabMoreInterestDividerBubbleView finderHomeTabMoreInterestDividerBubbleView = this.f104388p;
        if (finderHomeTabMoreInterestDividerBubbleView != null && finderHomeTabMoreInterestDividerBubbleView.getVisibility() == 0) {
            return true;
        }
        com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView finderHomeTabFeedBackBubbleView = this.f104389q;
        return finderHomeTabFeedBackBubbleView != null && finderHomeTabFeedBackBubbleView.getVisibility() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04e8  */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object] */
    @Override // in5.r
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r33, so2.a2 r34, int r35, int r36, boolean r37, java.util.List r38) {
        /*
            Method dump skipped, instructions count: 1507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qg.h(in5.s0, so2.a2, int, int, boolean, java.util.List):void");
    }

    public final void p(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView, so2.a2 a2Var, lx2.d dVar) {
        pm0.v.a(finderHomeTabRedDotTipsBubbleView, new com.tencent.mm.plugin.finder.convert.mg(finderHomeTabRedDotTipsBubbleView, dVar, a2Var, this));
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.S7).getValue()).r()).booleanValue()) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postAtFrontOfQueue(new com.tencent.mm.plugin.finder.convert.ng(finderHomeTabRedDotTipsBubbleView));
        }
    }

    public final androidx.lifecycle.k0 q(int i17, com.tencent.mm.ui.MMActivity mMActivity) {
        return new com.tencent.mm.plugin.finder.convert.og(this, i17, new kotlin.jvm.internal.c0(), mMActivity, new kotlin.jvm.internal.h0());
    }

    public final void r(in5.s0 s0Var, boolean z17, boolean z18) {
        android.view.View view = s0Var.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            viewGroup.getChildAt(i17).animate().cancel();
            if (z18) {
                if (!z17) {
                    viewGroup.animate().alpha(0.0f).setDuration(260L).start();
                } else if (viewGroup.getAlpha() < 1.0f) {
                    viewGroup.animate().alpha(1.0f).setDuration(260L).start();
                }
            } else if (z17) {
                viewGroup.setAlpha(1.0f);
            } else {
                viewGroup.setAlpha(0.0f);
            }
        }
    }
}
