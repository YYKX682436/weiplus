package wo;

/* loaded from: classes12.dex */
public class u0 extends wo.q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f529339g = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final int f529340d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.File f529341e;

    /* renamed from: f, reason: collision with root package name */
    public final wo.v0 f529342f;

    public u0(java.lang.String str, int i17) {
        super(null);
        if (str == null || str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("id is null or empty.");
        }
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("cacheFileCount is less or equal than zero.");
        }
        java.util.HashSet hashSet = (java.util.HashSet) f529339g;
        if (hashSet.contains(str)) {
            throw new java.lang.IllegalArgumentException("name: " + str + " is duplicated.");
        }
        hashSet.add(str);
        java.lang.String uuid = java.util.UUID.nameUUIDFromBytes(str.getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c))).toString();
        this.f529340d = i17;
        wo.v0 v0Var = new wo.v0(str);
        this.f529342f = v0Var;
        synchronized (this) {
            try {
                v0Var.a();
                java.io.File file = new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getParentFile(), ".auth_cache/" + uuid);
                this.f529341e = file;
                if (!file.exists() && !file.mkdirs()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceInfo", "[-] Fail to make base dir: %s", file.getAbsolutePath());
                }
                v0Var.c();
            } catch (java.lang.Throwable th6) {
                this.f529342f.c();
                throw th6;
            }
        }
    }

    @Override // wo.q0
    public synchronized java.lang.String b() {
        try {
            this.f529342f.a();
            if (!this.f529341e.exists()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceInfo", "[-] Base dir does not exist, base cache will return defValue.");
                return null;
            }
            int i17 = this.f529340d;
            int i18 = 0;
            for (int i19 = 0; i19 < this.f529340d; i19++) {
                java.io.File file = new java.io.File(this.f529341e, java.lang.String.valueOf(i19));
                if (file.exists()) {
                    java.lang.String g17 = g(file);
                    if (g17 != null) {
                        return g17;
                    }
                    i18++;
                } else {
                    i17--;
                }
            }
            if (i18 > 0) {
                f(i18 == i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeviceInfo", "[!] Cache missed, base cache will return defValue.");
            return null;
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceInfo", th6, "[-] Exception occurred when fetch value, base cache will return defValue.", new java.lang.Object[0]);
                return null;
            } finally {
                this.f529342f.c();
            }
        }
    }

    @Override // wo.q0
    public synchronized void c(java.lang.String str) {
        int i17;
        try {
            this.f529342f.a();
            if (!this.f529341e.exists()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceInfo", "[-] Base dir does not exist, skip rest logic.");
                e();
                return;
            }
            int i18 = 0;
            int i19 = 0;
            while (true) {
                i17 = this.f529340d;
                if (i18 >= i17) {
                    break;
                }
                java.io.File file = new java.io.File(this.f529341e, java.lang.String.valueOf(i18));
                if (file.isDirectory()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeviceInfo", "[!] Cache file %s is occupied by a directory, try to delete it first.");
                    file.delete();
                }
                if (!h(file, str)) {
                    i19++;
                }
                i18++;
            }
            if (i19 == i17) {
                e();
            }
        } finally {
            this.f529342f.c();
        }
    }

    public void e() {
    }

    public void f(boolean z17) {
    }

    public final java.lang.String g(java.io.File file) {
        java.io.BufferedReader bufferedReader;
        java.io.FileReader fileReader;
        try {
            fileReader = new java.io.FileReader(file);
            try {
                bufferedReader = new java.io.BufferedReader(fileReader);
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (android.text.TextUtils.isEmpty(readLine)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeviceInfo", "[-] Illegal cached data. Maybe reset before.");
                    } else {
                        int lastIndexOf = readLine.lastIndexOf(44);
                        if (lastIndexOf < 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceInfo", "[-] Illegal cached data.");
                        } else {
                            java.lang.String substring = readLine.substring(0, lastIndexOf);
                            java.lang.String substring2 = readLine.substring(lastIndexOf + 1);
                            java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                            crc32.update(substring.getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
                            if (crc32.getValue() == java.lang.Long.parseLong(substring2)) {
                                return substring;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeviceInfo", "[-] crc32 of data mismatch.");
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceInfo", th, "[-] Exception occurred when read from cache file.", new java.lang.Object[0]);
                        return null;
                    } finally {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(fileReader);
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                bufferedReader = null;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            bufferedReader = null;
            fileReader = null;
        }
        return null;
    }

    public final boolean h(java.io.File file, java.lang.String str) {
        java.io.PrintWriter printWriter = null;
        try {
            if (str == null) {
                if (file.exists()) {
                    new java.io.PrintWriter(new java.io.FileWriter(file)).close();
                }
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                return true;
            }
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(new java.io.FileWriter(file));
            try {
                java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                crc32.update(str.getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
                printWriter2.print(str + "," + crc32.getValue());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter2);
                return true;
            } catch (java.lang.Throwable th6) {
                th = th6;
                printWriter = printWriter2;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceInfo", th, "[-] Exception occurred when store value to file: %s", file.getAbsolutePath());
                    return false;
                } finally {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
