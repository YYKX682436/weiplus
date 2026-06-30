package b83;

/* loaded from: classes11.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.io.File f99872a = new java.io.File(lp0.b.e(), "patch_ver_history.bin");

    /* renamed from: b, reason: collision with root package name */
    public static boolean f99873b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f99874c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f99875d = 0;

    public static void a() {
        java.io.DataInputStream dataInputStream;
        java.lang.Throwable th6;
        java.io.DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new java.io.DataInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(f99872a)));
            try {
                f99874c = dataInputStream.readInt();
                f99875d = dataInputStream.readInt();
            } catch (java.io.FileNotFoundException unused) {
                dataInputStream2 = dataInputStream;
                try {
                    f99874c = java.lang.Integer.decode(lp0.a.f401782c).intValue();
                    int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
                    f99875d = i17;
                    b(f99874c, i17);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataInputStream2);
                    return;
                } catch (java.lang.Throwable th7) {
                    dataInputStream = dataInputStream2;
                    th = th7;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataInputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                try {
                    com.p314xaae8f345.mm.app.p5.d("MicroMsg.TinkerRollbackStatistic", th6, "[-] Fail to load base and patch clientversion.", new java.lang.Object[0]);
                    f99874c = java.lang.Integer.decode(lp0.a.f401782c).intValue();
                    f99875d = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataInputStream);
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataInputStream);
                    throw th;
                }
            }
        } catch (java.io.FileNotFoundException unused2) {
        } catch (java.lang.Throwable th10) {
            dataInputStream = null;
            th6 = th10;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataInputStream);
    }

    public static void b(int i17, int i18) {
        java.io.File file = f99872a;
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        java.io.DataOutputStream dataOutputStream = null;
        try {
            java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(file)));
            try {
                dataOutputStream2.writeInt(i17);
                dataOutputStream2.writeInt(i18);
                dataOutputStream2.flush();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataOutputStream2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                dataOutputStream = dataOutputStream2;
                try {
                    com.p314xaae8f345.mm.app.p5.d("MicroMsg.TinkerRollbackStatistic", th, "[-] Fail to store base clientversion[%s] and patch clientversion[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                } finally {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(dataOutputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
