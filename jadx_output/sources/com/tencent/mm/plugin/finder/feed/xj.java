package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xj {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f111072a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.tl f111073b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout f111074c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f111075d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f111076e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.x2 f111077f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f111078g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f111079h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f111080i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f111081j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.hj f111082k;

    /* renamed from: l, reason: collision with root package name */
    public qr2.a f111083l;

    public xj(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.tl presenter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f111072a = context;
        this.f111073b = presenter;
        android.view.View findViewById = context.findViewById(com.tencent.mm.R.id.lr8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        this.f111074c = finderRefreshLayout;
        android.view.View findViewById2 = context.findViewById(com.tencent.mm.R.id.f486458la3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111075d = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2;
        this.f111077f = new so2.x2();
        this.f111078g = jz5.h.b(new com.tencent.mm.plugin.finder.feed.kj(this));
        this.f111079h = jz5.h.b(new com.tencent.mm.plugin.finder.feed.lj(this));
        this.f111082k = new com.tencent.mm.plugin.finder.feed.hj(this, finderRefreshLayout);
    }

    public final void a() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f111072a;
        android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.iql);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.ipw);
            kotlin.jvm.internal.o.d(findViewById2);
            layoutParams2.topMargin = pm0.v.t(findViewById2)[1] + findViewById2.getHeight();
        }
        android.view.View findViewById3 = mMActivity.findViewById(com.tencent.mm.R.id.iql);
        if (findViewById3 != null) {
            findViewById3.requestLayout();
        }
    }

    public final void b(android.widget.TextView textView, int i17, so2.u1 u1Var, android.content.Context context, yz5.a aVar, boolean z17) {
        r45.rz0 rz0Var;
        if (this.f111081j) {
            return;
        }
        int i18 = 0;
        if (i17 <= 0) {
            if (z17) {
                this.f111080i = false;
                aVar.invoke();
                return;
            }
            return;
        }
        r45.dm2 object_extend = u1Var.getFeedObject().getFinderObject().getObject_extend();
        if (object_extend != null && (rz0Var = (r45.rz0) object_extend.getCustom(38)) != null) {
            i18 = rz0Var.getInteger(0);
        }
        java.lang.String string = i18 != 1 ? i18 != 2 ? context.getResources().getString(com.tencent.mm.R.string.m2q, java.lang.Integer.valueOf(i17)) : context.getResources().getString(com.tencent.mm.R.string.m2r, java.lang.Integer.valueOf(i17)) : context.getResources().getString(com.tencent.mm.R.string.m2p, java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.d(string);
        textView.setText(string);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.feed.jj jjVar = new com.tencent.mm.plugin.finder.feed.jj(this, textView, i17, u1Var, context, aVar, z17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(jjVar, 1000L, "MicroMsg.FinderLongVideoRelViewCallback");
    }

    public final void c(qr2.a aVar) {
        if (aVar != null) {
            qr2.a aVar2 = this.f111083l;
            if (aVar2 != null) {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f111076e;
                if (wxRecyclerAdapter == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                wxRecyclerAdapter.i0(aVar2.getItemId(), false);
                this.f111083l = null;
            }
            this.f111083l = aVar;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f111076e;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            if (wxRecyclerAdapter2.getData().size() > 0) {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f111076e;
                if (wxRecyclerAdapter3 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                if (wxRecyclerAdapter3.W(aVar)) {
                    return;
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = this.f111076e;
                if (wxRecyclerAdapter4 != null) {
                    wxRecyclerAdapter4.R(aVar, false, 0);
                } else {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r6 = this;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r6.f111076e
            java.lang.String r1 = "adapter"
            r2 = 0
            if (r0 == 0) goto L57
            java.util.List r0 = r0.getData()
            int r0 = r0.size()
            if (r0 <= 0) goto L56
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r6.f111076e
            if (r0 == 0) goto L52
            so2.x2 r3 = r6.f111077f
            boolean r0 = r0.W(r3)
            if (r0 != 0) goto L56
            qr2.a r0 = r6.f111083l
            r4 = 0
            if (r0 == 0) goto L43
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = r6.f111076e
            if (r5 == 0) goto L3f
            boolean r5 = r5.W(r0)
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 == 0) goto L43
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r6.f111076e
            if (r0 == 0) goto L3b
            r5 = 1
            r0.R(r3, r4, r5)
            jz5.f0 r0 = jz5.f0.f302826a
            goto L44
        L3b:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        L3f:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        L43:
            r0 = r2
        L44:
            if (r0 != 0) goto L56
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r6.f111076e
            if (r0 == 0) goto L4e
            r0.Q(r3, r4)
            goto L56
        L4e:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        L52:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        L56:
            return
        L57:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.xj.d():void");
    }

    public final android.view.View e() {
        java.lang.Object value = ((jz5.n) this.f111078g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void f(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f111076e;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemChanged(i17 + wxRecyclerAdapter.a0());
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    public final void g(boolean z17) {
        android.view.View findViewById = this.f111072a.findViewById(com.tencent.mm.R.id.iql);
        if (findViewById != null) {
            findViewById.post(new com.tencent.mm.plugin.finder.feed.qj(this));
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
