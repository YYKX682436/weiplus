package jt4;

/* loaded from: classes9.dex */
public abstract class f {
    public static java.lang.String a(android.content.Context context, java.lang.String... strArr) {
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
        if (strArr == null || strArr.length <= 0) {
            return string;
        }
        for (java.lang.String str : strArr) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return str;
            }
        }
        return string;
    }

    public static boolean b(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, java.lang.String str, int i18, java.lang.String str2) {
        if (i18 == 0) {
            str2 = str;
        } else {
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "finalRetCode: %s, finalRetMsg: %s", java.lang.Integer.valueOf(i17), str2);
        if (i17 != 269293577) {
            return np5.t.a(abstractActivityC22902xe37969e, m1Var, 1000, i17, str2);
        }
        db5.e1.G(abstractActivityC22902xe37969e, str, "", false, new jt4.d());
        return true;
    }

    public static boolean c(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, r45.ka5 ka5Var) {
        if (ka5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "no popItem");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ka5Var.f460094d)) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ka5Var.f460096f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ka5Var.f460095e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "show guide info 1");
            db5.e1.C(abstractActivityC22902xe37969e, ka5Var.f460094d, "", ka5Var.f460096f, ka5Var.f460095e, false, new jt4.a(ka5Var, abstractActivityC22902xe37969e, null), new jt4.b(ka5Var, abstractActivityC22902xe37969e));
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ka5Var.f460095e)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "show guide info 2");
            db5.e1.E(abstractActivityC22902xe37969e, ka5Var.f460094d, "", ka5Var.f460095e, false, new jt4.c(ka5Var, abstractActivityC22902xe37969e));
        }
        return true;
    }

    public static void d(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, com.p314xaae8f345.mm.p2802xd031a825.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ECardUtil", "start open ecard process, scene: %s, token==null%s, eCardType: %s, extraData: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)), str2, str3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_open_scene", i17);
        bundle.putString("key_open_token", str);
        bundle.putString("key_ecard_type", str2);
        bundle.putString("key_open_extra_data", str3);
        com.p314xaae8f345.mm.p2802xd031a825.a.j((android.app.Activity) context, kt4.r.class, bundle, gVar);
    }
}
