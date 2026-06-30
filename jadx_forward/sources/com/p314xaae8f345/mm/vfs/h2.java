package com.p314xaae8f345.mm.vfs;

/* loaded from: classes.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.h2 f294504d = new com.p314xaae8f345.mm.vfs.h2();

    public h2() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.p314xaae8f345.mm.vfs.x1 fe6 = (com.p314xaae8f345.mm.vfs.x1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fe6, "fe");
        java.lang.String[] strArr = {"#mmkv_ringtone_manager", "#mmkv_ringtone_params", "mmkv_ringtone_info", "mmkv_exclusive_manager"};
        int i17 = 0;
        while (true) {
            if (i17 >= 4) {
                z17 = false;
                break;
            }
            java.lang.String str = strArr[i17];
            java.lang.String name = fe6.f294765b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
            if (r26.n0.B(name, str, false)) {
                z17 = true;
                break;
            }
            i17++;
        }
        return java.lang.Integer.valueOf(z17 ? 0 : intValue | 65536);
    }
}
