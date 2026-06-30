package c.t.m.sapp.c;

/* loaded from: classes12.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f36925a = "WriterAndReader";

    /* renamed from: b, reason: collision with root package name */
    public java.io.File f36926b;

    public r(java.lang.String str) {
        this.f36926b = null;
        this.f36926b = new java.io.File(str);
    }

    public boolean a(byte[] bArr, boolean z17) {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            if (!this.f36926b.exists()) {
                java.io.File file = new java.io.File(this.f36926b.getParent());
                if (!file.exists()) {
                    file.mkdirs();
                    this.f36926b.createNewFile();
                }
            }
            fileOutputStream = new java.io.FileOutputStream(this.f36926b, z17);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            try {
                fileOutputStream.close();
                return true;
            } catch (java.lang.Exception unused2) {
                return true;
            }
        } catch (java.lang.Exception unused3) {
            fileOutputStream2 = fileOutputStream;
            try {
                fileOutputStream2.close();
                return false;
            } catch (java.lang.Exception unused4) {
                return false;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream2 = fileOutputStream;
            try {
                fileOutputStream2.close();
            } catch (java.lang.Exception unused5) {
            }
            throw th;
        }
    }

    public java.lang.String a(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.FileInputStream fileInputStream = null;
        try {
            try {
                if (this.f36926b.exists()) {
                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(this.f36926b.getAbsolutePath());
                    try {
                        byte[] bArr = new byte[com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES];
                        while (true) {
                            int read = fileInputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.close();
                        java.lang.String str2 = new java.lang.String(byteArrayOutputStream.toByteArray());
                        fileInputStream2.close();
                        try {
                            fileInputStream2.close();
                        } catch (java.lang.Exception unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (java.lang.Exception unused2) {
                        }
                        return str2;
                    } catch (java.lang.Exception unused3) {
                        fileInputStream = fileInputStream2;
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Exception unused4) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (java.lang.Exception unused5) {
                        }
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Exception unused6) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (java.lang.Exception unused7) {
                        }
                        return str;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        fileInputStream = fileInputStream2;
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Exception unused8) {
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (java.lang.Exception unused9) {
                            throw th;
                        }
                    }
                }
                try {
                    try {
                        throw null;
                    } catch (java.lang.Exception unused10) {
                        return str;
                    }
                } catch (java.lang.Exception unused11) {
                    byteArrayOutputStream.close();
                    return str;
                }
            } catch (java.lang.Exception unused12) {
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
