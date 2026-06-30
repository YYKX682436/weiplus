package cr3;

/* loaded from: classes11.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f303493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f303494e;

    public p(cr3.d0 d0Var, android.widget.CheckBox checkBox) {
        this.f303494e = d0Var;
        this.f303493d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        c01.g8 g8Var;
        cr3.d0 d0Var = this.f303494e;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = d0Var.f303465e;
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        n17.E2();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
            vg3.e4 e4Var = (vg3.e4) i95.n0.c(vg3.e4.class);
            java.lang.String d17 = z3Var.d1();
            ((np.h) e4Var).getClass();
            op.c cVar = new op.c(true);
            cVar.a(new p41.w(d17, 1));
            g8Var = cVar;
        } else {
            g8Var = np.b.c(n17);
        }
        if (g8Var != null) {
            op.a aVar = (op.a) g8Var;
            ((java.util.ArrayList) aVar.f428751c).add(new cr3.s(d0Var));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d0Var.f303464d;
            ((op.c) aVar).b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518216i, vg3.b.f518178e, vg3.c.f518190i, 0, new java.util.ArrayList(java.util.Collections.singletonList(d0Var.f303465e.d1()))));
        }
        if (g8Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileMenuManager", "dealSetBlack iContactCallbackFactory is null????");
        } else {
            ((java.util.ArrayList) ((op.a) g8Var).f428749a).add(new cr3.h(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(d0Var.f303464d.getIntent(), 14, 3, d0Var.f303465e.d1());
    }
}
