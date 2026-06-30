package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class n2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f190075d;

    /* renamed from: e, reason: collision with root package name */
    public int f190076e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny f190077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190078g;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        this.f190078g = a7Var;
        android.content.Context context = a7Var.f187740d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        } else {
            nyVar = null;
        }
        this.f190077f = nyVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        yw2.a0 a0Var;
        com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 m61894x14cd10dd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$CommentScrollReportListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190078g;
        if (i17 == 1 && this.f190075d != 1) {
            yw2.a0 a0Var2 = a7Var.f187749o;
            if (((a0Var2 == null || (m61894x14cd10dd = a0Var2.n().m61894x14cd10dd()) == null || m61894x14cd10dd.getVisibility() != 0) ? false : true) && (a0Var = a7Var.f187749o) != null) {
                a0Var.n().s(true);
            }
        }
        if (i17 != 1 && this.f190075d == 1 && this.f190076e > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            long j17 = a7Var.f187754r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = this.f190077f;
            java.lang.String str = nyVar != null ? nyVar.f216918q : null;
            java.lang.String str2 = nyVar != null ? nyVar.f216915p : null;
            java.lang.String str3 = nyVar != null ? nyVar.f216919r : null;
            int i18 = nyVar != null ? nyVar.f216913n : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a = a7Var.L;
            int i19 = c15268x6a41bd8a != null ? c15268x6a41bd8a.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0;
            o3Var.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6378x2b9e1c98 c6378x2b9e1c98 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6378x2b9e1c98();
            if (str == null) {
                str = "";
            }
            c6378x2b9e1c98.f137238d = c6378x2b9e1c98.b("SessionId", str, true);
            if (str2 == null) {
                str2 = "";
            }
            c6378x2b9e1c98.f137239e = c6378x2b9e1c98.b("ContextId", str2, true);
            if (str3 == null) {
                str3 = "";
            }
            c6378x2b9e1c98.f137240f = c6378x2b9e1c98.b("ClickTabContextId", str3, true);
            c6378x2b9e1c98.f137241g = i18;
            c6378x2b9e1c98.f137245k = o3Var.tk(i19);
            c6378x2b9e1c98.f137248n = c6378x2b9e1c98.b("enterSessionID", java.lang.String.valueOf(j17), true);
            c6378x2b9e1c98.f137250p = 1L;
            c6378x2b9e1c98.k();
            o3Var.Zk(c6378x2b9e1c98);
        }
        if (a7Var.R && this.f190075d != i17 && i17 != 2) {
            java.util.Collection values = a7Var.Q.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : values) {
                so2.y0 y0Var = (so2.y0) obj;
                boolean p17 = y0Var.p(a7Var.n0());
                if (p17) {
                    y0Var.f492242m = 1;
                    y0Var.f492243n = 2;
                }
                if (p17) {
                    arrayList2.add(obj);
                }
            }
            android.content.Context context = a7Var.f187740d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class)).R6(arrayList2);
        }
        this.f190075d = i17;
        if (i17 == 0) {
            this.f190076e = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$CommentScrollReportListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$CommentScrollReportListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f190076e += i18;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$CommentScrollReportListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
