package zw;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final zw.a f558018a = new zw.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f558019b = com.p314xaae8f345.mm.vfs.q7.c("bizcache") + "/media_tmp/";

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(q75.g.d(str2));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        java.lang.String str3 = (java.lang.String) m143895xf1229813;
        if (str3 == null) {
            str3 = q75.g.c(str2);
        }
        java.lang.String a17 = q75.g.a(str3);
        if (a17 == null || a17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizFlutterSelectPhotoFileHelper", "resolveVideoExt fallback, mime=" + str3 + " path=" + str2);
            a17 = "mp4";
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("_parse_");
        byte[] bytes = (str2 + java.lang.System.currentTimeMillis()).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append('.');
        sb6.append(a17);
        return sb6.toString();
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str2);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(n07 != null ? n07.outMimeType : null);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.String str3 = (java.lang.String) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
        if (str3 == null) {
            str3 = q75.g.c(str2);
        }
        java.lang.String a17 = q75.g.a(str3);
        if (a17 == null || a17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizFlutterSelectPhotoFileHelper", "resolveImageExt fallback, mime=" + str3 + " path=" + str2);
            a17 = "jpeg";
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        byte[] bytes = (str2 + java.lang.System.currentTimeMillis()).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append('.');
        sb6.append(a17);
        return sb6.toString();
    }

    public final java.lang.String c(java.lang.String mediaUniqueKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaUniqueKey, "mediaUniqueKey");
        java.lang.String str = f558019b + mediaUniqueKey + '/';
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterSelectPhotoFileHelper", "create biz livePhoto dir:" + str + " result:" + com.p314xaae8f345.mm.vfs.w6.u(str));
        }
        return str;
    }

    public final long d(java.lang.String fromPath, java.lang.String toPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromPath, "fromPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toPath, "toPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterSelectPhotoFileHelper", "copyFile >> fromPath: " + fromPath + " toPath: " + toPath);
        if (!r26.n0.B(fromPath, f558019b, false)) {
            return com.p314xaae8f345.mm.vfs.w6.d(fromPath, toPath, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizFlutterSelectPhotoFileHelper", "is already copy");
        return -1L;
    }
}
