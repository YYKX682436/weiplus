package f11;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static int f340087a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f340088b = "";

    public static int a() {
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        java.io.InputStream inputStream = null;
        try {
            try {
                java.lang.String b17 = b();
                com.p314xaae8f345.mm.vfs.z7 a17 = b17 == null ? null : com.p314xaae8f345.mm.vfs.z7.a(b17);
                if (a17 == null) {
                    z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l("config.conf", false, false), null, null);
                } else {
                    z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a17.f294812f + "/config.conf", false, false), a17.f294813g, a17.f294814h);
                }
                inputStream = com.p314xaae8f345.mm.vfs.w6.D(z7Var, com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null));
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                java.lang.String str = "";
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return new org.json.JSONObject(str).getInt("version");
                    }
                    str = str + readLine;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiStoreExportLogic", e17, e17.getMessage(), new java.lang.Object[0]);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                return 1;
            }
        } finally {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
        }
    }

    public static java.lang.String b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f340088b)) {
            f340088b = lp0.b.h();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f340088b, "emoji/res");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o();
    }

    public static void c(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.io.InputStream inputStream;
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, ".nomedia");
        boolean z17 = false;
        if (!r6Var2.m()) {
            try {
                r6Var2.k();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiStoreExportLogic", e17, "create nomedia file error", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var, "emoji_template.zip");
        java.lang.String o17 = r6Var3.o();
        java.io.OutputStream outputStream = null;
        try {
            inputStream = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("emoji_template.zip");
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiStoreExportLogic", e18, "", new java.lang.Object[0]);
            inputStream = null;
        }
        if (inputStream == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStoreExportLogic", "file inputStream not found");
        } else {
            com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(o17));
            if (r6Var4.m()) {
                r6Var4.l();
            }
            r6Var4.s().J();
            try {
                outputStream = com.p314xaae8f345.mm.vfs.w6.H(r6Var4);
            } catch (java.io.FileNotFoundException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiStoreExportLogic", e19, "", new java.lang.Object[0]);
            }
            if (outputStream != null) {
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                outputStream.write(bArr, 0, read);
                            }
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                        z17 = true;
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                        throw th6;
                    }
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiStoreExportLogic", e27, "", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                }
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreExportLogic", "copy template file from asset fail %s", r6Var3.o());
            return;
        }
        int Q = com.p314xaae8f345.mm.vfs.w6.Q(r6Var3.o(), r6Var3.r());
        if (Q >= 0) {
            f340087a = a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreExportLogic", "Unzip Path%s version=%d", r6Var3.r(), java.lang.Integer.valueOf(f340087a));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStoreExportLogic", "unzip fail, ret = " + Q + ", zipFilePath = " + r6Var3.o() + ", unzipPath = " + r6Var3.r());
    }
}
