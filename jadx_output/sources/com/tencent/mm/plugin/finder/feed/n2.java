package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class n2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f108542d;

    /* renamed from: e, reason: collision with root package name */
    public int f108543e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.ny f108544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108545g;

    public n2(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        this.f108545g = a7Var;
        android.content.Context context = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        this.f108544f = nyVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        yw2.a0 a0Var;
        com.tencent.mm.api.SmileyPanel smileyPanel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$CommentScrollReportListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f108545g;
        if (i17 == 1 && this.f108542d != 1) {
            yw2.a0 a0Var2 = a7Var.f106216o;
            if (((a0Var2 == null || (smileyPanel = a0Var2.n().getSmileyPanel()) == null || smileyPanel.getVisibility() != 0) ? false : true) && (a0Var = a7Var.f106216o) != null) {
                a0Var.n().s(true);
            }
        }
        if (i17 != 1 && this.f108542d == 1 && this.f108543e > 0) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            long j17 = a7Var.f106221r;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = this.f108544f;
            java.lang.String str = nyVar != null ? nyVar.f135385q : null;
            java.lang.String str2 = nyVar != null ? nyVar.f135382p : null;
            java.lang.String str3 = nyVar != null ? nyVar.f135386r : null;
            int i18 = nyVar != null ? nyVar.f135380n : 0;
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = a7Var.L;
            int i19 = finderCommentDrawer != null ? finderCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0;
            o3Var.getClass();
            com.tencent.mm.autogen.mmdata.rpt.CommentExposeStruct commentExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.CommentExposeStruct();
            if (str == null) {
                str = "";
            }
            commentExposeStruct.f55705d = commentExposeStruct.b("SessionId", str, true);
            if (str2 == null) {
                str2 = "";
            }
            commentExposeStruct.f55706e = commentExposeStruct.b("ContextId", str2, true);
            if (str3 == null) {
                str3 = "";
            }
            commentExposeStruct.f55707f = commentExposeStruct.b("ClickTabContextId", str3, true);
            commentExposeStruct.f55708g = i18;
            commentExposeStruct.f55712k = o3Var.tk(i19);
            commentExposeStruct.f55715n = commentExposeStruct.b("enterSessionID", java.lang.String.valueOf(j17), true);
            commentExposeStruct.f55717p = 1L;
            commentExposeStruct.k();
            o3Var.Zk(commentExposeStruct);
        }
        if (a7Var.R && this.f108542d != i17 && i17 != 2) {
            java.util.Collection values = a7Var.Q.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : values) {
                so2.y0 y0Var = (so2.y0) obj;
                boolean p17 = y0Var.p(a7Var.n0());
                if (p17) {
                    y0Var.f410709m = 1;
                    y0Var.f410710n = 2;
                }
                if (p17) {
                    arrayList2.add(obj);
                }
            }
            android.content.Context context = a7Var.f106207d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.u6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).R6(arrayList2);
        }
        this.f108542d = i17;
        if (i17 == 0) {
            this.f108543e = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$CommentScrollReportListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$CommentScrollReportListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f108543e += i18;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$CommentScrollReportListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
