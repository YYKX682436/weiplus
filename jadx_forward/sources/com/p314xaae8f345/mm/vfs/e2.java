package com.p314xaae8f345.mm.vfs;

/* loaded from: classes.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.e2 f294438d = new com.p314xaae8f345.mm.vfs.e2();

    public e2() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.vfs.x1 fe6 = (com.p314xaae8f345.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fe6, "fe");
        java.util.List<java.lang.String> list = com.p314xaae8f345.mm.vfs.l2.f294591q;
        if (!fe6.f294769f) {
            java.lang.String relPath = fe6.f294764a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
            boolean z17 = false;
            if (r26.i0.y(relPath, "pkg/", false)) {
                java.lang.String relPath2 = fe6.f294764a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath2, "relPath");
                if (r26.i0.n(relPath2, ".wxapkg", false)) {
                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                        for (java.lang.String str : list) {
                            java.lang.String relPath3 = fe6.f294764a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath3, "relPath");
                            java.lang.String substring = relPath3.substring(4);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                            if (r26.i0.y(substring, str, false)) {
                                break;
                            }
                        }
                    }
                    z17 = true;
                    if (!z17) {
                        intValue |= 65536;
                    }
                }
            }
        }
        return java.lang.Integer.valueOf(intValue);
    }
}
