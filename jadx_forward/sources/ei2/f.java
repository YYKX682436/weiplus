package ei2;

/* loaded from: classes3.dex */
public abstract class f {
    public static final java.lang.String a(long j17) {
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean x27 = r4Var.x2(j17);
        boolean y27 = r4Var.y2(j17);
        boolean w27 = r4Var.w2(j17);
        boolean z27 = r4Var.z2(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMicConditionUtil", "getConditionText followEnable:" + x27 + " rewardEnable:" + y27 + " buyProductEnable:" + w27 + " superFansEnable: " + z27);
        if (x27) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dur);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (y27) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        if (w27) {
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dup);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
            return string3;
        }
        if (z27) {
            java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lz6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
            return string4;
        }
        java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string5);
        return string5;
    }
}
