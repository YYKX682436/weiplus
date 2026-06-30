package r35;

/* loaded from: classes15.dex */
public class n0 implements p11.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f450743a;

    public n0(int i17) {
        this.f450743a = i17;
    }

    @Override // p11.c
    public q11.b b(java.lang.String str) {
        boolean z17;
        int i17 = this.f450743a;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            q11.b a17 = r35.z.f450862a.a(str, false, new r35.c0(i17));
            if (a17 != null) {
                java.lang.String str2 = a17.f441068e;
                byte[] bArr = a17.f441066c;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                r35.y yVar = r35.y.f450859a;
                if (qk.c.f() && yVar.d(str2) && qk.c.g(str)) {
                    if (bArr == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingBizImgDownloader", "response.data is null");
                        if (yVar.a(i17)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 10L, 1L);
                        }
                        return c(str);
                    }
                    int i18 = a17.f441069f;
                    if (i18 > 0 && i18 != bArr.length) {
                        if (yVar.a(i17)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 10L, 1L);
                        }
                        return c(str);
                    }
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    com.p314xaae8f345.mm.p786x600aa8b.e.b(bArr, 0, bArr.length, options);
                    if (options.outHeight >= 1 && options.outWidth >= 1) {
                        if (yVar.a(i17)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 9L, 1L);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingBizImgDownloader", "decode wxpic fail");
                    if (yVar.a(i17)) {
                        r35.x.f450853a.b(str2, false);
                    }
                    if (yVar.d(str2)) {
                        if (!(str.length() == 0) && (i17 == 1 || i17 == 2 || i17 == 3)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17492, str, 2, 1, java.lang.Integer.valueOf(i17));
                        }
                    }
                    return c(str);
                }
                if (m11.n1.g()) {
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                        if ((z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "image/webp")) && qk.c.h(str)) {
                            r9 = true;
                        }
                    }
                    z17 = true;
                    if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "image/webp")) {
                        r9 = true;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(86L, 4L, currentTimeMillis2, false);
                if (r9) {
                    g0Var.mo68477x336bdfd8(86L, 17L, currentTimeMillis2, false);
                }
            }
            return a17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingBizImgDownloader", "get image data failed.:%s", e17.toString());
            return new q11.b((byte[]) null, 2, (java.lang.String) null);
        }
    }

    public final q11.b c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBizImgDownloader", "tryToGetNormalImage after get WxPic failed");
        try {
            java.lang.System.currentTimeMillis();
            q11.b a17 = r35.z.f450862a.a(str, true, new r35.c0(this.f450743a));
            if (a17 == null) {
                return a17;
            }
            java.lang.System.currentTimeMillis();
            return a17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingBizImgDownloader", "get image data failed.:%s", e17.toString());
            return new q11.b((byte[]) null, 2, (java.lang.String) null);
        }
    }
}
