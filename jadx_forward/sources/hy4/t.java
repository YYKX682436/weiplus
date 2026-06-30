package hy4;

/* loaded from: classes.dex */
public abstract class t {
    public static android.content.Intent a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new com.p314xaae8f345.mm.vfs.r6(b(str))));
        return intent;
    }

    public static java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.m());
        if (!r6Var.J()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebJSSDKUtil", "mkdirs failed.File is exist = " + r6Var.m());
        }
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebJSSDKUtil", "camera storage path do not exist.(%s)", lp0.b.m());
        }
        java.lang.String str2 = r6Var.o() + "/" + str + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebJSSDKUtil", "get file path from capture file name : %s == %s", str, str2);
        return str2;
    }
}
