package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class z extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f270702e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.f270516f2, "AppInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f270703d;

    public z(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.f270516f2, "AppInfo", dm.m0.f319900z1);
        this.f270703d = new jt0.j(50);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
        mVar.f67370x28d45f97 = "wx4310bbd51be7d979";
        if (super.get(mVar, new java.lang.String[0])) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
        mVar2.f67370x28d45f97 = "wx4310bbd51be7d979";
        mVar2.f67372x453d1e07 = "weixinfile";
        mVar2.f67386xa1e9e82c = "com.tencent.mm.openapi";
        mVar2.f67391x10a0fed7 = -1;
        super.mo880xb970c2b9(mVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String D0(java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z.D0(java.lang.String, int):java.lang.String");
    }

    public java.lang.String J0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, java.lang.String str, int i17) {
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "getIconUrl, appInfo does not exist, appId: %s", str);
            return null;
        }
        if (!mVar.f67370x28d45f97.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "getIconUrl, appInfo.appId: %s not equal appId %s", mVar.f67370x28d45f97, str);
            return null;
        }
        if (i17 == 1) {
            return mVar.f67369x5e556d3a;
        }
        if (i17 == 2) {
            return mVar.f67380x32aac1e7;
        }
        if (i17 == 3) {
            return mVar.R;
        }
        if (i17 == 4) {
            return mVar.f319926y0;
        }
        if (i17 == 5) {
            return mVar.f319908l1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "hasIconUrl, unknown iconType: %s", java.lang.Integer.valueOf(i17));
        return null;
    }

    public android.database.Cursor L0(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("select * from AppInfo where ");
        if (i17 != 0) {
            sb6.append(" ( serviceAppInfoFlag & ");
            sb6.append(i17);
            sb6.append(" ) != 0 and ");
        }
        sb6.append(" ( serviceShowFlag & ");
        sb6.append(i18);
        sb6.append(" ) != 0");
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(sb6.toString(), new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            return m145256x1d3f4980;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "getServiceByAppInfoFlagAndShowFlag : cursor is null");
        return null;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        if (mVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67370x28d45f97)) {
            l75.e0 e0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.f270516f2;
            if ("wxce6f23b478a3a2a2".equals(mVar.f67370x28d45f97) || "wx6fa7e3bab7e15415".equals(mVar.f67370x28d45f97)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoStorage", "insert appinfo: %s, %s, %s, %s, %s", mVar.f67370x28d45f97, mVar.f67372x453d1e07, java.lang.Integer.valueOf(mVar.f67389x84b4f099), java.lang.Integer.valueOf(mVar.f67371xa2e856b6), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            }
            if (super.mo51731x24249762(mVar, false)) {
                java.lang.String str = mVar.f67370x28d45f97;
                mo142179xf35bbb4(str, 2, str);
                java.lang.String str2 = mVar.f67370x28d45f97;
                if (str2 == null) {
                    return true;
                }
                ((lt0.f) this.f270703d).j(str2, mVar);
                return true;
            }
        }
        return false;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, java.lang.String... strArr) {
        if (mVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67370x28d45f97)) {
            return false;
        }
        l75.e0 e0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.f270516f2;
        if ("wxce6f23b478a3a2a2".equals(mVar.f67370x28d45f97) || "wx6fa7e3bab7e15415".equals(mVar.f67370x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoStorage", "update appinfo: %s, %s, %s, %s, %s", mVar.f67370x28d45f97, mVar.f67372x453d1e07, java.lang.Integer.valueOf(mVar.f67389x84b4f099), java.lang.Integer.valueOf(mVar.f67371xa2e856b6), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        java.lang.String str = mVar.f67370x28d45f97;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((lt0.f) this.f270703d).mo141381xc84af884(str);
        }
        boolean mo51732xbf274172 = super.mo51732xbf274172(mVar, false, strArr);
        if (mo51732xbf274172) {
            mo142179xf35bbb4(mVar.f67370x28d45f97 + "", 3, mVar.f67370x28d45f97);
        }
        return mo51732xbf274172;
    }

    @Override // l75.n0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean mo9951xb06685ab(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, java.lang.String... strArr) {
        if (mVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67370x28d45f97)) {
            return false;
        }
        l75.e0 e0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.f270516f2;
        if ("wxce6f23b478a3a2a2".equals(mVar.f67370x28d45f97) || "wx6fa7e3bab7e15415".equals(mVar.f67370x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoStorage", "delete appinfo: %s, %s, %s, %s, %s", mVar.f67370x28d45f97, mVar.f67372x453d1e07, java.lang.Integer.valueOf(mVar.f67389x84b4f099), java.lang.Integer.valueOf(mVar.f67371xa2e856b6), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        java.lang.String str = mVar.f67370x28d45f97;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((lt0.f) this.f270703d).mo141381xc84af884(str);
        }
        boolean mo49766xb06685ab = super.mo49766xb06685ab((l75.f0) mVar, false, strArr);
        if (mo49766xb06685ab) {
            mo142179xf35bbb4(mVar.f67370x28d45f97 + "", 5, mVar.f67370x28d45f97);
        }
        return mo49766xb06685ab;
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m z0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "appId is null");
            return null;
        }
        kk.j jVar = this.f270703d;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) ((lt0.f) jVar).i(str);
        if (mVar == null) {
            mVar = null;
        }
        if (mVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67370x28d45f97)) {
            return mVar;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
        mVar2.f67370x28d45f97 = str;
        if (!super.get(mVar2, new java.lang.String[0])) {
            return null;
        }
        java.lang.String str2 = mVar2.f67370x28d45f97;
        if (str2 != null) {
            ((lt0.f) jVar).j(str2, mVar2);
        }
        return mVar2;
    }
}
