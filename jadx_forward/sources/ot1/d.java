package ot1;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final r26.t f430364a = new r26.t("^[0-9a-f]{3}/([0-9a-f]{32})/[0-9]+/([0-9]+)/([^/]+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f430365b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f430366c = new java.util.HashMap();

    public static final java.lang.Iterable a(java.lang.String str, java.lang.String str2, int[] iArr, yz5.q qVar) {
        java.lang.String sb6;
        java.util.HashMap hashMap = f430365b;
        java.lang.String str3 = "wcf://" + str + '/';
        if (str2 == null) {
            sb6 = str3;
        } else {
            byte[] bytes = str2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("wcf://");
            sb7.append(str);
            sb7.append('/');
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            sb7.append(r26.n0.l0(g17, new e06.k(0, 2)));
            sb7.append('/');
            sb7.append(g17);
            sb6 = sb7.toString();
        }
        ot1.j n17 = mt1.b0.f412724a.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "<get-wxFileIndexStorage>(...)");
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(sb6, true);
        if (s17 == null) {
            s17 = kz5.p0.f395529d;
        }
        return new pm5.l(s17, new ot1.a(n17, str2, hashMap, str3, qVar, iArr), null, false);
    }

    public static final java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.HashMap hashMap = f430365b;
        synchronized (hashMap) {
            java.lang.String str2 = (java.lang.String) f430366c.putIfAbsent(str, str);
            if (str2 != null) {
                return str2;
            }
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
            hashMap.put(g17, str);
            return str;
        }
    }
}
