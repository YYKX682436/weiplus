package r35;

/* loaded from: classes11.dex */
public class m implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.o f450712d;

    public m(r35.o oVar) {
        this.f450712d = oVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r35.o oVar = this.f450712d;
        android.app.ProgressDialog progressDialog = oVar.f450757p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (oVar.f450759r != null) {
            gm0.j1.i();
            gm0.j1.n().f354821b.q(106, oVar.f450759r);
        }
        if (oVar.f450757p == null && !oVar.f450765x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddContactDialog", "has cancel the loading dialog");
            oVar.b(0);
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddContactDialog", "searchContact onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            oVar.b(-1);
            return;
        }
        android.content.Context context = oVar.f450748d;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddContactDialog", "searchContact, context is null, msghandler has already been detached!");
            oVar.b(-1);
            return;
        }
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddContactDialog", "searchContact, context isFinishing");
            oVar.b(-1);
            return;
        }
        r45.iw5 H = ((tg3.r1) m1Var).H();
        java.lang.String g17 = x51.j1.g(H.f458889d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddContactDialog", "searchContact, user is null");
            android.content.Context context2 = oVar.f450748d;
            db5.e1.U(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.las), 1);
            oVar.b(-1);
            return;
        }
        java.lang.String str2 = oVar.f450761t;
        if (str2 == null || !str2.equals(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AddContactDialog", "user not the same, %s, %s", oVar.f450761t, g17);
        }
        gm0.j1.i();
        oVar.f450760s = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = oVar.f450760s;
        if (z3Var == null || ((int) z3Var.E2) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContactDialog", "searchContact, no contact with username = " + g17 + ", try get by alias");
            gm0.j1.i();
            oVar.f450760s = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(g17);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = oVar.f450760s;
            if (z3Var2 == null || ((int) z3Var2.E2) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContactDialog", "searchContact, no contact with alias, new Contact");
                oVar.f450760s = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(g17);
                oVar.f450760s.k1(H.f458902t);
                oVar.f450760s.M1(x51.j1.g(H.f458890e));
                oVar.f450760s.R1(x51.j1.g(H.f458891f));
                oVar.f450760s.S1(x51.j1.g(H.f458892g));
                oVar.f450760s.g3(H.f458893h);
                oVar.f450760s.c3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(H.A, H.f458895m, H.f458896n));
                oVar.f450760s.h3(H.f458897o);
                oVar.f450760s.Z1(H.f458899q);
                oVar.f450760s.o3(H.f458900r);
                oVar.f450760s.a2(H.f458904v);
                oVar.f450760s.b2(H.f458903u);
                oVar.f450760s.p3(H.f458901s);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContactDialog", "searchContact, contact in db, %s", g17);
        }
        oVar.g(oVar.f450760s);
    }
}
