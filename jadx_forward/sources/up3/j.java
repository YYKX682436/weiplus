package up3;

/* loaded from: classes12.dex */
public class j implements up3.p {
    @Override // up3.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) ((java.util.Map) obj).get(up3.o.f511375h);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.o.f511371d, "[-] Explained by src 5.");
        } else {
            try {
                com.p314xaae8f345.mm.vfs.r6 c17 = up3.b.c(tp3.b.a("§§´¥ì±¬"), ".zip");
                up3.b.b(up3.b.f(), c17, new up3.i(this, java.util.regex.Pattern.compile(str)), null);
                up3.o.a(c17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.o.f511371d, th6, "[-] Explained by src 6: %s", str);
            }
        }
        return null;
    }
}
