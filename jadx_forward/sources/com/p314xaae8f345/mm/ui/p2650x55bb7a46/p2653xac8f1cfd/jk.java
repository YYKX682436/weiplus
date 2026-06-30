package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.u1.class)
/* loaded from: classes9.dex */
public class jk extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.u1 {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f280827e;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f280833n;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f280835p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f280836q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f280837r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.n7 f280838s;

    /* renamed from: f, reason: collision with root package name */
    public boolean f280828f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f280829g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f280830h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f280831i = false;

    /* renamed from: m, reason: collision with root package name */
    public long f280832m = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f280834o = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f280839t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f280840u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f280841v = false;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        this.f280841v = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.n7 n7Var = this.f280838s;
        if (n7Var != null) {
            n7Var.c();
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).T && this.f280839t) {
            p0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f280828f = this.f280113d.f542250l.m78383x21a1233e("show_search_chat_content_result", false).booleanValue();
        this.f280833n = this.f280113d.f542250l.m78393x5ef8d750("highlight_keyword_list");
        this.f280832m = this.f280113d.f542250l.m78388x5a3fc3e("msg_local_id", -1L);
        this.f280829g = this.f280113d.f542250l.m78383x21a1233e("from_global_search", false).booleanValue();
        this.f280830h = this.f280113d.f542250l.m78383x21a1233e("from_date_search", false).booleanValue();
        this.f280113d.f542250l.m78383x21a1233e("img_gallery_enter_from_chatting_ui", false).booleanValue();
        this.f280831i = this.f280113d.f542250l.m78383x21a1233e("from_service_notify_content_search", false).booleanValue();
    }

    public boolean m0(long j17) {
        java.util.ArrayList arrayList;
        return this.f280832m == j17 && this.f280829g && (arrayList = this.f280833n) != null && arrayList.size() > 0;
    }

    public void n0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SearchComponent", "search result count %d, in edit mode %B, can report %B", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f280839t), java.lang.Boolean.valueOf(this.f280840u));
        if (this.f280839t) {
            if (this.f280840u && i17 >= 0) {
                this.f280840u = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10811, 2);
            }
            if (i17 > 0) {
                this.f280836q.setVisibility(0);
                this.f280113d.R(8);
                this.f280835p.setVisibility(8);
                android.view.View view = this.f280837r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 0) {
                this.f280836q.setVisibility(8);
                this.f280113d.R(8);
                this.f280835p.setVisibility(0);
                android.view.View view2 = this.f280837r;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            this.f280836q.setVisibility(8);
            this.f280113d.R(0);
            this.f280835p.setVisibility(8);
            android.view.View view3 = this.f280837r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void o0() {
        this.f280839t = true;
        this.f280113d.R(8);
        android.view.View view = this.f280827e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.n7 n7Var = this.f280838s;
            if (n7Var != null) {
                n7Var.f283544o = this.f280113d.x();
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.j(this.f280113d.f542250l, com.p314xaae8f345.mm.R.id.mdk);
            android.view.View c17 = this.f280113d.c(com.p314xaae8f345.mm.R.id.mds);
            this.f280827e = c17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f280837r = this.f280113d.c(com.p314xaae8f345.mm.R.id.mdi);
            this.f280113d.p().m75899xbcd9eff0(false);
            this.f280113d.p().m75900xfb5943cd(false);
            this.f280837r.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gk(this));
            android.view.View view2 = this.f280837r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f280835p = (android.widget.TextView) this.f280113d.c(com.p314xaae8f345.mm.R.id.dfr);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.n7 n7Var2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.n7(this.f280113d.g(), new com.p314xaae8f345.mm.p2621x8fb0427b.f9(), this.f280113d.x(), this.f280113d.t(), this.f280113d.C() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280287s);
            this.f280838s = n7Var2;
            n7Var2.f283548s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hk(this);
            android.widget.ListView listView = (android.widget.ListView) this.f280113d.c(com.p314xaae8f345.mm.R.id.mdj);
            this.f280836q = listView;
            listView.setVisibility(0);
            this.f280836q.setAdapter((android.widget.ListAdapter) this.f280838s);
            this.f280836q.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ik(this));
            this.f280836q.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ek(this));
        }
        n0(-1);
    }

    public void p0() {
        this.f280839t = false;
        this.f280840u = true;
        android.widget.TextView textView = this.f280835p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view = this.f280837r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "exitEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/SearchComponent", "exitEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ListView listView = this.f280836q;
        if (listView != null) {
            listView.setVisibility(8);
        }
        this.f280113d.R(0);
        this.f280113d.y();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (this.f280839t) {
            p0();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5) ((sb5.d0) this.f280113d.f542241c.a(sb5.d0.class))).q0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        if (this.f280832m >= 0 && !this.f280841v) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fk(this), 2000L);
        }
        if (this.f280828f || this.f280829g || this.f280830h || this.f280831i) {
            long m78388x5a3fc3e = this.f280113d.f542250l.m78388x5a3fc3e("msg_local_id", -1L);
            java.lang.String m78394x7e63ed49 = this.f280113d.f542250l.m78394x7e63ed49("Chat_User");
            int m78386x9c19e6d7 = this.f280113d.f542250l.m78386x9c19e6d7("SELECTION_TOP_OFFSET", 0);
            sb5.y yVar = new sb5.y();
            yVar.f487130b = true;
            yVar.f487133e = m78386x9c19e6d7;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).T0(m78394x7e63ed49, m78388x5a3fc3e, hd5.n.ACTION_POSITION, yVar);
        }
    }
}
