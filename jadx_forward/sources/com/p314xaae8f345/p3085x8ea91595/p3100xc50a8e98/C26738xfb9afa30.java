package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98;

/* renamed from: com.tencent.tmassistantsdk.protocol.ZipUtils */
/* loaded from: classes13.dex */
public class C26738xfb9afa30 {
    private static final java.lang.String TAG = "ZipUtils";

    /* renamed from: unzip */
    public static byte[] m105160x6a495e8(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        fp.v vVar = new fp.v();
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length);
            } catch (java.util.zip.DataFormatException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        try {
            byte[] bArr2 = new byte[1024];
            vVar.setInput(bArr);
            while (!vVar.finished()) {
                byteArrayOutputStream.write(bArr2, 0, vVar.inflate(bArr2));
            }
            vVar.end();
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException unused) {
            }
        } catch (java.util.zip.DataFormatException e18) {
            e = e18;
            byteArrayOutputStream2 = byteArrayOutputStream;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e, "", new java.lang.Object[0]);
            vVar.end();
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            byteArrayOutputStream = byteArrayOutputStream2;
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Throwable th7) {
            th = th7;
            vVar.end();
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.io.IOException unused3) {
                }
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] zip(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater();
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(bArr.length);
            try {
                deflater.setLevel(9);
                deflater.setInput(bArr);
                deflater.finish();
                byte[] bArr2 = new byte[1024];
                while (!deflater.finished()) {
                    byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
                }
                deflater.end();
                try {
                    byteArrayOutputStream2.close();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                }
                return byteArrayOutputStream2.toByteArray();
            } catch (java.lang.Throwable th6) {
                th = th6;
                byteArrayOutputStream = byteArrayOutputStream2;
                deflater.end();
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.io.IOException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
