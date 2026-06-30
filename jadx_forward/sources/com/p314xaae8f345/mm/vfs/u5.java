package com.p314xaae8f345.mm.vfs;

/* loaded from: classes4.dex */
public final class u5 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f294742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f294743e;

    public u5(java.util.List paths) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        this.f294742d = new java.util.ArrayList();
        this.f294743e = new java.util.ArrayList();
        java.util.Iterator it = paths.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "normalizePath(...)");
            int f17 = kz5.c0.f(this.f294742d, l17, 0, 0, 6, null);
            if (f17 < 0) {
                int i17 = (-f17) - 1;
                if (i17 != 0) {
                    java.lang.Object obj = this.f294742d.get(i17 - 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    if (!r26.i0.y((java.lang.String) obj, l17, false)) {
                    }
                }
                this.f294742d.add(i17, l17);
                this.f294743e.add(i17, java.lang.Boolean.valueOf(r26.n0.E(str, '/', false, 2, null)));
            }
        }
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.vfs.x1 fe6 = (com.p314xaae8f345.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fe6, "fe");
        java.util.ArrayList arrayList = this.f294742d;
        int f17 = kz5.c0.f(arrayList, fe6.f294764a, 0, 0, 6, null);
        if (f17 >= 0) {
            return java.lang.Integer.valueOf(intValue | 65536);
        }
        int i17 = (-f17) - 2;
        if (i17 < 0 || !((java.lang.Boolean) this.f294743e.get(i17)).booleanValue()) {
            return java.lang.Integer.valueOf(intValue);
        }
        java.lang.Object obj3 = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
        java.lang.String str = (java.lang.String) obj3;
        java.lang.String relPath = fe6.f294764a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
        if (r26.i0.y(relPath, str, false) && relPath.charAt(str.length()) == '/') {
            intValue |= 65536;
        }
        return java.lang.Integer.valueOf(intValue);
    }
}
