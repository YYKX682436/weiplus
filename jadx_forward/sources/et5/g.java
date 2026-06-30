package et5;

/* loaded from: classes13.dex */
public abstract class g {
    public static final java.lang.String a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        try {
            byte[] c17 = c(item);
            boolean z17 = true;
            if (c17.length == 0) {
                return "";
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(item.f298590g, "ANY")) {
                java.lang.String str = new java.lang.String(c17, r26.c.f450398a);
                if (str.length() != 0) {
                    z17 = false;
                }
                return z17 ? new java.lang.String(c17, r26.c.f450399b) : str;
            }
            java.lang.String charset = item.f298590g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charset, "charset");
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(charset);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
            return new java.lang.String(c17, forName);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WXQBarResultUtils", th6, "getRawData exception", new java.lang.Object[0]);
            return "";
        }
    }

    public static final int b(int i17, java.util.List list) {
        com.p314xaae8f345.p2891x34da02.C25312x3165f541 c25312x3165f541;
        if (list != null && (!list.isEmpty()) && i17 >= 0 && i17 < list.size() && (c25312x3165f541 = (com.p314xaae8f345.p2891x34da02.C25312x3165f541) kz5.n0.a0(list, i17)) != null) {
            return c25312x3165f541.f45430x93fa756a;
        }
        return 0;
    }

    public static final byte[] c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.i0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = item.f298596p;
        byte[] bArr = gVar != null ? gVar.f273689a : null;
        return bArr == null ? new byte[0] : bArr;
    }
}
