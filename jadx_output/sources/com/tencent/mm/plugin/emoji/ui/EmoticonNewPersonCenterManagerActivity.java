package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Landroid/view/View$OnClickListener;", "Ll75/q0;", "Landroid/view/View;", org.chromium.base.BaseSwitches.V, "Ljz5/f0;", "onClick", "<init>", "()V", "com/tencent/mm/plugin/emoji/ui/a4", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class EmoticonNewPersonCenterManagerActivity extends com.tencent.mm.ui.MMActivity implements android.view.View.OnClickListener, l75.q0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f97868u = 0;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f97871f;

    /* renamed from: g, reason: collision with root package name */
    public m22.q f97872g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.n f97873h;

    /* renamed from: i, reason: collision with root package name */
    public long f97874i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f97875m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f97876n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f97877o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f97878p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f97879q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f97880r;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f97869d = "MicroMsg.emoji.EmoticonNewPersonCenterManagerActivity";

    /* renamed from: e, reason: collision with root package name */
    public final int f97870e = 3;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.ui.b4 f97881s = new com.tencent.mm.plugin.emoji.ui.b4(this);

    /* renamed from: t, reason: collision with root package name */
    public final int f97882t = -1;

    public final void T6(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap) {
        hashMap.put("page_id", 50301);
        hashMap.put("page_name", "EmoAlbumManagePage");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, str2, hashMap, 35262);
    }

    public final void U6() {
        if (!((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f97632c) {
            java.util.Vector vector = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f97637h;
            if ((vector != null ? vector.size() : 0) <= 0) {
                android.view.View view = this.f97875m;
                kotlin.jvm.internal.o.d(view);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        android.view.View view2 = this.f97875m;
        kotlin.jvm.internal.o.d(view2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.getClass();
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            android.widget.TextView textView = this.f97876n;
            kotlin.jvm.internal.o.d(textView);
            textView.setText(com.tencent.mm.R.string.c09);
            android.view.View view3 = this.f97877o;
            kotlin.jvm.internal.o.d(view3);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f97878p;
            kotlin.jvm.internal.o.d(view4);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f97630a) {
            android.view.View view5 = this.f97877o;
            kotlin.jvm.internal.o.d(view5);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f97878p;
            kotlin.jvm.internal.o.d(view6);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.f97876n;
            kotlin.jvm.internal.o.d(textView2);
            textView2.setText(com.tencent.mm.R.string.bwf);
            return;
        }
        android.view.View view7 = this.f97877o;
        kotlin.jvm.internal.o.d(view7);
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f97878p;
        kotlin.jvm.internal.o.d(view8);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView3 = this.f97876n;
        kotlin.jvm.internal.o.d(textView3);
        textView3.setText(com.tencent.mm.R.string.f491101bx1);
    }

    public final void V6(boolean z17) {
        int i17;
        com.tencent.mm.plugin.emoji.model.n nVar = this.f97873h;
        if (nVar != null) {
            kotlin.jvm.internal.o.d(nVar);
            i17 = nVar.f97582b.size();
        } else {
            i17 = 0;
        }
        if (z17 && i17 > 0) {
            i17--;
        }
        setMMTitle(getString(com.tencent.mm.R.string.nnl, java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a7r;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.util.LinkedList linkedList;
        setTitle(com.tencent.mm.R.string.iqm);
        super.initView();
        this.f97871f = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f484199dc5);
        this.f97872g = new m22.q(new com.tencent.mm.plugin.emoji.ui.a4(this, this, 24, 7));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f97871f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f97871f;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f97872g);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f97871f;
        if (recyclerView3 != null) {
            recyclerView3.N(new m22.h(this, 1));
        }
        com.tencent.mm.plugin.emoji.model.n nVar = new com.tencent.mm.plugin.emoji.model.n(gr.v.f274696a.c() && ((com.tencent.mm.feature.emoji.r4) i95.n0.c(com.tencent.mm.feature.emoji.r4.class)).Di());
        this.f97873h = nVar;
        m22.q qVar = this.f97872g;
        if (qVar != null && (linkedList = qVar.f323063u) != null) {
            java.util.LinkedList linkedList2 = nVar.f97582b;
            kotlin.jvm.internal.o.d(linkedList2);
            linkedList.addAll(linkedList2);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a6p, (android.view.ViewGroup) this.f97871f, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f97879q = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.jkd);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        this.f97880r = viewGroup2;
        android.view.View findViewById2 = viewGroup2.findViewById(android.R.id.title);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) findViewById2).setText(com.tencent.mm.R.string.bwx);
        android.view.ViewGroup viewGroup3 = this.f97880r;
        kotlin.jvm.internal.o.d(viewGroup3);
        viewGroup3.findViewById(com.tencent.mm.R.id.cgi).setBackgroundResource(0);
        android.view.ViewGroup viewGroup4 = this.f97880r;
        kotlin.jvm.internal.o.d(viewGroup4);
        viewGroup4.setOnClickListener(this);
        m22.q qVar2 = this.f97872g;
        kotlin.jvm.internal.o.d(qVar2);
        android.view.ViewGroup viewGroup5 = this.f97879q;
        kotlin.jvm.internal.o.d(viewGroup5);
        qVar2.O(viewGroup5, -2, true);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nui);
        this.f97875m = findViewById3;
        kotlin.jvm.internal.o.d(findViewById3);
        android.view.View findViewById4 = findViewById3.findViewById(com.tencent.mm.R.id.nuh);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f97876n = textView;
        textView.setText(com.tencent.mm.R.string.c09);
        android.view.View view = this.f97875m;
        kotlin.jvm.internal.o.d(view);
        this.f97877o = view.findViewById(com.tencent.mm.R.id.dc7);
        android.view.View view2 = this.f97875m;
        kotlin.jvm.internal.o.d(view2);
        this.f97878p = view2.findViewById(com.tencent.mm.R.id.dc8);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().b();
        U6();
        android.view.View view3 = this.f97877o;
        kotlin.jvm.internal.o.d(view3);
        view3.setOnClickListener(this);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().a(this.f97881s);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().add(this);
        V6(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra("sortRet", -1);
            if (intExtra == 0) {
                T6("emo_album_manage_page_finish_button", "view_clk", new java.util.HashMap());
            } else if (intExtra == this.f97882t) {
                T6("emo_album_manage_page_cancel_button", "view_clk", new java.util.HashMap());
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != this.f97880r) {
            if (view == this.f97877o) {
                com.tencent.mm.plugin.emoji.sync.k kVar = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a;
                kVar.f97630a = true;
                kVar.f();
                U6();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "startEmojiPaid", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "startEmojiPaid", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        T6("emo_album_manage_page_add_cell", "view_clk", new java.util.HashMap());
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmoticonNewPersonCenterManagerActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f97874i = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getIntExtra("10931", 0) == this.f97870e) {
            d22.w wVar = new d22.w();
            wVar.f225877j = 2;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var != null) {
                ((com.tencent.mm.feature.emoji.f4) p6Var).wi(this, wVar);
            }
            finish();
        }
        initView();
        int intExtra = getIntent().getIntExtra("10931", 0);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.kvStat(10931, java.lang.String.valueOf(intExtra));
        com.tencent.mars.xlog.Log.i(this.f97869d, "statistics enter Emoji Setting UI:%d", java.lang.Integer.valueOf(intExtra));
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.c4(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f491106by1), new com.tencent.mm.plugin.emoji.ui.d4(this));
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (!((java.lang.Boolean) m17).booleanValue()) {
            q12.s.b(true);
        }
        g0Var.idkeyStat(406L, 3L, 1L, false);
        g0Var.idkeyStat(406L, 5L, java.lang.System.currentTimeMillis() - this.f97874i, false);
        g0Var.d(12740, 4, "", "", "", 24, 24);
        pr.q.f357764a.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        T6("", "page_in", hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("added_single_emo_entry", "view_exp", hashMap, 35262);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().c(this.f97881s);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().remove(this);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("stay_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f97874i));
        T6("", "page_out", hashMap);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (kotlin.jvm.internal.o.b("event_update_group", str)) {
            com.tencent.mm.plugin.emoji.model.n nVar = this.f97873h;
            kotlin.jvm.internal.o.d(nVar);
            nVar.reset();
            m22.q qVar = this.f97872g;
            kotlin.jvm.internal.o.d(qVar);
            qVar.f323063u.clear();
            m22.q qVar2 = this.f97872g;
            kotlin.jvm.internal.o.d(qVar2);
            java.util.LinkedList linkedList = qVar2.f323063u;
            com.tencent.mm.plugin.emoji.model.n nVar2 = this.f97873h;
            kotlin.jvm.internal.o.d(nVar2);
            linkedList.addAll(nVar2.f97582b);
            m22.q qVar3 = this.f97872g;
            kotlin.jvm.internal.o.d(qVar3);
            qVar3.notifyDataSetChanged();
        }
    }
}
