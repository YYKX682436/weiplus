package yw3;

/* loaded from: classes11.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f548285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f548286e;

    public g5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f548285d = repairerPatchDemoUI;
        this.f548286e = mm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        r45.mm6 mm6Var;
        uk.c cVar;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f548285d;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        repairerPatchDemoUI.getClass();
        java.lang.String str2 = null;
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(applicationInfo);
            str = applicationInfo.sourceDir;
        } catch (java.lang.Exception unused) {
            str = null;
        }
        if (str != null) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                uk.b b17 = uk.b.b(str);
                str2 = (b17 == null || (cVar = b17.f510015b) == null) ? com.p314xaae8f345.mm.vfs.w6.p(str) : cVar.f510016d;
            }
        }
        r45.mm6 mm6Var2 = this.f548286e;
        if ((mm6Var2 == null || !mm6Var2.f462205h.equals(str2)) && ((mm6Var = this.f548286e) == null || mm6Var.f462214t != 4)) {
            return;
        }
        r45.mm6 mm6Var3 = this.f548286e;
        if (mm6Var3 != null && mm6Var3.f462214t == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548285d.d, "checkTinkerBoostInstall, HdiffApk, oldApkMd5 is equal?: %s， dialogInfo.newApkPath = %s, oldApkMd5  = %s.", java.lang.Boolean.valueOf(r26.i0.p(mm6Var3.f462205h, str2, true)), this.f548286e.f462202e, str2);
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(this.f548286e.f462202e) && uk.b.a(this.f548286e.f462202e)) {
            ((ku5.t0) ku5.t0.f394148d).B(new yw3.c5(this.f548285d, this.f548286e));
        } else {
            ((un4.e) i95.n0.c(un4.e.class)).getClass();
            ((ku5.t0) ku5.t0.f394148d).B(new yw3.f5(this.f548285d, this.f548286e));
        }
    }
}
