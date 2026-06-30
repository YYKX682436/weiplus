package dk2;

/* loaded from: classes3.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.nc f315350a = new dk2.nc();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f315351b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f315352c;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46346xb4fc09c3));
        hashSet.add(-2304);
        hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46347x98b201af));
        hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46375x82913de9));
        f315351b = hashSet;
        f315352c = new java.util.HashMap();
    }

    public final java.lang.String a(r45.ah5 ah5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ah5Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tagInfo = \n");
        java.util.LinkedList items = ah5Var.f451546d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items, "items");
        int i17 = 0;
        for (java.lang.Object obj : items) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.bh5 bh5Var = (r45.bh5) obj;
            sb6.append("[ tagItem index: " + bh5Var.f452300d + " block: " + bh5Var.f452301e + " ] \n");
            i17 = i18;
        }
        sb6.append("cacheBuffer: " + ah5Var.f451547e);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
