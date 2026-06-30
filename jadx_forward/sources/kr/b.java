package kr;

/* loaded from: classes15.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022 f392823d;

    public b(com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022 c10439xce021022) {
        this.f392823d = c10439xce021022;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            if (this.f392823d.mo7946xf939df19() instanceof a85.a) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f392823d.mo7946xf939df19();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                ((a85.a) mo7946xf939df19).f83918p = true;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f392823d.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager).w();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = this.f392823d.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int y17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager2).y();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i18 = 0;
            for (int i19 = w17; i19 <= y17; i19++) {
                if (i19 >= 1 && (this.f392823d.mo7946xf939df19() instanceof a85.a)) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = this.f392823d.mo7946xf939df19();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df192, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                    if (((a85.a) mo7946xf939df192).y(i19) instanceof ir.g) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193 = this.f392823d.mo7946xf939df19();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df193, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                        ir.u0 y18 = ((a85.a) mo7946xf939df193).y(i19);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(y18, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiItem");
                        arrayList2.add(((ir.g) y18).f375369b);
                    }
                }
                if (this.f392823d.p0(i19) instanceof lr.y0) {
                    i18++;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = this.f392823d.p0(i19);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p07, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.SimilarEmojiNormalViewHolder");
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                    t0Var.getClass();
                    t0Var.z(new kr.a((lr.y0) p07), i18 / 2, false);
                }
            }
            if (this.f392823d.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 1) {
                if (w17 != 0) {
                    w17--;
                }
                ((ku5.t0) ku5.t0.f394148d).g(new z75.b(w17 + arrayList2.size(), arrayList2));
            }
        } else if ((i17 == 1 || i17 == 2) && (this.f392823d.mo7946xf939df19() instanceof a85.a)) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df194 = this.f392823d.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df194, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
            if (((a85.a) mo7946xf939df194).f83918p) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df195 = this.f392823d.mo7946xf939df19();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df195, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                ((a85.a) mo7946xf939df195).f83918p = false;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager3 = this.f392823d.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager4 = this.f392823d.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager4, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                int y19 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager4).y();
                for (int w18 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager3).w(); w18 <= y19; w18++) {
                    if (this.f392823d.p0(w18) instanceof lr.y0) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = this.f392823d.p0(w18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p08, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.SimilarEmojiNormalViewHolder");
                        ((lr.y0) p08).f402147g.m64932x65825f6();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        yz5.a loadMoreCall;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
        int m8008x3d79f549 = c1161x57298f5d != null ? c1161x57298f5d.m8008x3d79f549() : 0;
        int m8020x7e414b06 = c1161x57298f5d != null ? c1161x57298f5d.m8020x7e414b06() : 0;
        int w17 = c1161x57298f5d != null ? c1161x57298f5d.w() : 0;
        if (m8008x3d79f549 + w17 >= m8020x7e414b06 && w17 >= 0 && (loadMoreCall = this.f392823d.getLoadMoreCall()) != null) {
            loadMoreCall.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
