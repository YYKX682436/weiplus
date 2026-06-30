package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.GroupCardSelectUI */
/* loaded from: classes4.dex */
public class ActivityC22310xc85a83bf extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public boolean f287957e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f287958f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f287959g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f287960h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f287961i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f287962m;

    /* renamed from: p, reason: collision with root package name */
    public int f287965p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f287966q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ListView f287967r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.d4 f287968s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f287969t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f287970u;

    /* renamed from: d, reason: collision with root package name */
    public boolean f287956d = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f287963n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f287964o = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bil;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f287967r = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f566716gu0);
        if (this.f287966q) {
            this.f287968s = new com.p314xaae8f345.mm.ui.p2690x38b72420.jb(this, this.f287969t, this.f287964o, this.f287963n);
            this.f287967r.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf);
        } else {
            this.f287968s = new com.p314xaae8f345.mm.ui.p2690x38b72420.d4(this, this.f287969t, this.f287964o, this.f287963n);
        }
        this.f287967r.setAdapter((android.widget.ListAdapter) this.f287968s);
        this.f287967r.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.e4(this));
        this.f287970u = findViewById(com.p314xaae8f345.mm.R.id.gtu);
        if (this.f287968s.getCount() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupCardSelectUI", "show empty view");
            android.view.View view = this.f287970u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78500x43e00957(1, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupCardSelectUI", "hide empty view");
            android.view.View view2 = this.f287970u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.f4(this));
        if (this.f287959g) {
            android.widget.ListView listView = this.f287967r;
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bip, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572359ay4);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lu7);
            if (this.f287968s.getCount() <= 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            listView.addHeaderView(inflate);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p75.m d17;
        java.util.ArrayList arrayList;
        super.onCreate(bundle);
        this.f287956d = getIntent().getBooleanExtra("group_select_type", true);
        this.f287957e = getIntent().getBooleanExtra("group_select_need_result", false);
        this.f287958f = getIntent().getBooleanExtra("group_select_only_need_self_owner", false);
        this.f287961i = getIntent().getBooleanExtra("group_select_filter_associate_chat_room", false);
        this.f287962m = getIntent().getStringArrayListExtra("group_select_block_chatroom");
        this.f287959g = getIntent().getBooleanExtra("group_select_show_create_new_group", false);
        this.f287966q = getIntent().getBooleanExtra("group_should_show_chatroom_member", false);
        getIntent().getIntExtra("group_select_chatroom_max_num", Integer.MAX_VALUE);
        boolean booleanExtra = getIntent().getBooleanExtra("privacy_from_select_contact_ui", false);
        if (this.f287958f && !this.f287959g) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571459fp));
        } else if (booleanExtra) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbv));
        } else {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571458fo));
        }
        boolean booleanExtra2 = getIntent().getBooleanExtra("group_multi_select", false);
        this.f287963n = booleanExtra2;
        if (booleanExtra2) {
            java.lang.String stringExtra = getIntent().getStringExtra("already_select_contact");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                this.f287964o = new java.util.LinkedList();
            } else {
                java.lang.String[] split = stringExtra.split(",");
                int i17 = x51.t1.f533619a;
                if (split == null || split.length == 0) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.String str : split) {
                        arrayList.add(str);
                    }
                }
                this.f287964o = arrayList;
            }
            this.f287965p = getIntent().getIntExtra("max_limit_num", 0);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (getIntent().getBooleanExtra("grou_order_by_conversation_time", false)) {
            java.util.List<java.lang.String> c17 = o13.n.c();
            if (this.f287958f) {
                java.util.HashSet hashSet = new java.util.HashSet(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().P0(c01.v1.q()));
                for (java.lang.String str2 : c17) {
                    java.util.ArrayList arrayList2 = this.f287962m;
                    if (arrayList2 == null || !arrayList2.contains(str2)) {
                        if (hashSet.contains(str2)) {
                            if (!this.f287961i ? true : !c01.e2.E(str2)) {
                                linkedList.add(str2);
                            }
                        }
                    }
                }
            } else {
                for (java.lang.String str3 : c17) {
                    java.util.ArrayList arrayList3 = this.f287962m;
                    if (arrayList3 == null || !arrayList3.contains(str3)) {
                        if (!this.f287961i ? true : !c01.e2.E(str3)) {
                            linkedList.add(str3);
                        }
                    }
                }
            }
        } else {
            boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
            p75.d dVar = dm.e2.T1;
            l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            p75.m c18 = new p75.p0(dVar.z(), 1, 0).c(dVar.g(32, 0));
            if (a17) {
                p75.d dVar2 = dm.e2.Y1;
                d17 = dVar2.i(2L).d(dVar2.i(4L));
            } else {
                p75.d dVar3 = dm.e2.P1;
                d17 = dVar3.p("'@chatroom'").d(dVar3.p("'@im.chatroom'"));
            }
            ((p75.y) c18).f(d17);
            p75.n0 n0Var = dm.e2.N1;
            p75.d USERNAME = dm.e2.P1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(USERNAME, "USERNAME");
            p75.i0 h17 = n0Var.h(USERNAME);
            h17.f434190d = c18;
            linkedList.addAll(h17.a().l(gm0.j1.u().f354686f));
        }
        if (linkedList.isEmpty()) {
            this.f287969t = new java.util.LinkedList();
        } else {
            this.f287969t = g95.e.f351334a.e(linkedList);
        }
        mo43517x10010bd5();
        if (this.f287963n) {
            m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571992vn), new com.p314xaae8f345.mm.ui.p2690x38b72420.g4(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
            m78500x43e00957(1, false);
            if (this.f287963n && this.f287960h) {
                m78500x43e00957(1, true);
                mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571992vn));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
