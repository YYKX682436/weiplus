package v61;

/* loaded from: classes.dex */
public final class g0 {
    public g0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a() {
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LoginUtil", "getLanguageIndex: language:" + f17 + ' ');
        if (f17.equals("zh_CN")) {
            f17 = "zh_TW";
        }
        java.util.List list = v61.h0.f514975b;
        return list.contains(f17) ? list.indexOf(f17) : list.indexOf("en");
    }
}
