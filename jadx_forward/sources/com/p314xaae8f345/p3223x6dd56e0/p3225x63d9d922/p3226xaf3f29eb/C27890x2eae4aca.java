package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb;

/* renamed from: com.tencent.youtu.sdkkitframework.common.YTImageData */
/* loaded from: classes13.dex */
public class C27890x2eae4aca {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f61644x7118e671 = false;
    private static final java.lang.String TAG = "YTImageData";

    /* renamed from: checksum */
    public java.lang.String f61645x5b9b5c43;

    /* renamed from: height */
    public int f61646xb7389127;

    /* renamed from: imgData */
    public byte[] f61647x723a620d;

    /* renamed from: width */
    public int f61648x6be2dc6;
    public float[] xys;

    public C27890x2eae4aca() {
    }

    /* renamed from: convertBGRByteToColor */
    private int[] m120608x3ff79506(byte[] bArr) {
        int i17;
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i18 = 0;
        int i19 = length % 3 != 0 ? 1 : 0;
        int i27 = (length / 3) + i19;
        int[] iArr = new int[i27];
        if (i19 == 0) {
            while (i18 < i27) {
                int i28 = i18 * 3;
                iArr[i18] = ((bArr[i28 + 2] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) & 16711680) | (bArr[i28] & 255) | ((bArr[i28 + 1] << 8) & 65280) | (-16777216);
                i18++;
            }
        } else {
            while (true) {
                i17 = i27 - 1;
                if (i18 >= i17) {
                    break;
                }
                int i29 = i18 * 3;
                iArr[i18] = ((bArr[i29 + 2] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) & 16711680) | (bArr[i29] & 255) | ((bArr[i29 + 1] << 8) & 65280) | (-16777216);
                i18++;
            }
            iArr[i17] = -16777216;
        }
        return iArr;
    }

    /* renamed from: convertRGBByteToColor */
    private int[] m120609xe2b9d906(byte[] bArr) {
        int i17;
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i18 = 0;
        int i19 = length % 3 != 0 ? 1 : 0;
        int i27 = (length / 3) + i19;
        int[] iArr = new int[i27];
        if (i19 == 0) {
            while (i18 < i27) {
                int i28 = i18 * 3;
                iArr[i18] = (bArr[i28 + 2] & 255) | ((bArr[i28] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) & 16711680) | ((bArr[i28 + 1] << 8) & 65280) | (-16777216);
                i18++;
            }
        } else {
            while (true) {
                i17 = i27 - 1;
                if (i18 >= i17) {
                    break;
                }
                int i29 = i18 * 3;
                iArr[i18] = (bArr[i29 + 2] & 255) | ((bArr[i29] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) & 16711680) | ((bArr[i29 + 1] << 8) & 65280) | (-16777216);
                i18++;
            }
            iArr[i17] = -16777216;
        }
        return iArr;
    }

    /* renamed from: bgr2Bitmap */
    public android.graphics.Bitmap m120610x39816294() {
        int[] m120608x3ff79506 = m120608x3ff79506(this.f61647x723a620d);
        int i17 = this.f61648x6be2dc6;
        return android.graphics.Bitmap.createBitmap(m120608x3ff79506, 0, i17, i17, this.f61646xb7389127, android.graphics.Bitmap.Config.ARGB_8888);
    }

    /* renamed from: bgr2JPEG */
    public byte[] m120611xd240eaed() {
        return m120612xd240eaed(100);
    }

