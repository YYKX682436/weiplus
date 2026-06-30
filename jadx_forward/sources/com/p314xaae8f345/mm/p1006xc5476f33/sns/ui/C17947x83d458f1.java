package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.AtContactWidget */
/* loaded from: classes4.dex */
public class C17947x83d458f1 extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f247771p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f247772d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f247773e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f247774f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f247775g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f247776h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17990x7a02961d f247777i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18131x711b760 f247778m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f247779n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f247780o;

    public C17947x83d458f1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f247779n = new java.util.LinkedList();
        this.f247780o = false;
        d(context);
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f247779n == null) {
            this.f247779n = new java.util.LinkedList();
        }
        this.f247779n.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17990x7a02961d c17990x7a02961d = this.f247777i;
        if (c17990x7a02961d != null) {
            c17990x7a02961d.m70669x764ce020(this.f247779n);
        }
        f();
        android.widget.TextView textView = this.f247775g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = this.f247776h;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("contentDescription", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f247779n.iterator();
        while (it.hasNext()) {
            sb6.append(c01.e2.l((java.lang.String) it.next()).f2() + ",");
        }
        this.f247773e.setContentDescription(((java.lang.Object) this.f247776h.getText()) + " " + ((java.lang.Object) sb6));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("contentDescription", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goToSelectTogether", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this.f247772d, "com.tencent.mm.ui.contact.SnsSelectConversationUI");
        intent.putExtra("Select_Conv_ui_title", this.f247772d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jgi));
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f247779n, ","));
        android.app.Activity activity = this.f247772d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(6);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "goToSelectTogether", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goToSelectTogether", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void d(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        this.f247772d = (android.app.Activity) context;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(mo70553x8e08264e(), this);
        this.f247773e = inflate;
        this.f247777i = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17990x7a02961d) inflate.findViewById(com.p314xaae8f345.mm.R.id.a5i);
        this.f247774f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f247773e.findViewById(com.p314xaae8f345.mm.R.id.a5j);
        this.f247775g = (android.widget.TextView) this.f247773e.findViewById(com.p314xaae8f345.mm.R.id.a5l);
        this.f247776h = (android.widget.TextView) this.f247773e.findViewById(com.p314xaae8f345.mm.R.id.a5m);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.a()) {
            this.f247776h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jgi);
            android.view.View findViewById = this.f247773e.findViewById(com.p314xaae8f345.mm.R.id.a5n);
            int i17 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.b() || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.c()) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/AtContactWidget", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f247773e.findViewById(com.p314xaae8f345.mm.R.id.a5n);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/AtContactWidget", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f247773e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v0(this));
        this.f247773e.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w0(this));
        b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public boolean e(int i17, int i18, android.content.Intent intent, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        new java.util.LinkedList();
        java.util.List<java.lang.String> linkedList = (stringExtra == null || stringExtra.equals("")) ? new java.util.LinkedList() : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
        if (this.f247779n == null) {
            this.f247779n = new java.util.LinkedList();
        }
        this.f247779n.clear();
        for (java.lang.String str : linkedList) {
            if (!this.f247779n.contains(str)) {
                this.f247779n.add(str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17990x7a02961d c17990x7a02961d = this.f247777i;
        if (c17990x7a02961d != null) {
            c17990x7a02961d.m70669x764ce020(this.f247779n);
        }
        g(z17);
        android.widget.TextView textView = this.f247776h;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(linkedList.isEmpty() ? com.p314xaae8f345.mm.R.C30859x5a72f63.a0c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
        }
        if (this.f247780o) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealAtNumTv", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            this.f247779n.size();
            if (!this.f247780o || this.f247775g == null || this.f247779n.size() <= 0) {
                this.f247775g.setVisibility(8);
            } else {
                this.f247775g.setVisibility(0);
                if (this.f247779n.size() < 100) {
                    this.f247775g.setText(this.f247779n.size() + "");
                    this.f247775g.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(getContext(), this.f247779n.size()));
                } else {
                    this.f247775g.setText("");
                    this.f247775g.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealAtNumTv", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        }
        f();
        b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return true;
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLayoutWidth", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f247779n.size() > 0) {
            this.f247774f.s(mo70554x424674b5(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        } else {
            this.f247774f.s(mo70555xe4613eaa(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560798ui);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLayoutWidth", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateWithTaInfo", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f247779n.size() <= 0 || z17 || !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.a()) {
            android.view.View findViewById = getRootView().findViewById(com.p314xaae8f345.mm.R.id.mvt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = getRootView().findViewById(com.p314xaae8f345.mm.R.id.mvt);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWithTaInfo", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    /* renamed from: getAtList */
    public java.util.List<java.lang.String> m70552x11240267() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f247779n == null) {
            this.f247779n = new java.util.LinkedList();
        }
        java.util.List<java.lang.String> list = this.f247779n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return list;
    }

    /* renamed from: getLayoutResource */
    public int mo70553x8e08264e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutResource", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutResource", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569689io;
    }

    /* renamed from: getWithDrawableId */
    public int mo70554x424674b5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            return com.p314xaae8f345.mm.R.raw.f79541x5af5b4b1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return com.p314xaae8f345.mm.R.raw.f78398x76810661;
    }

    /* renamed from: getWithEmptyDrawableId */
    public int mo70555xe4613eaa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            return com.p314xaae8f345.mm.R.raw.f79580xe89b9b31;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return com.p314xaae8f345.mm.R.raw.f78397x94e99ec8;
    }

    /* renamed from: setShowAtList */
    public void m70556x2c49bad0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17990x7a02961d c17990x7a02961d = this.f247777i;
        if (c17990x7a02961d != null) {
            c17990x7a02961d.setVisibility(z17 ? 0 : 8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    /* renamed from: setShowAtNum */
    public void m70557xe8a79314(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowAtNum", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        this.f247780o = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowAtNum", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    /* renamed from: setShowAtTips */
    public void m70558x2c4d5d6a(boolean z17) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowAtTips", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f247773e != null && (textView = this.f247776h) != null) {
            textView.setVisibility(z17 ? 0 : 8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowAtTips", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public C17947x83d458f1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247779n = new java.util.LinkedList();
        this.f247780o = false;
        d(context);
    }
}
