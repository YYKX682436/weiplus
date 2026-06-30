package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class ab implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f182003a;

    public ab(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a) {
        this.f182003a = activityC13579xef51058a;
    }

    @Override // w82.j
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f182003a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(activityC13579xef51058a.T.k(false), activityC13579xef51058a, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ya(this), true, true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.o7(activityC13579xef51058a, activityC13579xef51058a.mo55332x76847179(), 4105, activityC13579xef51058a.T, activityC13579xef51058a.f181972p1);
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f182003a;
        db5.e1.u(activityC13579xef51058a.mo55332x76847179(), activityC13579xef51058a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_i), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.za(this), null);
    }

    @Override // w82.j
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f182003a;
        if (activityC13579xef51058a.T.l() <= 0) {
            return;
        }
        if (activityC13579xef51058a.T.l() <= 1) {
            o72.r2 r2Var = (o72.r2) ((java.util.LinkedList) activityC13579xef51058a.T.k(false)).get(0);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 3);
            intent.putExtra("key_fav_item_id", r2Var.f67645x88be67a1);
            o72.x1.M0(activityC13579xef51058a.mo55332x76847179(), ".ui.FavTagEditUI", intent, 4104, null);
            o72.z2.a("FavTagEditUI");
            if (activityC13579xef51058a.T.f182017q) {
                activityC13579xef51058a.t7();
                return;
            }
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 3);
        intent2.putExtra("key_fav_is_add_tag", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List k17 = activityC13579xef51058a.T.k(false);
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) k17;
            if (i17 >= linkedList.size()) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(((o72.r2) linkedList.get(i17)).f67643xc8a07680));
            i17++;
        }
        intent2.putExtra("key_fav_item_ids", arrayList);
        o72.x1.M0(activityC13579xef51058a.mo55332x76847179(), ".ui.FavTagEditUI", intent2, 4104, null);
        o72.z2.a("FavTagEditUI");
        for (o72.r2 r2Var2 : activityC13579xef51058a.T.k(false)) {
            if (r2Var2 != null) {
                ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var2.f67645x88be67a1));
            }
        }
        if (activityC13579xef51058a.T.f182017q) {
            activityC13579xef51058a.t7();
        }
    }
}
