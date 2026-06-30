package com.p314xaae8f345.mm.vfs;

/* loaded from: classes.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.j2 f294544d = new com.p314xaae8f345.mm.vfs.j2();

    public j2() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.vfs.x1 fe6 = (com.p314xaae8f345.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fe6, "fe");
        return java.lang.Integer.valueOf((fe6.f294769f ? 1073741824 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fe6.f294765b, "account.bin") ? 65536 : 4096) | (intValue & (-4097)));
    }
}
