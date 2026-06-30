package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI */
/* loaded from: classes11.dex */
public final class ActivityC22355xfc758206 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 {
    private static final java.lang.String TAG = "MicroMsg.AppBrandServiceConversationUI";

    /* renamed from: contentView */
    private android.view.View f39516xe8cefebe;

    /* renamed from: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI */
    /* loaded from: classes11.dex */
    public static class AppBrandServiceConversationFmUI extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI implements db5.t4 {

        /* renamed from: CONTEXT_MENU_LONGCLICK_ACCEPT_MSG */
        private static final int f39517xf799418d = 1;

        /* renamed from: CONTEXT_MENU_LONGCLICK_DELETE */
        private static final int f39518xae71e50e = 3;

        /* renamed from: CONTEXT_MENU_LONGCLICK_DISMISS */
        private static final int f39519x27043f67 = 4;

        /* renamed from: CONTEXT_MENU_LONGCLICK_REFUSE_MSG */
        private static final int f39520xe3550699 = 2;
        private static final java.lang.String TAG = "MicroMsg.AppBrandServiceConversationFmUI";

        /* renamed from: adapter */
        private com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 f39521xbb6ca34f;

        /* renamed from: appBrandServiceActionSheet */
        private ab5.z f39522x8ccfcb5a;

        /* renamed from: appbrandMessageLV */
        private android.widget.ListView f39523xb04eac6b;

        /* renamed from: contextMenuHelper */
        private com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f39524x6aff50fc;

        /* renamed from: conversation */
        private com.p314xaae8f345.mm.p2621x8fb0427b.l4 f39525x2c1ddc83;

        /* renamed from: emptyTipTv */
        private android.widget.TextView f39526xc03ee330;

        /* renamed from: fromScene */
        private int f39527x41e4b02;

        /* renamed from: mAppId */
        private java.lang.String f39529xbdc8caaf;

        /* renamed from: mSceneId */
        private java.lang.String f39530x1037e19a;

        /* renamed from: superUsername */
        private java.lang.String f39531x2891b171;

        /* renamed from: talker */
        private java.lang.String f39532xcb7bc659 = "";

        /* renamed from: tipDialog */
        private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f39533x691689c3 = null;

        /* renamed from: isDeleteCancel */
        private boolean f39528x88f6664f = false;

