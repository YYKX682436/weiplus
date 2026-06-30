package com.p314xaae8f345.mm.vfs;

/* loaded from: classes.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.c2 f294400d = new com.p314xaae8f345.mm.vfs.c2();

    public c2() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.vfs.x1 fe6 = (com.p314xaae8f345.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fe6, "fe");
        java.lang.String name = fe6.f294765b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
        java.util.List f07 = r26.n0.f0(name, new java.lang.String[]{".db"}, false, 2, 2, null);
        int size = f07.size();
        boolean z17 = fe6.f294769f;
        if (size == 2 && !z17) {
            java.lang.Integer num = (java.lang.Integer) com.p314xaae8f345.mm.vfs.l2.f294579e.get(f07.get(0));
            if (num != null) {
                intValue = (intValue & (-4096)) | num.intValue();
            }
            if (com.p314xaae8f345.mm.vfs.l2.f294580f.contains(f07.get(0))) {
                return java.lang.Integer.valueOf(((-65537) & intValue) | 4096);
            }
        }
        return java.lang.Integer.valueOf((z17 ? 1073741824 : 65536) | (intValue & (-4097)));
    }
}
