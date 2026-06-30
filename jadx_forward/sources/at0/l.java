package at0;

/* loaded from: classes4.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f95122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f95123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.p pVar, android.graphics.Bitmap bitmap) {
        super(1);
        this.f95122d = pVar;
        this.f95123e = bitmap;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Double valueOf;
        java.lang.Double valueOf2;
        java.lang.Integer num;
        java.lang.Integer num2;
        byte[] bArr = (byte[]) obj;
        kz5.q0 q0Var = kz5.q0.f395534d;
        android.graphics.Bitmap bitmap = this.f95123e;
        yz5.p pVar = this.f95122d;
        if (bArr == null) {
            pVar.mo149xb9724478(bitmap, q0Var);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            at0.k kVar = at0.k.f95121d;
            try {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                try {
                    android.media.ExifInterface exifInterface = new android.media.ExifInterface(byteArrayInputStream);
                    java.lang.String attribute = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3195xad0d4887);
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
                    java.lang.String attribute2 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3185x50451b00);
                    if (attribute2 != null) {
                        try {
                            valueOf2 = java.lang.Double.valueOf(java.lang.Double.parseDouble(attribute2));
                        } catch (java.lang.Exception unused2) {
                            valueOf2 = java.lang.Double.valueOf(0.0d);
                        }
                    } else {
                        valueOf2 = null;
                    }
                    hashMap.put(dm.n.f67500x7c3efcd3, valueOf2);
                    java.lang.String attribute3 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3240xa702825f);
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
                        java.lang.Double d18 = (java.lang.Double) kVar.mo146xb9724478(exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3190x9b5ec6c5));
                        if (d18 != null) {
                            d17 = d18.doubleValue();
                        }
                    } catch (java.lang.Exception unused4) {
                    }
                    hashMap.put("focalLength", java.lang.Double.valueOf(d17));
                    java.lang.String attribute4 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3191xdd772cc1);
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
                    pVar.mo149xb9724478(bitmap, hashMap);
                } finally {
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraPreviewContainer", "readExif error. " + e17);
                pVar.mo149xb9724478(bitmap, q0Var);
            } catch (java.lang.OutOfMemoryError e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraPreviewContainer", "readExif OutOfMemoryError. " + e18);
                pVar.mo149xb9724478(bitmap, q0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
