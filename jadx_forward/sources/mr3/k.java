package mr3;

/* loaded from: classes10.dex */
public final class k {
    public k(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final mr3.l a(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null || str2 == null || !com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str4 = a17.f294812f;
        int lastIndexOf = str4.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str4 = str4.substring(lastIndexOf + 1);
        }
        java.lang.String str5 = str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getName(...)");
        return new mr3.l(str5, str, null, null, str2, 0, i17, 40, null);
    }
}
