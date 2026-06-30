package ls1;

/* loaded from: classes7.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final com.p314xaae8f345.p3210x3857dc.y0 a(ls1.c cVar, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        java.io.InputStream inputStream;
        com.p314xaae8f345.p3210x3857dc.y0 y0Var;
        cVar.getClass();
        java.lang.String str2 = null;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewController", "tmpl file not found:" + str);
            return null;
        }
        java.lang.String c17 = q75.g.c(str);
        if (r26.i0.n(str, ".js", false) && nw4.v2.c(c27816xac2547f9)) {
            com.p314xaae8f345.p3210x3857dc.y2 y2Var = new com.p314xaae8f345.p3210x3857dc.y2(3, 256, c27816xac2547f9);
            y2Var.f302166c = str;
            y2Var.f302165b = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
            str2 = y2Var.m120528x9616526c();
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            y0Var = new com.p314xaae8f345.p3210x3857dc.y0(c17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, new java.io.ByteArrayInputStream(bytes));
        } else {
            try {
                inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
            } catch (java.io.FileNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewController", e17, "", new java.lang.Object[0]);
                inputStream = null;
            }
            if (inputStream == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewController", "stream is null, err");
                return null;
            }
            y0Var = new com.p314xaae8f345.p3210x3857dc.y0(c17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, inputStream);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String hexString = java.lang.Integer.toHexString(str.hashCode() & (-1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hexString, "toHexString(...)");
        java.lang.String lowerCase = hexString.toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        hashMap.put("Cache-Control", "max-age=31536000");
        hashMap.put("ETag", lowerCase);
        if (str2 != null) {
            hashMap.put("RunLocalJS", str2);
        }
        y0Var.f302158e = hashMap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewController", "readFileWebResp:%s\nETag:%s", str, lowerCase);
        return y0Var;
    }
}
