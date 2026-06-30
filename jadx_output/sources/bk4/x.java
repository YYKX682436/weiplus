package bk4;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f21605a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21606b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21607c;

    public x(java.lang.String prefix, java.util.Map xmlMap) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(xmlMap, "xmlMap");
        java.lang.String str = (java.lang.String) xmlMap.get(prefix.concat(".$styleId"));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f21605a = com.tencent.mm.sdk.platformtools.t8.D1(str == null ? "" : str, 0);
        this.f21606b = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) xmlMap.get(prefix.concat(".beginTime")));
        this.f21607c = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) xmlMap.get(prefix.concat(".endTime")));
    }
}
