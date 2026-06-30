package bn;

/* loaded from: classes12.dex */
public class d implements com.tencent.wechat.aff.cara.CaraAndroidSoBase {
    @Override // com.tencent.wechat.aff.cara.CaraAndroidSoBase
    public java.util.Optional getSoPath() {
        java.lang.String d17 = ym.d.d();
        if (!android.text.TextUtils.isEmpty(d17)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(d17);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                return java.util.Optional.of(d17);
            }
        }
        return java.util.Optional.empty();
    }
}
