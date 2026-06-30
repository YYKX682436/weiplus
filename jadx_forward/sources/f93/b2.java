package f93;

/* loaded from: classes11.dex */
public class b2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f341828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d f341829e;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d, java.util.ArrayList arrayList) {
        this.f341829e = viewOnCreateContextMenuListenerC16169x37a19e8d;
        this.f341828d = arrayList;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (i17 != 0) {
            return;
        }
        b93.l lVar = b93.l.f100129a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f341829e;
        int i18 = 0;
        b93.l.a(lVar, viewOnCreateContextMenuListenerC16169x37a19e8d.getIntent().getIntExtra("key_label_click_source", 0), 12, 0, 0, 0, 28, null);
        java.util.ArrayList arrayList = this.f341828d;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (i18 < arrayList.size()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) arrayList.get(i18);
                    if (d4Var != null) {
                        if (!arrayList2.contains(d4Var.f66585x70ce48ca + "")) {
                            arrayList2.add(d4Var.f66585x70ce48ca + "");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 2, 2, 2);
                    }
                    i18++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.Y6(viewOnCreateContextMenuListenerC16169x37a19e8d, arrayList2, arrayList);
                viewOnCreateContextMenuListenerC16169x37a19e8d.P = 1;
                return;
            }
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        k93.j jVar = viewOnCreateContextMenuListenerC16169x37a19e8d.A;
        if (jVar != null && jVar.f387427f.size() > 0) {
            for (int i19 = 0; i19 < viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387427f.size(); i19++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1((java.lang.String) viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387427f.get(i19));
                if (n17 != null) {
                    if (!arrayList4.contains(n17.f66585x70ce48ca + "")) {
                        arrayList4.add(n17.f66585x70ce48ca + "");
                        arrayList3.add(n17);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 2, 2, 2);
                }
            }
            java.lang.String stringExtra = viewOnCreateContextMenuListenerC16169x37a19e8d.getIntent().getStringExtra("contact_select_label_session_id");
            int intExtra = viewOnCreateContextMenuListenerC16169x37a19e8d.getIntent().getIntExtra("contact_select_label_from_scene", 0);
            if (stringExtra != null) {
                int length = stringExtra.length();
                int i27 = 0;
                while (true) {
                    if (i27 >= length) {
                        i18 = 1;
                        break;
                    }
                    int codePointAt = stringExtra.codePointAt(i27);
                    if (!java.lang.Character.isWhitespace(codePointAt)) {
                        break;
                    } else {
                        i27 += java.lang.Character.charCount(codePointAt);
                    }
                }
                if (i18 == 0) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("view_id", "label_detele_confirm_btn");
                    hashMap.put("label_business_type", java.lang.Integer.valueOf(intExtra));
                    hashMap.put("label_select_sessionid", stringExtra);
                    hashMap.put("delete_cnt", java.lang.Integer.valueOf(viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387427f.size()));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", viewOnCreateContextMenuListenerC16169x37a19e8d.f224783q, hashMap, 33926);
                }
            }
        }
        if (arrayList4.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.Y6(viewOnCreateContextMenuListenerC16169x37a19e8d, arrayList4, arrayList3);
        }
        viewOnCreateContextMenuListenerC16169x37a19e8d.P = 2;
    }
}
