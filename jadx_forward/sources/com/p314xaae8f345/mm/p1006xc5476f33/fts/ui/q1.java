package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public final class q1 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final int f219680q;

    /* renamed from: r, reason: collision with root package name */
    public final int f219681r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f219682s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219683t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 ftsBaseUIComponent, int i17, int i18) {
        super(ftsBaseUIComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsBaseUIComponent, "ftsBaseUIComponent");
        this.f219680q = i17;
        this.f219681r = i18;
        this.f219682s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1(this));
        this.f219683t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        n(((t13.k) ((jz5.n) this.f219682s).mo141623x754a37bb()).j(0));
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = ((t13.k) ((jz5.n) this.f219682s).mo141623x754a37bb()).b(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "createDataItem(...)");
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        ((t13.k) ((jz5.n) this.f219682s).mo141623x754a37bb()).f(this.f219583g, this.f219683t, new java.util.HashSet(), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        a23.g gVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var = this.f219580d;
        if (w0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSBizDetailUI");
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53) w0Var;
            if (activityC15600x40dfa53.f219481r && (gVar instanceof zq1.e0)) {
                sr1.a0 a0Var = (sr1.a0) ((zq1.e0) gVar);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f492983t) && (gVar2 = activityC15600x40dfa53.f219483t) != null) {
                    java.lang.String str = a0Var.f492983t;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getNickName(...)");
                    gVar2.a(str, true, activityC15600x40dfa53.h7(), activityC15600x40dfa53.g7(), java.lang.String.valueOf(activityC15600x40dfa53.H));
                }
            }
        }
        return ((t13.k) ((jz5.n) this.f219682s).mo141623x754a37bb()).a(view, gVar, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.String str;
        super.onScroll(absListView, i17, i18, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var = this.f219580d;
        if (w0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSBizDetailUI");
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53) w0Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(absListView, "null cannot be cast to non-null type android.widget.ListView");
            android.widget.ListView listView = (android.widget.ListView) absListView;
            int headerViewsCount = listView.getHeaderViewsCount();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q1 q1Var = activityC15600x40dfa53.f219484u;
            r45.h55 h55Var = activityC15600x40dfa53.E;
            if (q1Var == null || h55Var == null) {
                return;
            }
            android.view.View view = activityC15600x40dfa53.f219487x;
            if (view != null && listView.getLastVisiblePosition() >= q1Var.getCount() + headerViewsCount && view.getVisibility() == 0 && activityC15600x40dfa53.f219478J == 1) {
                int k17 = i65.a.k(activityC15600x40dfa53);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (view.getMeasuredHeight() + iArr[1] <= k17) {
                    activityC15600x40dfa53.f219478J = 2;
                    activityC15600x40dfa53.k7(h55Var, 2);
                }
            }
            android.widget.LinearLayout linearLayout = activityC15600x40dfa53.f219489z;
            if (linearLayout == null || listView.getLastVisiblePosition() < q1Var.getCount() + headerViewsCount || linearLayout.getVisibility() != 0) {
                return;
            }
            int k18 = i65.a.k(activityC15600x40dfa53);
            int childCount = linearLayout.getChildCount();
            for (int i27 = 0; i27 < childCount; i27++) {
                android.view.View childAt = linearLayout.getChildAt(i27);
                int[] iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                int measuredHeight = childAt.getMeasuredHeight() + iArr2[1];
                java.lang.Object tag = childAt.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FTSRelatedSugItem");
                r45.jo0 jo0Var = (r45.jo0) tag;
                if (measuredHeight <= k18) {
                    java.util.HashSet hashSet = activityC15600x40dfa53.I;
                    r45.di6 di6Var = jo0Var.f459519d;
                    if (di6Var == null || (str = di6Var.f454046e) == null) {
                        str = "";
                    }
                    if (hashSet.add(str)) {
                        activityC15600x40dfa53.j7(jo0Var, h55Var, 2);
                    }
                }
            }
        }
    }
}
