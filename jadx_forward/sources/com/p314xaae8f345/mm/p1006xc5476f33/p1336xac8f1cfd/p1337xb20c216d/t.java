package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u f178167d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u uVar) {
        this.f178167d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ec5.a aVar;
        com.p314xaae8f345.mm.vfs.x1 m17;
        int itemId = menuItem.getItemId();
        int i18 = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u uVar = this.f178167d;
        if (itemId != 0) {
            if (itemId == 1 && uVar.f178169d.f178004t != null) {
                ((d73.i) i95.n0.c(d73.i.class)).f6(uVar.f178169d.f178004t);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd = uVar.f178169d;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd.A;
        int T6 = activityC13154xb3ef6cfd.T6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd2 = uVar.f178169d;
        if (T6 == 8) {
            java.lang.String c17 = hx1.b.c(activityC13154xb3ef6cfd2.f178003s);
            if (!com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorFileUI", "share file failed, file not exists");
                android.widget.Toast.makeText(activityC13154xb3ef6cfd2, activityC13154xb3ef6cfd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccu), 1).show();
                return;
            }
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c17);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L) > com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd.f177990z) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorFileUI", "share file failed, file too large");
                android.widget.Toast.makeText(activityC13154xb3ef6cfd2, activityC13154xb3ef6cfd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccv), 1).show();
                return;
            }
        }
        activityC13154xb3ef6cfd2.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        if (activityC13154xb3ef6cfd2.T6() == 15) {
            intent.putExtra("image_path", hx1.b.e(activityC13154xb3ef6cfd2.f178003s));
            jd5.c cVar = new jd5.c();
            cVar.r(hx1.b.c(activityC13154xb3ef6cfd2.f178003s));
            cVar.q(activityC13154xb3ef6cfd2.f178003s.f456981y);
            cVar.o(hx1.b.e(activityC13154xb3ef6cfd2.f178003s));
            aVar = cVar;
            i18 = 11;
        } else if (activityC13154xb3ef6cfd2.T6() == 4) {
            intent.putExtra("image_path", hx1.b.e(activityC13154xb3ef6cfd2.f178003s));
            jd5.c cVar2 = new jd5.c();
            cVar2.r(hx1.b.c(activityC13154xb3ef6cfd2.f178003s));
            cVar2.q(activityC13154xb3ef6cfd2.f178003s.f456981y);
            cVar2.o(hx1.b.e(activityC13154xb3ef6cfd2.f178003s));
            aVar = cVar2;
        } else {
            intent.putExtra("desc_title", activityC13154xb3ef6cfd2.f178003s.f456937d);
            ec5.a aVar2 = new ec5.a();
            aVar2.l(hx1.b.c(activityC13154xb3ef6cfd2.f178003s));
            n13.v vVar = n13.v.f415673a;
            r45.gp0 gp0Var = activityC13154xb3ef6cfd2.f178003s;
            aVar2.k(vVar.b(gp0Var.f456937d, gp0Var.K, gp0Var.R));
            aVar = aVar2;
            i18 = 3;
        }
        intent.putExtra("Retr_Msg_Type", i18);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activityC13154xb3ef6cfd2, aVar, n13.r.a(1001));
    }
}
