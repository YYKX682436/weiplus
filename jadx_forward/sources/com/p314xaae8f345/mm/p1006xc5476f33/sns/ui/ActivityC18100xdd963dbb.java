package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI */
/* loaded from: classes10.dex */
public class ActivityC18100xdd963dbb extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final /* synthetic */ int F = 0;
    public final java.util.HashSet C = new java.util.HashSet();
    public int D = -1;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 E = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$$a
        @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
        /* renamed from: onTimerExpired */
        public final boolean mo322xdd48fb9f() {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb.F;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb activityC18100xdd963dbb = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb.this;
            activityC18100xdd963dbb.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$new$0", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            activityC18100xdd963dbb.mo54449x3f86539a(activityC18100xdd963dbb.e7());
            activityC18100xdd963dbb.m78573x31241be9(activityC18100xdd963dbb.mo55332x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
            if (activityC18100xdd963dbb.f7() > 0.0f) {
                activityC18100xdd963dbb.m78575xa6c64abb(activityC18100xdd963dbb.f7());
            }
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                activityC18100xdd963dbb.m78573x31241be9(activityC18100xdd963dbb.mo55332x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
            } else {
                activityC18100xdd963dbb.m78573x31241be9(activityC18100xdd963dbb.mo55332x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$new$0", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return false;
        }
    }, false);

    public static void w7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18100xdd963dbb activityC18100xdd963dbb, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        activityC18100xdd963dbb.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goToRoomMember", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String d17 = z3Var.d1();
        android.content.Intent intent = new android.content.Intent(activityC18100xdd963dbb, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18020x8424ad99.class);
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(d17);
        int size = m17 != null ? ((java.util.LinkedList) m17).size() : 0;
        int intExtra = activityC18100xdd963dbb.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        intent.putExtra("RoomInfo_Id", d17);
        intent.putExtra("room_member_count", size);
        intent.putExtra("Add_address_titile", activityC18100xdd963dbb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbh));
        intent.putExtra("room_name", z3Var.d1());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        activityC18100xdd963dbb.startActivityForResult(intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.D(d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goToRoomMember", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        if (i17 == 1) {
            java.util.HashSet hashSet = this.C;
            hashSet.remove(str);
            b7().notifyDataSetChanged();
            int size = hashSet.size();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            u7(size);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createInitAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        boolean booleanExtra = getIntent().getBooleanExtra("key_filter_associate_chat_room", false);
        if (getIntent().getBooleanExtra("new_life_stryle", false)) {
            sb4.a aVar = new sb4.a(this, null, true, booleanExtra, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(getIntent().getStringExtra("recent_select_list"), ","));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createInitAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return aVar;
        }
        sb4.c cVar = new sb4.c(this, null, true, false, booleanExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.no noVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.no(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        cVar.f486983r = noVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createInitAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSearchAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        sb4.d dVar = new sb4.d(this, null, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oo ooVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oo(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        dVar.f486986n = ooVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        ((qd0.n0) dVar.f288237m).f443102t = true;
        if (getIntent().getBooleanExtra("new_life_stryle", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
            dVar.f486987o = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSearchAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSearchRange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        int[] iArr = {131075};
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSearchRange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return iArr;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String stringExtra = getIntent().getStringExtra("sub_title");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return stringExtra;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public float f7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubTitleTextSize", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        float intExtra = getIntent().getIntExtra("sub_title_text_size", -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubTitleTextSize", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return intExtra;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String stringExtra = getIntent().getStringExtra("titile");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return stringExtra;
        }
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbi);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return string;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectChatRoomUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        if (!(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a aVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) item;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = aVar.B;
        if (z3Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        if (z3Var.F0() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = aVar.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectUser", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String d17 = z3Var2.d1();
        java.util.HashSet hashSet = this.C;
        if (hashSet.contains(d17)) {
            hashSet.remove(d17);
        } else {
            if (this.D > 0 && hashSet.size() >= this.D) {
                mo54449x3f86539a(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyu, java.lang.Integer.valueOf(this.D)));
                m78573x31241be9(mo55332x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
                if (f7() > 0.0f) {
                    m78575xa6c64abb(f7());
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.E;
                b4Var.d();
                b4Var.c(1500L, 1500L);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(this, true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectUser", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
                this.f287981f.notifyDataSetChanged();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            }
            hashSet.add(d17);
        }
        Y6();
        this.f287983h.d(d17);
        int size = hashSet.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        u7(size);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectUser", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        this.f287981f.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        super.j7();
        java.lang.String stringExtra = getIntent().getStringExtra("already_select_contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra, ",");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(O1)) {
                this.C.addAll(O1);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSearchBarInTop", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSearchBarInTop", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowAlphabetScrollBar", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowAlphabetScrollBar", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initMenu", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String stringExtra = getIntent().getStringExtra("key_confirm_menu_name");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            stringExtra = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571992vn);
        }
        m78494xd9193382(1, stringExtra, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.mo(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78500x43e00957(1, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initMenu", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.util.HashSet hashSet = this.C;
        this.f287983h.e(new java.util.ArrayList(hashSet));
        this.D = getIntent().getIntExtra("max_limit_num", -1);
        int size = hashSet.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        u7(size);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void r7(android.widget.ListView listView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHeaderView", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHeaderView", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return false;
        }
        boolean contains = this.C.contains(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return contains;
    }

    public final java.util.ArrayList x7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectList", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.C.iterator();
        while (it.hasNext()) {
            hashSet.add((java.lang.String) it.next());
        }
        arrayList.addAll(hashSet);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectList", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return arrayList;
    }
}
