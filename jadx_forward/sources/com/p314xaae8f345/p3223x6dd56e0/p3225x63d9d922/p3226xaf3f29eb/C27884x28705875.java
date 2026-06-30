package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb;

/* renamed from: com.tencent.youtu.sdkkitframework.common.FileUtils */
/* loaded from: classes12.dex */
public class C27884x28705875 {
    private static final java.lang.String TAG = "FileUtils";

    /* renamed from: mLoadedLibrary */
    private static java.util.Map<java.lang.String, java.lang.String> f61525xa7c97589 = new java.util.HashMap();

    private C27884x28705875() {
        throw new java.lang.AssertionError();
    }

    /* renamed from: copyAsset */
    public static boolean m120573x5817ac7b(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        try {
            java.io.InputStream open = assetManager.open(str);
            new java.io.File(str2).createNewFile();
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str2);
            m120574xe1d15691(open, fileOutputStream);
            open.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "copyAsset fail:" + android.util.Log.getStackTraceString(e17));
            return false;
        }
    }

    /* renamed from: copyFile */
    public static void m120574xe1d15691(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: copyFileOrDir */
    public static void m120575x55913b99(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String[] list = assetManager.list(str);
            if (list.length == 0) {
                m120573x5817ac7b(assetManager, str, str2 + "/" + str);
                return;
            }
            java.lang.String str3 = java.io.File.separator;
            java.io.File file = new java.io.File(str2.endsWith(str3) ? str2 + str : str2 + str3 + str);
            if (!file.exists()) {
                file.mkdir();
            }
            for (java.lang.String str4 : list) {
                m120575x55913b99(assetManager, str + "/" + str4, str2);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "copyFileOrDir fail:" + android.util.Log.getStackTraceString(e17));
        }
    }

    /* renamed from: createFile */
    public static java.io.File m120576x51962c98(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(android.os.Environment.getExternalStorageDirectory());
        java.lang.String str3 = java.io.File.separator;
        sb6.append(str3);
        sb6.append(str2);
        sb6.append(str3);
        java.io.File file = new java.io.File(sb6.toString());
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        java.io.File file2 = new java.io.File(file.getPath() + str3 + str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "createFile fail:" + android.util.Log.getStackTraceString(e17));
            }
        }
        return file2;
    }

    /* renamed from: loadLibrary */
    public static void m120577xeb57c8f5(java.lang.String str) {
        if (f61525xa7c97589.get(str) == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "[YTUtils.loadLibrary] " + java.lang.System.getProperty("java.library.path"));
            try {
                com.p314xaae8f345.cso.C2941xefde02d2.e(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "loadLibrary fail: libName:" + str + ",exception:" + android.util.Log.getStackTraceString(e17));
            }
            f61525xa7c97589.put(str, "loaded");
        }
    }

    /* renamed from: readAssetFile */
    public static java.lang.StringBuilder m120578xdc988b96(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.io.BufferedReader bufferedReader = null;
        try {
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(context.getResources().getAssets().open(str)));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader2.close();
                                return sb6;
                            } catch (java.io.IOException e17) {
                                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "readAssetFile fail:" + android.util.Log.getStackTraceString(e17));
                                throw new java.lang.RuntimeException("IOException occurred. ", e17);
                            }
                        }
                        if (!sb6.toString().equals("")) {
                            sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                        }
                        sb6.append(readLine);
                    } catch (java.io.IOException e18) {
                        e = e18;
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "readAssetFile fail:" + android.util.Log.getStackTraceString(e));
                        throw new java.lang.RuntimeException("IOException occurred. ", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e19) {
                                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "readAssetFile fail:" + android.util.Log.getStackTraceString(e19));
                                throw new java.lang.RuntimeException("IOException occurred. ", e19);
                            }
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.io.IOException e27) {
            e = e27;
        }
    }

    /* renamed from: readFile */
    public static java.lang.StringBuilder m120579xcc440832(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.io.BufferedReader bufferedReader = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader2.close();
                                return sb6;
                            } catch (java.io.IOException e17) {
                                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "readFile fail:" + android.util.Log.getStackTraceString(e17));
                                throw new java.lang.RuntimeException("IOException occurred. ", e17);
                            }
                        }
                        if (!sb6.toString().equals("")) {
                            sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                        }
                        sb6.append(readLine);
                    } catch (java.io.IOException e18) {
                        e = e18;
                        bufferedReader = bufferedReader2;
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "readFile fail:" + android.util.Log.getStackTraceString(e));
                        throw new java.lang.RuntimeException("IOException occurred. ", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e19) {
                                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "readFile fail:" + android.util.Log.getStackTraceString(e19));
                                throw new java.lang.RuntimeException("IOException occurred. ", e19);
                            }
                        }
                        throw th;
                    }
                }
            } catch (java.io.IOException e27) {
                e = e27;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
