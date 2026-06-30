package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "com/tencent/mm/ui/chatting/gallery/i0", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment */
/* loaded from: classes9.dex */
public final class C21744x29417dbc extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f282078n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f282079o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f282080p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f282081q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 f282082r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 f282083s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f282084t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f282085u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f282086v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f282087w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f282088x;

    public C21744x29417dbc(java.lang.String adapterTalker, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapterTalker, "adapterTalker");
        this.f282078n = adapterTalker;
        this.f282079o = z17;
        this.f282085u = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.efj;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.r0.f395535d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        yj0.a.a("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo7397x3b13c504(context);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0(context, this.f282078n, this.f282079o);
        this.f282082r = h0Var;
        if (this.f282086v || (list = this.f282084t) == null) {
            return;
        }
        h0Var.f282507g = kz5.n0.V0(list);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var2 = this.f282082r;
        if (h0Var2 != null) {
            h0Var2.m8146xced61ae5();
        }
        this.f282086v = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListFragment", "onCreateView >> inflate view");
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflater, viewGroup, bundle);
        if (mo7503x18bad100 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiHistoryListFragment", "onCreateView >> inflate view failed !");
            return null;
        }
        this.f282080p = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo7503x18bad100.findViewById(com.p314xaae8f345.mm.R.id.gg6);
        this.f282081q = (android.widget.TextView) mo7503x18bad100.findViewById(com.p314xaae8f345.mm.R.id.kcl);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f282080p;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j0(this));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f282080p;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7960x6cab2c8d(this.f282082r);
        }
        java.util.List list = this.f282084t;
        if (list != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            r0(list, this.f282085u);
            this.f282084t = null;
        }
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        android.view.View m7474xfb86a31b = m7474xfb86a31b();
        android.content.Context mo7438x76847179 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
        float f17 = mo7438x76847179.getResources().getDisplayMetrics().density;
        if (m7474xfb86a31b != null) {
            m7474xfb86a31b.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.m0(this, m7474xfb86a31b, f17));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        yj0.a.a("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final void r0(java.util.List dataList, java.lang.String query) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListFragment", "[onSearchResult] :: dataList size: " + dataList.size() + " with query: " + query);
        this.f282084t = kz5.n0.V0(dataList);
        this.f282085u = query;
        if (this.f282082r == null || this.f282080p == null || this.f282081q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListFragment", "fragment not inited !");
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            de5.a.f310929a.b(7, this.f282079o);
            java.util.List list = this.f282084t;
            if (list != null && ((java.util.ArrayList) list).size() == 0) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(query, "")) {
                    android.widget.TextView textView = this.f282081q;
                    if (textView != null) {
                        textView.setText(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.b5e));
                    }
                } else {
                    java.lang.String m7468x2fec8307 = m7468x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.nps, query);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7468x2fec8307, "getString(...)");
                    android.widget.TextView textView2 = this.f282081q;
                    if (textView2 != null) {
                        textView2.setText(o13.q.c(textView2.getContext(), m7468x2fec8307, query));
                    }
                }
                android.widget.TextView textView3 = this.f282081q;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f282080p;
                if (c1163xf1deaba4 == null) {
                    return;
                }
                c1163xf1deaba4.setVisibility(8);
                return;
            }
            android.widget.TextView textView4 = this.f282081q;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f282080p;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.setVisibility(0);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = this.f282082r;
            if (h0Var == null) {
                this.f282086v = false;
                return;
            }
            java.util.List list2 = this.f282084t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
            h0Var.f282507g = kz5.n0.V0(list2);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var2 = this.f282082r;
            if (h0Var2 != null) {
                h0Var2.m8146xced61ae5();
            }
            this.f282086v = true;
        }
    }
}
