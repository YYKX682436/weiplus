package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI */
/* loaded from: classes15.dex */
public class ActivityC13279x3d93ec0b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.widget.AdapterView.OnItemClickListener, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f179229x0 = 0;
    public android.view.View A;
    public android.view.View B;
    public android.widget.TextView C;
    public android.view.View D;
    public m22.d E;
    public android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f179230J;
    public android.widget.ImageView K;
    public android.widget.Button L;
    public android.widget.TextView M;
    public java.util.List N;
    public m22.x U;
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 V;
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 W;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f179232e;

    /* renamed from: f, reason: collision with root package name */
    public c22.e f179233f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f179234g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.a f179235h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f179236i;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f179238n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f179239o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f179240p;

    /* renamed from: u, reason: collision with root package name */
    public pr.b1 f179246u;

    /* renamed from: x, reason: collision with root package name */
    public m22.e f179249x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13378x554507f3 f179250y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f179251z;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0 f179231d = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.NORMAL;

    /* renamed from: m, reason: collision with root package name */
    public final pr.r0 f179237m = pr.r0.f439308d;

    /* renamed from: q, reason: collision with root package name */
    public boolean f179242q = false;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o0 f179243r = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o0.EMPTY;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f179244s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public int f179245t = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f179247v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f179248w = 0;
    public int F = -1;
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6416x520012d1 G = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6416x520012d1();
    public boolean H = false;
    public final android.view.View.OnClickListener P = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d0(this);
    public final l75.q0 Q = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g0(this);
    public final pr.e0 R = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h0(this);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 S = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.i0(this);
    public final ir.p T = new ir.p();
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p0 X = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p0.TYPE_WA_APP;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f179241p0 = null;

    public static java.util.List T6(java.util.List list) {
        return kz5.n0.l0(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13292xe0da2002());
    }

    public final ir.u0 U6(java.util.List list, java.lang.String str) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ir.u0 u0Var = (ir.u0) it.next();
            if ((u0Var instanceof ir.g) && ((ir.g) u0Var).f375369b.mo42933xb5885648().equals(str)) {
                return u0Var;
            }
        }
        return null;
    }

    public final void V6(boolean z17) {
        this.H = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "freezeDataUpdate(%s)", java.lang.String.valueOf(z17));
    }

    public final java.lang.String W6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List list = this.N;
        if (list != null && !list.isEmpty()) {
            for (int i17 = 0; i17 < this.N.size() - 1; i17++) {
                if (this.N.get(i17) != null) {
                    sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r0) this.N.get(i17)).f179708a);
                    sb6.append("#");
                }
            }
            if (this.N.get(r1.size() - 1) != null) {
                sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r0) this.N.get(r1.size() - 1)).f179708a);
            }
        }
        return sb6.toString();
    }

    public final void X6(android.content.Intent intent) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "data intent is null");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("upload_token");
        java.lang.String stringExtra2 = intent.getStringExtra("upload_file_url");
        java.lang.String stringExtra3 = intent.getStringExtra("extra_id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "url is " + stringExtra2);
        if (android.text.TextUtils.isEmpty(stringExtra3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "md5 is empty ");
            stringExtra3 = intent.getStringExtra("extra_md5");
            if (android.text.TextUtils.isEmpty(stringExtra3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "md5 is empty give up ");
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "token or md5 is empty ");
            stringExtra = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "upload token " + stringExtra + ", md5 %s", stringExtra3);
        if (this.N == null) {
            this.N = new java.util.ArrayList();
        }
        this.N.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r0(this);
        r0Var.f179708a = stringExtra3;
        r0Var.f179709b = stringExtra;
        r0Var.f179710c = stringExtra2;
        this.N.add(0, r0Var);
        if (!this.Y) {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_emoticon_post_entrance_json_andr, "", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "jumpConfig " + Zi);
            if (android.text.TextUtils.isEmpty(Zi)) {
                return;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                boolean z17 = jSONObject.getInt("postEntrance") == 1;
                this.Y = z17;
                if (!z17) {
                    return;
                } else {
                    this.X = jSONObject.getInt("jumpType") == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p0.TYPE_LITE_APP : com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p0.TYPE_WA_APP;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiCustomUI", "json parse failed " + e17.toString());
                return;
            }
        }
        java.util.List list = this.N;
        if (list == null || list.isEmpty() || this.f179245t != 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "md5 " + r0Var.f179708a);
        if (android.text.TextUtils.isEmpty(r0Var.f179708a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "md5 is empty");
            return;
        }
        java.util.Iterator it = this.f179233f.f402152f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ir.u0 u0Var = (ir.u0) it.next();
            if (u0Var instanceof ir.g) {
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = ((ir.g) u0Var).f375369b;
                if ((interfaceC4987x84e327cb instanceof com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) && (c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb) != null && r0Var.f179708a.equals(c21053xdbf1e5f4.mo42933xb5885648())) {
                    this.W = c21053xdbf1e5f4;
                    break;
                }
            }
        }
        if (this.W == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "no find emojiInfo " + r0Var.f179708a);
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            this.W = c21053xdbf1e5f42;
            c21053xdbf1e5f42.f68671x4b6e68b9 = r0Var.f179708a;
            c21053xdbf1e5f42.f68654xf47770e7 = r0Var.f179710c;
        }
        if (this.I != null) {
            zq.h.f556505a.c(this.W, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x(this));
        }
        android.view.View view = this.f179230J;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "showPostEmoticonEntrance", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$PostInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "showPostEmoticonEntrance", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$PostInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.Z = false;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("emo_cnt", 1);
        hashMap.put("emo_md5_list", W6());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("add_single_emo_page_bar", "view_exp", hashMap, 35262);
    }

    public final void Y6() {
        java.util.List T6 = T6(this.f179244s);
        java.util.ArrayList arrayList = this.f179233f.f402152f;
        for (int i17 = 0; i17 < this.f179234g.m8008x3d79f549(); i17++) {
            int m8032xa86cd69f = this.f179234g.m8032xa86cd69f(this.f179234g.m8007x6a486239(i17));
            ir.u0 u0Var = (ir.u0) arrayList.get(m8032xa86cd69f);
            if (u0Var instanceof ir.g) {
                if (((java.util.ArrayList) T6).contains(((ir.g) u0Var).f375369b.mo42933xb5885648())) {
                    this.f179233f.m8147xed6e4d18(m8032xa86cd69f);
                }
            }
        }
    }

    public final void Z6() {
        java.util.ArrayList arrayList = this.f179244s;
        if (arrayList != null) {
            arrayList.clear();
            this.f179233f.J(this.f179244s);
        }
        e7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "clear md5 list. updateMode NORMAL");
    }

    public final void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o0 o0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "dz[updateButtonType,button type:%s]", o0Var.toString());
        this.f179243r = o0Var;
        int ordinal = o0Var.ordinal();
        if (ordinal == 0) {
            this.f179239o.setVisibility(0);
            this.f179239o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572653c06);
        } else if (ordinal == 1) {
            this.f179239o.setVisibility(0);
            this.f179239o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c07);
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f179239o.setVisibility(4);
        }
    }

    public void b7() {
        if (this.f179231d == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT) {
            java.util.ArrayList arrayList = this.f179244s;
            int size = arrayList == null ? 0 : arrayList.size();
            if (size > 0) {
                this.C.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwn, java.lang.Integer.valueOf(size)));
                this.C.setEnabled(true);
                this.B.setEnabled(true);
            } else {
                this.C.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
                this.C.setEnabled(false);
                this.B.setEnabled(false);
            }
            e7();
        }
    }

    public void c7() {
        android.view.View view = this.f179236i;
        int i17 = this.f179231d == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0 q0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "updateMode: %s -> %s", this.f179231d.name(), q0Var.name());
        java.lang.System.currentTimeMillis();
        this.f179231d = q0Var;
        c22.e eVar = this.f179233f;
        eVar.getClass();
        eVar.f119531o = q0Var;
        int ordinal = q0Var.ordinal();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.S;
        if (ordinal == 0) {
            mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$s
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                    activityC13279x3d93ec0b.getClass();
                    cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    aVar.pk(activityC13279x3d93ec0b.mo78514x143f1b92().K, "emoji_close");
                    cy1.a aVar2 = (cy1.a) aVar.ik(activityC13279x3d93ec0b.mo78514x143f1b92().K, 8, 28444);
                    aVar2.Xj(activityC13279x3d93ec0b.mo78514x143f1b92().K, "view_clk", new java.util.HashMap());
                    aVar2.Cj("view_clk", activityC13279x3d93ec0b.mo78514x143f1b92().K, new java.util.HashMap(), 28444);
                    activityC13279x3d93ec0b.finish();
                    return true;
                }
            });
            m78560xe21cbbf(true);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(mo78514x143f1b92().K, "emoji_manage_finish");
            ((cy1.a) aVar.ik(mo78514x143f1b92().K, 8, 28444)).Xj(mo78514x143f1b92().K, "view_clk", new java.util.HashMap());
            m78499x92e71989(true);
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.byj), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$t
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0 q0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                    activityC13279x3d93ec0b.d7(q0Var2);
                    n22.c.b(1, activityC13279x3d93ec0b.f179248w);
                    activityC13279x3d93ec0b.f179233f.m8146xced61ae5();
                    return true;
                }
            });
            this.f179232e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$u
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                    android.view.View view = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this.mo78514x143f1b92().E(0).f289917j;
                    cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    aVar2.pk(view, "emoji_tidyup");
                    ((cy1.a) aVar2.ik(view, 8, 28444)).Xj(view, "view_clk", new java.util.HashMap());
                }
            });
            android.view.View view = this.f179236i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this) && n3Var != null) {
                n3Var.mo50307xb9e94560(1003, 0);
            }
            Z6();
            c7();
            m22.e eVar2 = this.f179249x;
            eVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFreeSortingItemDec", "switchToFixedMode: ");
            eVar2.f404574i = false;
            eVar2.f404569d.D0();
            this.f179233f.m8147xed6e4d18(0);
            int a17 = ym5.x.a(this, 4.0f);
            int a18 = ym5.x.a(this, 8.0f);
            this.f179232e.scrollBy(0, -(a18 - this.f179232e.getPaddingTop()));
            this.f179232e.setPadding(a17, a18, a17, a18);
            android.view.View view2 = this.f179251z;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13378x554507f3 c13378x554507f3 = this.f179250y;
            c13378x554507f3.removeAllViews();
            c13378x554507f3.setVisibility(8);
            c22.e eVar3 = this.f179233f;
            eVar3.m8151xc67946d3(0, eVar3.mo1894x7e414b06());
            android.view.View view3 = this.f179236i;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559856gq, typedValue, true);
            view3.setBackground(b3.l.m9707x4a96be14(this, typedValue.resourceId));
            android.view.View view4 = this.D;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.E.f404555d = false;
            V6(false);
            this.f179233f.m8146xced61ae5();
        } else if (ordinal == 1) {
            m78560xe21cbbf(false);
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$v
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this.d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.NORMAL);
                    return true;
                }
            });
            this.f179232e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$w
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                    android.view.View view5 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this.mo78514x143f1b92().E(0).f289917j;
                    cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    aVar2.pk(view5, "emoji_tidyup_cancel");
                    ((cy1.a) aVar2.ik(view5, 8, 28444)).Xj(view5, "view_clk", new java.util.HashMap());
                }
            });
            android.view.View view5 = this.f179236i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (n3Var != null) {
                n3Var.mo50307xb9e94560(1003, 0);
            }
            b7();
            c7();
            int a19 = ym5.x.a(this, 4.0f);
            int a27 = ym5.x.a(this, 8.0f);
            this.f179232e.scrollBy(0, -(a27 - this.f179232e.getPaddingTop()));
            this.f179232e.setPadding(a19, a27, a19, a27);
            this.f179233f.m8147xed6e4d18(0);
            android.view.View view6 = this.A;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.B;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13378x554507f3 c13378x554507f32 = this.f179250y;
            c13378x554507f32.removeAllViews();
            c13378x554507f32.setVisibility(8);
            m22.e eVar4 = this.f179249x;
            eVar4.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFreeSortingItemDec", "switchToFixedMode: ");
            eVar4.f404574i = false;
            eVar4.f404569d.D0();
            android.view.View view8 = this.f179251z;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f179236i;
            android.util.TypedValue typedValue2 = new android.util.TypedValue();
            getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559856gq, typedValue2, true);
            view9.setBackground(b3.l.m9707x4a96be14(this, typedValue2.resourceId));
            android.view.View view10 = this.D;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.E.f404555d = true;
        } else if (ordinal == 2) {
            c7();
            m22.e eVar5 = this.f179249x;
            eVar5.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFreeSortingItemDec", "switchToFixedMode: ");
            eVar5.f404574i = false;
            eVar5.f404569d.D0();
            this.f179233f.m8147xed6e4d18(0);
        } else if (ordinal == 3) {
            c7();
        } else if (ordinal == 4) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.util.ArrayList arrayList9 = this.f179244s;
            objArr[0] = java.lang.Integer.valueOf(arrayList9 == null ? 0 : arrayList9.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "start dragging emojis: %d", objArr);
            java.util.ArrayList arrayList10 = this.f179244s;
            if (arrayList10 != null && !arrayList10.isEmpty()) {
                V6(true);
                m78560xe21cbbf(false);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f179232e;
                c1163xf1deaba4.setPadding(c1163xf1deaba4.getPaddingLeft(), this.f179232e.getPaddingTop(), this.f179232e.getPaddingRight(), ym5.x.a(this, 240.0f));
                m78551x8f8ecf18(0);
                android.view.View view11 = this.A;
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList11.add(0);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view12 = this.B;
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.C.setVisibility(8);
                android.view.View view13 = this.f179251z;
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(0);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f179232e.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z(this));
                this.f179236i.setBackground(null);
                android.view.View view14 = this.D;
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(0);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.E.f404555d = false;
            }
        }
        this.f179235h.i(true);
        this.f179235h.e();
        java.lang.System.currentTimeMillis();
    }

    public final void e7() {
        java.util.ArrayList arrayList = this.f179244s;
        int size = arrayList == null ? 0 : arrayList.size();
        if (size != 0) {
            mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bxw, java.lang.Integer.valueOf(size)));
        } else if (this.f179245t == 0) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvn, java.lang.Integer.valueOf(this.f179235h.b().a())));
        } else {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572620bv3, java.lang.Integer.valueOf(this.f179235h.b().a())));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a6c;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.TextView textView;
        this.f179238n = findViewById(com.p314xaae8f345.mm.R.id.nui);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.nub);
        this.f179239o = button;
        button.setOnClickListener(this.P);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.dan);
        this.f179232e = c1163xf1deaba4;
        c1163xf1deaba4.setFocusable(false);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(this, 5);
        this.f179234g = c1161x57298f5d;
        c1161x57298f5d.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.j0(this);
        this.f179232e.mo7967x900dcbe1(this.f179234g);
        m22.e eVar = new m22.e(this.f179232e, 5, false);
        this.f179249x = eVar;
        this.f179232e.N(eVar);
        if (this.f179245t == 0) {
            this.I = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567888ur2);
            this.f179230J = findViewById(com.p314xaae8f345.mm.R.id.t2e);
            this.K = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.u0_);
            this.L = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.u0a);
            this.M = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567906us0);
            if (com.p314xaae8f345.mm.ui.bk.C() && (textView = this.M) != null) {
                textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            }
            android.view.View view = this.f179230J;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.L.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i17;
                    java.lang.String str;
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                    activityC13279x3d93ec0b.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13279x3d93ec0b, array);
                    java.util.List list = activityC13279x3d93ec0b.N;
                    if (list == null || ((java.util.ArrayList) list).isEmpty() || ((java.util.ArrayList) activityC13279x3d93ec0b.N).get(0) == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiCustomUI", "postTokens is empty");
                    } else {
                        activityC13279x3d93ec0b.Z = true;
                        q80.d0 d0Var = new q80.d0();
                        d0Var.f442182a = "wxalite3781e0acb99de51167d8cc934ce9f490";
                        d0Var.f442183b = "pages/setting";
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r0) ((java.util.ArrayList) activityC13279x3d93ec0b.N).get(0);
                        if (activityC13279x3d93ec0b.X == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p0.TYPE_WA_APP) {
                            l81.b1 b1Var = new l81.b1();
                            b1Var.f398547b = "wxb08362e4cc792a91";
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                                i17 = 2;
                            } else {
                                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                i17 = 0;
                            }
                            b1Var.f398549c = i17;
                            b1Var.f398565k = 1417;
                            b1Var.f398555f = "pages/login/login.html";
                            b1Var.f398551d = 0;
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("fromApp", "my-favourite-emoticons");
                                jSONObject.put("md5", r0Var.f179708a);
                                jSONObject.put("token", r0Var.f179709b);
                                jSONObject.put("fromAppImage", r0Var.f179710c);
                                str = jSONObject.toString();
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "json exception " + e17.toString());
                                str = "";
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
                            c11812xa040dc98.f158857f = str;
                            c11812xa040dc98.f158855d = 1;
                            c11812xa040dc98.f158856e = "wxb08362e4cc792a91";
                            b1Var.f398574s = c11812xa040dc98;
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(activityC13279x3d93ec0b, b1Var);
                        } else {
                            try {
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("md5", r0Var.f179708a);
                                jSONObject2.put("token", r0Var.f179709b);
                                org.json.JSONArray jSONArray = new org.json.JSONArray();
                                jSONArray.put(jSONObject2);
                                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                jSONObject3.put("imageInfoList", jSONArray);
                                jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
                                d0Var.f442184c = jSONObject3.toString();
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiCustomUI", "try json error %s", e18.getMessage());
                            }
                            final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
                            sVar.f225701e = "wxalite3781e0acb99de51167d8cc934ce9f490";
                            sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$h
                                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
                                /* renamed from: onDispatch */
                                public final boolean mo9541xb6136779(long j17, java.lang.String str3, java.lang.Object obj, int i19) {
                                    int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                                    if (obj != null && str3 != null && str3.equals("getImageLocalIdByMd5") && (obj instanceof org.json.JSONObject)) {
                                        java.lang.String optString = ((org.json.JSONObject) obj).optString("md5");
                                        if (android.text.TextUtils.isEmpty(optString)) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiCustomUI", "no found md5");
                                        } else {
                                            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(optString);
                                            if (N != null) {
                                                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s.this;
                                                java.lang.String str4 = sVar2.f225701e;
                                                long j18 = sVar2.f225699c;
                                                java.lang.String T = N.T();
                                                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
                                                java.lang.String m65291x71b41ca8 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65291x71b41ca8(j18, str4, T);
                                                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                                                try {
                                                    jSONObject4.put(dm.i4.f66867x2a5c95c7, m65291x71b41ca8);
                                                    sVar2.c(j17, i19, jSONObject4.toString());
                                                } catch (java.lang.Exception e19) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiCustomUI", "to json error " + e19.getMessage());
                                                    sVar2.c(j17, i19, "");
                                                }
                                                return true;
                                            }
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiCustomUI", "emoji is null. md5:%s");
                                        }
                                    }
                                    return false;
                                }
                            };
                            d0Var.f442205x = sVar;
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(activityC13279x3d93ec0b, d0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.y(activityC13279x3d93ec0b, d0Var));
                        }
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("emo_cnt", 1);
                        hashMap.put("emo_md5_list", activityC13279x3d93ec0b.W6());
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("add_single_emo_page_bar_publish", "view_clk", hashMap, 35262);
                    }
                    yj0.a.h(activityC13279x3d93ec0b, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.L.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                    activityC13279x3d93ec0b.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    arrayList2.add(motionEvent);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", activityC13279x3d93ec0b, array);
                    if (motionEvent.getAction() == 0) {
                        activityC13279x3d93ec0b.L.setTextColor(android.graphics.Color.parseColor("#cc576b95"));
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        activityC13279x3d93ec0b.L.setTextColor(activityC13279x3d93ec0b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
                    }
                    yj0.a.i(false, activityC13279x3d93ec0b, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            });
            this.K.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                    activityC13279x3d93ec0b.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13279x3d93ec0b, array);
                    android.view.View view3 = activityC13279x3d93ec0b.f179230J;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "closePostEmoticonTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "closePostEmoticonTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("emo_cnt", 1);
                    hashMap.put("emo_md5_list", activityC13279x3d93ec0b.W6());
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("add_single_emo_page_bar_close", "view_clk", hashMap, 35262);
                    yj0.a.h(activityC13279x3d93ec0b, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        c22.e eVar2 = new c22.e();
        this.f179233f = eVar2;
        eVar2.f402153g = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k0(this);
        this.f179232e.mo7960x6cab2c8d(eVar2);
        if (this.f179245t == 1) {
            this.f179235h = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.l0(this);
        } else {
            this.f179235h = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.m0(this, true);
        }
        this.f179235h.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.n0(this, this.f179233f));
        this.f179233f.E(this.f179235h.b().b());
        this.f179236i = findViewById(com.p314xaae8f345.mm.R.id.mpe);
        this.f179250y = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13378x554507f3) findViewById(com.p314xaae8f345.mm.R.id.d4i);
        this.f179251z = findViewById(com.p314xaae8f345.mm.R.id.ngi);
        this.D = findViewById(com.p314xaae8f345.mm.R.id.d4e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mpf);
        this.C = textView2;
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$e
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                activityC13279x3d93ec0b.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13279x3d93ec0b, array);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6416x520012d1 c6416x520012d1 = activityC13279x3d93ec0b.G;
                c6416x520012d1.f137589d = 2L;
                c6416x520012d1.f137591f = activityC13279x3d93ec0b.f179244s.size();
                java.util.ArrayList arrayList3 = activityC13279x3d93ec0b.f179244s;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    java.util.Iterator it = activityC13279x3d93ec0b.f179244s.iterator();
                    boolean z17 = false;
                    boolean z18 = false;
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it.next();
                        if ("9bd1281af3a31710a45b84d736363691".equals(c21053xdbf1e5f4.mo42933xb5885648())) {
                            z17 = true;
                        }
                        if ("08f223fa83f1ca34e143d1e580252c7c".equals(c21053xdbf1e5f4.mo42933xb5885648())) {
                            z18 = true;
                        }
                    }
                    if (z17 || z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "deleteEmoji: forbid, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
                        db5.e1.A(activityC13279x3d93ec0b.mo55332x76847179(), activityC13279x3d93ec0b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvk, z18 ? activityC13279x3d93ec0b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572629bw0) : activityC13279x3d93ec0b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwj)), "", "", activityC13279x3d93ec0b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), null, null);
                        yj0.a.h(activityC13279x3d93ec0b, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                }
                db5.e1.B(activityC13279x3d93ec0b.mo55332x76847179(), activityC13279x3d93ec0b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvq), "", activityC13279x3d93ec0b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), activityC13279x3d93ec0b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.a0(activityC13279x3d93ec0b), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f561016a32);
                yj0.a.h(activityC13279x3d93ec0b, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this.C, "emoji_select_delete");
        ((cy1.a) aVar.ik(this.C, 8, 28444)).Xj(this.C, "view_clk", new java.util.HashMap());
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mpd);
        this.A = findViewById;
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$f
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                activityC13279x3d93ec0b.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13279x3d93ec0b, array);
                activityC13279x3d93ec0b.d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT);
                activityC13279x3d93ec0b.f179233f.E(activityC13279x3d93ec0b.f179235h.b().b());
                activityC13279x3d93ec0b.f179233f.m8146xced61ae5();
                yj0.a.h(activityC13279x3d93ec0b, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(this.A, "emoji_move_cancel");
        ((cy1.a) aVar2.ik(this.A, 8, 28444)).Xj(this.A, "view_clk", new java.util.HashMap());
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.mpg);
        this.B = findViewById2;
        findViewById2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$g
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                activityC13279x3d93ec0b.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13279x3d93ec0b, array);
                activityC13279x3d93ec0b.G.f137589d = 1L;
                activityC13279x3d93ec0b.d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.DRAGGING);
                yj0.a.h(activityC13279x3d93ec0b, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.pk(this.B, "emoji_select_move");
        ((cy1.a) aVar3.ik(this.B, 8, 28444)).Xj(this.B, "view_clk", new java.util.HashMap());
        m22.d dVar = new m22.d(this);
        this.E = dVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = this.f179232e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.u(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        dVar.f404563o = recyclerView;
        dVar.f404564p = uVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        dVar.f404565q = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager;
        recyclerView.P(dVar);
        m22.x xVar = new m22.x(mo55332x76847179(), 5);
        this.U = xVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView2 = this.f179232e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13378x554507f3 indicatorView = this.f179250y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView2, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indicatorView, "indicatorView");
        xVar.f404605e = recyclerView2;
        xVar.f404606f = tVar;
        recyclerView2.N(xVar);
        recyclerView2.O(xVar);
        recyclerView2.setOnDragListener(xVar);
        indicatorView.setOnTouchListener(new m22.v(indicatorView));
        cy1.a aVar4 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar4.pk(mo78514x143f1b92().K, "emoji_manage_finish");
        ((cy1.a) aVar4.ik(mo78514x143f1b92().K, 8, 28444)).Xj(mo78514x143f1b92().K, "view_clk", new java.util.HashMap());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("data is null ");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", sb6.toString());
        if (i18 == -1) {
            switch (i17) {
                case 205:
                    X6(intent);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("CropImageMode", 3);
                    intent2.putExtra("CropImage_OutputPath", n22.m.g());
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.r(intent2, 206, this, intent);
                    return;
                case 206:
                    if (intent == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult MAT_IMAGE_IN_CROP_ACTIVITY return null.");
                        return;
                    }
                    java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                    int intExtra = intent.getIntExtra("emoji_type", 0);
                    if (stringExtra == null || stringExtra.length() < 1) {
                        return;
                    }
                    java.lang.String substring = stringExtra.substring(stringExtra.lastIndexOf(47) + 1);
                    java.lang.String str = n22.m.g() + substring;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                    this.V = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(substring);
                    ck5.c cVar = new ck5.c(str);
                    cVar.f124083b = ip.c.b();
                    int c17 = ip.c.c();
                    cVar.f124084c = c17;
                    cVar.f124085d = c17;
                    cVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.w(this, intExtra, substring));
                    return;
                case 207:
                    X6(intent);
                    return;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult: not found this requestCode");
                    return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f179231d == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT) {
            d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.NORMAL);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        this.f179245t = getIntent().getIntExtra("key_emoji_panel_type", this.f179245t);
        this.f179247v = getIntent().getBooleanExtra("key_from_settings_mine", false);
        this.f179248w = getIntent().getIntExtra("key_from_scene", 0);
        if (this.f179245t == 1) {
            this.f179246u = pr.k0.f439256q.a(false);
        } else {
            this.f179246u = pr.k0.f439256q.b(false);
        }
        mo43517x10010bd5();
        d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.NORMAL);
        boolean booleanValue = this.f179245t == 1 ? ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() : ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "[cpan] touch batch emoji download from EmojiCustomUI needDownload:%b", java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue) {
            new pr.t(this.f179245t, null, false).a();
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().add(this.Q);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(406L, 9L, 1L, false);
        g0Var.mo68477x336bdfd8(406L, 11L, java.lang.System.currentTimeMillis() - currentTimeMillis, false);
        g0Var.d(12740, 4, "", "", "", 28, 28);
        this.f179246u.f(this.R);
        this.f179246u.b(true);
        gr.v.f356229a.a(true);
        if (this.f179245t == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z4 z4Var = com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j;
            if (z4Var.d() && !com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.wi()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "setupEmojiRecognition: isFromSettingsMine=" + this.f179247v);
                if (this.f179247v) {
                    android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cor);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.cok);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    final com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.coq);
                    viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z4Var.e());
                    final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a296 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296();
                    c6384xa2a6a296.f137298d = 1;
                    c6384xa2a6a296.f137299e = 1L;
                    c6384xa2a6a296.f137300f = z4Var.e() ? 1L : 2L;
                    c6384xa2a6a296.k();
                    viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new al5.c2() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$k
                        @Override // al5.c2
                        /* renamed from: onStatusChange */
                        public final void mo2289xd6191dc1(boolean z17) {
                            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this;
                            activityC13279x3d93ec0b.getClass();
                            final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a2962 = c6384xa2a6a296;
                            if (!z17) {
                                c6384xa2a6a2962.f137299e = 3L;
                                c6384xa2a6a2962.k();
                                com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j.h(false);
                            } else {
                                final com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = viewOnClickListenerC22631x1cc07cc8;
                                viewOnClickListenerC22631x1cc07cc82.clearAnimation();
                                viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(false);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h4.a(activityC13279x3d93ec0b.mo55332x76847179(), new yz5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$n
                                    @Override // yz5.a
                                    /* renamed from: invoke */
                                    public final java.lang.Object mo152xb9724478() {
                                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8.this.m81392x52cfa5c6(true);
                                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a2963 = c6384xa2a6a2962;
                                        c6384xa2a6a2963.f137299e = 2L;
                                        c6384xa2a6a2963.k();
                                        return null;
                                    }
                                }, new yz5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$o
                                    @Override // yz5.a
                                    /* renamed from: invoke */
                                    public final java.lang.Object mo152xb9724478() {
                                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a2963 = com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296.this;
                                        c6384xa2a6a2963.f137299e = 3L;
                                        c6384xa2a6a2963.k();
                                        return null;
                                    }
                                });
                            }
                        }
                    });
                } else {
                    final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a2962 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296();
                    c6384xa2a6a2962.f137298d = 2;
                    c6384xa2a6a2962.f137299e = 1L;
                    c6384xa2a6a2962.f137300f = 2L;
                    c6384xa2a6a2962.k();
                    if (!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOTION_RECOGNITION_GUIDE_BOOLEAN_SYNC, false)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h4.a(this, new yz5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$i
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a2963 = com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296.this;
                                c6384xa2a6a2963.f137299e = 2L;
                                c6384xa2a6a2963.k();
                                return null;
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$j
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296 c6384xa2a6a2963 = com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6384xa2a6a296.this;
                                c6384xa2a6a2963.f137299e = 3L;
                                c6384xa2a6a2963.k();
                                return null;
                            }
                        });
                    }
                }
            }
        }
        z12.g.I();
        m78588xfb5745ae(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this.f179232e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "lambda$onCreate$0", "()V", "Undefined", "scrollToPosition", "(I)V");
                c1163xf1deaba4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "lambda$onCreate$0", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        });
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.EmojiCustomUI);
        n22.c.b(7, this.f179248w);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo49775xc84af884(this.Q);
        this.f179246u.d(this.R);
        this.S.mo50302x6b17ad39(null);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.n().f354821b.q(698, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        super.onResume();
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this) && (n3Var = this.S) != null) {
            n3Var.mo50307xb9e94560(1003, 0);
        }
        gm0.j1.n().f354821b.a(698, this);
        if (this.Z) {
            this.Z = false;
            android.view.View view = this.f179230J;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (!(m1Var instanceof z12.g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiCustomUI", "no emoji operate");
            return;
        }
        int i19 = ((z12.g) m1Var).f550828g;
        if (i19 == 2) {
            android.app.ProgressDialog progressDialog = this.f179240p;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f179240p.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                this.f179233f.I();
                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e0(this, new java.util.ArrayList(T6(this.f179244s))));
                if (this.f179245t == 0) {
                    gr.t.g().n(true);
                    gr.t.g().l(true);
                } else {
                    gr.t.g().m(true);
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().n1(T6(this.f179244s), this.f179245t);
                Z6();
                b7();
                gr.v.f356229a.a(true);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Ai()) {
                    com.p314xaae8f345.mm.p2614xca6eae71.c0 c0Var = com.p314xaae8f345.mm.p2614xca6eae71.c0.f274758a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "restart");
                    c0Var.e(com.p314xaae8f345.mm.p2614xca6eae71.v.f274931d);
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z4 z4Var = com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j;
                    if (z4Var.e()) {
                        z4Var.g();
                    }
                }
                mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$l
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this.d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.NORMAL);
                        return true;
                    }
                });
                this.f179232e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$p
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                        android.view.View view = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this.mo78514x143f1b92().E(0).f289917j;
                        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                        aVar.pk(view, "emoji_manage_finish");
                        ((cy1.a) aVar.ik(view, 8, 28444)).Xj(view, "view_clk", new java.util.HashMap());
                    }
                });
                V6(false);
                this.f179235h.h();
                this.f179235h.e();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "delete failed");
                db5.e1.A(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwq), "", "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwr), null, null);
            }
        } else if (i19 == 3 || i19 == 5) {
            android.app.ProgressDialog progressDialog2 = this.f179240p;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f179240p.dismiss();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f179241p0;
            if (u3Var != null && u3Var.isShowing()) {
                this.f179241p0.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                if (this.f179245t == 0) {
                    gr.t.g().n(true);
                    gr.t.g().l(true);
                } else {
                    gr.t.g().m(true);
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                z85.l c17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
                int i27 = this.f179245t;
                int i28 = this.F;
                if (i27 == 0) {
                    i28--;
                }
                c17.o2(i27, i28, T6(this.f179244s));
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f179233f.f402152f);
                java.util.List b17 = this.f179235h.b().b();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f179244s);
                Z6();
                int i29 = this.F;
                if (arrayList2.size() > 0) {
                    ir.u0 U6 = U6(b17, ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) arrayList2.get(0)).mo42933xb5885648());
                    if (U6 != null) {
                        arrayList.set(i29, U6);
                        this.f179233f.m8147xed6e4d18(this.F);
                        i29++;
                    } else {
                        arrayList.remove(this.F);
                        this.f179233f.m8155x27702c4(this.F);
                    }
                }
                int i37 = i29;
                for (int i38 = 1; i38 < arrayList2.size(); i38++) {
                    ir.u0 U62 = U6(b17, ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) arrayList2.get(i38)).mo42933xb5885648());
                    if (U62 != null) {
                        arrayList.add(i37, U62);
                        i37++;
                    }
                }
                this.f179233f.E(arrayList);
                this.f179233f.m8153xd399a4d9(i29, i37 - i29);
                Y6();
                d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT);
                mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$q
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                        int i39 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this.d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.NORMAL);
                        return true;
                    }
                });
                this.f179232e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$r
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i39 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                        android.view.View view = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.this.mo78514x143f1b92().E(0).f289917j;
                        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                        aVar.pk(view, "emoji_manage_finish");
                        ((cy1.a) aVar.ik(view, 8, 28444)).Xj(view, "view_clk", new java.util.HashMap());
                    }
                });
                b7();
                this.f179232e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c0(this, arrayList2));
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(this.f179233f.f402152f);
                arrayList3.remove(this.T);
                this.f179233f.E(arrayList3);
                db5.e1.A(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwq), "", "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwr), null, null);
                this.f179233f.m8146xced61ae5();
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6416x520012d1 c6416x520012d1 = this.G;
        if (i17 == 0 && i18 == 0) {
            c6416x520012d1.f137590e = 1L;
        } else {
            c6416x520012d1.f137590e = 2L;
        }
        c6416x520012d1.f137594i = this.f179248w;
        c6416x520012d1.k();
    }
}
