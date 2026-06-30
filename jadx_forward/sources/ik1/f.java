package ik1;

/* loaded from: classes7.dex */
public abstract class f {
    public static byte[] a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return new byte[0];
        }
        if (!byteBuffer.isDirect()) {
            return byteBuffer.array();
        }
        int position = byteBuffer.position();
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }

    public static byte[] b(java.io.InputStream inputStream) {
        return c(inputStream, 0L, -1L);
    }

    public static byte[] c(java.io.InputStream inputStream, long j17, long j18) {
        int read;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            try {
                int available = inputStream.available();
                if (available < 0) {
                    byte[] bArr2 = new byte[0];
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + e17);
                    }
                    return bArr2;
                }
                if ((j17 + j18) - 1 > available - 1) {
                    byte[] bArr3 = new byte[0];
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + e18);
                    }
                    return bArr3;
                }
                long j19 = available;
                if (j18 < 0) {
                    j18 = j19;
                }
                inputStream.skip(j17);
                int i17 = 0;
                while (true) {
                    long j27 = i17;
                    if (j27 >= j18 || (read = inputStream.read(bArr, 0, 16384)) == -1) {
                        break;
                    }
                    int min = (int) java.lang.Math.min(read, j18 - j27);
                    byteArrayOutputStream.write(bArr, 0, min);
                    i17 += min;
                }
                byteArrayOutputStream.flush();
                try {
                    inputStream.close();
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + e19);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (java.lang.Throwable th6) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + e27);
                }
                throw th6;
            }
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray: " + e28);
            byte[] bArr4 = new byte[0];
            try {
                inputStream.close();
            } catch (java.lang.Exception e29) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "convertStreamToByteArray close: " + e29);
            }
            return bArr4;
        }
    }

    public static java.lang.String d(java.io.InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream);
        char[] cArr = new char[16384];
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        while (true) {
            try {
                try {
                    int read = inputStreamReader.read(cArr);
                    if (-1 == read) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStreamReader);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                        return stringWriter.toString();
                    }
                    stringWriter.write(cArr, 0, read);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "convertStreamToString: read, %s", e17.getMessage());
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStreamReader);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    return "";
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStreamReader);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                throw th6;
            }
        }
    }

    public static java.lang.String e(java.lang.String str) {
        java.io.InputStream inputStream;
        try {
            inputStream = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "openRead file( %s ) failed, exp = %s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            inputStream = null;
        }
        return inputStream == null ? "" : d(inputStream);
    }

    public static java.lang.String f(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return "";
        }
        try {
            java.io.FileInputStream createInputStream = assetFileDescriptor.createInputStream();
            try {
                java.lang.String d17 = d(createInputStream);
                if (createInputStream != null) {
                    createInputStream.close();
                }
                return d17;
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIOUtil", "openReadFdAsString(%s) createInputStream get exception %s", assetFileDescriptor, e17);
            return "";
        }
    }
}
