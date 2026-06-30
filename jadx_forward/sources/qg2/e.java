package qg2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final qg2.e f444332a = new qg2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f444333b = new java.util.HashSet();

    public final java.lang.String a(java.lang.String defaultUrl, r45.ka4 ka4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultUrl, "defaultUrl");
        if (!f444333b.contains(defaultUrl) || ka4Var == null) {
            return defaultUrl;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList<r45.gv> linkedList = ka4Var.f460073m;
        if (linkedList != null) {
            for (r45.gv gvVar : linkedList) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(gvVar.f457071f);
                java.lang.String str = gvVar.f457070e;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                int i17 = gvVar.f457075m;
                java.lang.String str3 = gvVar.f457076n;
                java.lang.String str4 = gvVar.f457078p;
                if (str4 != null) {
                    str2 = str4;
                }
                hashMap.put(valueOf, new kn0.r(str, i17, str3, str2));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerUtils", "cdn_quality_h265backcfg: " + ka4Var.f460080r + " cdnUrlMap: " + hashMap);
        kn0.r rVar = (kn0.r) hashMap.get(java.lang.Integer.valueOf(ka4Var.f460080r));
        java.lang.String str5 = rVar != null ? rVar.f391129a : null;
        return str5 == null ? defaultUrl : str5;
    }

    public final void b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerUtils", "mark hasH265Error = ".concat(url));
        f444333b.add(url);
    }

    public final void c(java.lang.String source, mn0.b0 player, r45.ka4 ka4Var, r45.p72 p72Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        mn0.y yVar = (mn0.y) player;
        boolean Ni = ((b92.v1) ((zy2.z7) i95.n0.c(zy2.z7.class))).Ni(source, yVar.f411349r);
        boolean z17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerUtils", "tryReplayLive: source=" + source + ", markIPInvalid=" + Ni + ", nonNetwork=" + z17);
        if (Ni) {
            ((b92.v1) ((zy2.z7) i95.n0.c(zy2.z7.class))).Vi(source);
            if (z17) {
                return;
            }
            mn0.b0.C(player, false, false, false, 6, null);
            mn0.b0.D(player, yVar.f411349r, 1, ka4Var, p72Var, true, false, 32, null);
        }
    }
}