    /* renamed from: clone */
    public java.lang.Object m120613x5a5dd5d() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca c27890x2eae4aca = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca();
        c27890x2eae4aca.f61647x723a620d = (byte[]) this.f61647x723a620d.clone();
        c27890x2eae4aca.f61648x6be2dc6 = this.f61648x6be2dc6;
        c27890x2eae4aca.f61646xb7389127 = this.f61646xb7389127;
        return c27890x2eae4aca;
    }

    /* renamed from: compressBitmap */
    public byte[] m120614x5a2c3731(int i17) {
        byte[] bArr = this.f61647x723a620d;
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        decodeByteArray.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: getHeight */
    public int m120615x1c4fb41d() {
        return this.f61646xb7389127;
    }

    /* renamed from: getImgData */
    public byte[] m120616xb0079dd7() {
        return this.f61647x723a620d;
    }

    /* renamed from: getWidth */
    public int m120617x755bd410() {
        return this.f61648x6be2dc6;
    }

    /* renamed from: jpeg2Bitmap */
    public android.graphics.Bitmap m120618x9d01ca99() {
        byte[] bArr = this.f61647x723a620d;
        return android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    /* renamed from: resize */
    public void m120619xc84d9cb4(int i17, int i18, int i19) {
        android.graphics.Bitmap m120618x9d01ca99 = m120618x9d01ca99();
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(m120618x9d01ca99, i17, i18, true);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        createScaledBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i19, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        m120618x9d01ca99.recycle();
        this.f61648x6be2dc6 = i17;
        this.f61646xb7389127 = i18;
        this.f61647x723a620d = byteArray;
    }

    /* renamed from: setHeight */
    public void m120620xf84e829(int i17) {
        this.f61646xb7389127 = i17;
    }

    /* renamed from: setImgData */
    public void m120621x2378eb4b(byte[] bArr) {
        this.f61647x723a620d = bArr;
    }

    /* renamed from: setWidth */
    public void m120622x53e9ee84(int i17) {
        this.f61648x6be2dc6 = i17;
    }

    /* renamed from: toJSON */
    public org.json.JSONObject m120623xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("img", new java.lang.String(this.f61647x723a620d));
            jSONObject.put("checksum", this.f61645x5b9b5c43);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "video data tojson error:" + android.util.Log.getStackTraceString(e17));
            return new org.json.JSONObject();
        }
    }

    /* renamed from: toString */
    public java.lang.String m120624x9616526c() {
        return "ImageData{imgDataSize=" + this.f61647x723a620d.length + ", width=" + this.f61648x6be2dc6 + ", height=" + this.f61646xb7389127 + '}';
    }

    /* renamed from: writeImg2LocalDisk */
    public void m120625xbc26c5fa(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120576x51962c98(str, str2));
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
        }
    }

    /* renamed from: writeImgByteArray2LocalDisk */
    public void m120626x57798683(java.lang.String str, java.lang.String str2) {
        java.io.File m120576x51962c98 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120576x51962c98(str, str2);
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(this.f61647x723a620d);
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(m120576x51962c98);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (java.io.FileNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    /* renamed from: writeJPEGImg2LocalDisk */
    public void m120627xa7b1ae12(java.lang.String str, java.lang.String str2) {
        java.io.File m120576x51962c98 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27884x28705875.m120576x51962c98(str, str2);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(m120576x51962c98);
                try {
                    fileOutputStream2.write(this.f61647x723a620d);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (java.lang.Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException unused3) {
            }
        } catch (java.lang.Exception unused4) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: yuv2Bitmap */
    public android.graphics.Bitmap m120628xe75d51e7() {
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(this.f61647x723a620d, 17, this.f61648x6be2dc6, this.f61646xb7389127, null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 95, byteArrayOutputStream);
        return android.graphics.BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
    }

    /* renamed from: yuv2JPEG */
    public byte[] m120629x12e69300(int i17) {
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(this.f61647x723a620d, 17, this.f61648x6be2dc6, this.f61646xb7389127, null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public C27890x2eae4aca(byte[] bArr, int i17, int i18) {
        this.f61647x723a620d = bArr;
        this.f61648x6be2dc6 = i17;
        this.f61646xb7389127 = i18;
    }

    /* renamed from: bgr2JPEG */
    public byte[] m120612xd240eaed(int i17) {
        int[] m120608x3ff79506 = m120608x3ff79506((byte[]) this.f61647x723a620d.clone());
        int i18 = this.f61648x6be2dc6;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(m120608x3ff79506, 0, i18, i18, this.f61646xb7389127, android.graphics.Bitmap.Config.ARGB_8888);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        createBitmap.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    public C27890x2eae4aca(byte[] bArr, float[] fArr, int i17, int i18) {
        this.f61647x723a620d = bArr;
        this.xys = fArr;
        this.f61648x6be2dc6 = i17;
        this.f61646xb7389127 = i18;
    }
}
