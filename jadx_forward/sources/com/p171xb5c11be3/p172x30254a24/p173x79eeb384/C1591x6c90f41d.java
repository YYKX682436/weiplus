package com.p171xb5c11be3.p172x30254a24.p173x79eeb384;

/* renamed from: com.github.henryye.nativeiv.BaseImageDecodeService */
/* loaded from: classes7.dex */
public class C1591x6c90f41d implements com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375 {
    private static final java.lang.String TAG = "BaseImageDecodeService";

    /* renamed from: mFallbackImageStreamFetcher */
    private h8.c f5270xa038e47b;

    /* renamed from: mHttpImageStreamFetcher */
    private final h8.a f5271x465c9721;

    /* renamed from: mImageStreamFetcherList */
    private java.util.LinkedList<h8.c> f5272x285e5337;

    /* renamed from: mIsTrackInitImages */
    private boolean f5273x218cabdc = false;

    /* renamed from: mDecodeSlave */
    private e8.b f5269xf082b5dc = null;

    /* renamed from: mDecodeEventListeners */
    private final java.util.List<e8.d> f5268x4b8fee60 = new java.util.LinkedList();

    /* renamed from: mCompactDecodeEventListener */
    private final e8.d f5267x36e6cc4a = new d8.b(this, null);

    public C1591x6c90f41d() {
        h8.a aVar = new h8.a();
        this.f5271x465c9721 = aVar;
        this.f5272x285e5337 = new java.util.LinkedList<>();
        mo17100xcc2da62d(aVar, false);
        mo17116xdebdab98(new d8.e());
    }

