package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI */
/* loaded from: classes11.dex */
public class ActivityC22362x9bac7ed5 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 {
    static final java.lang.String TAG = "MicroMsg.ConvBoxServiceConversationUI";

    /* renamed from: contentView */
    private android.view.View f39562xe8cefebe;

    /* renamed from: com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI */
    /* loaded from: classes11.dex */
    public static class ConvBoxServiceConversationFmUI extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI {

        /* renamed from: CONTEXT_MENU_LONGCLICK_DELETE */
        public static final int f39563xae71e50e = 4;

        /* renamed from: CONTEXT_MENU_LONGCLICK_DISMISS */
        public static final int f39564x27043f67 = 3;

        /* renamed from: CONTEXT_MENU_LONGCLICK_MARK_READ */
        public static final int f39565x3735f985 = 2;

        /* renamed from: CONTEXT_MENU_LONGCLICK_SET_UN_READ */
        public static final int f39566xbfe476fc = 1;
        private static final java.lang.String TAG = "MicroMsg.ConvBoxServiceConversationFmUI";

        /* renamed from: adapter */
        private com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 f39567xbb6ca34f;

        /* renamed from: appbrandMessageLV */
        private android.widget.ListView f39568xb04eac6b;

        /* renamed from: conversation */
        private com.p314xaae8f345.mm.p2621x8fb0427b.l4 f39570x2c1ddc83;

        /* renamed from: emptyTipTv */
        private android.widget.TextView f39571xc03ee330;

        /* renamed from: mAppId */
        private java.lang.String f39573xbdc8caaf;

        /* renamed from: superUsername */
        private java.lang.String f39574x2891b171;

        /* renamed from: x_down */
        private int f39577xd22f6809;

        /* renamed from: y_down */
        private int f39578xd3e440a8;

        /* renamed from: talker */
        private java.lang.String f39575xcb7bc659 = "";

        /* renamed from: clickStatusController */
        private com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 f39569x339642d6 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3();

        /* renamed from: isFirstOnResume */
        boolean f39572x46457cb2 = true;

        /* renamed from: tipDialog */
        private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f39576x691689c3 = null;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: isReaded */
        public boolean m80511xf0724a7f(java.lang.String str) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str);
            return (p17 == null || p17.d1() > 0 || p17.d2(1048576)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setShowView */
        public void m80512x626161c4(int i17) {
            if (i17 <= 0) {
                this.f39571xc03ee330.setVisibility(0);
                this.f39568xb04eac6b.setVisibility(8);
            } else {
                this.f39571xc03ee330.setVisibility(8);
                this.f39568xb04eac6b.setVisibility(0);
            }
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutId */
        public int getF153758d() {
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.d1c;
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI
        /* renamed from: getUserName */
        public java.lang.String mo79363x6bf53a6c() {
            return this.f39574x2891b171;
        }

        /* renamed from: initView */
        public void m80513x10010bd5() {
            mo78695xbf7c1df6(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572551bl4));
            this.f39568xb04eac6b = (android.widget.ListView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.odk);
            android.widget.TextView textView = (android.widget.TextView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.dfo);
            this.f39571xc03ee330 = textView;
            textView.setTextColor(m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f39571xc03ee330.getLayoutParams();
            layoutParams.topMargin = 200;
            this.f39571xc03ee330.setLayoutParams(layoutParams);
            this.f39571xc03ee330.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572550bl3);
            mo78682x9c8c0d33(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j0(this));
            this.f39567xbb6ca34f = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t0(mo78409x676b27cd(), this.f39574x2891b171, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k0(this));
            this.f39567xbb6ca34f.getClass();
            this.f39568xb04eac6b.setAdapter((android.widget.ListAdapter) this.f39567xbb6ca34f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "data count:" + this.f39567xbb6ca34f.getCount());
            this.f39568xb04eac6b.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l0(this));
            this.f39568xb04eac6b.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m0(this));
            this.f39568xb04eac6b.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q0(this));
            this.f39567xbb6ca34f.getClass();
            this.f39567xbb6ca34f.getClass();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo7430x19263085().findViewById(com.p314xaae8f345.mm.R.id.huh);
            boolean z17 = (com.p314xaae8f345.mm.ui.bk.v0() && (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.c0() || com.p314xaae8f345.mm.ui.bk.y())) || com.p314xaae8f345.mm.ui.bk.Z() || com.p314xaae8f345.mm.ui.bk.w0();
            if (viewGroup == null || z17) {
                return;
            }
            viewGroup.setImportantForAccessibility(4);
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityCreated */
        public void mo7495x78cb4fa(android.os.Bundle bundle) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onActivityCreated");
            super.mo7495x78cb4fa(bundle);
            java.lang.String m78394x7e63ed49 = m78394x7e63ed49("Contact_User");
            this.f39574x2891b171 = m78394x7e63ed49;
            if (android.text.TextUtils.isEmpty(m78394x7e63ed49)) {
                this.f39574x2891b171 = "conversationboxservice";
            }
            m80513x10010bd5();
            ((l75.a1) c01.d9.b().r()).a(this.f39567xbb6ca34f);
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityResult */
        public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
            super.mo7496x9d4787cb(i17, i18, intent);
            java.lang.String str = this.f39575xcb7bc659;
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f39575xcb7bc659 = "";
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            if (gm0.j1.a()) {
                ((l75.a1) c01.d9.b().r()).e(this.f39567xbb6ca34f);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f39567xbb6ca34f);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var = this.f39567xbb6ca34f;
            if (o2Var != null) {
                o2Var.E();
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo7430x19263085().findViewById(com.p314xaae8f345.mm.R.id.huh);
            boolean z17 = (com.p314xaae8f345.mm.ui.bk.v0() && (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.c0() || com.p314xaae8f345.mm.ui.bk.y())) || com.p314xaae8f345.mm.ui.bk.Z() || com.p314xaae8f345.mm.ui.bk.w0();
            if (viewGroup != null && !z17) {
                viewGroup.setImportantForAccessibility(1);
            }
            super.mo7504xac79a11b();
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onPause */
        public void mo7512xb01dfb57() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "on pause");
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).b0(this.f39574x2891b171);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var = this.f39567xbb6ca34f;
            if (o2Var != null) {
                o2Var.F();
            }
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.J("@placeholder_foldgroup", 1);
            super.mo7512xb01dfb57();
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onResume */
        public void mo7517x57429eec() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "on resume");
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var = this.f39567xbb6ca34f;
            if (o2Var != null) {
                o2Var.G();
            }
            this.f39567xbb6ca34f.q();
            if (this.f39572x46457cb2) {
                ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
                com.p314xaae8f345.mm.p957x53236a1b.g1.J("@placeholder_foldgroup", 1);
                this.f39572x46457cb2 = false;
            }
            this.f39569x339642d6.b(0);
            super.mo7517x57429eec();
            m80497x2636cab1(c01.h2.c(1), true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableEdge2Edge */
    public boolean mo60885x863d972f() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).aj(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569762nn, (android.view.ViewGroup) null);
        this.f39562xe8cefebe = inflate;
        setContentView(inflate);
        this.f39542x9c18d0aa = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI();
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.jmc, this.f39542x9c18d0aa, null, 1);
        m7630xb2c12e75.d();
        o25.n1.d(this, this.f39562xe8cefebe);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ConvBoxServiceConversationUI);
    }
}
