package at0;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f13589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f13590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.p pVar, android.graphics.Bitmap bitmap) {
        super(1);
        this.f13589d = pVar;
        this.f13590e = bitmap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Double valueOf;
        java.lang.Double valueOf2;
        java.lang.Integer num;
        java.lang.Integer num2;
        byte[] bArr = (byte[]) obj;
        kz5.q0 q0Var = kz5.q0.f314001d;
        android.graphics.Bitmap bitmap = this.f13590e;
        yz5.p pVar = this.f13589d;
        if (bArr == null) {
            pVar.invoke(bitmap, q0Var);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            at0.k kVar = at0.k.f13588d;
            try {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                try {
                    android.media.ExifInterface exifInterface = new android.media.ExifInterface(byteArrayInputStream);
                    java.lang.String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER);
                    double d17 = 0.0d;
                    if (attribute != null) {
                        try {
                            valueOf = java.lang.Double.valueOf(java.lang.Double.parseDouble(attribute));
                        } catch (java.lang.Exception unused) {
                            valueOf = java.lang.Double.valueOf(0.0d);
                        }
                    } else {
                        valueOf = null;
                    }
                    hashMap.put("aperture", valueOf);
                    java.lang.String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME);
                    if (attribute2 != null) {
                        try {
                            valueOf2 = java.lang.Double.valueOf(java.lang.Double.parseDouble(attribute2));
                        } catch (java.lang.Exception unused2) {
                            valueOf2 = java.lang.Double.valueOf(0.0d);
                        }
                    } else {
                        valueOf2 = null;
                    }
                    hashMap.put(dm.n.COL_EXPOSURETIME, valueOf2);
                    java.lang.String attribute3 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS);
                    if (attribute3 != null) {
                        try {
                            num = java.lang.Integer.valueOf(java.lang.Integer.parseInt(attribute3));
                        } catch (java.lang.Exception unused3) {
                            num = 0;
                        }
                    } else {
                        num = null;
                    }
                    hashMap.put("iso", num);
                    try {
                        java.lang.Double d18 = (java.lang.Double) kVar.invoke(exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH));
                        if (d18 != null) {
                            d17 = d18.doubleValue();
                        }
                    } catch (java.lang.Exception unused4) {
                    }
                    hashMap.put("focalLength", java.lang.Double.valueOf(d17));
                    java.lang.String attribute4 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM);
                    if (attribute4 != null) {
                        try {
                            num2 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(attribute4));
                        } catch (java.lang.Exception unused5) {
                            num2 = 0;
                        }
                    } else {
                        num2 = null;
                    }
                    hashMap.put("focalLengthIn35mmFilm", num2);
                    vz5.b.a(byteArrayInputStream, null);
                    pVar.invoke(bitmap, hashMap);
                } finally {
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CameraPreviewContainer", "readExif error. " + e17);
                pVar.invoke(bitmap, q0Var);
            } catch (java.lang.OutOfMemoryError e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CameraPreviewContainer", "readExif OutOfMemoryError. " + e18);
                pVar.invoke(bitmap, q0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
