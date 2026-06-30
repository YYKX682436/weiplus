package v24;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.v f514490a = new v24.v();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f514491b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f514492c;

    static {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("qrcode"));
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var.o() + '/' + gm0.j1.b().h());
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        f514491b = r6Var2;
        f514492c = kz5.c0.i(995, 996, 997, 800, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0.f34827x366c91de), 802, 803, 804, 805);
    }

    public final boolean a(int i17) {
        if (!j(i17)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = f514491b.G();
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : G) {
                if (r6Var.m82467xfb82e301().equals(java.lang.String.valueOf(i17)) && r6Var.C() > 0) {
                    return true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QRCodeCacheManager", "checkCache style: " + i17 + " failed");
        return false;
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeCacheManager", "clearCache() called with: style = " + i17);
        c(i17);
        com.p314xaae8f345.mm.vfs.r6[] G = f514491b.G();
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : G) {
                if (r6Var.m82467xfb82e301().equals(java.lang.String.valueOf(i17))) {
                    r6Var.l();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeCacheManager", "clearCache success: style = " + i17);
                }
            }
        }
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode_url").remove(java.lang.String.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode_url_style").remove(java.lang.String.valueOf(i17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.vfs.r6[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.tencent.mm.vfs.r6] */
    public final byte[] d(int i17) {
        java.io.IOException e17;
        com.p314xaae8f345.mm.vfs.u6 u6Var;
        java.io.InputStream inputStream = null;
        if (!j(i17)) {
            return null;
        }
        ?? G = f514491b.G();
        if (G != 0) {
            for (?? r57 : G) {
                if (r57.m82467xfb82e301().equals(java.lang.String.valueOf(i17)) && r57.h()) {
                    try {
                        if (r57.C() > 0) {
                            try {
                                u6Var = new com.p314xaae8f345.mm.vfs.u6((com.p314xaae8f345.mm.vfs.r6) r57);
                                try {
                                    byte[] c17 = vz5.a.c(u6Var);
                                    try {
                                        u6Var.close();
                                    } catch (java.io.IOException unused) {
                                    }
                                    return c17;
                                } catch (java.io.IOException e18) {
                                    e17 = e18;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QRCodeCacheManager", e17, "getCache(" + i17 + ") exception", new java.lang.Object[0]);
                                    f514490a.c(i17);
                                    if (u6Var != null) {
                                        try {
                                            u6Var.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                    }
                                    return null;
                                }
                            } catch (java.io.IOException e19) {
                                e17 = e19;
                                u6Var = null;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (java.io.IOException unused3) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        inputStream = G;
                    }
                }
            }
        }
        c(i17);
        return null;
    }

    public final java.lang.String e(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().h());
        sb6.append('_');
        sb6.append(i17);
        return sb6.toString();
    }

    public final java.lang.String f(int i17) {
        if (!j(i17) || !a(i17)) {
            b(i17);
            return "";
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode_url").getString(e(i17), "");
        java.lang.String str = string != null ? string : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeCacheManager", "getUrl(" + i17 + ") called return : " + str);
        return str;
    }

    public final java.lang.String g(int i17) {
        java.lang.String str;
        str = "";
        if (j(i17) && a(i17)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode_url_style").getString(e(i17), "");
            str = string != null ? string : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeCacheManager", "getUrlWithStyle() called return : ".concat(str));
        }
        return str;
    }

    public final void h(int i17, java.lang.String url, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveCache() called with: style = ");
        sb6.append(i17);
        sb6.append(", url = ");
        sb6.append(url);
        sb6.append(", qrData = ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeCacheManager", sb6.toString());
        if (bArr != null) {
            if ((bArr.length == 0) || !j(i17)) {
                return;
            }
            b(i17);
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode_url").putString(e(i17), url);
            if (com.p314xaae8f345.mm.vfs.w6.S(f514491b.o() + java.io.File.separator + valueOf, bArr, 0, bArr.length) != 0) {
                c(i17);
            }
        }
    }

    public final void i(int i17, java.lang.String urlWithStyle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlWithStyle, "urlWithStyle");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode_url_style").putString(e(i17), urlWithStyle);
    }

    public final boolean j(int i17) {
        return f514492c.contains(java.lang.Integer.valueOf(i17));
    }
}
