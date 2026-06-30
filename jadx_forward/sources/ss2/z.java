package ss2;

/* loaded from: classes10.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f493527d;

    public z(ss2.a0 a0Var) {
        this.f493527d = a0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        int i19;
        int itemId = menuItem.getItemId();
        ss2.a0 a0Var = this.f493527d;
        if (itemId == 4387) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = a0Var.f493438d;
            if (iq.b.v(abstractActivityC21394xb3d2c0cf) || iq.b.e(abstractActivityC21394xb3d2c0cf)) {
                return;
            }
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(abstractActivityC21394xb3d2c0cf, "android.permission.CAMERA", 18, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostMediaWidget", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), abstractActivityC21394xb3d2c0cf);
            if (a17) {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ss2.p(a0Var, null), 3, null);
                return;
            }
            return;
        }
        if (itemId != 4388) {
            return;
        }
        java.util.ArrayList arrayList = a0Var.f493449r;
        int size = arrayList != null ? arrayList.size() : 0;
        java.util.ArrayList arrayList2 = a0Var.f493444m;
        int size2 = arrayList2 != null ? arrayList2.size() : 0;
        if (size2 < 9 || size < 9) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("album_from_finder_add_media", true);
            if (size2 != 0 || size >= 9) {
                return;
            }
            if (size == 0) {
                i19 = 3;
                i18 = 9;
            } else {
                i18 = 9 - size;
                i19 = 1;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).ok(a0Var.f493438d, intent, i19, i18, 4388);
        }
    }
}
