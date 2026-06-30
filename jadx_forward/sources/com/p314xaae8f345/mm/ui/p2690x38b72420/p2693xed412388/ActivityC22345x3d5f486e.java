package com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388;

/* renamed from: com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI */
/* loaded from: classes10.dex */
public class ActivityC22345x3d5f486e extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final /* synthetic */ int E = 0;
    public final java.util.HashSet C = new java.util.HashSet();
    public java.lang.String D;

    public static void w7(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e activityC22345x3d5f486e, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        activityC22345x3d5f486e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonSelectChatRoomUI", "goToRoomMember, contact=%s.", z3Var);
        java.lang.String d17 = z3Var.d1();
        android.content.Intent intent = new android.content.Intent(activityC22345x3d5f486e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18020x8424ad99.class);
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(d17);
        int size = m17 != null ? ((java.util.LinkedList) m17).size() : 0;
        intent.putExtra("RoomInfo_Id", d17);
        intent.putExtra("room_member_count", size);
        intent.putExtra("Add_address_titile", activityC22345x3d5f486e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbh));
        intent.putExtra("room_name", z3Var.d1());
        activityC22345x3d5f486e.startActivityForResult(intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.D(d17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.C.remove(str);
            b7().notifyDataSetChanged();
            y7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        sb4.c cVar = new sb4.c(this, null, true, false, false);
        uf5.a0 a0Var = new uf5.a0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        cVar.f486983r = a0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        sb4.d dVar = new sb4.d(this, null, true);
        uf5.b0 b0Var = new uf5.b0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        dVar.f486986n = b0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131075};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a aVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonSelectChatRoomUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) || (z3Var = (aVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        java.lang.String d17 = aVar.B.d1();
        Y6();
        this.f287983h.d(d17);
        java.util.HashSet hashSet = this.C;
        if (hashSet.contains(d17)) {
            hashSet.remove(d17);
        } else {
            hashSet.add(d17);
        }
        this.f287981f.notifyDataSetChanged();
        y7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        java.lang.String stringExtra = getIntent().getStringExtra("privacy_source_type");
        this.D = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonSelectChatRoomUI", "initData, blackType = %s.", stringExtra);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonSelectChatRoomUI", "onActivityResult, resultCode = %s.", java.lang.Integer.valueOf(i18));
            return;
        }
        if (i17 == 0) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Select_Contact", stringExtra);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new uf5.y(this));
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww), new uf5.z(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        y7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void r7(android.widget.ListView listView, int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.C.contains(str);
    }

    public final java.util.ArrayList x7(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.C.iterator();
        while (it.hasNext()) {
            hashSet.add((java.lang.String) it.next());
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public final void y7() {
        java.util.HashSet hashSet = this.C;
        if (hashSet.size() > 0) {
            m78500x43e00957(1, true);
        } else {
            m78500x43e00957(1, false);
        }
        mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + "(" + hashSet.size() + ")");
    }
}
