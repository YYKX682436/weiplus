package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class EmojiCustomUI extends com.tencent.mm.ui.MMActivity implements android.widget.AdapterView.OnItemClickListener, com.tencent.mm.modelbase.u0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f97696x0 = 0;
    public android.view.View A;
    public android.view.View B;
    public android.widget.TextView C;
    public android.view.View D;
    public m22.d E;
    public android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f97697J;
    public android.widget.ImageView K;
    public android.widget.Button L;
    public android.widget.TextView M;
    public java.util.List N;
    public m22.x U;
    public com.tencent.mm.storage.emotion.EmojiInfo V;
    public com.tencent.mm.storage.emotion.EmojiInfo W;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f97699e;

    /* renamed from: f, reason: collision with root package name */
    public c22.e f97700f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.GridLayoutManager f97701g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.a f97702h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f97703i;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f97705n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f97706o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f97707p;

    /* renamed from: u, reason: collision with root package name */
    public pr.b1 f97713u;

    /* renamed from: x, reason: collision with root package name */
    public m22.e f97716x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.widget.EmojiDragStackView f97717y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f97718z;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.q0 f97698d = com.tencent.mm.plugin.emoji.ui.q0.NORMAL;

    /* renamed from: m, reason: collision with root package name */
    public final pr.r0 f97704m = pr.r0.f357775d;

    /* renamed from: q, reason: collision with root package name */
    public boolean f97709q = false;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.o0 f97710r = com.tencent.mm.plugin.emoji.ui.o0.EMPTY;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f97711s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public int f97712t = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f97714v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f97715w = 0;
    public int F = -1;
    public final com.tencent.mm.autogen.mmdata.rpt.EmoticonManageDetailStruct G = new com.tencent.mm.autogen.mmdata.rpt.EmoticonManageDetailStruct();
    public boolean H = false;
    public final android.view.View.OnClickListener P = new com.tencent.mm.plugin.emoji.ui.d0(this);
    public final l75.q0 Q = new com.tencent.mm.plugin.emoji.ui.g0(this);
    public final pr.e0 R = new com.tencent.mm.plugin.emoji.ui.h0(this);
    public final com.tencent.mm.sdk.platformtools.n3 S = new com.tencent.mm.plugin.emoji.ui.i0(this);
    public final ir.p T = new ir.p();
    public com.tencent.mm.plugin.emoji.ui.p0 X = com.tencent.mm.plugin.emoji.ui.p0.TYPE_WA_APP;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f97708p0 = null;

    public static java.util.List T6(java.util.List list) {
        return kz5.n0.l0(list, new com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$m());
    }

    public final ir.u0 U6(java.util.List list, java.lang.String str) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ir.u0 u0Var = (ir.u0) it.next();
            if ((u0Var instanceof ir.g) && ((ir.g) u0Var).f293836b.getMd5().equals(str)) {
                return u0Var;
            }
        }
        return null;
    }

    public final void V6(boolean z17) {
        this.H = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "freezeDataUpdate(%s)", java.lang.String.valueOf(z17));
    }

    public final java.lang.String W6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List list = this.N;
        if (list != null && !list.isEmpty()) {
            for (int i17 = 0; i17 < this.N.size() - 1; i17++) {
                if (this.N.get(i17) != null) {
                    sb6.append(((com.tencent.mm.plugin.emoji.ui.r0) this.N.get(i17)).f98175a);
                    sb6.append("#");
                }
            }
            if (this.N.get(r1.size() - 1) != null) {
                sb6.append(((com.tencent.mm.plugin.emoji.ui.r0) this.N.get(r1.size() - 1)).f98175a);
            }
        }
        return sb6.toString();
    }

    public final void X6(android.content.Intent intent) {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "data intent is null");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("upload_token");
        java.lang.String stringExtra2 = intent.getStringExtra("upload_file_url");
        java.lang.String stringExtra3 = intent.getStringExtra("extra_id");
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "url is " + stringExtra2);
        if (android.text.TextUtils.isEmpty(stringExtra3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "md5 is empty ");
            stringExtra3 = intent.getStringExtra("extra_md5");
            if (android.text.TextUtils.isEmpty(stringExtra3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "md5 is empty give up ");
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "token or md5 is empty ");
            stringExtra = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "upload token " + stringExtra + ", md5 %s", stringExtra3);
        if (this.N == null) {
            this.N = new java.util.ArrayList();
        }
        this.N.clear();
        com.tencent.mm.plugin.emoji.ui.r0 r0Var = new com.tencent.mm.plugin.emoji.ui.r0(this);
        r0Var.f98175a = stringExtra3;
        r0Var.f98176b = stringExtra;
        r0Var.f98177c = stringExtra2;
        this.N.add(0, r0Var);
        if (!this.Y) {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_emoticon_post_entrance_json_andr, "", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "jumpConfig " + Zi);
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
                    this.X = jSONObject.getInt("jumpType") == 1 ? com.tencent.mm.plugin.emoji.ui.p0.TYPE_LITE_APP : com.tencent.mm.plugin.emoji.ui.p0.TYPE_WA_APP;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiCustomUI", "json parse failed " + e17.toString());
                return;
            }
        }
        java.util.List list = this.N;
        if (list == null || list.isEmpty() || this.f97712t != 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "md5 " + r0Var.f98175a);
        if (android.text.TextUtils.isEmpty(r0Var.f98175a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "md5 is empty");
            return;
        }
        java.util.Iterator it = this.f97700f.f320619f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ir.u0 u0Var = (ir.u0) it.next();
            if (u0Var instanceof ir.g) {
                com.tencent.mm.api.IEmojiInfo iEmojiInfo = ((ir.g) u0Var).f293836b;
                if ((iEmojiInfo instanceof com.tencent.mm.storage.emotion.EmojiInfo) && (emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo) != null && r0Var.f98175a.equals(emojiInfo.getMd5())) {
                    this.W = emojiInfo;
                    break;
                }
            }
        }
        if (this.W == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "no find emojiInfo " + r0Var.f98175a);
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = new com.tencent.mm.storage.emotion.EmojiInfo();
            this.W = emojiInfo2;
            emojiInfo2.field_md5 = r0Var.f98175a;
            emojiInfo2.field_cdnUrl = r0Var.f98177c;
        }
        if (this.I != null) {
            zq.h.f474972a.c(this.W, new com.tencent.mm.plugin.emoji.ui.x(this));
        }
        android.view.View view = this.f97697J;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        java.util.List T6 = T6(this.f97711s);
        java.util.ArrayList arrayList = this.f97700f.f320619f;
        for (int i17 = 0; i17 < this.f97701g.getChildCount(); i17++) {
            int position = this.f97701g.getPosition(this.f97701g.getChildAt(i17));
            ir.u0 u0Var = (ir.u0) arrayList.get(position);
            if (u0Var instanceof ir.g) {
                if (((java.util.ArrayList) T6).contains(((ir.g) u0Var).f293836b.getMd5())) {
                    this.f97700f.notifyItemChanged(position);
                }
            }
        }
    }

    public final void Z6() {
        java.util.ArrayList arrayList = this.f97711s;
        if (arrayList != null) {
            arrayList.clear();
            this.f97700f.J(this.f97711s);
        }
        e7();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "clear md5 list. updateMode NORMAL");
    }

    public final void a7(com.tencent.mm.plugin.emoji.ui.o0 o0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "dz[updateButtonType,button type:%s]", o0Var.toString());
        this.f97710r = o0Var;
        int ordinal = o0Var.ordinal();
        if (ordinal == 0) {
            this.f97706o.setVisibility(0);
            this.f97706o.setText(com.tencent.mm.R.string.f491120c06);
        } else if (ordinal == 1) {
            this.f97706o.setVisibility(0);
            this.f97706o.setText(com.tencent.mm.R.string.c07);
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f97706o.setVisibility(4);
        }
    }

    public void b7() {
        if (this.f97698d == com.tencent.mm.plugin.emoji.ui.q0.EDIT) {
            java.util.ArrayList arrayList = this.f97711s;
            int size = arrayList == null ? 0 : arrayList.size();
            if (size > 0) {
                this.C.setText(getResources().getString(com.tencent.mm.R.string.bwn, java.lang.Integer.valueOf(size)));
                this.C.setEnabled(true);
                this.B.setEnabled(true);
            } else {
                this.C.setText(getResources().getString(com.tencent.mm.R.string.f490367t0));
                this.C.setEnabled(false);
                this.B.setEnabled(false);
            }
            e7();
        }
    }

    public void c7() {
        android.view.View view = this.f97703i;
        int i17 = this.f97698d == com.tencent.mm.plugin.emoji.ui.q0.EDIT ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d7(com.tencent.mm.plugin.emoji.ui.q0 q0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "updateMode: %s -> %s", this.f97698d.name(), q0Var.name());
        java.lang.System.currentTimeMillis();
        this.f97698d = q0Var;
        c22.e eVar = this.f97700f;
        eVar.getClass();
        eVar.f37998o = q0Var;
        int ordinal = q0Var.ordinal();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.S;
        if (ordinal == 0) {
            setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$s
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                    com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                    emojiCustomUI.getClass();
                    cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    aVar.pk(emojiCustomUI.getController().K, "emoji_close");
                    cy1.a aVar2 = (cy1.a) aVar.ik(emojiCustomUI.getController().K, 8, 28444);
                    aVar2.Xj(emojiCustomUI.getController().K, "view_clk", new java.util.HashMap());
                    aVar2.Cj("view_clk", emojiCustomUI.getController().K, new java.util.HashMap(), 28444);
                    emojiCustomUI.finish();
                    return true;
                }
            });
            setBackBtnVisible(true);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(getController().K, "emoji_manage_finish");
            ((cy1.a) aVar.ik(getController().K, 8, 28444)).Xj(getController().K, "view_clk", new java.util.HashMap());
            enableBackMenu(true);
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.byj), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$t
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                    com.tencent.mm.plugin.emoji.ui.q0 q0Var2 = com.tencent.mm.plugin.emoji.ui.q0.EDIT;
                    com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                    emojiCustomUI.d7(q0Var2);
                    n22.c.b(1, emojiCustomUI.f97715w);
                    emojiCustomUI.f97700f.notifyDataSetChanged();
                    return true;
                }
            });
            this.f97699e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$u
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                    android.view.View view = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this.getController().E(0).f208384j;
                    cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    aVar2.pk(view, "emoji_tidyup");
                    ((cy1.a) aVar2.ik(view, 8, 28444)).Xj(view, "view_clk", new java.util.HashMap());
                }
            });
            android.view.View view = this.f97703i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!com.tencent.mars.comm.NetStatusUtil.isConnected(this) && n3Var != null) {
                n3Var.sendEmptyMessageDelayed(1003, 0);
            }
            Z6();
            c7();
            m22.e eVar2 = this.f97716x;
            eVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFreeSortingItemDec", "switchToFixedMode: ");
            eVar2.f323041i = false;
            eVar2.f323036d.D0();
            this.f97700f.notifyItemChanged(0);
            int a17 = ym5.x.a(this, 4.0f);
            int a18 = ym5.x.a(this, 8.0f);
            this.f97699e.scrollBy(0, -(a18 - this.f97699e.getPaddingTop()));
            this.f97699e.setPadding(a17, a18, a17, a18);
            android.view.View view2 = this.f97718z;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.emoji.ui.widget.EmojiDragStackView emojiDragStackView = this.f97717y;
            emojiDragStackView.removeAllViews();
            emojiDragStackView.setVisibility(8);
            c22.e eVar3 = this.f97700f;
            eVar3.notifyItemRangeChanged(0, eVar3.getItemCount());
            android.view.View view3 = this.f97703i;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            getTheme().resolveAttribute(com.tencent.mm.R.attr.f478323gq, typedValue, true);
            view3.setBackground(b3.l.getDrawable(this, typedValue.resourceId));
            android.view.View view4 = this.D;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.E.f323022d = false;
            V6(false);
            this.f97700f.notifyDataSetChanged();
        } else if (ordinal == 1) {
            setBackBtnVisible(false);
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490347sg), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$v
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                    com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this.d7(com.tencent.mm.plugin.emoji.ui.q0.NORMAL);
                    return true;
                }
            });
            this.f97699e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$w
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                    android.view.View view5 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this.getController().E(0).f208384j;
                    cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    aVar2.pk(view5, "emoji_tidyup_cancel");
                    ((cy1.a) aVar2.ik(view5, 8, 28444)).Xj(view5, "view_clk", new java.util.HashMap());
                }
            });
            android.view.View view5 = this.f97703i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (n3Var != null) {
                n3Var.sendEmptyMessageDelayed(1003, 0);
            }
            b7();
            c7();
            int a19 = ym5.x.a(this, 4.0f);
            int a27 = ym5.x.a(this, 8.0f);
            this.f97699e.scrollBy(0, -(a27 - this.f97699e.getPaddingTop()));
            this.f97699e.setPadding(a19, a27, a19, a27);
            this.f97700f.notifyItemChanged(0);
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
            com.tencent.mm.plugin.emoji.ui.widget.EmojiDragStackView emojiDragStackView2 = this.f97717y;
            emojiDragStackView2.removeAllViews();
            emojiDragStackView2.setVisibility(8);
            m22.e eVar4 = this.f97716x;
            eVar4.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFreeSortingItemDec", "switchToFixedMode: ");
            eVar4.f323041i = false;
            eVar4.f323036d.D0();
            android.view.View view8 = this.f97718z;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f97703i;
            android.util.TypedValue typedValue2 = new android.util.TypedValue();
            getTheme().resolveAttribute(com.tencent.mm.R.attr.f478323gq, typedValue2, true);
            view9.setBackground(b3.l.getDrawable(this, typedValue2.resourceId));
            android.view.View view10 = this.D;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.E.f323022d = true;
        } else if (ordinal == 2) {
            c7();
            m22.e eVar5 = this.f97716x;
            eVar5.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFreeSortingItemDec", "switchToFixedMode: ");
            eVar5.f323041i = false;
            eVar5.f323036d.D0();
            this.f97700f.notifyItemChanged(0);
        } else if (ordinal == 3) {
            c7();
        } else if (ordinal == 4) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.util.ArrayList arrayList9 = this.f97711s;
            objArr[0] = java.lang.Integer.valueOf(arrayList9 == null ? 0 : arrayList9.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "start dragging emojis: %d", objArr);
            java.util.ArrayList arrayList10 = this.f97711s;
            if (arrayList10 != null && !arrayList10.isEmpty()) {
                V6(true);
                setBackBtnVisible(false);
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f97699e;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f97699e.getPaddingTop(), this.f97699e.getPaddingRight(), ym5.x.a(this, 240.0f));
                removeOptionMenu(0);
                android.view.View view11 = this.A;
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
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
                android.view.View view13 = this.f97718z;
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(0);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f97699e.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.emoji.ui.z(this));
                this.f97703i.setBackground(null);
                android.view.View view14 = this.D;
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(0);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "updateMode", "(Lcom/tencent/mm/plugin/emoji/ui/EmojiCustomUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.E.f323022d = false;
            }
        }
        this.f97702h.i(true);
        this.f97702h.e();
        java.lang.System.currentTimeMillis();
    }

    public final void e7() {
        java.util.ArrayList arrayList = this.f97711s;
        int size = arrayList == null ? 0 : arrayList.size();
        if (size != 0) {
            setMMTitle(getResources().getString(com.tencent.mm.R.string.bxw, java.lang.Integer.valueOf(size)));
        } else if (this.f97712t == 0) {
            setMMTitle(getString(com.tencent.mm.R.string.bvn, java.lang.Integer.valueOf(this.f97702h.b().a())));
        } else {
            setMMTitle(getString(com.tencent.mm.R.string.f491087bv3, java.lang.Integer.valueOf(this.f97702h.b().a())));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a6c;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView textView;
        this.f97705n = findViewById(com.tencent.mm.R.id.nui);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.nub);
        this.f97706o = button;
        button.setOnClickListener(this.P);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.dan);
        this.f97699e = recyclerView;
        recyclerView.setFocusable(false);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(this, 5);
        this.f97701g = gridLayoutManager;
        gridLayoutManager.B = new com.tencent.mm.plugin.emoji.ui.j0(this);
        this.f97699e.setLayoutManager(this.f97701g);
        m22.e eVar = new m22.e(this.f97699e, 5, false);
        this.f97716x = eVar;
        this.f97699e.N(eVar);
        if (this.f97712t == 0) {
            this.I = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486355ur2);
            this.f97697J = findViewById(com.tencent.mm.R.id.t2e);
            this.K = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.u0_);
            this.L = (android.widget.Button) findViewById(com.tencent.mm.R.id.u0a);
            this.M = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486373us0);
            if (com.tencent.mm.ui.bk.C() && (textView = this.M) != null) {
                textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            }
            android.view.View view = this.f97697J;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
                    int i18 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                    com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                    emojiCustomUI.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", emojiCustomUI, array);
                    java.util.List list = emojiCustomUI.N;
                    if (list == null || ((java.util.ArrayList) list).isEmpty() || ((java.util.ArrayList) emojiCustomUI.N).get(0) == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiCustomUI", "postTokens is empty");
                    } else {
                        emojiCustomUI.Z = true;
                        q80.d0 d0Var = new q80.d0();
                        d0Var.f360649a = "wxalite3781e0acb99de51167d8cc934ce9f490";
                        d0Var.f360650b = "pages/setting";
                        com.tencent.mm.plugin.emoji.ui.r0 r0Var = (com.tencent.mm.plugin.emoji.ui.r0) ((java.util.ArrayList) emojiCustomUI.N).get(0);
                        if (emojiCustomUI.X == com.tencent.mm.plugin.emoji.ui.p0.TYPE_WA_APP) {
                            l81.b1 b1Var = new l81.b1();
                            b1Var.f317014b = "wxb08362e4cc792a91";
                            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                                i17 = 2;
                            } else {
                                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                i17 = 0;
                            }
                            b1Var.f317016c = i17;
                            b1Var.f317032k = 1417;
                            b1Var.f317022f = "pages/login/login.html";
                            b1Var.f317018d = 0;
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("fromApp", "my-favourite-emoticons");
                                jSONObject.put("md5", r0Var.f98175a);
                                jSONObject.put("token", r0Var.f98176b);
                                jSONObject.put("fromAppImage", r0Var.f98177c);
                                str = jSONObject.toString();
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "json exception " + e17.toString());
                                str = "";
                            }
                            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
                            appBrandLaunchReferrer.f77324f = str;
                            appBrandLaunchReferrer.f77322d = 1;
                            appBrandLaunchReferrer.f77323e = "wxb08362e4cc792a91";
                            b1Var.f317041s = appBrandLaunchReferrer;
                            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(emojiCustomUI, b1Var);
                        } else {
                            try {
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("md5", r0Var.f98175a);
                                jSONObject2.put("token", r0Var.f98176b);
                                org.json.JSONArray jSONArray = new org.json.JSONArray();
                                jSONArray.put(jSONObject2);
                                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                jSONObject3.put("imageInfoList", jSONArray);
                                jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                                d0Var.f360651c = jSONObject3.toString();
                            } catch (java.lang.Exception e18) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiCustomUI", "try json error %s", e18.getMessage());
                            }
                            final com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
                            sVar.f144168e = "wxalite3781e0acb99de51167d8cc934ce9f490";
                            sVar.f144167d = new com.tencent.mm.plugin.lite.r() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$h
                                @Override // com.tencent.mm.plugin.lite.r
                                public final boolean onDispatch(long j17, java.lang.String str3, java.lang.Object obj, int i19) {
                                    int i27 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                                    if (obj != null && str3 != null && str3.equals("getImageLocalIdByMd5") && (obj instanceof org.json.JSONObject)) {
                                        java.lang.String optString = ((org.json.JSONObject) obj).optString("md5");
                                        if (android.text.TextUtils.isEmpty(optString)) {
                                            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiCustomUI", "no found md5");
                                        } else {
                                            com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(optString);
                                            if (N != null) {
                                                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                                                com.tencent.mm.plugin.lite.s sVar2 = com.tencent.mm.plugin.lite.s.this;
                                                java.lang.String str4 = sVar2.f144168e;
                                                long j18 = sVar2.f144166c;
                                                java.lang.String T = N.T();
                                                ((com.tencent.mm.feature.lite.i) g0Var).getClass();
                                                java.lang.String generateLiteAppLocalId = com.tencent.mm.plugin.lite.LiteAppCenter.generateLiteAppLocalId(j18, str4, T);
                                                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                                                try {
                                                    jSONObject4.put(dm.i4.COL_LOCALID, generateLiteAppLocalId);
                                                    sVar2.c(j17, i19, jSONObject4.toString());
                                                } catch (java.lang.Exception e19) {
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiCustomUI", "to json error " + e19.getMessage());
                                                    sVar2.c(j17, i19, "");
                                                }
                                                return true;
                                            }
                                            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiCustomUI", "emoji is null. md5:%s");
                                        }
                                    }
                                    return false;
                                }
                            };
                            d0Var.f360672x = sVar;
                            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(emojiCustomUI, d0Var, new com.tencent.mm.plugin.emoji.ui.y(emojiCustomUI, d0Var));
                        }
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("emo_cnt", 1);
                        hashMap.put("emo_md5_list", emojiCustomUI.W6());
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("add_single_emo_page_bar_publish", "view_clk", hashMap, 35262);
                    }
                    yj0.a.h(emojiCustomUI, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.L.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                    com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                    emojiCustomUI.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    arrayList2.add(motionEvent);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", emojiCustomUI, array);
                    if (motionEvent.getAction() == 0) {
                        emojiCustomUI.L.setTextColor(android.graphics.Color.parseColor("#cc576b95"));
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        emojiCustomUI.L.setTextColor(emojiCustomUI.getResources().getColor(com.tencent.mm.R.color.Link_100));
                    }
                    yj0.a.i(false, emojiCustomUI, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            });
            this.K.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                    com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                    emojiCustomUI.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", emojiCustomUI, array);
                    android.view.View view3 = emojiCustomUI.f97697J;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "closePostEmoticonTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "closePostEmoticonTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("emo_cnt", 1);
                    hashMap.put("emo_md5_list", emojiCustomUI.W6());
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("add_single_emo_page_bar_close", "view_clk", hashMap, 35262);
                    yj0.a.h(emojiCustomUI, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        c22.e eVar2 = new c22.e();
        this.f97700f = eVar2;
        eVar2.f320620g = new com.tencent.mm.plugin.emoji.ui.k0(this);
        this.f97699e.setAdapter(eVar2);
        if (this.f97712t == 1) {
            this.f97702h = new com.tencent.mm.plugin.emoji.ui.l0(this);
        } else {
            this.f97702h = new com.tencent.mm.plugin.emoji.ui.m0(this, true);
        }
        this.f97702h.g(new com.tencent.mm.plugin.emoji.ui.n0(this, this.f97700f));
        this.f97700f.E(this.f97702h.b().b());
        this.f97703i = findViewById(com.tencent.mm.R.id.mpe);
        this.f97717y = (com.tencent.mm.plugin.emoji.ui.widget.EmojiDragStackView) findViewById(com.tencent.mm.R.id.d4i);
        this.f97718z = findViewById(com.tencent.mm.R.id.ngi);
        this.D = findViewById(com.tencent.mm.R.id.d4e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mpf);
        this.C = textView2;
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$e
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                emojiCustomUI.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", emojiCustomUI, array);
                com.tencent.mm.autogen.mmdata.rpt.EmoticonManageDetailStruct emoticonManageDetailStruct = emojiCustomUI.G;
                emoticonManageDetailStruct.f56056d = 2L;
                emoticonManageDetailStruct.f56058f = emojiCustomUI.f97711s.size();
                java.util.ArrayList arrayList3 = emojiCustomUI.f97711s;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    java.util.Iterator it = emojiCustomUI.f97711s.iterator();
                    boolean z17 = false;
                    boolean z18 = false;
                    while (it.hasNext()) {
                        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) it.next();
                        if ("9bd1281af3a31710a45b84d736363691".equals(emojiInfo.getMd5())) {
                            z17 = true;
                        }
                        if ("08f223fa83f1ca34e143d1e580252c7c".equals(emojiInfo.getMd5())) {
                            z18 = true;
                        }
                    }
                    if (z17 || z18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "deleteEmoji: forbid, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
                        db5.e1.A(emojiCustomUI.getContext(), emojiCustomUI.getString(com.tencent.mm.R.string.bvk, z18 ? emojiCustomUI.getString(com.tencent.mm.R.string.f491096bw0) : emojiCustomUI.getString(com.tencent.mm.R.string.bwj)), "", "", emojiCustomUI.getString(com.tencent.mm.R.string.f490454vi), null, null);
                        yj0.a.h(emojiCustomUI, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                }
                db5.e1.B(emojiCustomUI.getContext(), emojiCustomUI.getResources().getString(com.tencent.mm.R.string.bvq), "", emojiCustomUI.getResources().getString(com.tencent.mm.R.string.f490367t0), emojiCustomUI.getResources().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.emoji.ui.a0(emojiCustomUI), null, com.tencent.mm.R.color.f479483a32);
                yj0.a.h(emojiCustomUI, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this.C, "emoji_select_delete");
        ((cy1.a) aVar.ik(this.C, 8, 28444)).Xj(this.C, "view_clk", new java.util.HashMap());
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mpd);
        this.A = findViewById;
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$f
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                emojiCustomUI.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", emojiCustomUI, array);
                emojiCustomUI.d7(com.tencent.mm.plugin.emoji.ui.q0.EDIT);
                emojiCustomUI.f97700f.E(emojiCustomUI.f97702h.b().b());
                emojiCustomUI.f97700f.notifyDataSetChanged();
                yj0.a.h(emojiCustomUI, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(this.A, "emoji_move_cancel");
        ((cy1.a) aVar2.ik(this.A, 8, 28444)).Xj(this.A, "view_clk", new java.util.HashMap());
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.mpg);
        this.B = findViewById2;
        findViewById2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$g
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                emojiCustomUI.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", emojiCustomUI, array);
                emojiCustomUI.G.f56056d = 1L;
                emojiCustomUI.d7(com.tencent.mm.plugin.emoji.ui.q0.DRAGGING);
                yj0.a.h(emojiCustomUI, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.pk(this.B, "emoji_select_move");
        ((cy1.a) aVar3.ik(this.B, 8, 28444)).Xj(this.B, "view_clk", new java.util.HashMap());
        m22.d dVar = new m22.d(this);
        this.E = dVar;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f97699e;
        com.tencent.mm.plugin.emoji.ui.u uVar = new com.tencent.mm.plugin.emoji.ui.u(this);
        kotlin.jvm.internal.o.g(recyclerView2, "recyclerView");
        dVar.f323030o = recyclerView2;
        dVar.f323031p = uVar;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        dVar.f323032q = (androidx.recyclerview.widget.GridLayoutManager) layoutManager;
        recyclerView2.P(dVar);
        m22.x xVar = new m22.x(getContext(), 5);
        this.U = xVar;
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f97699e;
        com.tencent.mm.plugin.emoji.ui.widget.EmojiDragStackView indicatorView = this.f97717y;
        com.tencent.mm.plugin.emoji.ui.t tVar = new com.tencent.mm.plugin.emoji.ui.t(this);
        kotlin.jvm.internal.o.g(recyclerView3, "recyclerView");
        kotlin.jvm.internal.o.g(indicatorView, "indicatorView");
        xVar.f323072e = recyclerView3;
        xVar.f323073f = tVar;
        recyclerView3.N(xVar);
        recyclerView3.O(xVar);
        recyclerView3.setOnDragListener(xVar);
        indicatorView.setOnTouchListener(new m22.v(indicatorView));
        cy1.a aVar4 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar4.pk(getController().K, "emoji_manage_finish");
        ((cy1.a) aVar4.ik(getController().K, 8, 28444)).Xj(getController().K, "view_clk", new java.util.HashMap());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("data is null ");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", sb6.toString());
        if (i18 == -1) {
            switch (i17) {
                case 205:
                    X6(intent);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("CropImageMode", 3);
                    intent2.putExtra("CropImage_OutputPath", n22.m.g());
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.r(intent2, 206, this, intent);
                    return;
                case 206:
                    if (intent == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult MAT_IMAGE_IN_CROP_ACTIVITY return null.");
                        return;
                    }
                    java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                    int intExtra = intent.getIntExtra("emoji_type", 0);
                    if (stringExtra == null || stringExtra.length() < 1) {
                        return;
                    }
                    java.lang.String substring = stringExtra.substring(stringExtra.lastIndexOf(47) + 1);
                    java.lang.String str = n22.m.g() + substring;
                    ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                    this.V = com.tencent.mm.storage.n5.f().c().u1(substring);
                    ck5.c cVar = new ck5.c(str);
                    cVar.f42550b = ip.c.b();
                    int c17 = ip.c.c();
                    cVar.f42551c = c17;
                    cVar.f42552d = c17;
                    cVar.a(new com.tencent.mm.plugin.emoji.ui.w(this, intExtra, substring));
                    return;
                case 207:
                    X6(intent);
                    return;
                default:
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult: not found this requestCode");
                    return;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f97698d == com.tencent.mm.plugin.emoji.ui.q0.EDIT) {
            d7(com.tencent.mm.plugin.emoji.ui.q0.NORMAL);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        this.f97712t = getIntent().getIntExtra("key_emoji_panel_type", this.f97712t);
        this.f97714v = getIntent().getBooleanExtra("key_from_settings_mine", false);
        this.f97715w = getIntent().getIntExtra("key_from_scene", 0);
        if (this.f97712t == 1) {
            this.f97713u = pr.k0.f357723q.a(false);
        } else {
            this.f97713u = pr.k0.f357723q.b(false);
        }
        initView();
        d7(com.tencent.mm.plugin.emoji.ui.q0.NORMAL);
        boolean booleanValue = this.f97712t == 1 ? ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() : ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "[cpan] touch batch emoji download from EmojiCustomUI needDownload:%b", java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue) {
            new pr.t(this.f97712t, null, false).a();
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().c().add(this.Q);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(406L, 9L, 1L, false);
        g0Var.idkeyStat(406L, 11L, java.lang.System.currentTimeMillis() - currentTimeMillis, false);
        g0Var.d(12740, 4, "", "", "", 28, 28);
        this.f97713u.f(this.R);
        this.f97713u.b(true);
        gr.v.f274696a.a(true);
        if (this.f97712t == 0) {
            com.tencent.mm.storage.z4 z4Var = com.tencent.mm.storage.z4.f196391j;
            if (z4Var.d() && !com.tencent.mm.storage.h5.f195006d.wi()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "setupEmojiRecognition: isFromSettingsMine=" + this.f97714v);
                if (this.f97714v) {
                    android.view.View findViewById = findViewById(com.tencent.mm.R.id.cor);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.cok);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "setupEmojiRecognition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    final com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.coq);
                    mMSwitchBtn.setCheck(z4Var.e());
                    final com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct = new com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct();
                    customEmotionRecognitionSwitchStruct.f55765d = 1;
                    customEmotionRecognitionSwitchStruct.f55766e = 1L;
                    customEmotionRecognitionSwitchStruct.f55767f = z4Var.e() ? 1L : 2L;
                    customEmotionRecognitionSwitchStruct.k();
                    mMSwitchBtn.setSwitchListener(new al5.c2() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$k
                        @Override // al5.c2
                        public final void onStatusChange(boolean z17) {
                            int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                            com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this;
                            emojiCustomUI.getClass();
                            final com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct2 = customEmotionRecognitionSwitchStruct;
                            if (!z17) {
                                customEmotionRecognitionSwitchStruct2.f55766e = 3L;
                                customEmotionRecognitionSwitchStruct2.k();
                                com.tencent.mm.storage.z4.f196391j.h(false);
                            } else {
                                final com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = mMSwitchBtn;
                                mMSwitchBtn2.clearAnimation();
                                mMSwitchBtn2.setCheck(false);
                                com.tencent.mm.plugin.emoji.ui.h4.a(emojiCustomUI.getContext(), new yz5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$n
                                    @Override // yz5.a
                                    public final java.lang.Object invoke() {
                                        int i18 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                                        com.tencent.mm.ui.widget.MMSwitchBtn.this.setCheck(true);
                                        com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct3 = customEmotionRecognitionSwitchStruct2;
                                        customEmotionRecognitionSwitchStruct3.f55766e = 2L;
                                        customEmotionRecognitionSwitchStruct3.k();
                                        return null;
                                    }
                                }, new yz5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$o
                                    @Override // yz5.a
                                    public final java.lang.Object invoke() {
                                        int i18 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                                        com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct3 = com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct.this;
                                        customEmotionRecognitionSwitchStruct3.f55766e = 3L;
                                        customEmotionRecognitionSwitchStruct3.k();
                                        return null;
                                    }
                                });
                            }
                        }
                    });
                } else {
                    final com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct2 = new com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct();
                    customEmotionRecognitionSwitchStruct2.f55765d = 2;
                    customEmotionRecognitionSwitchStruct2.f55766e = 1L;
                    customEmotionRecognitionSwitchStruct2.f55767f = 2L;
                    customEmotionRecognitionSwitchStruct2.k();
                    if (!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_EMOTION_RECOGNITION_GUIDE_BOOLEAN_SYNC, false)) {
                        com.tencent.mm.plugin.emoji.ui.h4.a(this, new yz5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$i
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                                com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct3 = com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct.this;
                                customEmotionRecognitionSwitchStruct3.f55766e = 2L;
                                customEmotionRecognitionSwitchStruct3.k();
                                return null;
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$j
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                                com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct3 = com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct.this;
                                customEmotionRecognitionSwitchStruct3.f55766e = 3L;
                                customEmotionRecognitionSwitchStruct3.k();
                                return null;
                            }
                        });
                    }
                }
            }
        }
        z12.g.I();
        setTitleBarDoubleClickListener(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.recyclerview.widget.RecyclerView recyclerView = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this.f97699e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "lambda$onCreate$0", "()V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "lambda$onCreate$0", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        });
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.EmojiCustomUI);
        n22.c.b(7, this.f97715w);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().c().remove(this.Q);
        this.f97713u.d(this.R);
        this.S.removeCallbacksAndMessages(null);
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

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.n().f273288b.q(698, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        super.onResume();
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(this) && (n3Var = this.S) != null) {
            n3Var.sendEmptyMessageDelayed(1003, 0);
        }
        gm0.j1.n().f273288b.a(698, this);
        if (this.Z) {
            this.Z = false;
            android.view.View view = this.f97697J;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (!(m1Var instanceof z12.g)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiCustomUI", "no emoji operate");
            return;
        }
        int i19 = ((z12.g) m1Var).f469295g;
        if (i19 == 2) {
            android.app.ProgressDialog progressDialog = this.f97707p;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f97707p.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                this.f97700f.I();
                gm0.j1.e().j(new com.tencent.mm.plugin.emoji.ui.e0(this, new java.util.ArrayList(T6(this.f97711s))));
                if (this.f97712t == 0) {
                    gr.t.g().n(true);
                    gr.t.g().l(true);
                } else {
                    gr.t.g().m(true);
                }
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.n5.f().c().n1(T6(this.f97711s), this.f97712t);
                Z6();
                b7();
                gr.v.f274696a.a(true);
                if (com.tencent.mm.storage.h5.f195006d.Ai()) {
                    com.tencent.mm.smiley.c0 c0Var = com.tencent.mm.smiley.c0.f193225a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "restart");
                    c0Var.e(com.tencent.mm.smiley.v.f193398d);
                } else {
                    com.tencent.mm.storage.z4 z4Var = com.tencent.mm.storage.z4.f196391j;
                    if (z4Var.e()) {
                        z4Var.g();
                    }
                }
                addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$l
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                        int i27 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this.d7(com.tencent.mm.plugin.emoji.ui.q0.NORMAL);
                        return true;
                    }
                });
                this.f97699e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$p
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i27 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                        android.view.View view = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this.getController().E(0).f208384j;
                        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                        aVar.pk(view, "emoji_manage_finish");
                        ((cy1.a) aVar.ik(view, 8, 28444)).Xj(view, "view_clk", new java.util.HashMap());
                    }
                });
                V6(false);
                this.f97702h.h();
                this.f97702h.e();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "delete failed");
                db5.e1.A(getContext(), getString(com.tencent.mm.R.string.bwq), "", "", getString(com.tencent.mm.R.string.bwr), null, null);
            }
        } else if (i19 == 3 || i19 == 5) {
            android.app.ProgressDialog progressDialog2 = this.f97707p;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f97707p.dismiss();
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f97708p0;
            if (u3Var != null && u3Var.isShowing()) {
                this.f97708p0.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                if (this.f97712t == 0) {
                    gr.t.g().n(true);
                    gr.t.g().l(true);
                } else {
                    gr.t.g().m(true);
                }
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                z85.l c17 = com.tencent.mm.storage.n5.f().c();
                int i27 = this.f97712t;
                int i28 = this.F;
                if (i27 == 0) {
                    i28--;
                }
                c17.o2(i27, i28, T6(this.f97711s));
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f97700f.f320619f);
                java.util.List b17 = this.f97702h.b().b();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f97711s);
                Z6();
                int i29 = this.F;
                if (arrayList2.size() > 0) {
                    ir.u0 U6 = U6(b17, ((com.tencent.mm.storage.emotion.EmojiInfo) arrayList2.get(0)).getMd5());
                    if (U6 != null) {
                        arrayList.set(i29, U6);
                        this.f97700f.notifyItemChanged(this.F);
                        i29++;
                    } else {
                        arrayList.remove(this.F);
                        this.f97700f.notifyItemRemoved(this.F);
                    }
                }
                int i37 = i29;
                for (int i38 = 1; i38 < arrayList2.size(); i38++) {
                    ir.u0 U62 = U6(b17, ((com.tencent.mm.storage.emotion.EmojiInfo) arrayList2.get(i38)).getMd5());
                    if (U62 != null) {
                        arrayList.add(i37, U62);
                        i37++;
                    }
                }
                this.f97700f.E(arrayList);
                this.f97700f.notifyItemRangeInserted(i29, i37 - i29);
                Y6();
                d7(com.tencent.mm.plugin.emoji.ui.q0.EDIT);
                addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$q
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                        int i39 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this.d7(com.tencent.mm.plugin.emoji.ui.q0.NORMAL);
                        return true;
                    }
                });
                this.f97699e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$r
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i39 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                        android.view.View view = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.this.getController().E(0).f208384j;
                        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                        aVar.pk(view, "emoji_manage_finish");
                        ((cy1.a) aVar.ik(view, 8, 28444)).Xj(view, "view_clk", new java.util.HashMap());
                    }
                });
                b7();
                this.f97699e.post(new com.tencent.mm.plugin.emoji.ui.c0(this, arrayList2));
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(this.f97700f.f320619f);
                arrayList3.remove(this.T);
                this.f97700f.E(arrayList3);
                db5.e1.A(getContext(), getString(com.tencent.mm.R.string.bwq), "", "", getString(com.tencent.mm.R.string.bwr), null, null);
                this.f97700f.notifyDataSetChanged();
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.EmoticonManageDetailStruct emoticonManageDetailStruct = this.G;
        if (i17 == 0 && i18 == 0) {
            emoticonManageDetailStruct.f56057e = 1L;
        } else {
            emoticonManageDetailStruct.f56057e = 2L;
        }
        emoticonManageDetailStruct.f56061i = this.f97715w;
        emoticonManageDetailStruct.k();
    }
}
