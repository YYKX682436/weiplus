package lp;

/* loaded from: classes11.dex */
public class j implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401764a = 0;

    static {
        q25.b.b(new lp.j(), "//hotpatch");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        char c17 = 65535;
        switch (str2.hashCode()) {
            case 3237038:
                if (str2.equals("info")) {
                    c17 = 0;
                    break;
                }
                break;
            case 93029230:
                if (str2.equals("apply")) {
                    c17 = 1;
                    break;
                }
                break;
            case 94627080:
                if (str2.equals("check")) {
                    c17 = 2;
                    break;
                }
                break;
            case 94746189:
                if (str2.equals("clear")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                lp.j.class.getClassLoader();
                return true;
            case 1:
                java.lang.String str3 = strArr.length < 3 ? "/data/local/tmp/test.apk" : strArr[2];
                if (!ak0.o.f()) {
                    ak0.n.a();
                }
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 300000));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5644x27155247 c5644x27155247 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5644x27155247();
                c5644x27155247.f135972g.f89070e = str3;
                c5644x27155247.e();
                return true;
            case 2:
                if (strArr.length < 3) {
                    return true;
                }
                java.lang.String str4 = strArr[2];
                if (!str4.startsWith("/")) {
                    str4 = context.getCacheDir().getParent() + "/app_dex/" + str4;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandTestHotPatches", "hotpatch check patch file %s", str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(new java.io.File(str4).length() == 32);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandTestHotPatches", "hotpatch check md5, passed=%b", objArr);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
                return true;
            case 3:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5644x27155247 c5644x271552472 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5644x27155247();
                c5644x271552472.f135972g.f89071f = 1;
                c5644x271552472.e();
                return true;
            default:
                return true;
        }
    }
}
