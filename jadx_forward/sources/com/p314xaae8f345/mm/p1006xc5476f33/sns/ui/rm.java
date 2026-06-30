package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class rm extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm {
    public int A;
    public int B;
    public boolean C;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18080xc668b4d6 D;

    /* renamed from: y, reason: collision with root package name */
    public android.database.Cursor f251959y;

    /* renamed from: z, reason: collision with root package name */
    public android.database.Cursor f251960z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18080xc668b4d6 activityC18080xc668b4d6, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var) {
        super(activityC18080xc668b4d6, context, v1Var);
        this.D = activityC18080xc668b4d6;
        this.f251959y = null;
        this.f251960z = null;
        this.C = false;
        o();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm
    public boolean H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return false;
    }

    public android.database.Cursor J(int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int M = M();
        int K = K();
        int i19 = 0;
        boolean z17 = M > 0;
        boolean z18 = K > 0;
        int i27 = (z17 && this.C) ? 1 : 0;
        if (z18 && this.C) {
            i19 = 1;
        }
        if (i27 == 1 && i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        if (z17 && i17 >= i27 && i17 < M + i27) {
            android.database.Cursor cursor = this.f251959y;
            if (cursor == null || !cursor.moveToPosition(i17 - i27)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
                return null;
            }
            android.database.Cursor cursor2 = this.f251959y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return cursor2;
        }
        if (i19 == 1 && i17 == M + i27) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        if (!z18 || i17 < (i18 = i27 + M + i19) || i17 >= i18 + K) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        android.database.Cursor cursor3 = this.f251960z;
        if (cursor3 == null || !cursor3.moveToPosition(((i17 - i27) - M) - i19)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        android.database.Cursor cursor4 = this.f251960z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return cursor4;
    }

    public int K() {
        android.database.Cursor cursor;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFriendsUnReadCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        if (this.B < 0 && (cursor = this.f251960z) != null) {
            this.B = cursor.getCount();
        }
        int i17 = this.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFriendsUnReadCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return i17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 L(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        java.util.Map map = this.f294143g;
        if (map != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            if (v1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
                return v1Var;
            }
        }
        android.database.Cursor J2 = J(i17);
        if (J2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        if (this.f294143g == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 x17 = x((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) this.f294140d, J2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return x17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 x18 = x(null, J2);
        ((java.util.HashMap) this.f294143g).put(java.lang.Integer.valueOf(i17), x18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return x18;
    }

    public int M() {
        android.database.Cursor cursor;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getToMeUnReadCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        if (this.A < 0 && (cursor = this.f251959y) != null) {
            this.A = cursor.getCount();
        }
        int i17 = this.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getToMeUnReadCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        android.database.Cursor cursor = this.f251959y;
        if (cursor != null) {
            cursor.close();
        }
        this.A = -1;
        android.database.Cursor cursor2 = this.f251960z;
        if (cursor2 != null) {
            cursor2.close();
        }
        this.B = -1;
        java.util.Map map = this.f294143g;
        if (map != null) {
            map.clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int M = M();
        int K = K();
        int i17 = 0;
        if (M > 0) {
            i17 = (this.C ? 1 : 0) + M + 0;
        }
        if (K > 0) {
            i17 = i17 + K + (this.C ? 1 : 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 L = L(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm, com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 L = L(i17);
        if (L == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return 0L;
        }
        long j17 = L.f67469x29d1290e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sm smVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sm smVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int M = M();
        int K = K();
        boolean z17 = false;
        boolean z18 = M > 0;
        boolean z19 = K > 0;
        int i18 = (z18 && this.C) ? 1 : 0;
        if (z19 && this.C) {
            z17 = true;
        }
        if (i18 == 1 && i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getToMeTitleView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            if (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sm)) {
                view = com.p314xaae8f345.mm.ui.id.b(this.f294141e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ep9, (android.view.ViewGroup) null);
                smVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sm();
                smVar2.f252010a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.v99);
                view.setTag(smVar2);
            } else {
                smVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sm) view.getTag();
            }
            if (smVar2 != null) {
                smVar2.f252010a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.oju);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getToMeTitleView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return view;
        }
        if (!z17 || i17 != M + i18) {
            android.view.View view2 = super.getView(i17, view, viewGroup);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return view2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFriendsTitleView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        if (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sm)) {
            view = com.p314xaae8f345.mm.ui.id.b(this.f294141e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ep9, (android.view.ViewGroup) null);
            smVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sm();
            smVar.f252010a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.v99);
            view.setTag(smVar);
        } else {
            smVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sm) view.getTag();
        }
        if (smVar != null) {
            smVar.f252010a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ojl);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFriendsTitleView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object k(int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 x17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        android.database.Cursor J2 = J(i17);
        if (J2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            x17 = null;
        } else {
            x17 = x(v1Var, J2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return x17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm, com.p314xaae8f345.mm.ui.z9
    public void q() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().i1(1);
        if (i18 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUIWithRelevance", "adapter resetToMeCursor toMeUnreadCnt = %d", java.lang.Integer.valueOf(i18));
            android.database.Cursor b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().b1(1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setToMeCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            this.f251959y = b17;
            this.A = -1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setToMeCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().i1(2);
        if (i19 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUIWithRelevance", "adapter resetFriendsCursor friendsUnreadCnt = %d", java.lang.Integer.valueOf(i19));
            android.database.Cursor b18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().b1(2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFriendsCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            this.f251960z = b18;
            this.B = -1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFriendsCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        }
        int i27 = i18 + i19;
        if (i18 > 0 && i19 > 0) {
            this.C = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMainTitle", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        this.D.k7();
        if (!this.C && M() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMyInteractionMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMyInteractionMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.ojt;
        } else if (this.C || K() <= 0) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.jcy;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMutualFriendMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMutualFriendMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.ojs;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qm(this, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMainTitle", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        u(i27);
        notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm
    public int t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm
    public int y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int count = getCount();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return count;
    }
}
