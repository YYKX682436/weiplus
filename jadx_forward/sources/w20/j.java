package w20;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final w20.j f523821a = new w20.j();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f523822b = jz5.h.b(w20.h.f523819d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f523823c = jz5.h.b(w20.i.f523820d);

    public final void a(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
        if (m18.a()) {
            m18.f294799a.r(m18.f294800b);
        }
    }
}
