package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.f2 f294456d = new com.p314xaae8f345.mm.vfs.f2();

    public f2() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.vfs.x1 fe6 = (com.p314xaae8f345.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fe6, "fe");
        java.lang.String str = com.p314xaae8f345.mm.vfs.l2.f294593s;
        if (str == null) {
            str = com.p314xaae8f345.mm.vfs.b2.i(java.lang.System.currentTimeMillis());
        }
        int i17 = ((-65537) & intValue) | 4096;
        int i18 = (intValue & (-4097)) | 65536;
        if (!fe6.f294769f) {
            java.lang.String relPath = fe6.f294764a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
            if (!r26.n0.C(relPath, '/', false, 2, null)) {
                r26.t tVar = com.p314xaae8f345.mm.vfs.l2.f294583i;
                java.lang.String name = fe6.f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                r26.m d17 = tVar.d(name);
                if (d17 == null) {
                    return java.lang.Integer.valueOf(i18);
                }
                if (((java.lang.String) ((r26.q) d17).a().get(1)).compareTo(str) >= 0) {
                    i17 = i18;
                }
                return java.lang.Integer.valueOf(i17);
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
