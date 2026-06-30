package s61;

/* loaded from: classes8.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s61.o0 f484902d;

    public m0(s61.o0 o0Var) {
        this.f484902d = o0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e activityC11378xa7f41e6e = this.f484902d.f484914d;
        for (int i18 = 0; i18 < activityC11378xa7f41e6e.f154696e.a().length; i18++) {
            r45.n04 n04Var = new r45.n04();
            java.lang.String str = activityC11378xa7f41e6e.f154696e.a()[i18];
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            n04Var.f462509h = str;
            n04Var.f462510i = activityC11378xa7f41e6e.f154701m;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(22, n04Var));
            r61.v0 v0Var = new r61.v0();
            v0Var.f474501a = activityC11378xa7f41e6e.f154696e.a()[i18];
            v0Var.f474502b = activityC11378xa7f41e6e.f154701m;
            v0Var.f474503c = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.Ni().n0(v0Var);
        }
        db5.e1.m(activityC11378xa7f41e6e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.g28, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new s61.s0(activityC11378xa7f41e6e));
    }
}
