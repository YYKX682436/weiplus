package b83;

/* loaded from: classes11.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.io.File f18339a = new java.io.File(lp0.b.e(), "patch_ver_history.bin");

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18340b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f18341c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f18342d = 0;

    public static void a() {
        java.io.DataInputStream dataInputStream;
        java.lang.Throwable th6;
        java.io.DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new java.io.DataInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(f18339a)));
            try {
                f18341c = dataInputStream.readInt();
                f18342d = dataInputStream.readInt();
            } catch (java.io.FileNotFoundException unused) {
                dataInputStream2 = dataInputStream;
                try {
                    f18341c = java.lang.Integer.decode(lp0.a.f320249c).intValue();
                    int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
                    f18342d = i17;
                    b(f18341c, i17);
                    com.tencent.mm.sdk.platformtools.t8.v1(dataInputStream2);
                    return;
                } catch (java.lang.Throwable th7) {
                    dataInputStream = dataInputStream2;
                    th = th7;
                    com.tencent.mm.sdk.platformtools.t8.v1(dataInputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                try {
                    com.tencent.mm.app.p5.d("MicroMsg.TinkerRollbackStatistic", th6, "[-] Fail to load base and patch clientversion.", new java.lang.Object[0]);
                    f18341c = java.lang.Integer.decode(lp0.a.f320249c).intValue();
                    f18342d = com.tencent.mm.sdk.platformtools.z.f193112h;
                    com.tencent.mm.sdk.platformtools.t8.v1(dataInputStream);
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    com.tencent.mm.sdk.platformtools.t8.v1(dataInputStream);
                    throw th;
                }
            }
        } catch (java.io.FileNotFoundException unused2) {
        } catch (java.lang.Throwable th10) {
            dataInputStream = null;
            th6 = th10;
        }
        com.tencent.mm.sdk.platformtools.t8.v1(dataInputStream);
    }

    public static void b(int i17, int i18) {
        java.io.File file = f18339a;
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
                com.tencent.mm.sdk.platformtools.t8.v1(dataOutputStream2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                dataOutputStream = dataOutputStream2;
                try {
                    com.tencent.mm.app.p5.d("MicroMsg.TinkerRollbackStatistic", th, "[-] Fail to store base clientversion[%s] and patch clientversion[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                } finally {
                    com.tencent.mm.sdk.platformtools.t8.v1(dataOutputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
