package lp;

/* loaded from: classes7.dex */
public final class l implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401766a = 0;

    static {
        q25.b.b(new lp.l(), "//testnospace");
    }

    public static boolean b(android.content.Context context) {
        java.io.File file = new java.io.File(context.getCacheDir(), ".testnospace");
        if (!file.exists()) {
            return false;
        }
        file.delete();
        return true;
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        boolean z17 = false;
        try {
            if (new java.io.File(context.getCacheDir(), ".testnospace").createNewFile()) {
                z17 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoSpaceTest", "Fail to touch nospace marker file.");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NoSpaceTest", th6, "[-] Fail to touch nospace marker file.", new java.lang.Object[0]);
        }
        if (z17) {
            db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Success.");
        } else {
            db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Failure.");
        }
        return true;
    }
}
