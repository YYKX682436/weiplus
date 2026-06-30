package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class l0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f158035e = {l75.n0.m145250x3fdc6f77(dm.w.f322232x, "AppBrandCommonUseApp")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f158036d;

    public l0(l75.k0 k0Var) {
        super(k0Var, dm.w.f322232x, "AppBrandCommonUseApp", dm.w.f322223o);
        this.f158036d = k0Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 D0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g0 g0Var, r45.hd7 hd7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        java.lang.String z07 = z0(g0Var.f68932xdec927b, g0Var.f68933x94d24c6d);
        java.lang.String str = g0Var.f68932xdec927b;
        java.lang.String str2 = hd7Var.f457605g;
        java.lang.String str3 = hd7Var.f457606h;
        java.lang.String str4 = hd7Var.f457607i;
        int i17 = hd7Var.f457608m;
        int i18 = g0Var.f68933x94d24c6d;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4(z07, str, str2, str3, str3, str4, i17, i18, 0, 0L, 0L, w2Var != null && w2Var.z0(str, i18), -1L, 0, 0, 0, false, "", false);
    }

    public boolean J0(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "remove username:%s, versionType:%d", str, java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g0();
        g0Var.f68929xee1faef1 = z0(str, i17).hashCode();
        g0Var.f68932xdec927b = str;
        g0Var.f68933x94d24c6d = i17;
        if (!mo49766xb06685ab((l75.f0) g0Var, false, new java.lang.String[0])) {
            return true;
        }
        boolean z17 = super.get(g0Var, new java.lang.String[0]);
        if (!z17) {
            int mo78086x7444f759 = mo78086x7444f759();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "do deleteCommUseRecord cgi, listCount:%d", java.lang.Integer.valueOf(mo78086x7444f759));
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.n3(1001, false, i17, 3, 2, str, 1, null, mo78086x7444f759 == 0 ? 1 : 0).l();
            mo142179xf35bbb4("single", 5, null);
        }
        return !z17;
    }

    public void y0(java.util.LinkedList linkedList, java.lang.Long l17, boolean z17, int i17, java.lang.Runnable runnable) {
        java.util.Iterator it;
        int i18;
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "flushCommonUseList");
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = this.f158036d;
        long F = k0Var.F(valueOf);
        k0Var.mo70514xb06685ab("AppBrandCommonUseApp", "", null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCommonUsedAppStorage", "flushCommonUseList commonUseList is null or 0 size");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g0();
            java.util.Iterator it6 = linkedList.iterator();
            int i27 = 0;
            while (it6.hasNext()) {
                r45.pc7 pc7Var = (r45.pc7) it6.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pc7Var.f464477d)) {
                    g0Var.f68929xee1faef1 = z0(pc7Var.f464477d, pc7Var.f464479f).hashCode();
                    g0Var.f68932xdec927b = pc7Var.f464477d;
                    g0Var.f68933x94d24c6d = pc7Var.f464479f;
                    java.util.Iterator it7 = it6;
                    g0Var.f68931xa783a79b = java.lang.System.currentTimeMillis();
                    int i28 = i27 + 1;
                    g0Var.f68930xa45f0850 = i27;
                    g0Var.f68927x453e07a1 = pc7Var.f464484n;
                    try {
                        r45.hd7 hd7Var = pc7Var.f464483m;
                        if (hd7Var != null) {
                            g0Var.f68928xbb7037e5 = hd7Var.mo14344x5f01b1f6();
                            i19 = pc7Var.f464483m.f457602d;
                        } else {
                            i19 = -1;
                        }
                        it = it7;
                        i18 = i19;
                    } catch (java.io.IOException e17) {
                        it = it7;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandCommonUsedAppStorage", e17, "", new java.lang.Object[0]);
                        i18 = -1;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "username:%s, version_type:%d, referId:%d, app_path:%s", pc7Var.f464477d, java.lang.Integer.valueOf(pc7Var.f464479f), java.lang.Integer.valueOf(i18), pc7Var.f464484n);
                    k0Var.l("AppBrandCommonUseApp", null, g0Var.mo9763xeb27878e());
                    i27 = i28;
                    it6 = it;
                }
            }
        }
        k0Var.w(java.lang.Long.valueOf(F));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.a3.a(i17, null, linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.k0(this, z17, l17, runnable));
            return;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "ljd doNotify db clear list");
            mo142179xf35bbb4("batch", 3, l17);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final java.lang.String z0(java.lang.String str, int i17) {
        return java.lang.String.format(java.util.Locale.US, "%s_%d", str, java.lang.Integer.valueOf(i17));
    }
}
