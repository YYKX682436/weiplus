package t23;

/* loaded from: classes10.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f496800a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f496801b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.SparseArray f496802c;

    /* renamed from: d, reason: collision with root package name */
    public android.util.SparseArray f496803d;

    /* renamed from: e, reason: collision with root package name */
    public int f496804e;

    public t0() {
        long j17;
        this.f496800a = 5;
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (defaultSharedPreferences.getInt("com.tencent.mm.plugin.gallery.cache.cache-up-to-date", 0) == 0) {
            defaultSharedPreferences.edit().putInt("com.tencent.mm.plugin.gallery.cache.cache-up-to-date", 1).apply();
            java.lang.String str = lp0.b.D() + "diskcache";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiskCache", str);
            com.p314xaae8f345.mm.vfs.w6.f(str);
        }
        try {
            android.os.StatFs statFs = new android.os.StatFs(lp0.b.e0());
            j17 = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (java.lang.Exception unused) {
            j17 = 0;
        }
        int i17 = (int) (((((float) j17) / 1024.0f) / 1024.0f) / 1024.0f);
        if (i17 < 64) {
            this.f496800a = 5;
        } else if (i17 < 128) {
            this.f496800a = 10;
        }
        int i18 = android.preference.PreferenceManager.getDefaultSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getInt("com.tencent.mm.plugin.gallery.cache.cache-file-num", 0);
        if (i18 == 0 || i18 != this.f496800a) {
            java.lang.String e17 = e();
            if (e17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiskCache", "cache path: %s.", e17);
                com.p314xaae8f345.mm.vfs.w6.f(e17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "shared storage is not currently available.");
            }
        }
        android.preference.PreferenceManager.getDefaultSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).edit().putInt("com.tencent.mm.plugin.gallery.cache.cache-file-num", this.f496800a).apply();
        java.lang.String e18 = e();
        if (e18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiskCache", "use old dir!!!");
            e18 = lp0.b.D() + "diskcache";
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e18) ? new com.p314xaae8f345.mm.vfs.r6(e18) : null;
        if (r6Var == null) {
            throw new java.lang.IllegalArgumentException("save dir is null");
        }
        if (!r6Var.y()) {
            r6Var.J();
            r6Var.o();
        }
        this.f496801b = r6Var;
        this.f496803d = new android.util.SparseArray();
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "want close %s fail: %s", closeable.getClass().getName(), e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiskCache", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final void b() {
        android.util.SparseArray sparseArray = this.f496802c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return;
        }
        for (int i17 = 0; i17 < this.f496802c.size(); i17++) {
            a((java.io.RandomAccessFile) this.f496802c.valueAt(i17));
        }
        this.f496802c.clear();
    }

    public final void c(int i17) {
        android.util.SparseArray sparseArray = this.f496802c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f496802c == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DiskCache", "file map is invalid, is null? [%s]", objArr);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f496801b;
        if (i17 < 0) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l("cache.idx", false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str = z7Var.f294812f;
                z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str + '/' + l17, z7Var.f294813g, z7Var.f294814h);
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
            if (m17.a()) {
                m17.f294799a.d(m17.f294800b);
            }
            this.f496803d.clear();
        } else {
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            for (int i18 = 0; i18 < this.f496803d.size(); i18++) {
                r45.mz3 mz3Var = (r45.mz3) this.f496803d.valueAt(i18);
                if (mz3Var.f462475g != i17) {
                    sparseArray2.put(this.f496803d.keyAt(i18), mz3Var);
                }
            }
            this.f496803d = sparseArray2;
            i();
        }
        if (i17 >= 0) {
            a((java.io.Closeable) this.f496802c.get(i17));
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(f(i17), false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var2 = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
            if (l18 != null && !l18.isEmpty()) {
                java.lang.String str2 = z7Var2.f294812f;
                z7Var2 = new com.p314xaae8f345.mm.vfs.z7(z7Var2.f294810d, z7Var2.f294811e, str2 + '/' + l18, z7Var2.f294813g, z7Var2.f294814h);
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var2, null);
            if (m18.a()) {
                m18.f294799a.d(m18.f294800b);
                return;
            }
            return;
        }
        b();
        int i19 = 0;
        while (true) {
            int i27 = this.f496800a;
            if (i19 >= i27) {
                return;
            }
            java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(f(i27), false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var3 = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
            if (l19 != null && !l19.isEmpty()) {
                java.lang.String str3 = z7Var3.f294812f;
                z7Var3 = new com.p314xaae8f345.mm.vfs.z7(z7Var3.f294810d, z7Var3.f294811e, str3 + '/' + l19, z7Var3.f294813g, z7Var3.f294814h);
            }
            com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var3, null);
            if (m19.a()) {
                m19.f294799a.d(m19.f294800b);
            }
            i19++;
        }
    }

    public android.graphics.Bitmap d(int i17) {
        android.util.SparseArray sparseArray = this.f496802c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "want to get bitmap, but data file is null");
            return null;
        }
        r45.mz3 mz3Var = (r45.mz3) this.f496803d.get(i17);
        if (mz3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DiskCache", "oh!!! indexNode is null!!!");
            return null;
        }
        try {
            byte[] bArr = new byte[mz3Var.f462474f];
            java.io.RandomAccessFile randomAccessFile = (java.io.RandomAccessFile) this.f496802c.get(mz3Var.f462475g);
            randomAccessFile.seek(mz3Var.f462473e);
            randomAccessFile.read(bArr, 0, mz3Var.f462474f);
            android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
            if (G != null) {
                G.getWidth();
                G.getHeight();
            } else {
                this.f496803d.remove(i17);
            }
            return G;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DiskCache", "read data fail, key[%d]: %s", java.lang.Integer.valueOf(i17), th6.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiskCache", th6, "", new java.lang.Object[0]);
            this.f496803d.remove(i17);
            return null;
        }
    }

    public final java.lang.String e() {
        try {
            return com.p314xaae8f345.mm.vfs.r6.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir()).o() + "/imgcache";
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String f(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache.data");
        java.lang.String str = "";
        if (i17 != 0) {
            str = "" + i17;
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final void g(int i17) {
        try {
            android.util.SparseArray sparseArray = this.f496802c;
            com.p314xaae8f345.mm.vfs.r6 r6Var = this.f496801b;
            if (sparseArray == null) {
                this.f496802c = new android.util.SparseArray();
                for (int i18 = 0; i18 < this.f496800a; i18++) {
                    this.f496802c.put(i18, com.p314xaae8f345.mm.vfs.w6.B(r6Var + "/" + f(i18), true));
                }
                return;
            }
            if (i17 >= 0) {
                java.io.RandomAccessFile B = com.p314xaae8f345.mm.vfs.w6.B(r6Var + "/" + f(i17), true);
                a((java.io.Closeable) this.f496802c.get(i17));
                this.f496802c.put(i17, B);
                return;
            }
            b();
            for (int i19 = 0; i19 < this.f496800a; i19++) {
                this.f496802c.put(i19, com.p314xaae8f345.mm.vfs.w6.B(r6Var + "/" + f(i19), true));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "load data file error: %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiskCache", e17, "", new java.lang.Object[0]);
            this.f496802c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public void h(int i17, android.graphics.Bitmap bitmap) {
        android.util.SparseArray sparseArray = this.f496802c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f496802c != null ? 0 : 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "want to put bitmap, but data file is invalid, is null?[%s]", objArr);
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Boolean.valueOf(bitmap != null ? 0 : 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "put bmp, value error, bmp is null? [%s]", objArr2);
            return;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        android.util.SparseArray sparseArray2 = this.f496802c;
        int i18 = -1;
        if (sparseArray2 != null && sparseArray2.size() > 0) {
            android.util.SparseArray sparseArray3 = this.f496802c;
            if (sparseArray3 != null && sparseArray3.size() > 0) {
                int i19 = 0;
                while (true) {
                    try {
                        if (i19 >= this.f496802c.size()) {
                            break;
                        }
                        java.io.RandomAccessFile randomAccessFile = (java.io.RandomAccessFile) this.f496802c.valueAt(i19);
                        randomAccessFile.length();
                        if (randomAccessFile.length() < 52428800) {
                            i18 = i19;
                            break;
                        }
                        i19++;
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiskCache", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            if (i18 < 0) {
                int i27 = this.f496804e + 1;
                i18 = i27 >= this.f496800a ? 0 : i27;
                c(i18);
                g(i18);
            }
        }
        if (i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "impossible!!! put bmp, file suffix < 0");
            return;
        }
        r45.mz3 mz3Var = (r45.mz3) this.f496803d.get(i17);
        if (mz3Var == null) {
            mz3Var = new r45.mz3();
            mz3Var.f462472d = i17;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            java.lang.System.currentTimeMillis();
            java.io.RandomAccessFile randomAccessFile2 = (java.io.RandomAccessFile) this.f496802c.get(i18);
            mz3Var.f462473e = randomAccessFile2.length();
            mz3Var.f462475g = i18;
            mz3Var.f462474f = byteArrayOutputStream.size();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            randomAccessFile2.seek(mz3Var.f462473e);
            randomAccessFile2.write(byteArray);
            this.f496804e = i18;
            java.lang.System.currentTimeMillis();
            this.f496803d.put(i17, mz3Var);
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void i() {
        r45.mz3 mz3Var;
        r45.lz3 lz3Var = new r45.lz3();
        for (int i17 = 0; i17 < this.f496803d.size(); i17++) {
            try {
                mz3Var = (r45.mz3) this.f496803d.valueAt(i17);
            } catch (java.lang.ClassCastException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiskCache", e17, "saveIndex ClassCastException.", new java.lang.Object[0]);
                mz3Var = null;
            }
            if (mz3Var != null) {
                lz3Var.f461530d.add(mz3Var);
                int i18 = mz3Var.f462472d;
            }
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W1(new com.p314xaae8f345.mm.vfs.r6(this.f496801b, "cache.idx").o(), lz3Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "save index data error: %s", e18.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiskCache", e18, "", new java.lang.Object[0]);
        }
    }
}
