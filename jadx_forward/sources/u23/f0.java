package u23;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u23.f0 f505607a = new u23.f0();

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.Object obj = item.f219976u.get("KEY_MEDIA_PARENT");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str.concat(b(item)));
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        java.util.HashMap hashMap;
        java.lang.Object obj = (abstractC15633xee433078 == null || (hashMap = abstractC15633xee433078.f219976u) == null) ? null : hashMap.get("KEY_MEDIA_NAME");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        return str == null ? "" : str;
    }

    public final android.net.Uri c(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        java.util.HashMap hashMap;
        java.lang.Object obj = (abstractC15633xee433078 == null || (hashMap = abstractC15633xee433078.f219976u) == null) ? null : hashMap.get("KEY_MEDIA_URI");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            return android.net.Uri.parse(str);
        }
        return null;
    }
}
