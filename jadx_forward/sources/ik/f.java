package ik;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ik.f f373354a = new ik.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f373355b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f373356c;

    static {
        rz5.a aVar = ik.b.f373350a;
        int d17 = kz5.b1.d(kz5.d0.q(aVar, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : aVar) {
            linkedHashMap.put(((wj.t0) obj).f528051d, obj);
        }
        f373355b = linkedHashMap;
        jz5.h.b(ik.e.f373353d);
        f373356c = jz5.h.b(ik.c.f373351d);
    }

    public final boolean a(java.lang.String str, long j17) {
        android.content.pm.PackageInfo a17;
        int i17 = (str == null || (a17 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str)) == null) ? 0 : a17.versionCode;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonUtils", "checkPkgVersionOk, pkg: " + str + ", pkgVersion: " + i17 + ", minVersion: " + j17);
        return ((long) i17) >= j17;
    }

    public final long b() {
        return ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), ik.a.class)).f149938d;
    }

    public final wj.t0 c(java.lang.String adPosId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adPosId, "adPosId");
        wj.t0 t0Var = (wj.t0) ((java.util.LinkedHashMap) f373355b).get(adPosId);
        return t0Var == null ? wj.t0.f528041q : t0Var;
    }

    public final java.lang.String d(java.lang.String posId, java.lang.String serverAid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serverAid, "serverAid");
        if (serverAid.length() == 0) {
            return "";
        }
        return posId + '-' + serverAid;
    }

    public final java.lang.String e(wj.t0 posId, java.lang.String serverAid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serverAid, "serverAid");
        return d(posId.f528051d, serverAid);
    }
}
