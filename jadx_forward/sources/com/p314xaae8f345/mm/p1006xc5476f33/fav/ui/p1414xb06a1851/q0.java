package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class q0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.r0 f182314d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.r0 r0Var) {
        this.f182314d = r0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.r0 r0Var = this.f182314d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 2);
            intent.putExtra("key_fav_item_id", r0Var.f182319e.f182160o.f67645x88be67a1);
            o72.x1.L0(r0Var.f182319e.mo55332x76847179(), ".ui.FavTagEditUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = r0Var.f182319e;
            activityC13591xdaafa82c.f182133g.f425023o++;
            activityC13591xdaafa82c.U6(7);
            return;
        }
        java.lang.String str = "";
        if (itemId == 1) {
            db5.e1.u(r0Var.f182319e.mo55332x76847179(), r0Var.f182319e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p0(this), null);
            r0Var.f182319e.U6(6);
            return;
        }
        if (itemId != 2) {
            if (itemId != 3) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c2 = r0Var.f182319e;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b4.b(activityC13591xdaafa82c2, r0Var.f182318d, activityC13591xdaafa82c2.f182133g);
            r0Var.f182319e.U6(5);
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        o72.r2 r2Var = r0Var.f182319e.f182160o;
        if (r2Var != null) {
            r45.bq0 bq0Var = r2Var.f67640x5ab01132;
            if (bq0Var != null && (jq0Var = bq0Var.f452495d) != null) {
                java.lang.String str2 = jq0Var.f459569f;
                java.lang.String str3 = jq0Var.f459571h;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jq0Var.f459579s)) {
                    long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(jq0Var.f459579s, 0L);
                    int i18 = aVar.f125235d;
                    aVar.set(i18 + 2, java.lang.Long.valueOf(V));
                    if (c01.z1.r().equals(str2)) {
                        aVar.set(i18 + 1, str3);
                    } else {
                        aVar.set(i18 + 1, str2);
                    }
                }
            }
            r45.gp0 J2 = o72.x1.J(r0Var.f182319e.f182160o);
            if (J2 != null) {
                str = o72.x1.x(J2);
            }
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            aVar.p(str);
            n13.r rVar = new n13.r();
            rVar.f415650a = true;
            rVar.f415653d.f415672a = 6;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(r0Var.f182319e, aVar, rVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c3 = r0Var.f182319e;
        activityC13591xdaafa82c3.X6(activityC13591xdaafa82c3.f182160o.f67645x88be67a1, 1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c4 = r0Var.f182319e;
        activityC13591xdaafa82c4.f182133g.f425020l++;
        activityC13591xdaafa82c4.U6(3);
    }
}
