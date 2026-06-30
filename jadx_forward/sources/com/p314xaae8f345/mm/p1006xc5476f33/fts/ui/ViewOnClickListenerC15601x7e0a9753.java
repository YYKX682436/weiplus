package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSChattingConvUI */
/* loaded from: classes12.dex */
public class ViewOnClickListenerC15601x7e0a9753 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219490p;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f219492r;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f219494t;

    /* renamed from: u, reason: collision with root package name */
    public int f219495u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.z1 f219496v;

    /* renamed from: q, reason: collision with root package name */
    public boolean f219491q = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f219493s = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        if (this.f219496v == null) {
            this.f219496v = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.z1(w0Var, this.f219490p);
        }
        return this.f219496v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void V6(java.lang.String str) {
        super.V6(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f219493s = false;
        }
        ?? r112 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f219490p);
        if (this.f219491q) {
            r112 = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14569, 0, 1, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(this.f219495u), java.lang.Integer.valueOf((int) r112));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void X6() {
        this.f219490p = getIntent().getStringExtra("detail_username");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(this.f219490p);
        this.f219491q = getIntent().getBooleanExtra("detail_user_dismiss", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "initSearchData conversation=%s", this.f219490p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void Z6() {
        super.Z6();
        android.view.View view = this.f219492r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void a7() {
        super.a7();
        android.view.View view = this.f219492r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void b7() {
        super.b7();
        android.view.View view = this.f219492r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void c7() {
        super.c7();
        android.view.View view = this.f219492r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f7(int i17) {
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f219490p)) {
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[9];
                objArr[0] = 0;
                objArr[1] = 0;
                objArr[2] = 1;
                objArr[3] = 0;
                objArr[4] = 0;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = 0;
                objArr[8] = java.lang.Integer.valueOf(this.f219491q ? 2 : 0);
                g0Var.d(14569, objArr);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[9];
            objArr2[0] = 0;
            objArr2[1] = 0;
            objArr2[2] = 0;
            objArr2[3] = 1;
            objArr2[4] = 0;
            objArr2[5] = 0;
            objArr2[6] = 0;
            objArr2[7] = 0;
            objArr2[8] = java.lang.Integer.valueOf(this.f219491q ? 2 : 0);
            g0Var2.d(14569, objArr2);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f219490p);
        if (W0.A0() != null) {
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr3 = new java.lang.Object[9];
                objArr3[0] = 0;
                objArr3[1] = 0;
                objArr3[2] = 1;
                objArr3[3] = 0;
                objArr3[4] = 0;
                objArr3[5] = 0;
                objArr3[6] = 0;
                objArr3[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr3[8] = java.lang.Integer.valueOf(this.f219491q ? 2 : 1);
                g0Var3.d(14569, objArr3);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr4 = new java.lang.Object[9];
            objArr4[0] = 0;
            objArr4[1] = 0;
            objArr4[2] = 0;
            objArr4[3] = 1;
            objArr4[4] = 0;
            objArr4[5] = 0;
            objArr4[6] = 0;
            objArr4[7] = java.lang.Integer.valueOf(W0.A0().size());
            objArr4[8] = java.lang.Integer.valueOf(this.f219491q ? 2 : 1);
            g0Var4.d(14569, objArr4);
        }
    }

    public final void g7(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(13234, java.lang.String.format("%s,%d,%d,%d,%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), 0));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f219490p)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f219490p);
            this.f219494t = W0;
            if (W0.A0() != null) {
                this.f219495u = this.f219494t.A0().size();
            }
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mfb);
        this.f219492r = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.gs6);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(mo55332x76847179(), 3));
        c1163xf1deaba4.N(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a2(this));
        c1163xf1deaba4.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c2(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view instanceof android.widget.TextView)) {
            yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f219493s = false;
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f219490p)) {
            intValue++;
        }
        if (intValue == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSearchMemberDetail");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("from_scene", 1);
            intent.putExtra("RoomInfo_Id", this.f219490p);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ic8));
            j45.l.u(this, "com.tencent.mm.chatroom.ui.SeeMemberRecordUI", intent, null);
        } else if (intValue == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSearchDateDetail");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("detail_username", this.f219490p);
            j45.l.u(this, "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, null);
            f7(0);
        } else if (intValue == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeImageVideoHistory");
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("kintent_talker", this.f219490p);
            intent3.putExtra("key_media_type", 1);
            intent3.putExtra("key_gallery_enter_scene", 2);
            intent3.addFlags(67108864);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI", intent3, null);
            f7(1);
        } else if (intValue == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeFileHistory");
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("kintent_talker", this.f219490p);
            intent4.putExtra("key_media_type", 2);
            bundle = com.p314xaae8f345.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent4.putExtra("detail_user_dismiss", this.f219491q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent4, bundle);
        } else if (intValue == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeUrlHistory");
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("kintent_talker", this.f219490p);
            intent5.putExtra("key_media_type", 3);
            bundle = com.p314xaae8f345.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent5.putExtra("detail_user_dismiss", this.f219491q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent5, bundle);
        } else if (intValue == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeUrlHistory");
            android.content.Intent intent6 = new android.content.Intent();
            intent6.putExtra("kintent_talker", this.f219490p);
            intent6.putExtra("key_media_type", 4);
            bundle = com.p314xaae8f345.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent6.putExtra("detail_user_dismiss", this.f219491q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent6, bundle);
        } else if (intValue == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeePayHistory");
            android.content.Intent intent7 = new android.content.Intent();
            intent7.putExtra("kintent_talker", this.f219490p);
            intent7.putExtra("key_media_type", 5);
            bundle = com.p314xaae8f345.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent7.putExtra("detail_user_dismiss", this.f219491q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent7, bundle);
        } else if (intValue == 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeAppBrandHistory");
            android.content.Intent intent8 = new android.content.Intent();
            intent8.putExtra("kintent_talker", this.f219490p);
            intent8.putExtra("key_media_type", 6);
            bundle = com.p314xaae8f345.mm.ui.bk.C() ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
            intent8.putExtra("detail_user_dismiss", this.f219491q);
            j45.l.u(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent8, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSChattingConvUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        t13.g bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) bj6).f219302c = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        int i17;
        super.onDestroy();
        this.f219496v.g();
        t13.g bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) bj6).g();
        }
        if (this.f219493s && this.f219491q) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f219490p)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f219490p);
                if (W0.A0() != null) {
                    i17 = W0.A0().size();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14569, 1, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(i17), 2, 0, 99);
                }
            }
            i17 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14569, 1, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(i17), 2, 0, 99);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f219492r.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.b2(this), 128L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f219490p)) {
            g7(this.f219443n, 10, 5, gVar.f505292b + 1);
        } else {
            g7(this.f219443n, 11, 5, gVar.f505292b + 1);
        }
    }
}
