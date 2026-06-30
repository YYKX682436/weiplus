package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public final class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f273357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f273358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f273359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f273361h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f273362i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f273363m;

    public p2(java.util.List list, boolean z17, java.util.List list2, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, java.util.List list3, org.json.JSONArray jSONArray) {
        this.f273357d = list;
        this.f273358e = z17;
        this.f273359f = list2;
        this.f273360g = activityC19730xa7b9756f;
        this.f273361h = f4Var;
        this.f273362i = list3;
        this.f273363m = jSONArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("share_file_temp");
        java.util.List list2 = this.f273357d;
        int size = list2.size();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            list = this.f273359f;
            if (i18 >= size) {
                break;
            }
            if (this.f273358e || !r26.i0.A((java.lang.String) list2.get(i18), "content://", false, 2, null)) {
                arrayList.add(list2.get(i18));
            } else {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(h07, java.lang.String.valueOf(i18));
                if (!r6Var.m()) {
                    r6Var.J();
                }
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, (java.lang.String) list.get(i18));
                if (com.p314xaae8f345.mm.vfs.w6.d((java.lang.String) list2.get(i18), r6Var2.o(), false) < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSelectorUI", "copy file fail, " + ((java.lang.String) list2.get(i18)) + " -> " + r6Var2.o());
                    arrayList.add(list2.get(i18));
                } else {
                    arrayList.add(r6Var2.o());
                }
            }
            i18++;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activity = this.f273360g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        e45.r rVar = (e45.r) pf5.z.f435481a.a(activity).a(e45.r.class);
        rVar.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.Map map = rVar.f330956m;
            if (map.containsKey(str)) {
                java.lang.String str2 = (java.lang.String) ((java.util.LinkedHashMap) map).get(str);
                arrayList2.add(str2 != null ? str2 : "");
            } else {
                arrayList2.add("");
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f273361h;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("selected_file_lst", arrayList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        intent.putStringArrayListExtra("selected_file_title_lst", (java.util.ArrayList) list);
        intent.putStringArrayListExtra("key_file_thumb_path", arrayList2);
        java.util.List list3 = this.f273362i;
        intent.putExtra("selected_file_need_clean_lst", list3 instanceof java.util.ArrayList ? (java.util.ArrayList) list3 : null);
        intent.putExtra("GalleryUI_ToUser", activity.f272901e);
        activity.setResult(-1, intent);
        activity.f272914u.f273057a.f141723d = 1L;
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("file_selected_info", this.f273363m.toString());
        int i19 = activity.f272917x;
        if (i19 != 1) {
            if (i19 == 2) {
                i17 = 1;
            } else if (i19 == 3) {
                i17 = 2;
            } else if (i19 == 4) {
                i17 = 3;
            }
        }
        lVarArr[1] = new jz5.l("send_file_tab", java.lang.Integer.valueOf(i17));
        lVarArr[2] = new jz5.l("view_id", "send_file_confirm_button");
        ((cy1.a) rVar2).Ej("view_clk", kz5.c1.k(lVarArr), 28579);
        activity.finish();
    }
}
