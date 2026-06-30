package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f292122a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f292123b;

    public static void a(qk.o oVar, android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        if (oVar == null || activity == null || z3Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(oVar == null);
            objArr[1] = java.lang.Boolean.valueOf(activity == null);
            objArr[2] = java.lang.Boolean.valueOf(z3Var == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b, %b", objArr);
            return;
        }
        f292122a = false;
        f292123b = new java.lang.ref.WeakReference(db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2740x696c9db.k1()));
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        java.lang.String d17 = z3Var.d1();
        z3Var.s3();
        aq1.n nVar = (aq1.n) ((i35.g) gm0.j1.s(i35.g.class));
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactService", "delete contact %s", d17);
        nVar.a(d17, true);
        ((java.util.ArrayList) ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).f94603d).add(new com.p314xaae8f345.mm.ui.p2740x696c9db.l1(z3Var, oVar, weakReference, z17));
    }

    public static void b(qk.o oVar, android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, java.lang.Runnable runnable, int i17) {
        if (oVar != null && activity != null && z3Var != null) {
            db5.e1.B(activity, oVar.G0() ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572304ap5) : activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ap6, z3Var.g2()), "", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgp), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgo), new com.p314xaae8f345.mm.ui.p2740x696c9db.j1(oVar, activity, z3Var, z17, i17, runnable), null, com.p314xaae8f345.mm.R.C30859x5a72f63.a2y);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(oVar == null);
        objArr[1] = java.lang.Boolean.valueOf(activity == null);
        objArr[2] = java.lang.Boolean.valueOf(z3Var == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDeleteUtil", "bizInfo null : %s, context null : %s, ct null : %s", objArr);
    }
}
