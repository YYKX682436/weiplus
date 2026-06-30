package b00;

@j95.b
/* loaded from: classes8.dex */
public final class u extends i95.w implements c00.c3 {
    public java.lang.String Ai(java.lang.String str, long j17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("EcsGMsgIdService", "gen gmsgid with null sns id");
            return "";
        }
        bw5.b7 b7Var = new bw5.b7();
        b7Var.f25550h = str;
        boolean[] zArr = b7Var.f25551i;
        zArr[6] = true;
        b7Var.f25549g = j17;
        zArr[5] = true;
        java.lang.String encodeToString = android.util.Base64.encodeToString(b7Var.toByteArray(), 2);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public java.lang.String wi(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("EcsGMsgIdService", "gen gmsgid with null msg info");
            return "";
        }
        java.lang.String c17 = g95.e0.c(f9Var);
        if (c17 == null || c17.length() == 0) {
            com.tencent.mars.xlog.Log.w("EcsGMsgIdService", "gen gmsgid, to user is null");
            return "";
        }
        java.lang.String str = c17 + '_' + f9Var.I0();
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        kotlin.jvm.internal.o.d(digest);
        java.lang.String concat = "uniqver1_".concat(kz5.z.a0(digest, "", null, null, 0, null, b00.t.f16771d, 30, null));
        bw5.b7 b7Var = new bw5.b7();
        b7Var.f25548f = concat;
        boolean[] zArr = b7Var.f25551i;
        zArr[4] = true;
        b7Var.f25549g = f9Var.getCreateTime() / 1000;
        zArr[5] = true;
        java.lang.String encodeToString = android.util.Base64.encodeToString(b7Var.toByteArray(), 2);
        kotlin.jvm.internal.o.d(encodeToString);
        return encodeToString;
    }
}
