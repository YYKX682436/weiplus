package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db;

/* renamed from: com.tencent.youtu.ytcommon.tools.YTFileUtils */
/* loaded from: classes12.dex */
public class C27962x140b9bba {
    private C27962x140b9bba() {
        throw new java.lang.AssertionError();
    }

    /* renamed from: copyAsset */
    public static boolean m121263x5817ac7b(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        try {
            java.io.InputStream open = assetManager.open(str);
            new java.io.File(str2).createNewFile();
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str2);
            m121264xe1d15691(open, fileOutputStream);
            open.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: copyFile */
    public static void m121264xe1d15691(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
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
    public static void m121265x55913b99(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String[] list = assetManager.list(str);
            if (list.length == 0) {
                m121263x5817ac7b(assetManager, str, str2 + "/" + str);
                return;
            }
            java.lang.String str3 = java.io.File.separator;
            java.io.File file = new java.io.File(str2.endsWith(str3) ? str2 + str : str2 + str3 + str);
            if (!file.exists()) {
                file.mkdir();
            }
            for (java.lang.String str4 : list) {
                m121265x55913b99(assetManager, str + "/" + str4, str2);
            }
        } catch (java.io.IOException unused) {
        }
    }

    /* renamed from: drawableToBitmap */
    public static android.graphics.Bitmap m121266x88cd4a48(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        android.graphics.Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888) : android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: getLastPathComponent */
    public static java.lang.String m121267xd5ed3aac(java.lang.String str) {
        java.lang.String[] split = str.split("/");
        return split.length == 0 ? "" : split[split.length - 1];
    }

    /* renamed from: readAssetFile */
    public static java.lang.StringBuilder m121268xdc988b96(android.content.Context context, java.lang.String str) {
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
                                throw new java.lang.RuntimeException("IOException occurred. ", e17);
                            }
                        }
                        if (!sb6.toString().equals("")) {
                            sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                        }
                        sb6.append(readLine);
                    } catch (java.io.IOException e18) {
                        e = e18;
                        throw new java.lang.RuntimeException("IOException occurred. ", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e19) {
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
    public static java.lang.StringBuilder m121269xcc440832(java.lang.String str) {
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
                        throw new java.lang.RuntimeException("IOException occurred. ", e);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e19) {
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

    /* renamed from: zipFileAtPath */
    public static boolean m121270xb9ca6595(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        try {
            java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(str2)));
            if (!file.isDirectory()) {
                byte[] bArr = new byte[2048];
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(str), 2048);
                zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(m121267xd5ed3aac(str)));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
            } else {
                m121271xe695d4ad(zipOutputStream, file, file.getParent().length());
            }
            zipOutputStream.close();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: zipSubFolder */
    private static void m121271xe695d4ad(java.util.zip.ZipOutputStream zipOutputStream, java.io.File file, int i17) {
        for (java.io.File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                m121271xe695d4ad(zipOutputStream, file2, i17);
            } else {
                byte[] bArr = new byte[2048];
                java.lang.String path = file2.getPath();
                java.lang.String substring = path.substring(i17);
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(path), 2048);
                zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(substring));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, read);
                    }
                }
                bufferedInputStream.close();
            }
        }
    }
}
