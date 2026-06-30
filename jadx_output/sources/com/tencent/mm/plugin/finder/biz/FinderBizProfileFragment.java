package com.tencent.mm.plugin.finder.biz;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/biz/FinderBizProfileFragment;", "Lzy2/hb;", "Lzy2/h5;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lab2/g;", "Lab2/a;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderBizProfileFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment<ab2.g, ab2.a> implements zy2.hb, zy2.h5 {
    public static final /* synthetic */ int M = 0;
    public ab2.g A;
    public com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader B;
    public boolean C;
    public long D;
    public boolean E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f102761J;
    public final yz5.l K;
    public boolean L;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f102762u;

    /* renamed from: v, reason: collision with root package name */
    public final long f102763v;

    /* renamed from: w, reason: collision with root package name */
    public final int f102764w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f102765x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f102766y;

    /* renamed from: z, reason: collision with root package name */
    public ab2.a f102767z;

    public FinderBizProfileFragment(java.lang.String bizUsername, long j17, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        this.f102762u = bizUsername;
        this.f102763v = j17;
        this.f102764w = i17;
        this.f102765x = z17;
        this.f102766y = jz5.h.b(new ab2.r(this));
        this.F = jz5.h.b(new ab2.t(this));
        this.G = jz5.h.b(new ab2.u(this));
        this.H = jz5.h.b(new ab2.v(this));
        this.I = jz5.h.b(new ab2.w(this));
        this.K = new ab2.y(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.a1 A0() {
        ab2.g gVar = this.A;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a7  */
    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment.C0(android.view.View):void");
    }

    public final void G0(boolean z17) {
        if (J0().getVisibility() == 0) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, J0().getWidth(), 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            J0().startAnimation(translateAnimation);
            android.view.View J0 = J0();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            J0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(J0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!z17) {
                android.view.View K0 = K0();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(K0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                K0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(K0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View L0 = L0();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(L0, arrayList3.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                L0.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(L0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnGone", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.L = false;
            H0().f102776o = false;
        }
    }

    public final com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader H0() {
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = this.B;
        if (finderBizProfileLoader != null) {
            return finderBizProfileLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    public final android.view.View J0() {
        java.lang.Object value = ((jz5.n) this.F).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View K0() {
        java.lang.Object value = ((jz5.n) this.G).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View L0() {
        java.lang.Object value = ((jz5.n) this.H).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void M0() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        long c17;
        com.tencent.mm.ui.MMActivity context = y0();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 == null || (str = V6.getString(0)) == null) {
            str = "";
        }
        if (V6 == null || (str2 = V6.getString(1)) == null) {
            str2 = "";
        }
        int integer = V6 != null ? V6.getInteger(7) : 0;
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z17 = this.C;
        int i18 = !z17 ? 1 : 0;
        if (z17) {
            c17 = 0;
            i17 = integer;
        } else {
            i17 = integer;
            c17 = c01.id.c() - this.D;
        }
        jSONObject.put("biz_username", this.f102762u);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        g0Var.d(21874, str, str2, 119, java.lang.Integer.valueOf(i18), valueOf, xy2.c.f(V6), r26.i0.t(jSONObject2, ",", ";", false), "", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c17));
    }

    public final void N0(java.lang.String str, int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SOURCE, i18);
        jSONObject.put("watching_feedid", this.f102763v);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String stringExtra = y0().getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, Ri, stringExtra, 119, java.lang.Integer.valueOf(i17), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), str, t17);
    }

    @Override // zy2.h5
    public boolean O() {
        return true;
    }

    @Override // zy2.h5
    public void P() {
        ab2.g gVar = this.A;
        if (gVar == null) {
            return;
        }
        if (gVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = gVar.getRecyclerView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    public void P0() {
        ab2.g gVar = this.A;
        if (gVar == null) {
            return;
        }
        if (gVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = gVar.f106180m;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        refreshLoadMoreLayout.onStopNestedScroll(gVar.getRecyclerView());
        if (this.C) {
            this.C = false;
            com.tencent.mm.ui.MMActivity context = y0();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null) {
                nyVar.onUserVisibleUnFocused();
            }
            M0();
        }
    }

    public void Q0() {
        if (this.C) {
            return;
        }
        if (this.f102767z == null) {
            this.E = true;
            return;
        }
        this.C = true;
        com.tencent.mm.ui.MMActivity context = y0();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            nyVar.onUserVisibleFocused();
        }
        this.D = c01.id.c();
        M0();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aeb;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        H0().f102773i.b("biz-onResume");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        com.tencent.mm.ui.MMActivity context = y0();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            nyVar.onPreDestroyed();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void q0(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.q0(set);
        if (((java.lang.Boolean) ((jz5.n) this.f102766y).getValue()).booleanValue()) {
            set.remove(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC.class);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.k0 z0() {
        ab2.a aVar = this.f102767z;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
