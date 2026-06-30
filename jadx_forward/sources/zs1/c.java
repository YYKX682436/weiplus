package zs1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final zs1.c f556766a = new zs1.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f556767b = jz5.h.b(zs1.b.f556765d);

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f556768c;

    public static final boolean a() {
        if (f556768c == null) {
            boolean z17 = true;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_prefetcher_enable_download_pkg_by_http, 1);
            if (Ni != 1) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            f556768c = java.lang.Boolean.valueOf(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherPkgManager", "initWebPrefetcherPkgConfig enableDownloadPkgByHttp config: " + Ni + ", enable: " + f556768c);
        }
        java.lang.Boolean bool = f556768c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        return bool.booleanValue();
    }

    public static final r45.q97 b(java.lang.String appId, java.lang.String pkgVersion) {
        byte[] j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgVersion, "pkgVersion");
        java.lang.Object obj = null;
        if (!(appId.length() > 0)) {
            return null;
        }
        zs1.c cVar = f556766a;
        java.lang.String c17 = cVar.c(appId, pkgVersion);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17 = cVar.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-pkgVersionManager>(...)");
        if (d17.f(c17) && (j17 = d17.j(c17)) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.q97.class.newInstance();
                    ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                    obj = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
            }
        }
        return (r45.q97) obj;
    }

    public static final void e(r45.q97 q97Var) {
        if (q97Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherPkgManager", "saveCurrentPkgInfo appId: " + q97Var.f465318d + ", pkgVersion: " + q97Var.f465320f);
        ku4.z zVar = ku4.z.f394072a;
        java.lang.String appId = q97Var.f465318d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        r45.mt mtVar = new r45.mt();
        java.lang.String str = q97Var.f465318d;
        if (str == null) {
            str = "";
        }
        mtVar.f462349d = str;
        java.lang.String str2 = q97Var.f465319e;
        if (str2 == null) {
            str2 = "";
        }
        mtVar.f462350e = str2;
        java.lang.String str3 = q97Var.f465320f;
        mtVar.f462354i = str3 != null ? str3 : "";
        zVar.n(appId, mtVar);
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (str2.length() == 0) {
            return str;
        }
        return str + '_' + str2.hashCode();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f556767b).mo141623x754a37bb();
    }
}
