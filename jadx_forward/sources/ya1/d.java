package ya1;

/* loaded from: classes7.dex */
public abstract class d {
    public static void a(java.io.InputStream inputStream, java.lang.String str) {
        if (inputStream == null || !c(str)) {
            return;
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(str);
        ya1.c.a(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(inputStream), c1098xe10e35e9);
        c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, null);
        c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, null);
        c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3307x43046baa, null);
        c1098xe10e35e9.m7362xaf634eb4();
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        if (c(str) && c(str2)) {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(str2);
            ya1.c.a(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(str), c1098xe10e35e9);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3307x43046baa, null);
            c1098xe10e35e9.m7362xaf634eb4();
        }
    }

    public static boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return !m17.a() ? false : m17.f294799a.F(m17.f294800b);
    }
}
