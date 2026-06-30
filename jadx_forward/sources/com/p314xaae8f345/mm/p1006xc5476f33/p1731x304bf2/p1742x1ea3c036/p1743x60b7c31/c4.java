package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f221136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221140h;

    public c4(android.graphics.Bitmap bitmap, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, android.content.Context context, java.lang.String str2) {
        this.f221136d = bitmap;
        this.f221137e = str;
        this.f221138f = q5Var;
        this.f221139g = context;
        this.f221140h = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x018a: MOVE (r16 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:94:0x0189 */
    @Override // java.lang.Runnable
    public void run() {
        java.io.Closeable closeable;
        java.io.Closeable closeable2;
        com.p314xaae8f345.mm.vfs.u6 u6Var;
        java.io.OutputStream outputStream;
        java.lang.String str;
        java.lang.String str2;
        java.io.OutputStream outputStream2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221138f;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.vfs.u6 u6Var2 = null;
        android.graphics.Bitmap bitmap = this.f221136d;
        java.lang.String str3 = this.f221137e;
        try {
            if (bitmap != 0) {
                try {
                    java.lang.String str4 = "MMImage_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str3) + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.h(bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.f221307e, str4);
                    str = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.f221307e + str4;
                    u6Var = new com.p314xaae8f345.mm.vfs.u6(str);
                } catch (java.io.FileNotFoundException unused) {
                    u6Var = null;
                    outputStream = null;
                    q5Var.a("saveToPhotosAlbum fail, file not found", null);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                    return;
                } catch (java.lang.Exception unused2) {
                    u6Var = null;
                    outputStream = null;
                    q5Var.a("saveToPhotosAlbum fail, exception", null);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                    return;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    closeable2 = null;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var2);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable2);
                    throw th;
                }
                try {
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                    str2 = "jpg";
                } catch (java.io.FileNotFoundException unused3) {
                    outputStream = null;
                    q5Var.a("saveToPhotosAlbum fail, file not found", null);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                    return;
                } catch (java.lang.Exception unused4) {
                    outputStream = null;
                    q5Var.a("saveToPhotosAlbum fail, exception", null);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                    return;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    closeable2 = null;
                    u6Var2 = u6Var;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var2);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable2);
                    throw th;
                }
            } else {
                try {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        return;
                    }
                    u6Var = new com.p314xaae8f345.mm.vfs.u6(str3);
                    try {
                        str2 = s46.c.c(str3);
                    } catch (java.io.FileNotFoundException unused5) {
                        outputStream = null;
                        q5Var.a("saveToPhotosAlbum fail, file not found", null);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Exception unused6) {
                        outputStream = null;
                        q5Var.a("saveToPhotosAlbum fail, exception", null);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        u6Var2 = u6Var;
                        closeable2 = null;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var2);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable2);
                        throw th;
                    }
                } catch (java.io.FileNotFoundException unused7) {
                    u6Var = null;
                } catch (java.lang.Exception unused8) {
                    u6Var = null;
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    u6Var2 = null;
                }
            }
            java.lang.String a17 = q75.c.a(str2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                q5Var.a("saveToPhotosAlbum fail, savePath is null", null);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                return;
            }
            int i17 = android.os.Build.VERSION.SDK_INT;
            android.content.Context context = this.f221139g;
            java.lang.String str5 = this.f221140h;
            if (i17 < 29 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.f(a17, u6Var)) {
                    dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lwd, q75.c.e()), 1).show();
                    q75.c.f(a17, context);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(a17), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.z0.class);
                        hashMap.put(dm.i4.f66867x2a5c95c7, c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : "");
                    } else {
                        hashMap.put(dm.i4.f66867x2a5c95c7, str5);
                    }
                    hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, a17);
                    hashMap.put("err_msg", "saveToPhotosAlbum:ok");
                    q5Var.a(null, new org.json.JSONObject(hashMap));
                } else {
                    q5Var.a("saveToPhotosAlbum fail, save fail", null);
                }
                outputStream2 = null;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a7[] a7VarArr = {null};
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u6.b(context, a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.b4(this, a7VarArr));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var = a7VarArr[0];
                outputStream = a7Var != null ? a7Var.b() : null;
                try {
                    if (outputStream == null) {
                        throw new java.io.IOException("Open OutputStream with MediaStore fail!");
                    }
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = u6Var.read(bArr);
                        if (-1 == read) {
                            break;
                        } else {
                            outputStream.write(bArr, 0, read);
                        }
                    }
                    outputStream.flush();
                    a7VarArr[0].c();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(a17), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.z0.class);
                        hashMap.put(dm.i4.f66867x2a5c95c7, c10756x2a5d7b2d2 != null ? c10756x2a5d7b2d2.f149939d : "");
                    } else {
                        hashMap.put(dm.i4.f66867x2a5c95c7, str5);
                    }
                    hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, a17);
                    hashMap.put("err_msg", "saveToPhotosAlbum:ok");
                    q5Var.a(null, new org.json.JSONObject(hashMap));
                    outputStream2 = outputStream;
                } catch (java.io.FileNotFoundException unused9) {
                    q5Var.a("saveToPhotosAlbum fail, file not found", null);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                    return;
                } catch (java.lang.Exception unused10) {
                    q5Var.a("saveToPhotosAlbum fail, exception", null);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                    return;
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(u6Var);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream2);
        } catch (java.lang.Throwable th10) {
            th = th10;
            u6Var2 = bitmap;
            closeable2 = closeable;
        }
    }
}
