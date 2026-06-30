package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class f5 {
    public static int[] a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        xi1.g mo48803xee5260a9 = d0Var.t3() != null ? d0Var.t3().mo48803xee5260a9() : null;
        android.util.DisplayMetrics mo48807xad90d981 = mo48803xee5260a9 != null ? mo48803xee5260a9.mo48807xad90d981() : d0Var.mo50352x76847179().getResources().getDisplayMetrics();
        return new int[]{mo48807xad90d981.widthPixels, mo48807xad90d981.heightPixels};
    }

    public static int[] b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        int[] a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
        android.widget.FrameLayout mo51313xaf0c0532 = a18 == null ? null : a18.mo51313xaf0c0532();
        if (mo51313xaf0c0532 == null || !mo51313xaf0c0532.isLaidOut()) {
            xi1.g mo50261xee5260a9 = yVar.mo50261xee5260a9();
            if (mo50261xee5260a9 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: windowAndroid %s", mo50261xee5260a9.getClass().getCanonicalName());
                android.util.DisplayMetrics mo48807xad90d981 = mo50261xee5260a9.mo48807xad90d981();
                int i17 = mo48807xad90d981.widthPixels;
                if (i17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.UIUtil", "getWindowWidthHeight try Method(windowAndroid) but width<=0, use Method(Screen) instead");
                    a17 = a(yVar);
                } else {
                    a17 = new int[]{i17, mo48807xad90d981.heightPixels};
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: Screen");
                a17 = a(yVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: normal");
            a17 = new int[]{mo51313xaf0c0532.getWidth(), mo51313xaf0c0532.getHeight()};
        }
        int i18 = a17[0];
        int i19 = a17[1];
        return a17;
    }

    public static boolean c(android.view.View view) {
        android.app.Activity a17;
        return (view == null || (a17 = q75.a.a(view.getContext())) == null || !a17.isInMultiWindowMode()) ? false : true;
    }
}
