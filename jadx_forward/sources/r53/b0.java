package r53;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m53.x0 f474174d;

    public b0(m53.x0 x0Var) {
        this.f474174d = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p43.e eVar;
        java.util.LinkedList PackageInfoList = this.f474174d.f405700d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PackageInfoList, "PackageInfoList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : PackageInfoList) {
            java.lang.String str = ((m53.b5) obj).f405119e;
            if (!(str == null || str.length() == 0)) {
                arrayList.add(obj);
            }
        }
        for (m53.b5 b5Var : kz5.n0.F0(arrayList, new r53.a0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocalGameReportUtil", "gamelog.reportLocalGameStatus pkgName = " + b5Var.f405119e + "  Priority = " + b5Var.f405118d);
            p43.f aj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).aj();
            java.lang.String PackageName = b5Var.f405119e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PackageName, "PackageName");
            p43.h hVar = (p43.h) aj6;
            hVar.getClass();
            p43.e eVar2 = null;
            android.database.Cursor f17 = hVar.f433300d.f("SELECT * FROM LocalGameReport WHERE pkgName = " + d95.b0.O(PackageName), null, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        eVar = new p43.e();
                        eVar.mo9015xbf5d97fd(f17);
                    } else {
                        eVar = null;
                    }
                    vz5.b.a(f17, null);
                    eVar2 = eVar;
                } finally {
                }
            }
            r53.c0 c0Var = r53.c0.f474179a;
            if (eVar2 == null) {
                r53.c0.a(c0Var, b5Var.f405119e);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T0(java.lang.System.currentTimeMillis(), eVar2.f68052xac7571e7)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocalGameReportUtil", "gamelog.report32418 pkgName = " + b5Var.f405119e + "  Priority = " + b5Var.f405118d + " today has already reported");
            } else {
                r53.c0.a(c0Var, b5Var.f405119e);
            }
        }
    }
}
