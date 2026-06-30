package com.p314xaae8f345.mm.vfs;

/* loaded from: classes.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.g2 f294481d = new com.p314xaae8f345.mm.vfs.g2();

    public g2() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.vfs.x1 fe6 = (com.p314xaae8f345.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fe6, "fe");
        java.util.List list = com.p314xaae8f345.mm.vfs.l2.f294589o;
        boolean z17 = false;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                java.lang.String relPath = fe6.f294764a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append('/');
                if (r26.i0.y(relPath, sb6.toString(), false) || (fe6.f294769f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fe6.f294764a, str))) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            intValue = 65536 | (intValue & (-4097));
        }
        return java.lang.Integer.valueOf(intValue);
    }
}
