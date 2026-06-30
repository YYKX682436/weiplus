package zw;

/* loaded from: classes7.dex */
public final class q {
    public q(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String srcPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(srcPath).m43592x7a249f0b();
        if (m43592x7a249f0b == 0) {
            return srcPath;
        }
        int i17 = m43592x7a249f0b % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(srcPath, options);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Biz.BizImageUtil", "rotate image, get null bmp");
                return srcPath;
            }
            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(d17, i17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.K());
            sb6.append("microMsg.tmp.");
            sb6.append(java.lang.System.currentTimeMillis());
            zw.q qVar = zw.r.f558072a;
            sb6.append(qVar.d(options) ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG : ".png");
            java.lang.String sb7 = sb6.toString();
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(w07, 100, qVar.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                if (qVar.d(options)) {
                    b(srcPath, sb7);
                }
                return sb7;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Biz.BizImageUtil", "rotate image, exception occurred when saving | %s", e17);
                com.p314xaae8f345.mm.vfs.w6.h(sb7);
                return srcPath;
            }
        } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
            return srcPath;
        }
    }

    public final void b(java.lang.String srcPath, java.lang.String dstPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstPath, "dstPath");
        if (c(srcPath) && c(dstPath)) {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(dstPath);
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e92 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(srcPath);
            for (java.lang.String str : zw.p.f558071a) {
                java.lang.String m7340x351be6 = c1098xe10e35e92.m7340x351be6(str);
                if (m7340x351be6 != null) {
                    c1098xe10e35e9.m7364x5c88dc5a(str, m7340x351be6);
                }
            }
            c1098xe10e35e9.m7362xaf634eb4();
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3234x23ca6c5d, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3307x43046baa, null);
            c1098xe10e35e9.m7362xaf634eb4();
        }
    }

    public final boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
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

    public final boolean d(android.graphics.BitmapFactory.Options options) {
        java.lang.String str;
        if (options == null || (str = options.outMimeType) == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        return r26.n0.L(lowerCase, "jpg", 0, false, 6, null) >= 0 || r26.n0.L(lowerCase, "jpeg", 0, false, 6, null) >= 0;
    }

    public final boolean e(java.lang.String imageFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageFile, "imageFile");
        return com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(imageFile).m43592x7a249f0b() != 0;
    }
}
