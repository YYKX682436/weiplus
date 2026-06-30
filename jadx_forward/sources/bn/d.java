package bn;

/* loaded from: classes12.dex */
public class d implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27146x1ff1606f {
    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27146x1ff1606f
    /* renamed from: getSoPath */
    public java.util.Optional mo10850x2f967b97() {
        java.lang.String d17 = ym.d.d();
        if (!android.text.TextUtils.isEmpty(d17)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(d17);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                return java.util.Optional.of(d17);
            }
        }
        return java.util.Optional.empty();
    }
}