    /* renamed from: ensureCompressFormat */
    private android.graphics.Bitmap.CompressFormat m17096xf95a61d7(java.lang.String str) {
        if ("image/webp".equals(str)) {
            return android.graphics.Bitmap.CompressFormat.WEBP;
        }
        if (!"image/jpeg".equals(str) && !"image/jpg".equals(str)) {
            return android.graphics.Bitmap.CompressFormat.PNG;
        }
        return android.graphics.Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: ensureQuality */
    private int m17097x7cad1ae1(float f17) {
        if (f17 < 0.0f || f17 > 1.0f) {
            f17 = 0.92f;
        }
        return (int) (f17 * 100.0f);
    }

    /* renamed from: runInThreadPool */
    private void m17098x167b1a76(java.lang.Object obj, java.lang.Runnable runnable) {
        if (this.f5271x465c9721.mo127722xab27b508(obj)) {
            ((java.util.concurrent.ThreadPoolExecutor) d8.o.INSTANCE.f308447d).execute(runnable);
        } else {
            ((java.util.concurrent.ThreadPoolExecutor) d8.o.INSTANCE.f308448e).execute(runnable);
        }
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: addDecodeEventListener */
    public void mo17099xd2af33bf(e8.d dVar) {
        this.f5268x4b8fee60.add(dVar);
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: addImageStreamFetcher */
    public void mo17100xcc2da62d(h8.c cVar, boolean z17) {
        g8.g.b(TAG, "hy: %d adding stream fetcher: %s %b", java.lang.Integer.valueOf(hashCode()), cVar.getClass().getSimpleName(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f5270xa038e47b = cVar;
        } else {
            this.f5272x285e5337.push(cVar);
        }
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: encodeToBase64 */
    public java.lang.String mo17101x893cbbe0(android.graphics.Bitmap bitmap, int i17, float f17) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && !bitmap.isRecycled()) {
            android.graphics.Bitmap.CompressFormat m17095xf95a61d7 = m17095xf95a61d7(i17);
            int m17097x7cad1ae1 = m17097x7cad1ae1(f17);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            boolean compress = bitmap.compress(m17095xf95a61d7, m17097x7cad1ae1, byteArrayOutputStream);
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException e17) {
                g8.g.a(TAG, "base64_encode IOException e %s", e17.toString());
                compress = false;
            }
            if (compress && byteArrayOutputStream.size() > 0) {
                return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            g8.g.a(TAG, "base64_encode Bitmap compress error.", new java.lang.Object[0]);
        }
        return null;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: encodeToBuffer */
    public byte[] mo17102x8a50b2d1(android.graphics.Bitmap bitmap, int i17, float f17) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && !bitmap.isRecycled()) {
            android.graphics.Bitmap.CompressFormat m17095xf95a61d7 = m17095xf95a61d7(i17);
            int m17097x7cad1ae1 = m17097x7cad1ae1(f17);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            boolean compress = bitmap.compress(m17095xf95a61d7, m17097x7cad1ae1, byteArrayOutputStream);
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException e17) {
                g8.g.a(TAG, "encodeToBuffer IOException e %s", e17.toString());
                compress = false;
            }
            if (compress && byteArrayOutputStream.size() > 0) {
                return byteArrayOutputStream.toByteArray();
            }
            g8.g.a(TAG, "encodeToBuffer Bitmap compress error.", new java.lang.Object[0]);
        }
        return null;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: forceSetUseType */
    public void mo17103xca1b33ea(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 enumC1595xee8a129) {
        ((d8.e) this.f5269xf082b5dc).f308433d = enumC1595xee8a129;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo17104x12501425(int i17, int i18) {
        d8.s sVar;
        if (d8.s.f308449b == null) {
            synchronized (d8.s.class) {
                if (d8.s.f308449b == null) {
                    d8.s.f308449b = new d8.s();
                }
                sVar = d8.s.f308449b;
            }
        } else {
            sVar = d8.s.f308449b;
        }
        ((d8.q) sVar.f308450a).getClass();
        g8.g.b("MiroMsg.MBBitmapPool", "hy: dummy getTask", new java.lang.Object[0]);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/github/henryye/nativeiv/MBBitmapPool$DefaultBitmapPoolInstance", "get", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/github/henryye/nativeiv/MBBitmapPool$DefaultBitmapPoolInstance", "get", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: init */
    public void mo17105x316510() {
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: loadBitmapAsync */
    public void mo17107x5e27dc7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        mo17108x5e27dc7(str, new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab());
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: loadBitmapSync */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 mo17109xd6ee89f0(java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        h8.c cVar;
        h8.b b17;
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab2 = c1592x888963ab == null ? new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab() : c1592x888963ab;
        java.util.Iterator<h8.c> it = this.f5272x285e5337.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            if (cVar.mo127722xab27b508(obj)) {
                break;
            }
        }
        if (cVar == null) {
            cVar = this.f5270xa038e47b;
        }
        h8.c cVar2 = cVar;
        if (cVar2 == null) {
            g8.g.a(TAG, "No fit image stream fetcher found for %s", obj.toString());
            return null;
        }
        e8.b bVar = this.f5269xf082b5dc;
        if (bVar != null) {
            d8.e eVar = (d8.e) bVar;
            if (!eVar.f308435f) {
                java.lang.String obj2 = obj.toString();
                e8.a aVar = new e8.a();
                int i17 = eVar.f308430a;
                aVar.f331517d = eVar.f308431b;
                aVar.f331516c = i17;
                aVar.f331520g = cVar2.a();
                try {
                    b17 = cVar2.b(obj, c1592x888963ab2);
                } catch (java.lang.Exception e17) {
                    eVar.f308434e.a(obj2, e8.c.THROW_EXCEPTION, aVar);
                    g8.g.c("DefaultBitmapDecoder", e17, "ImageDecoder(%s) decode path[%s]", cVar2, obj.toString());
                }
                if (b17.f361044a != null && android.text.TextUtils.isEmpty(b17.f361045b)) {
                    java.io.InputStream inputStream = b17.f361044a;
                    d8.l a17 = eVar.a(eVar.f308432c, aVar);
                    a17.f308439a = eVar.f308433d;
                    a17.f308441c = eVar.f308434e;
                    com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 interfaceC1596x8c44c2d8 = a17.f308440b;
                    if (interfaceC1596x8c44c2d8 != null) {
                        interfaceC1596x8c44c2d8.mo17133x408b7293();
                    }
                    f8.d a18 = inputStream != null ? a17.a(inputStream) : null;
                    if (a18 == null) {
                        eVar.f308434e.a(obj2, e8.c.PRE_DECODE_ERROR, aVar);
                        return null;
                    }
                    long j17 = a18.f341606b;
                    aVar.f331519f = j17;
                    long j18 = a18.f341607c;
                    aVar.f331518e = j18;
                    if (a18.f341605a == f8.c.UNKNOWN) {
                        eVar.f308434e.a(obj2, e8.c.UNSUPPORTED_IMG_FORMAT, aVar);
                    } else {
                        if (j17 <= eVar.f308430a && j18 <= eVar.f308431b) {
                            eVar.b(a17, obj2, inputStream, c1592x888963ab2, a18);
                            return a17.f308440b;
                        }
                        eVar.f308434e.a(obj2, e8.c.HUGE_SIZE, aVar);
                        a17.f308440b.mo17133x408b7293();
                    }
                    return null;
                }
                aVar.f331521h = b17.f361045b;
                eVar.f308434e.a(obj2, e8.c.NOT_EXIST, aVar);
                return null;
            }
        }
        g8.g.f350942a.w(TAG, "BitmapDecodeSlave destroyed", new java.lang.Object[0]);
        return null;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: release */
    public void mo17112x41012807() {
        e8.b bVar = this.f5269xf082b5dc;
        if (bVar != null) {
            d8.e eVar = (d8.e) bVar;
            eVar.f308435f = true;
            d8.i iVar = eVar.f308432c;
            int i17 = 0;
            while (true) {
                android.util.SparseArray sparseArray = iVar.f308437b;
                if (i17 >= sparseArray.size()) {
                    break;
                }
                java.util.Map map = (java.util.Map) sparseArray.get(sparseArray.keyAt(i17));
                if (map != null) {
                    java.util.Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((f8.b) it.next()).mo17148x5cd39ffa();
                    }
                }
                i17++;
            }
            java.util.Map map2 = iVar.f308436a;
            if (map2 != null) {
                java.util.Iterator it6 = ((java.util.HashMap) map2).values().iterator();
                while (it6.hasNext()) {
                    ((f8.b) it6.next()).mo17148x5cd39ffa();
                }
            }
            this.f5269xf082b5dc = null;
        }
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: releaseBitmap */
    public void mo17113x9e6ca416(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        g8.g.b(TAG, "recycle because releaseBitmap", new java.lang.Object[0]);
        bitmap.recycle();
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: removeDecodeEventListener */
    public void mo17114xd9a06afc(e8.d dVar) {
        this.f5268x4b8fee60.remove(dVar);
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: removeImageStreamFetcher */
    public void mo17115x58ca1350(h8.c cVar, boolean z17) {
        g8.g.b(TAG, "hy: %d removing stream fetcher: %s %b", java.lang.Integer.valueOf(hashCode()), cVar.getClass().getSimpleName(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f5270xa038e47b = null;
        } else {
            this.f5272x285e5337.remove(cVar);
        }
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: setBitmapDecodeSlave */
    public void mo17116xdebdab98(e8.b bVar) {
        this.f5269xf082b5dc = bVar;
        ((d8.e) bVar).f308434e = this.f5267x36e6cc4a;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: setIdKeyReportDelegate */
    public void mo17117x6f5dc37b(g8.h hVar) {
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: setKvReportDelegate */
    public void mo17118x8af4a1a6(g8.i iVar) {
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: setMaxDecodeDimension */
    public void mo17119xf75a4916(int i17, int i18) {
        d8.e eVar = (d8.e) this.f5269xf082b5dc;
        eVar.f308430a = i17;
        eVar.f308431b = i18;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: setNetworkTimeout */
    public void mo17120x2b19055(int i17, int i18) {
        h8.a aVar = this.f5271x465c9721;
        aVar.getClass();
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        aVar.f361042a = i17;
        aVar.f361043b = i18;
        g8.g.b("NativeImageHttpFetcher", "Http Timeout Set: connection[%d] read[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: loadBitmapAsync */
    public void mo17108x5e27dc7(java.lang.String str, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        mo17106x5e27dc7((java.lang.Object) str, c1592x888963ab);
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: loadBitmapAsync */
    public void mo17106x5e27dc7(java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        if (c1592x888963ab == null) {
            c1592x888963ab = new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab();
        }
        m17098x167b1a76(obj, new d8.d(this, obj, c1592x888963ab));
    }

    /* renamed from: ensureCompressFormat */
    private android.graphics.Bitmap.CompressFormat m17095xf95a61d7(int i17) {
        if (i17 == 1) {
            return android.graphics.Bitmap.CompressFormat.WEBP;
        }
        if (i17 != 2) {
            return android.graphics.Bitmap.CompressFormat.PNG;
        }
        return android.graphics.Bitmap.CompressFormat.JPEG;
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: loadBitmapSync */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 mo17110xd6ee89f0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return mo17111xd6ee89f0(str, new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab());
    }

    @Override // com.p171xb5c11be3.p172x30254a24.p173x79eeb384.api.InterfaceC1594x6bcbd375
    /* renamed from: loadBitmapSync */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 mo17111xd6ee89f0(java.lang.String str, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        return mo17109xd6ee89f0((java.lang.Object) str, c1592x888963ab);
    }
}
