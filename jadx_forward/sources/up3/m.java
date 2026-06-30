package up3;

/* loaded from: classes12.dex */
public class m implements up3.p {
    @Override // up3.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) ((java.util.Map) obj).get(up3.o.f511377m);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.o.f511371d, "filePath NULL");
        } else {
            try {
                com.p314xaae8f345.mm.vfs.r6 c17 = up3.b.c(tp3.b.a("µ¾³ì±¬"), ".zip");
                up3.b.b(new com.p314xaae8f345.mm.vfs.r6(str), c17, null, null);
                up3.o.a(c17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.o.f511371d, th6, "[-] faild op %s", str);
            }
        }
        return null;
    }
}
