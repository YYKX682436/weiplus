package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract */
/* loaded from: classes3.dex */
public final class C14617x82f7e804 {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$Presenter */
    /* loaded from: classes3.dex */
    public static abstract class Presenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f204084d;

        /* renamed from: e, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f204085e;

        /* renamed from: f, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback f204086f;

        /* renamed from: g, reason: collision with root package name */
        public final ym5.q1 f204087g;

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$Presenter$Companion */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
                this();
            }
        }

        static {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.Companion(null);
        }

        public Presenter(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 loader) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
            this.f204084d = loader;
            this.f204087g = new ym5.q1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.1
                @Override // ym5.m1
                /* renamed from: onChanged */
                public void mo56048x7bb163d5() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().mo56048x7bb163d5();
                    }
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeChanged */
                public void mo56049xa44dd169(int i17, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter presenter = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = presenter.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().mo56049xa44dd169(i17 + presenter.f().a0(), i18);
                    }
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeInserted */
                public void mo56051xb0566d03(int i17, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter presenter = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = presenter.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().mo56051xb0566d03(i17 + presenter.f().a0(), i18);
                    }
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeMoved */
                public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter presenter = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = presenter.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().mo56052x5e3cd6a8(i17 + presenter.f().a0(), i18 + presenter.f().a0(), i19);
                    }
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeRemoved */
                public void mo56053xb9568715(int i17, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter presenter = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = presenter.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().mo56053xb9568715(i17 + presenter.f().a0(), i18);
                    }
                }

                @Override // ym5.p1
                /* renamed from: onPreFinishLoadMore */
                public void mo15403x2053b072(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().O(reason);
                    }
                }

                @Override // ym5.p1
                /* renamed from: onPreFinishLoadMoreSmooth */
                public void mo56054xc12c74c0(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().mo56054xc12c74c0(reason);
                    }
                }

                @Override // ym5.p1
                /* renamed from: onPreFinishRefresh */
                public void mo15404x8041b4e4(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().Q(reason);
                    }
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeChanged */
                public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter presenter = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = presenter.f204086f;
                    if (viewCallback != null) {
                        viewCallback.a().mo56050xa44dd169(i17 + presenter.f().a0(), i18, obj);
                    }
                }
            };
        }

        public abstract com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c();

        public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f() {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f204085e;
            if (c22848x6ddd90cf != null) {
                return c22848x6ddd90cf;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }

        public void g(final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback callback) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c17 = c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "<set-?>");
            this.f204085e = c17;
            this.f204086f = callback;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = callback.f204089d;
            android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.m6e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            callback.f204091f = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
            callback.a().m82690xd3a27e96(false);
            final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = callback.a().m82555x4905e9fa();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(m82555x4905e9fa, "finder_live_lottery_record_view");
            m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf));
            m82555x4905e9fa.mo7960x6cab2c8d(callback.f204090e.f());
            callback.a().m82683xb165a19d(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback$initView$1
                @Override // ym5.q3
                public void b(int i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback.this.f204090e.f204084d, false, 1, null);
                }

                @Override // ym5.q3
                public void c(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback.this.f204090e.f204084d.mo56155xd210094c();
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                    m82555x4905e9fa.m7964x8d4ad49c(new uw2.n0());
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback.this;
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.u(viewCallback.a(), null, 1, null);
                    final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m82555x4905e9fa;
                    c1163xf1deaba4.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback$initView$1$onRefreshEnd$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.this.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
                        }
                    }, 1000L);
                    viewCallback.g(false);
                }
            });
            callback.g(true);
            pm0.v.V(300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14620xc5eb893d(callback));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(this.f204084d, this.f204087g, false, 2, null);
        }

        @Override // fs2.a
        /* renamed from: onDetach */
        public void mo979x3f5eee52() {
            this.f204084d.m56401x31d4943c(this.f204087g);
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback */
    /* loaded from: classes3.dex */
    public static class ViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204089d;

        /* renamed from: e, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter f204090e;

        /* renamed from: f, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f204091f;

        public ViewCallback(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter presenter, boolean z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
            this.f204089d = activity;
            this.f204090e = presenter;
        }

        public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 a() {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f204091f;
            if (c22801x87cbdc00 != null) {
                return c22801x87cbdc00;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }

        public final void g(boolean z17) {
            android.view.View findViewById = this.f204089d.findViewById(com.p314xaae8f345.mm.R.id.irl);
            if (findViewById == null) {
                return;
            }
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        @Override // fs2.c
        /* renamed from: getActivity */
        public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
            return this.f204089d;
        }
    }

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804();
    }

    private C14617x82f7e804() {
    }
}