        /* renamed from: asyncDelMsg */
        private void m80445xcd934d12(java.lang.String str) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "async del msg talker:%s", str);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 r66 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).r6(str);
            r45.ac0 ac0Var = new r45.ac0();
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = str == null ? "" : str;
            du5Var.f454290e = true;
            ac0Var.f451445d = du5Var;
            ac0Var.f451447f = r66.I0();
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(8, ac0Var));
            this.f39528x88f6664f = false;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo78409x676b27cd(), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b(this));
            m80452x40d1e1d5(5);
            c01.w9.h(str, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c(this, Q));
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.I(str, 15);
        }

        /* renamed from: batchSyncForWxaContact */
        private void m80446xb1b20914() {
            java.util.List list;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var = this.f39521xbb6ca34f;
            if (o2Var == null || o2Var.getCount() == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "batchSyncForWxaContact, size:%d", java.lang.Integer.valueOf(this.f39521xbb6ca34f.getCount()));
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var2 = this.f39521xbb6ca34f;
            if (!(o2Var2 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k) || (list = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k) o2Var2).N) == null || ((java.util.ArrayList) list).size() <= 0) {
                return;
            }
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttrExportService", "batchSync list %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ", "));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.c(list, k91.h1.WXA_CUSTOMER_SERVICE, null);
        }

        /* renamed from: cleadAllServiceAppBrandUnreadCount */
        private void m80447x6799d867() {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5167xa795c797().e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: delConversationAndMsg */
        public void m80448xc47f5ff8(java.lang.String str) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Delete Conversation and messages fail because username is null or nil.");
                return;
            }
            m80445xcd934d12(str);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(str);
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a(this));
        }

        /* renamed from: enterConversationReport */
        private void m80449x8f9e2c8f() {
            java.lang.String str;
            int i17;
            if (this.f39521xbb6ca34f == null) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p("appbrandcustomerservicemsg");
            int d17 = (p17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.h1())) ? 0 : p17.d1();
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) this.f39521xbb6ca34f.getItem(0);
            str = "";
            if (l4Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l4Var.h1())) {
                java.lang.String j17 = l4Var.j();
                str = j17 != null ? j17 : "";
                k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(l4Var.h1());
                this.f39529xbdc8caaf = Bi == null ? null : Bi.f68904x28d45f97;
            }
            java.lang.String str2 = str;
            if (d17 > 0) {
                int count = this.f39521xbb6ca34f.getCount();
                i17 = 0;
                for (int i18 = 0; i18 < count; i18++) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) this.f39521xbb6ca34f.getItem(i18);
                    if (l4Var2.d1() + l4Var2.f1() > 0) {
                        i17++;
                    }
                }
            } else {
                i17 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13797, this.f39530x1037e19a, java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(i17), this.f39529xbdc8caaf, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), 0, str2);
            g23.j.f349463a.a(1L);
        }

        /* renamed from: intToString */
        private java.lang.String m80450xd24eef7b(int i17) {
            return new java.math.BigInteger(java.lang.Integer.toBinaryString(i17), 2).toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setShowView */
        public void m80451x626161c4(int i17) {
            if (i17 <= 0) {
                this.f39526xc03ee330.setVisibility(0);
                this.f39523xb04eac6b.setVisibility(8);
            } else {
                this.f39526xc03ee330.setVisibility(8);
                this.f39523xb04eac6b.setVisibility(0);
            }
        }

        /* renamed from: customerMsgOperateReport */
        public void m80452x40d1e1d5(int i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13798, java.lang.Integer.valueOf(i17), this.f39529xbdc8caaf, 0, this.f39530x1037e19a, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        }

        /* renamed from: entryCustomerMsgDialogReport */
        public void m80453xb01f1a2d(java.lang.String str, int i17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str);
            if (p17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "cvs:%s is null, error", str);
                return;
            }
            int d17 = p17.d1();
            java.lang.String str2 = this.f39530x1037e19a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13799, this.f39529xbdc8caaf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17), str2, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutId */
        public int getF153758d() {
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.d1c;
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI
        /* renamed from: getUserName */
        public java.lang.String mo79363x6bf53a6c() {
            return this.f39531x2891b171;
        }

        /* renamed from: initView */
        public void m80454x10010bd5() {
            mo78695xbf7c1df6(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571621kk));
            this.f39523xb04eac6b = (android.widget.ListView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.odk);
            android.widget.TextView textView = (android.widget.TextView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.dfo);
            this.f39526xc03ee330 = textView;
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l_);
            mo78682x9c8c0d33(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f(this));
            this.f39522x8ccfcb5a = new ab5.z(mo78409x676b27cd());
            this.f39521xbb6ca34f = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k(mo78409x676b27cd(), this.f39531x2891b171, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g(this));
            this.f39521xbb6ca34f.getClass();
            this.f39523xb04eac6b.setAdapter((android.widget.ListAdapter) this.f39521xbb6ca34f);
            this.f39524x6aff50fc = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(mo78409x676b27cd());
            this.f39523xb04eac6b.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h(this));
            this.f39523xb04eac6b.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i(this));
            this.f39521xbb6ca34f.getClass();
            this.f39521xbb6ca34f.getClass();
            this.f39521xbb6ca34f.getClass();
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityCreated */
        public void mo7495x78cb4fa(android.os.Bundle bundle) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onActivityCreated");
            super.mo7495x78cb4fa(bundle);
            java.lang.String m78394x7e63ed49 = m78394x7e63ed49("Contact_User");
            this.f39531x2891b171 = m78394x7e63ed49;
            if (android.text.TextUtils.isEmpty(m78394x7e63ed49)) {
                this.f39531x2891b171 = "appbrandcustomerservicemsg";
            }
            int m78386x9c19e6d7 = m78386x9c19e6d7("app_brand_conversation_from_scene", 1);
            this.f39527x41e4b02 = m78386x9c19e6d7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "fromScene:%d", java.lang.Integer.valueOf(m78386x9c19e6d7));
            this.f39530x1037e19a = java.lang.System.currentTimeMillis() + m80450xd24eef7b(c01.d9.b().C());
            m80454x10010bd5();
            m78623x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571346ch, com.p314xaae8f345.mm.R.raw.f80298x5ddec500, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d(this));
            m78623x84f07bce(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571347ci, com.p314xaae8f345.mm.R.raw.f78479x6c9f07fa, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e(this));
            ((l75.a1) c01.d9.b().r()).a(this.f39521xbb6ca34f);
            m80447x6799d867();
            m80449x8f9e2c8f();
            m80446xb1b20914();
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityResult */
        public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
            super.mo7496x9d4787cb(i17, i18, intent);
            java.lang.String str = this.f39532xcb7bc659;
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f39532xcb7bc659 = "";
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(this.f39532xcb7bc659);
            if (Bi != null && (Bi.f68906xf1b7abb7 & 2) > 0) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571728nm);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571730no);
            }
            contextMenu.add(adapterContextMenuInfo.position, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.boo);
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            if (gm0.j1.a()) {
                ((l75.a1) c01.d9.b().r()).e(this.f39521xbb6ca34f);
            }
            m80446xb1b20914();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var = this.f39521xbb6ca34f;
            if (o2Var != null) {
                o2Var.E();
            }
            super.mo7504xac79a11b();
        }

        @Override // db5.t4
        /* renamed from: onMMMenuItemSelected */
        public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f39532xcb7bc659, true);
            if (n17 == null || ((int) n17.E2) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "changed biz stick status failed, contact is null, talker = " + this.f39532xcb7bc659);
                return;
            }
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                ab5.z zVar = this.f39522x8ccfcb5a;
                zVar.f84522e = this.f39532xcb7bc659;
                zVar.f84525h = this.f39527x41e4b02;
                zVar.f84524g = this.f39530x1037e19a;
                zVar.f84526i = true;
                zVar.e(3);
                return;
            }
            if (itemId != 2) {
                if (itemId != 3) {
                    return;
                }
                m80448xc47f5ff8(this.f39532xcb7bc659);
            } else {
                ab5.z zVar2 = this.f39522x8ccfcb5a;
                zVar2.f84522e = this.f39532xcb7bc659;
                zVar2.f84525h = this.f39527x41e4b02;
                zVar2.f84524g = this.f39530x1037e19a;
                zVar2.f84526i = true;
                zVar2.e(4);
            }
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onPause */
        public void mo7512xb01dfb57() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "on pause");
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).b0(this.f39531x2891b171);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var = this.f39521xbb6ca34f;
            if (o2Var != null) {
                o2Var.F();
            }
            super.mo7512xb01dfb57();
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onResume */
        public void mo7517x57429eec() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "on resume");
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var = this.f39521xbb6ca34f;
            if (o2Var != null) {
                o2Var.G();
            }
            super.mo7517x57429eec();
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
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8
    /* renamed from: getChattingUIFragment */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea mo80432x7473b9c0() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI();
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569762nn, (android.view.ViewGroup) null);
        this.f39516xe8cefebe = inflate;
        setContentView(inflate);
        this.f39542x9c18d0aa = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22355xfc758206.AppBrandServiceConversationFmUI();
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.jmc, this.f39542x9c18d0aa, null, 1);
        m7630xb2c12e75.d();
        o25.n1.d(this, this.f39516xe8cefebe);
    }
}
