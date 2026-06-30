package com.tencent.mm.plugin.emoji.ui;

@db5.a(8192)
/* loaded from: classes12.dex */
public class EmojiMineUI extends com.tencent.mm.ui.MMActivity implements android.view.View.OnClickListener, l75.q0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f97793y = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f97794d;

    /* renamed from: e, reason: collision with root package name */
    public m22.q f97795e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.n f97796f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f97797g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f97798h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f97799i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f97800m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f97801n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f97802o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f97803p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f97804q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f97805r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f97806s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f97807t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f97808u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f97809v = "";

    /* renamed from: w, reason: collision with root package name */
    public boolean f97810w = false;

    /* renamed from: x, reason: collision with root package name */
    public final pr.a f97811x = new com.tencent.mm.plugin.emoji.ui.p2(this);

    public void T6() {
        if (this.f97806s != null) {
            if (this.f97796f.f97582b.isEmpty()) {
                this.f97807t.setVisibility(8);
            } else {
                this.f97807t.setVisibility(0);
            }
        }
    }

    public final boolean U6(int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("added_single_emo_entry", "view_clk", new java.util.HashMap(), 35262);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.class);
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
        if (!((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f97632c) {
            java.util.Vector vector = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f97637h;
            if ((vector != null ? vector.size() : 0) <= 0) {
                android.view.View view = this.f97797g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        android.view.View view2 = this.f97797g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.getClass();
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            this.f97798h.setText(com.tencent.mm.R.string.c09);
            android.view.View view3 = this.f97799i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f97800m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f97630a) {
            android.view.View view5 = this.f97799i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f97800m;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f97798h.setText(com.tencent.mm.R.string.bwf);
            return;
        }
        android.view.View view7 = this.f97799i;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f97800m;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f97798h.setText(com.tencent.mm.R.string.f491101bx1);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a7r;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iqm);
        super.initView();
        this.f97794d = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f484199dc5);
        this.f97795e = new m22.q(new m22.j(this, 24, 7));
        this.f97794d.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f97794d.setAdapter(this.f97795e);
        this.f97794d.N(new m22.h(this, 1));
        com.tencent.mm.plugin.emoji.model.n nVar = new com.tencent.mm.plugin.emoji.model.n(gr.v.f274696a.c() && java.lang.Boolean.valueOf(((com.tencent.mm.feature.emoji.r4) i95.n0.c(com.tencent.mm.feature.emoji.r4.class)).Di()).booleanValue());
        this.f97796f = nVar;
        this.f97795e.f323063u.addAll(nVar.f97582b);
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.d0 d0Var = e42.d0.clicfg_emoticon_center_to_post_entrance;
        if (((h62.d) e0Var).fj(d0Var, false)) {
            com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("EmoticonMineKV", 2, null);
            if (N != null) {
                this.f97810w = N.getBoolean("show_post_entrance", false);
                this.f97808u = N.getString("jump_post_appid", "");
                this.f97809v = N.getString("jump_post_app_path", "");
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMineUI", "show mmkv " + this.f97810w + ", appid " + this.f97808u + ", path " + this.f97809v);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMineUI", "post not open");
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.a6r, null);
        this.f97806s = viewGroup;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obm);
        this.f97807t = textView;
        textView.setText(com.tencent.mm.R.string.iqo);
        this.f97807t.setVisibility(8);
        this.f97795e.T(this.f97806s, -1, true);
        this.f97801n = (android.view.ViewGroup) from.inflate(com.tencent.mm.R.layout.a6p, (android.view.ViewGroup) this.f97794d, false);
        this.f97802o = (android.view.ViewGroup) this.f97806s.findViewById(com.tencent.mm.R.id.jkc);
        this.f97803p = (android.view.ViewGroup) this.f97806s.findViewById(com.tencent.mm.R.id.dbz);
        this.f97805r = (android.view.ViewGroup) this.f97801n.findViewById(com.tencent.mm.R.id.jkd);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f97806s.findViewById(com.tencent.mm.R.id.t7o);
        this.f97804q = viewGroup2;
        if (!this.f97810w) {
            viewGroup2.setVisibility(8);
        }
        ((android.widget.TextView) this.f97802o.findViewById(android.R.id.title)).setText(com.tencent.mm.R.string.bvj);
        ((android.widget.TextView) this.f97805r.findViewById(android.R.id.title)).setText(com.tencent.mm.R.string.bwx);
        ((android.widget.TextView) this.f97803p.findViewById(com.tencent.mm.R.id.f484195dc1)).setText(com.tencent.mm.R.string.bva);
        ((android.widget.TextView) this.f97804q.findViewById(com.tencent.mm.R.id.t7q)).setText(com.tencent.mm.R.string.nsw);
        this.f97805r.findViewById(com.tencent.mm.R.id.cgi).setBackgroundResource(0);
        this.f97802o.setOnClickListener(this);
        this.f97805r.setOnClickListener(this);
        this.f97803p.setOnClickListener(this);
        this.f97804q.setOnClickListener(this);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(d0Var, false)) {
            r45.ti0 ti0Var = new r45.ti0();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 9462;
            lVar.f70666c = "/cgi-bin/mmemotionlogicsvr/emojimanagepage";
            lVar.f70664a = ti0Var;
            lVar.f70665b = new r45.ui0();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            iVar.l().h(new com.tencent.mm.plugin.emoji.ui.s2(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMineUI", "not open");
        }
        this.f97795e.O(this.f97801n, -2, true);
        if (com.tencent.mm.storage.h5.f195006d.wi()) {
            android.view.View findViewById = this.f97806s.findViewById(com.tencent.mm.R.id.cop);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = this.f97806s.findViewById(com.tencent.mm.R.id.coj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f97806s.findViewById(com.tencent.mm.R.id.cop).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.EmojiMineUI$$a());
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nui);
        this.f97797g = findViewById3;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.nuh);
        this.f97798h = textView2;
        textView2.setText(com.tencent.mm.R.string.c09);
        this.f97799i = this.f97797g.findViewById(com.tencent.mm.R.id.dc7);
        this.f97800m = this.f97797g.findViewById(com.tencent.mm.R.id.dc8);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().b();
        V6();
        this.f97799i.setOnClickListener(this);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().a(this.f97811x);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().add(this);
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
        if (view == this.f97802o) {
            U6(0);
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view == this.f97805r) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiPaid", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiPaid", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view == this.f97803p) {
            U6(1);
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view != this.f97804q) {
            if (view == this.f97799i) {
                com.tencent.mm.plugin.emoji.sync.k kVar = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a;
                kVar.f97630a = true;
                kVar.f();
                V6();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMineUI", "app id " + this.f97808u);
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("EmoticonMineKV", 2, null);
        if (N != null) {
            hashMap.put("if_first_exp", java.lang.Integer.valueOf(!N.getBoolean("has_save_post_entrance", false) ? 1 : 0));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("my_posted_emoticon_entrance", "view_clk", hashMap, 35262);
        if (!android.text.TextUtils.isEmpty(this.f97808u)) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = this.f97808u;
            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                i17 = 2;
            } else {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            b1Var.f317016c = i17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BuildInfo.IS_FLAVOR_RED false, debug false, WeChatEnvironment.isCoolassistEnv() ");
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            sb6.append(com.tencent.mm.sdk.platformtools.s9.f192975c);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMineUI", sb6.toString());
            b1Var.f317032k = 1417;
            b1Var.f317022f = this.f97809v;
            b1Var.f317024g = true;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("fromApp", "my-emoticons");
                str = jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMineUI", "json exception " + e17.toString());
                str = "";
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            appBrandLaunchReferrer.f77324f = str;
            appBrandLaunchReferrer.f77322d = 1;
            appBrandLaunchReferrer.f77323e = this.f97808u;
            b1Var.f317041s = appBrandLaunchReferrer;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this, b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        initView();
        int intExtra = getIntent().getIntExtra(java.lang.String.valueOf(10931), 0);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.kvStat(10931, java.lang.String.valueOf(intExtra));
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMineUI", "jacks statistics enter Emoji Setting UI:%d", java.lang.Integer.valueOf(intExtra));
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.q2(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f491106by1), new com.tencent.mm.plugin.emoji.ui.r2(this));
        if (!((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
            q12.s.b(true);
        }
        g0Var.idkeyStat(406L, 3L, 1L, false);
        g0Var.idkeyStat(406L, 5L, java.lang.System.currentTimeMillis() - currentTimeMillis, false);
        g0Var.d(12740, 4, "", "", "", 24, 24);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("added_single_emo_entry", "view_exp", new java.util.HashMap(), 35262);
        pr.q.f357764a.a();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().c(this.f97811x);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().remove(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if ("event_update_group".equals(str)) {
            this.f97796f.reset();
            this.f97795e.f323063u.clear();
            this.f97795e.f323063u.addAll(this.f97796f.f97582b);
            this.f97795e.notifyDataSetChanged();
            T6();
        }
    }
}
