package yb0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yb0.a f542145a = new yb0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f542146b = new java.util.LinkedHashMap();

    public final void a(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdApkAttributionInfoManager", "apply traceid , downloadUrl=" + str + "  traceId=" + str2);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) d(str))).k(str2);
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{"|"}, false, 0, 6, null);
        if (f07.size() > 1) {
            java.lang.String str3 = (java.lang.String) f07.get(1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdApkAttributionInfoManager", "apply traceid by biz , downloadUrl=" + str + "  traceId=" + str3);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) d(str))).k(str3);
        }
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.String str2;
        if (str == null) {
            return null;
        }
        java.util.Map map = f542146b;
        synchronized (map) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) ((java.util.LinkedHashMap) map).get(str);
            str2 = j2Var != null ? (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb() : null;
        }
        return str2;
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j d(java.lang.String k17) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k17, "k");
        java.util.Map map = f542146b;
        synchronized (map) {
            j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) ((java.util.LinkedHashMap) map).get(k17);
            if (j2Var == null) {
                j2Var = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
                map.put(k17, j2Var);
            }
        }
        return j2Var;
    }
}
