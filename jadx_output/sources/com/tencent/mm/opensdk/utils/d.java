package com.tencent.mm.opensdk.utils;

/* loaded from: classes9.dex */
public final class d {
    public static android.content.Context D;

    /* loaded from: classes9.dex */
    public static class a {
        public static java.util.concurrent.ThreadPoolExecutor E;

        static {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(5, 9, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque());
            E = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    private static int a(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            com.tencent.mm.opensdk.utils.Log.w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        java.io.InputStream inputStream = null;
        try {
            try {
                java.io.InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream == null) {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (java.io.IOException e17) {
                            com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e17.getMessage());
                        }
                    }
                    return 0;
                }
                int available = openInputStream.available();
                try {
                    openInputStream.close();
                } catch (java.io.IOException e18) {
                    com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e18.getMessage());
                }
                return available;
            } catch (java.lang.Exception e19) {
                com.tencent.mm.opensdk.utils.Log.w("MicroMsg.SDK.Util", "getFileSize fail, " + e19.getMessage());
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e27) {
                        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e27.getMessage());
                    }
                }
                return 0;
            }
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e28) {
                    com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e28.getMessage());
                }
            }
            throw th6;
        }
    }

    public static java.util.concurrent.ThreadPoolExecutor b() {
        return com.tencent.mm.opensdk.utils.d.a.E;
    }

    public static int c(java.lang.String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return java.lang.Integer.parseInt(str);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }

    public static int getFileSize(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (D != null && str.startsWith("content")) {
            try {
                return a(D.getContentResolver(), android.net.Uri.parse(str));
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }

    public static boolean a(int i17) {
        return i17 == 36 || i17 == 46;
    }

    public static boolean b(int i17) {
        return i17 == 101;
    }

    public static boolean b(java.lang.String str) {
        return str == null || str.length() <= 0;
    }
}
