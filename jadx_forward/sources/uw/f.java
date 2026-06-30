package uw;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final uw.f f513023a = new uw.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f513024b = new java.util.HashMap();

    public final java.util.Map a(uw.e type, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        java.util.Map d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(type);
        sb6.append('_');
        sb6.append(msgInfo.m124847x74d37ac6());
        sb6.append('_');
        sb6.append(msgInfo.I0());
        java.lang.String sb7 = sb6.toString();
        java.util.HashMap hashMap = f513024b;
        if (hashMap.get(sb7) != null) {
            return (java.util.Map) hashMap.get(sb7);
        }
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(msgInfo.j(), "msg", null);
        } else if (ordinal == 1) {
            d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(msgInfo.G, "msgsource", null);
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(msgInfo.j(), "avatar_url", null);
        }
        hashMap.put(sb7, d17);
        return d17;
    }
}
