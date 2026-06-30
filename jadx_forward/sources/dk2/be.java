package dk2;

/* loaded from: classes3.dex */
public final class be implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.be f314794d = new dk2.be();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        dk2.x4 x4Var;
        km2.r rVar;
        km2.r rVar2;
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "doKeepLive[" + dk2.ef.I + ']');
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if ((c1Var == null || c1Var.f410374m2) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "[doKeepLive] keepAliveSwitch = false");
            return;
        }
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            if (!zl2.r4.f555483a.w1()) {
                mm2.n0 n0Var = (mm2.n0) efVar.i(mm2.n0.class);
                r3 = ((n0Var == null || !n0Var.f410806r) ? 0 : 1) != 0 ? 16 : 2;
            }
            int i17 = r3;
            r45.qt2 qt2Var = new r45.qt2();
            km2.n nVar = dk2.ef.H;
            qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f390684c) == null) ? 0 : rVar2.f390739k));
            km2.n nVar2 = dk2.ef.H;
            qt2Var.set(5, java.lang.Integer.valueOf((nVar2 == null || (rVar = nVar2.f390684c) == null) ? 0 : rVar.f390739k));
            km2.n nVar3 = dk2.ef.H;
            if (nVar3 == null || (x4Var = nVar3.f390688g) == null || (str = x4Var.f315865z) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
            byte[] bArr = ((mm2.e1) e1Var.m147920xbba4bfc0(mm2.e1.class)).f410518o;
            java.lang.String f17 = xy2.c.f(qt2Var);
            long j17 = ((mm2.e1) e1Var.m147920xbba4bfc0(mm2.e1.class)).f410516m;
            java.lang.String str3 = e1Var.f410525v;
            java.lang.String str4 = ((mm2.e1) e1Var.m147920xbba4bfc0(mm2.e1.class)).f410517n;
            java.lang.String str5 = e1Var.f410526w;
            tn0.w0 w0Var = dk2.ef.f314911d;
            java.lang.String str6 = w0Var != null ? w0Var.Z : null;
            java.lang.String str7 = e1Var.f410528y;
            km2.n nVar4 = dk2.ef.H;
            new ek2.e0(m75942xfb822ef2, bArr, f17, j17, i17, str3, str4, str5, null, 0, qt2Var, 0, null, str6, str2, 0, str7, null, 0L, 1, null, null, null, false, nVar4 != null ? nVar4.f390694m : 0, 16161536, null).l().K(new dk2.ud(e1Var));
        }
    }
}
