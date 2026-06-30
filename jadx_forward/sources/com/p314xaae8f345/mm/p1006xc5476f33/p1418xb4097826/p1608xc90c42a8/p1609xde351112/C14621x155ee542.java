package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract;", "", "()V", "CloseDrawerCallback", "NPresenter", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract */
/* loaded from: classes6.dex */
public final class C14621x155ee542 {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$CloseDrawerCallback;", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback */
    /* loaded from: classes6.dex */
    public interface CloseDrawerCallback {

        @p3321xbce91901.InterfaceC29042xe907df4f(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback$DefaultImpls */
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
        }

        void a(int i17, java.util.List list, boolean z17);
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;", "Lfs2/a;", "Lyw2/a0;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter */
    /* loaded from: classes10.dex */
    public interface NPresenter extends fs2.a {

        @p3321xbce91901.InterfaceC29042xe907df4f(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter$DefaultImpls */
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
        }

        static /* synthetic */ void L(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter, android.content.Context context, so2.y0 y0Var, int i17, zy2.gc gcVar, int i18, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modComment");
            }
            if ((i18 & 8) != 0) {
                gcVar = null;
            }
            nPresenter.b0(context, y0Var, i17, gcVar);
        }

        void B0(boolean z17);

        void E(android.view.View view, int i17);

        void H(android.view.View view, so2.y0 y0Var);

        boolean J(so2.y0 y0Var, boolean z17);

        void K(int i17);

        so2.y0 N(long j17);

        boolean O(int i17);

        void R(android.widget.ImageView imageView, int i17);

        int S();

        void T();

        void U(so2.y0 y0Var, int i17, zy2.gc gcVar);

        int W();

        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a(android.content.Context context);

        java.lang.String a0();

        p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 b(android.content.Context context);

        void b0(android.content.Context context, so2.y0 y0Var, int i17, zy2.gc gcVar);

        boolean c0();

        void d(int i17);

        void e(android.view.View view, so2.y0 y0Var);

        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f0();

        void g0(long j17);

        /* renamed from: getCommentScene */
        int mo56026x8fadefe3();

        boolean h0();

        kw2.c j();

        int k();

        int k0();

        void l(so2.y0 y0Var, boolean z17);

        boolean l0();

        void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, so2.y0 y0Var);

        void o(so2.y0 y0Var, int i17);

        void q0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a, yw2.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback closeDrawerCallback, int i17, boolean z17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, boolean z18, boolean z19, long j18, boolean z27, boolean z28, boolean z29, int i18);

        boolean r();

        void r0(so2.y0 y0Var);

        void t(int i17);

        boolean t0();

        void u(android.view.View view, so2.y0 y0Var);

        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 v0();

        java.util.HashSet w();

        boolean x();

        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 z0();
    }
}
