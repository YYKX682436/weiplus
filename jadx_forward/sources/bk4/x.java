package bk4;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f103138a;

    /* renamed from: b, reason: collision with root package name */
    public final long f103139b;

    /* renamed from: c, reason: collision with root package name */
    public final long f103140c;

    public x(java.lang.String prefix, java.util.Map xmlMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlMap, "xmlMap");
        java.lang.String str = (java.lang.String) xmlMap.get(prefix.concat(".$styleId"));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f103138a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str == null ? "" : str, 0);
        this.f103139b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) xmlMap.get(prefix.concat(".beginTime")));
        this.f103140c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) xmlMap.get(prefix.concat(".endTime")));
    }
}
