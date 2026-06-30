package cz0;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final cz0.z f306509a = new cz0.z();

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_sdk");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    public final java.lang.String b() {
        java.lang.String string = a().getString("KEY_SDK_SHA1", "");
        return string == null ? "" : string;
    }

    public final boolean c() {
        return a().getLong("KEY_SDK_UPDATE_TIME", 0L) < a().getLong("KEY_RES_UPDATE_TIME", 0L);
    }
}
