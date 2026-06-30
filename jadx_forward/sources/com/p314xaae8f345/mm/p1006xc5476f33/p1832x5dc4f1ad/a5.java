package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes7.dex */
public final class a5 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f229370b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f229371c = false;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f229372d = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f229376h;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 f229369a = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229373e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f229374f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f229375g = new java.util.LinkedHashSet();

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f229377i = "";

    public final java.lang.String a(java.util.Set set) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String instanceName = (java.lang.String) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
            java.lang.String lowerCase = r26.n0.s0(instanceName, "-", instanceName).toLowerCase(java.util.Locale.ROOT);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        return kz5.n0.Q(arrayList).toString();
    }

    public final java.lang.String b() {
        java.lang.String str = f229372d;
        return str.length() == 0 ? f229374f : str;
    }
}
