package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes9.dex */
public abstract class b0 {
    public static boolean a(android.widget.ImageView imageView, r45.dp0 dp0Var, float f17) {
        if (dp0Var == null || dp0Var.f454171h != 1 || android.text.TextUtils.isEmpty(dp0Var.f454167d)) {
            return false;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, dp0Var.f454167d, f17);
        return true;
    }

    public static boolean b(r45.dp0 dp0Var) {
        if (dp0Var == null) {
            return false;
        }
        return dp0Var.f454171h == 3 || dp0Var.f454175o == 1;
    }

    public static java.util.HashMap c(o72.r2 r2Var) {
        r45.dp0 dp0Var = r2Var.f67640x5ab01132.I;
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String format = java.lang.String.format("file://%s", o72.x1.X(J2));
        if (!com.p314xaae8f345.mm.vfs.w6.j(format)) {
            format = java.lang.String.format("file://%s", o72.x1.x(J2));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("desc", r2Var.f67640x5ab01132.f452505q);
        hashMap.put("type", 2);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, r2Var.f67640x5ab01132.f452505q);
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, dp0Var.f454168e);
        hashMap.put("pkg_type", java.lang.Integer.valueOf(dp0Var.f454169f));
        hashMap.put("pkg_version", java.lang.Integer.valueOf(dp0Var.f454174n));
        hashMap.put("img_url", format);
        hashMap.put("is_dynamic", java.lang.Boolean.FALSE);
        hashMap.put("cache_key", "");
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, dp0Var.f454172i);
        hashMap.put("subType", java.lang.Integer.valueOf(dp0Var.f454178r));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavAppBrandLogic", "buildAppBrandMsgParamsForIntent image path:%s", format);
        return hashMap;
    }
}
