package com.p314xaae8f345.p2936x80def495.jni;

/* renamed from: com.tencent.skyline.jni.IOUtil */
/* loaded from: classes7.dex */
public final class C25591x81136a48 {
    private static final java.lang.String TAG = "IOUtil";

    private C25591x81136a48() {
    }

    /* renamed from: convertStreamToString */
    public static java.lang.String m95902xab1fa9f(java.io.InputStream inputStream) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream);
        char[] cArr = new char[16384];
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        while (true) {
            try {
                try {
                    int read = inputStreamReader.read(cArr);
                    if (-1 == read) {
                        m95904xf4adf439(inputStreamReader);
                        m95904xf4adf439(inputStream);
                        return stringWriter.toString();
                    }
                    stringWriter.write(cArr, 0, read);
                } catch (java.lang.Exception e17) {
                    java.lang.String.format("convertStreamToString: read, %s", e17.getMessage());
                    m95904xf4adf439(inputStreamReader);
                    m95904xf4adf439(inputStream);
                    return "";
                }
            } catch (java.lang.Throwable th6) {
                m95904xf4adf439(inputStreamReader);
                m95904xf4adf439(inputStream);
                throw th6;
            }
        }
    }

    /* renamed from: getAssetAsString */
    public static java.lang.String m95903xbc5e063d(android.content.Context context, java.lang.String str) {
        java.io.InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
        } catch (java.lang.Exception e17) {
            java.lang.String.format("openRead file( %s ) failed, exp = %s", str, e17);
            inputStream = null;
        }
        return inputStream == null ? "" : m95902xab1fa9f(inputStream);
    }

    /* renamed from: qualityClose */
    public static void m95904xf4adf439(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
