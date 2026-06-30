package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiMineUI */
/* loaded from: classes12.dex */
public class ViewOnClickListenerC13307xada0aded extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.View.OnClickListener, l75.q0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f179326y = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f179327d;

    /* renamed from: e, reason: collision with root package name */
    public m22.q f179328e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.n f179329f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f179330g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f179331h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f179332i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f179333m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f179334n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f179335o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f179336p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f179337q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f179338r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f179339s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f179340t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f179341u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f179342v = "";

    /* renamed from: w, reason: collision with root package name */
    public boolean f179343w = false;

    /* renamed from: x, reason: collision with root package name */
    public final pr.a f179344x = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p2(this);

    public void T6() {
        if (this.f179339s != null) {
            if (this.f179329f.f179115b.isEmpty()) {
                this.f179340t.setVisibility(8);
            } else {
                this.f179340t.setVisibility(0);
            }
        }
    }

    public final boolean U6(int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("added_single_emo_entry", "view_clk", new java.util.HashMap(), 35262);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.class);
        intent.putExtra("key_emoji_panel_type", i17);
        intent.putExtra("key_from_settings_mine", true);
        intent.putExtra("key_from_scene", 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiCustom", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiCustom", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final void V6() {
        if (!((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.f179165c) {
            java.util.Vector vector = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.f179170h;
            if ((vector != null ? vector.size() : 0) <= 0) {
                android.view.View view = this.f179330g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        android.view.View view2 = this.f179330g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.getClass();
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            this.f179331h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c09);
            android.view.View view3 = this.f179332i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f179333m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.f179163a) {
            android.view.View view5 = this.f179332i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f179333m;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f179331h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bwf);
            return;
        }
        android.view.View view7 = this.f179332i;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f179333m;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f179331h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572634bx1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a7r;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iqm);
        super.mo43517x10010bd5();
        this.f179327d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f565732dc5);
        this.f179328e = new m22.q(new m22.j(this, 24, 7));
        this.f179327d.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f179327d.mo7960x6cab2c8d(this.f179328e);
        this.f179327d.N(new m22.h(this, 1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.n(gr.v.f356229a.c() && java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4.class)).Di()).booleanValue());
        this.f179329f = nVar;
        this.f179328e.f404596u.addAll(nVar.f179115b);
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.d0 d0Var = e42.d0.clicfg_emoticon_center_to_post_entrance;
        if (((h62.d) e0Var).fj(d0Var, false)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("EmoticonMineKV", 2, null);
            if (N != null) {
                this.f179343w = N.getBoolean("show_post_entrance", false);
                this.f179341u = N.getString("jump_post_appid", "");
                this.f179342v = N.getString("jump_post_app_path", "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMineUI", "show mmkv " + this.f179343w + ", appid " + this.f179341u + ", path " + this.f179342v);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMineUI", "post not open");
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(mo55332x76847179());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a6r, null);
        this.f179339s = viewGroup;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obm);
        this.f179340t = textView;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iqo);
        this.f179340t.setVisibility(8);
        this.f179328e.T(this.f179339s, -1, true);
        this.f179334n = (android.view.ViewGroup) from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6p, (android.view.ViewGroup) this.f179327d, false);
        this.f179335o = (android.view.ViewGroup) this.f179339s.findViewById(com.p314xaae8f345.mm.R.id.jkc);
        this.f179336p = (android.view.ViewGroup) this.f179339s.findViewById(com.p314xaae8f345.mm.R.id.dbz);
        this.f179338r = (android.view.ViewGroup) this.f179334n.findViewById(com.p314xaae8f345.mm.R.id.jkd);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f179339s.findViewById(com.p314xaae8f345.mm.R.id.t7o);
        this.f179337q = viewGroup2;
        if (!this.f179343w) {
            viewGroup2.setVisibility(8);
        }
        ((android.widget.TextView) this.f179335o.findViewById(android.R.id.title)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.bvj);
        ((android.widget.TextView) this.f179338r.findViewById(android.R.id.title)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.bwx);
        ((android.widget.TextView) this.f179336p.findViewById(com.p314xaae8f345.mm.R.id.f565728dc1)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.bva);
        ((android.widget.TextView) this.f179337q.findViewById(com.p314xaae8f345.mm.R.id.t7q)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.nsw);
        this.f179338r.findViewById(com.p314xaae8f345.mm.R.id.cgi).setBackgroundResource(0);
        this.f179335o.setOnClickListener(this);
        this.f179338r.setOnClickListener(this);
        this.f179336p.setOnClickListener(this);
        this.f179337q.setOnClickListener(this);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(d0Var, false)) {
            r45.ti0 ti0Var = new r45.ti0();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 9462;
            lVar.f152199c = "/cgi-bin/mmemotionlogicsvr/emojimanagepage";
            lVar.f152197a = ti0Var;
            lVar.f152198b = new r45.ui0();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            iVar.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s2(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMineUI", "not open");
        }
        this.f179328e.O(this.f179334n, -2, true);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.wi()) {
            android.view.View findViewById = this.f179339s.findViewById(com.p314xaae8f345.mm.R.id.cop);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = this.f179339s.findViewById(com.p314xaae8f345.mm.R.id.coj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f179339s.findViewById(com.p314xaae8f345.mm.R.id.cop).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13308x3d707ad4());
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nui);
        this.f179330g = findViewById3;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.nuh);
        this.f179331h = textView2;
        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c09);
        this.f179332i = this.f179330g.findViewById(com.p314xaae8f345.mm.R.id.dc7);
        this.f179333m = this.f179330g.findViewById(com.p314xaae8f345.mm.R.id.dc8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().b();
        V6();
        this.f179332i.setOnClickListener(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().a(this.f179344x);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().add(this);
        T6();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        if (view == this.f179335o) {
            U6(0);
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view == this.f179338r) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiPaid", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiPaid", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view == this.f179336p) {
            U6(1);
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view != this.f179337q) {
            if (view == this.f179332i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a;
                kVar.f179163a = true;
                kVar.f();
                V6();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMineUI", "app id " + this.f179341u);
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("EmoticonMineKV", 2, null);
        if (N != null) {
            hashMap.put("if_first_exp", java.lang.Integer.valueOf(!N.getBoolean("has_save_post_entrance", false) ? 1 : 0));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("my_posted_emoticon_entrance", "view_clk", hashMap, 35262);
        if (!android.text.TextUtils.isEmpty(this.f179341u)) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = this.f179341u;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                i17 = 2;
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            b1Var.f398549c = i17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BuildInfo.IS_FLAVOR_RED false, debug false, WeChatEnvironment.isCoolassistEnv() ");
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMineUI", sb6.toString());
            b1Var.f398565k = 1417;
            b1Var.f398555f = this.f179342v;
            b1Var.f398557g = true;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("fromApp", "my-emoticons");
                str = jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMineUI", "json exception " + e17.toString());
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            c11812xa040dc98.f158857f = str;
            c11812xa040dc98.f158855d = 1;
            c11812xa040dc98.f158856e = this.f179341u;
            b1Var.f398574s = c11812xa040dc98;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this, b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        mo43517x10010bd5();
        int intExtra = getIntent().getIntExtra(java.lang.String.valueOf(10931), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68478xbd3cda5f(10931, java.lang.String.valueOf(intExtra));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMineUI", "jacks statistics enter Emoji Setting UI:%d", java.lang.Integer.valueOf(intExtra));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q2(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572639by1), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r2(this));
        if (!((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
            q12.s.b(true);
        }
        g0Var.mo68477x336bdfd8(406L, 3L, 1L, false);
        g0Var.mo68477x336bdfd8(406L, 5L, java.lang.System.currentTimeMillis() - currentTimeMillis, false);
        g0Var.d(12740, 4, "", "", "", 24, 24);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("added_single_emo_entry", "view_exp", new java.util.HashMap(), 35262);
        pr.q.f439297a.a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().c(this.f179344x);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().mo49775xc84af884(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if ("event_update_group".equals(str)) {
            this.f179329f.mo54784x6761d4f();
            this.f179328e.f404596u.clear();
            this.f179328e.f404596u.addAll(this.f179329f.f179115b);
            this.f179328e.m8146xced61ae5();
            T6();
        }
    }
}
