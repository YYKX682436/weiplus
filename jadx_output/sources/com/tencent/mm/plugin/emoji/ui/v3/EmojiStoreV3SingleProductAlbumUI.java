package com.tencent.mm.plugin.emoji.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "g22/g0", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiStoreV3SingleProductAlbumUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f98449z = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView f98451e;

    /* renamed from: f, reason: collision with root package name */
    public i22.g0 f98452f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f98453g;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f98461r;

    /* renamed from: w, reason: collision with root package name */
    public boolean f98466w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f98467x;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98450d = "MicroMsg.EmojiStoreV3SingleProductAlbumUI";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f98454h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f98455i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f98456m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f98457n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f98458o = 6;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f98459p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f98460q = -1;

    /* renamed from: s, reason: collision with root package name */
    public g22.g0 f98462s = g22.g0.f267815d;

    /* renamed from: t, reason: collision with root package name */
    public boolean f98463t = true;

    /* renamed from: u, reason: collision with root package name */
    public int f98464u = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f98465v = true;

    /* renamed from: y, reason: collision with root package name */
    public final int f98468y = 2002;

    public final void T6() {
        if (g22.g0.f267815d == this.f98462s) {
            gm0.j1.n().f273288b.g(new z12.n(5, 0, 0, null, this.f98460q, this.f98461r));
            this.f98462s = g22.g0.f267817f;
        }
    }

    public final void U6(java.util.List list, boolean z17) {
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.i(this.f98450d, "updateAdapterData failed, data error");
            return;
        }
        i22.g0 g0Var = this.f98452f;
        if (g0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.ri0 ri0Var = (r45.ri0) it.next();
                i22.c1 c1Var = new i22.c1();
                c1Var.f287952a = ri0Var;
                arrayList2.add(c1Var);
            }
            arrayList.addAll(arrayList2);
            java.util.List list2 = g0Var.f287967e;
            if (z17) {
                int itemCount = g0Var.getItemCount();
                list2.addAll(arrayList);
                g0Var.notifyItemRangeChanged(itemCount, arrayList.size());
            } else {
                list2.clear();
                list2.addAll(arrayList);
                g0Var.notifyDataSetChanged();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a8o;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i(this.f98450d, "handleIntent");
        this.f98460q = getIntent().getIntExtra("set_id", -1);
        java.lang.String stringExtra = getIntent().getStringExtra("set_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f98454h = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("set_desc");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f98455i = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("set_iconURL");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f98456m = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("headurl");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f98457n = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("sns_object_data");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f98459p = stringExtra5;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
            this.f98460q = com.tencent.mm.plugin.emoji.model.EmojiLogic.i(this.f98459p);
            java.lang.String j17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.j(this.f98459p);
            kotlin.jvm.internal.o.f(j17, "getEmojiPageTitle(...)");
            this.f98454h = j17;
            java.lang.String g17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.g(this.f98459p);
            kotlin.jvm.internal.o.f(g17, "getEmojiPageIconUrl(...)");
            this.f98456m = g17;
            java.lang.String f17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.f(this.f98459p);
            kotlin.jvm.internal.o.f(f17, "getEmojiPageDesc(...)");
            this.f98455i = f17;
            this.f98457n = com.tencent.mm.plugin.emoji.model.EmojiLogic.h(this.f98459p);
            this.f98458o = com.tencent.mm.plugin.emoji.model.EmojiLogic.k(this.f98459p);
        }
        this.f98464u = getIntent().getIntExtra("entrance_scene", 10007);
        setMMTitle("");
        setBackBtn(new g22.n0(this));
        setActionbarColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_100));
        if (!kotlin.jvm.internal.o.b(this.f98456m, "")) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_share, new g22.o0(this));
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ilp);
        this.f98453g = findViewById;
        if (findViewById != null) {
            findViewById.setBackgroundResource(com.tencent.mm.R.color.BW_100);
        }
        this.f98451e = (com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView) findViewById(com.tencent.mm.R.id.mzg);
        i22.b1 b1Var = new i22.b1();
        int i17 = b1Var.f288060b;
        g22.f fVar = new g22.f((int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn), 0, !kotlin.jvm.internal.o.b(this.f98454h, "") ? 1 : 0, b1Var);
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = this.f98451e;
        if (emojiStoreV3SingleProductRecyclerView != null) {
            emojiStoreV3SingleProductRecyclerView.setSizeResolver(b1Var);
        }
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView2 = this.f98451e;
        if (emojiStoreV3SingleProductRecyclerView2 != null) {
            emojiStoreV3SingleProductRecyclerView2.N(fVar);
        }
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(this, i17);
        gridLayoutManager.B = new g22.i0(this, gridLayoutManager);
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView3 = this.f98451e;
        if (emojiStoreV3SingleProductRecyclerView3 != null) {
            emojiStoreV3SingleProductRecyclerView3.setLayoutManager(gridLayoutManager);
        }
        i22.g0 g0Var = new i22.g0(this, new java.util.ArrayList());
        this.f98452f = g0Var;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView4 = this.f98451e;
        if (emojiStoreV3SingleProductRecyclerView4 != null) {
            emojiStoreV3SingleProductRecyclerView4.setAdapter(g0Var);
        }
        i22.g0 g0Var2 = this.f98452f;
        if (g0Var2 != null) {
            g0Var2.f287972m = i17;
        }
        if (g0Var2 != null) {
            g0Var2.f287970h = new g22.j0(this);
        }
        if (g0Var2 != null) {
            g0Var2.f287971i = new g22.k0(this);
        }
        if (g0Var2 != null) {
            g0Var2.f287969g = new g22.l0(this);
        }
        if (g0Var2 != null) {
            g0Var2.f287976q = new g22.m0(this);
        }
        android.view.View view = this.f98453g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView5 = this.f98451e;
        if (emojiStoreV3SingleProductRecyclerView5 != null) {
            emojiStoreV3SingleProductRecyclerView5.setVisibility(8);
        }
        T6();
        gm0.j1.n().f273288b.a(gd1.h.CTRL_INDEX, this);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 4, "", "", 0, java.lang.Integer.valueOf(this.f98464u), 29);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(gd1.h.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f98466w = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f98466w && !this.f98467x) {
            this.f98466w = false;
            i22.g0 g0Var = this.f98452f;
            if (g0Var != null) {
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = this.f98451e;
                g0Var.x(emojiStoreV3SingleProductRecyclerView != null ? emojiStoreV3SingleProductRecyclerView.getLayoutManager() : null);
            }
        }
        this.f98467x = false;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.List list;
        android.view.View view = this.f98453g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = this.f98451e;
        if (emojiStoreV3SingleProductRecyclerView != null) {
            emojiStoreV3SingleProductRecyclerView.setVisibility(0);
        }
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        com.tencent.mars.xlog.Log.i(this.f98450d, "type:" + valueOf + ", errType:" + i17 + ", errCode:" + i18);
        if (valueOf != null && valueOf.intValue() == 821) {
            i22.g0 g0Var = this.f98452f;
            if ((g0Var != null && g0Var.getItemCount() == 0) && !kotlin.jvm.internal.o.b(this.f98454h, "")) {
                i22.y0 y0Var = new i22.y0();
                java.lang.String str2 = this.f98455i;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                y0Var.f288069b = str2;
                java.lang.String str3 = this.f98454h;
                kotlin.jvm.internal.o.g(str3, "<set-?>");
                y0Var.f288068a = str3;
                i22.g0 g0Var2 = this.f98452f;
                if (g0Var2 != null && (list = g0Var2.f287967e) != null) {
                    list.add(0, y0Var);
                }
                i22.g0 g0Var3 = this.f98452f;
                if (g0Var3 != null) {
                    g0Var3.notifyItemChanged(0);
                }
            }
            z12.n nVar = m1Var instanceof z12.n ? (z12.n) m1Var : null;
            r45.ce3 H = nVar != null ? nVar.H() : null;
            java.util.LinkedList linkedList = H != null ? H.f371496d : null;
            i22.g0 g0Var4 = this.f98452f;
            if (g0Var4 != null) {
                java.util.List list2 = g0Var4.f287967e;
                if ((!list2.isEmpty()) && ((i22.n0) kz5.n0.i0(list2)).getType() == 8) {
                    g0Var4.notifyItemChanged(g0Var4.getItemCount() - 1, java.lang.Boolean.TRUE);
                    g0Var4.notifyItemRemoved(g0Var4.getItemCount() - 1);
                    list2.remove(g0Var4.getItemCount() - 1);
                }
            }
            setBounceEnabled(true);
            if (i17 == 0 || i17 == 4) {
                if (linkedList != null) {
                    linkedList.size();
                }
                if (i18 == 0) {
                    this.f98462s = g22.g0.f267816e;
                    U6(linkedList, true);
                } else if (i18 == 2) {
                    this.f98462s = g22.g0.f267815d;
                    U6(linkedList, true);
                } else if (i18 != 3) {
                    dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.c0f), 0).show();
                } else {
                    this.f98462s = g22.g0.f267815d;
                    U6(linkedList, false);
                }
            } else {
                dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.c0f), 0).show();
            }
            this.f98461r = nVar != null ? nVar.f469337h : null;
            if (this.f98465v) {
                this.f98465v = false;
                this.f98466w = false;
                ku5.u0 u0Var = ku5.t0.f312615d;
                g22.h0 h0Var = new g22.h0(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(h0Var, 500L, false);
            }
            if (this.f98463t) {
                if (this.f98462s != g22.g0.f267816e) {
                    setBounceEnabled(false);
                    com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView2 = this.f98451e;
                    if (emojiStoreV3SingleProductRecyclerView2 != null) {
                        emojiStoreV3SingleProductRecyclerView2.post(new g22.p0(this));
                    }
                    T6();
                }
                this.f98463t = false;
            }
        }
    }
}
