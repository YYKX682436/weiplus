package nj2;

/* loaded from: classes10.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final gk2.e H;
    public final zh2.c I;

    /* renamed from: J, reason: collision with root package name */
    public final zh2.e f419368J;
    public android.view.View K;
    public android.view.View L;
    public final jz5.g M;
    public final jz5.g N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.view.View R;
    public final nj2.f S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, gk2.e liveData, zh2.c pluginAbility, zh2.e userInterface) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInterface, "userInterface");
        this.H = liveData;
        this.I = pluginAbility;
        this.f419368J = userInterface;
        this.M = jz5.h.b(new nj2.c(this));
        this.N = jz5.h.b(new nj2.g(context, this));
        this.S = new nj2.f(this);
    }

    public static final nj2.j e0(nj2.h hVar) {
        return (nj2.j) ((jz5.n) hVar.M).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dqs;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.R = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.imn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.K = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.enl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.L = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rmg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.P = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.s5g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.Q = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.gz9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById5);
        Y(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        super.U();
        zh2.c cVar = this.I;
        df2.g3 g3Var = (df2.g3) cVar.mo57008x143f1b92(df2.g3.class);
        if (g3Var != null) {
            g3Var.Z6(0, (int) ((mm2.c1) cVar.g().a(mm2.c1.class)).f410399q, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458665g, new nj2.d(this));
        }
    }

    public final void f0(boolean z17) {
        if (z17) {
            android.view.View view = this.K;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.L;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.K;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.L;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        android.view.View inflate = android.view.LayoutInflater.from(this.f199716e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570484eb1, (android.view.ViewGroup) null);
        java.util.Objects.toString(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return inflate;
    }
}
