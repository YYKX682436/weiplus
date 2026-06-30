package dl4;

@j95.b
/* loaded from: classes3.dex */
public final class m0 extends i95.w implements ff0.t {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f316968d = jz5.h.b(dl4.t.f317005d);

    public byte[] Ai(byte[] bArr) {
        android.graphics.Point point;
        byte[] bArr2;
        if (bArr == null) {
            return null;
        }
        dl4.e1 e1Var = dl4.e1.f316922a;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.p314xaae8f345.mm.p786x600aa8b.e.b(bArr, 0, bArr.length, options);
            point = new android.graphics.Point(options.outWidth, options.outHeight);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingImageUtils", "compressImage imageOriginSize: " + point + ", targetSize: 512, data length: " + bArr.length + ", maxDataLength: 65536");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingImageUtils", th6, "compressImage exception", new java.lang.Object[0]);
        }
        if (point.x < 512 && bArr.length < 65536) {
            return bArr;
        }
        android.graphics.Bitmap a17 = e1Var.a(bArr, point, 512);
        if (a17 != null && !a17.isRecycled()) {
            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(a17, 0);
            java.lang.Math.max(w07.getWidth(), w07.getHeight());
            int[] iArr = dl4.e1.f316923b;
            for (int i17 = 0; i17 < 5; i17++) {
                int i18 = iArr[i17];
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    w07.compress(android.graphics.Bitmap.CompressFormat.JPEG, i18, byteArrayOutputStream);
                    bArr2 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingImageUtils", e17, "compressImageByQuality exception", new java.lang.Object[0]);
                    bArr2 = null;
                }
                if (bArr2 != null && bArr2.length <= 65536) {
                    return bArr2;
                }
            }
            w07.recycle();
        }
        return null;
    }

    public void Bi(java.lang.String str, ff0.u uVar) {
        if (str == null || str.length() == 0) {
            if (uVar != null) {
                uVar.a(false, null);
                return;
            }
            return;
        }
        java.lang.String Ri = Ri(str);
        if (com.p314xaae8f345.mm.vfs.w6.j(Ri)) {
            if (uVar != null) {
                uVar.a(true, Ri);
            }
        } else {
            java.lang.String Ni = Ni(str);
            java.lang.String Di = Di(str);
            o11.f wi6 = wi(Ni, Di);
            wi6.A = (dl4.m) ((jz5.n) dl4.d1.f316919d).mo141623x754a37bb();
            ((ku5.t0) ku5.t0.f394148d).h(new dl4.s0(wi6.a(), new dl4.n(this, uVar, Ri), str, Di), "MicroMsg.TingImageLoader_download");
        }
    }

    public java.lang.String Di(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        byte[] bytes = url.concat("_ting_image").getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
        return g17;
    }

    public java.lang.String Ni(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (!r26.i0.y(url, "http", false)) {
            return url;
        }
        java.lang.String a17 = cl4.j.f124483a.a(url);
        return a17 == null ? "" : a17;
    }

    public java.lang.String Ri(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String a17 = cl4.j.f124483a.a(url.concat("_thumb"));
        return a17 == null ? "" : a17;
    }

    public int Ui() {
        return !com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30861xcebc809e.co7 : com.p314xaae8f345.mm.R.C30861xcebc809e.co6;
    }

    public int Vi() {
        return !com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81196x18aa6dd2 : com.p314xaae8f345.mm.R.raw.f81195x2d7cdce0;
    }

    public void Zi(java.lang.String url, android.widget.ImageView imageView, int i17, int i18, int i19, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, ff0.v vVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (i17 != 0) {
            pm0.v.X(new dl4.r(imageView, i17));
        }
        java.lang.String Ni = Ni(url);
        java.lang.String format = java.lang.String.format(Di(url) + ',' + i18 + ',' + i19, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingImageFeatureService", "loadTingImage url: %s, size: %s, %s, customKey: %s, savePath: %s, exist: %s, view: %s", url, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), format, Ni, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(Ni)), imageView);
        o11.f wi6 = wi(Ni, format);
        wi6.f423619j = i18;
        wi6.f423620k = i19;
        wi6.f423626q = i17;
        o11.g a17 = wi6.a();
        if (imageView != null) {
            imageView.setTag(com.p314xaae8f345.mm.R.id.o9g, format);
        }
        dl4.s sVar = new dl4.s(format, imageView, this, vVar);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(Ni);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (j17) {
            pm0.v.X(new dl4.v0(currentTimeMillis, url, format, a17, w1Var, sVar));
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new dl4.z0(currentTimeMillis, url, format, a17, w1Var, sVar), "MicroMsg.TingImageLoader_download");
        }
    }

    public void aj(java.lang.String url, android.widget.ImageView imageView, int i17, ff0.v vVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        Zi(url, imageView, i17, 512, 512, null, vVar);
    }

    public void bj(java.lang.String url, android.widget.ImageView imageView, ff0.v vVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        aj(url, imageView, Vi(), vVar);
    }

    public void cj(java.lang.String imageKey, android.graphics.Bitmap bitmap, ff0.x xVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        java.lang.String a17 = dl4.k.a(imageKey);
        ff0.z zVar = (ff0.z) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) dl4.m1.f316970b).get(a17);
        if (zVar != null) {
            pm0.v.X(new dl4.u(xVar, zVar));
        } else if (bitmap == null) {
            pm0.v.X(new dl4.v(xVar));
        } else {
            dl4.m1.a(a17, bitmap, null, new dl4.w(a17, xVar));
        }
    }

    public void fj(java.lang.String imageKey, android.view.View view, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, ff0.x xVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        java.lang.String a17 = dl4.k.a(imageKey);
        ff0.z zVar = (ff0.z) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) dl4.m1.f316970b).get(a17);
        if (zVar != null) {
            pm0.v.X(new dl4.k0(zVar, view, this));
            pm0.v.X(new dl4.d0(xVar, zVar));
        } else {
            if (bitmap == null) {
                pm0.v.X(new dl4.e0(xVar));
                return;
            }
            if (view != null) {
                view.setTag(com.p314xaae8f345.mm.R.id.o9n, a17);
            }
            dl4.m1.a(a17, bitmap, w1Var, new dl4.f0(view, a17, this, xVar));
        }
    }

    public void hj(java.lang.String imageKey, android.view.View view, android.graphics.Bitmap bitmap, ff0.x xVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        fj(imageKey, view, bitmap, null, xVar);
    }

    public void ij(java.lang.String imageKey, android.view.View view, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        if (((java.lang.Boolean) ((jz5.n) this.f316968d).mo141623x754a37bb()).booleanValue()) {
            fj(imageKey, view, bitmap, w1Var, new dl4.h0(lVar, view));
            return;
        }
        dl4.i0 i0Var = new dl4.i0(lVar);
        java.lang.String a17 = dl4.k.a(imageKey);
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((jt0.i) dl4.k.f316957a).get(a17);
        if (bitmap != null) {
            bitmap.getWidth();
        }
        if (bitmap != null) {
            bitmap.getHeight();
        }
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            pm0.v.X(new dl4.j0(bitmap2, view));
            pm0.v.X(new dl4.y(i0Var, bitmap2));
        } else {
            if (bitmap == null) {
                pm0.v.X(new dl4.z(i0Var));
                return;
            }
            if (view != null) {
                view.setTag(com.p314xaae8f345.mm.R.id.f568843o93, a17);
            }
            ((ku5.t0) ku5.t0.f394148d).g(new dl4.c0(bitmap, a17, w1Var, view, this, i0Var));
        }
    }

    public final o11.f wi(java.lang.String str, java.lang.String str2) {
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423610a = true;
        fVar.f423615f = str;
        fVar.D = str2;
        fVar.f423635z = new java.lang.Object[]{new java.lang.Object()};
        dl4.d1 d1Var = dl4.d1.f316916a;
        fVar.A = (dl4.m) ((jz5.n) dl4.d1.f316920e).mo141623x754a37bb();
        return fVar;
    }
}
