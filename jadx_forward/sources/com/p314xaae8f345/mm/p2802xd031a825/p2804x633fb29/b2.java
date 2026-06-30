package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class b2 {
    public static java.lang.String a(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        switch (i17) {
            case 1:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.kr7);
            case 2:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.krb);
            case 3:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.krc);
            case 4:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.krd);
            case 5:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.kre);
            case 6:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.krf);
            case 7:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.krg);
            case 8:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.krh);
            case 9:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.kri);
            case 10:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.kr8);
            case 11:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.kr9);
            case 12:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.kr_);
            case 13:
                return i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.kra);
            default:
                return "";
        }
    }

    public static boolean b(android.content.Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra("key_pay_reslut_type", 0)) != 1000) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intExtra);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayUtil", "onActivityResult isCanFinish %s %s", valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        return true;
    }

    public static boolean c(android.content.Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra("key_pay_reslut_type", 0)) != 1001) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intExtra);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayUtil", "onActivityResult isCanIgnore %s %s", valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        return true;
    }
}
