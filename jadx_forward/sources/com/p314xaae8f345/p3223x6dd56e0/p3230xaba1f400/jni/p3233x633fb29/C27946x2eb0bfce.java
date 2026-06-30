package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo */
/* loaded from: classes13.dex */
public class C27946x2eb0bfce {

    /* renamed from: checksum */
    public java.lang.String f62510x5b9b5c43;

    /* renamed from: five_points */
    public java.util.ArrayList<java.lang.Float> f62511x3f7cd710;

    /* renamed from: image */
    public java.lang.String f62512x5faa95b;

    public C27946x2eb0bfce(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3231x2eefaa.C27925x9e11c5b5 c27925x9e11c5b5) {
        this.f62512x5faa95b = new java.lang.String(android.util.Base64.encode(c27925x9e11c5b5.f62399x5faa95b, 2));
        this.f62510x5b9b5c43 = c27925x9e11c5b5.f62398x5b9b5c43;
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        this.f62511x3f7cd710 = arrayList;
        float[] fArr = c27925x9e11c5b5.xys;
        if (fArr != null) {
            arrayList.add(java.lang.Float.valueOf(fArr[176]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[177]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[178]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[179]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[64]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[65]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[90]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[91]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[102]));
            this.f62511x3f7cd710.add(java.lang.Float.valueOf(c27925x9e11c5b5.xys[103]));
        }
    }

    /* renamed from: createFileWithByte */
    private void m121185xf30c2ba6(java.lang.String str, byte[] bArr) {
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.File file = new java.io.File(str);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream2);
                try {
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (java.io.IOException unused) {
                    }
                } catch (java.lang.Exception unused2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    if (bufferedOutputStream == null) {
                        return;
                    }
                    bufferedOutputStream.close();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    if (bufferedOutputStream == null) {
                        throw th;
                    }
                    try {
                        bufferedOutputStream.close();
                        throw th;
                    } catch (java.lang.Exception unused5) {
                        throw th;
                    }
                }
            } catch (java.lang.Exception unused6) {
                bufferedOutputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                bufferedOutputStream = null;
            }
        } catch (java.lang.Exception unused7) {
            bufferedOutputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            bufferedOutputStream = null;
        }
        try {
            bufferedOutputStream.close();
        } catch (java.lang.Exception unused8) {
        }
    }
}
