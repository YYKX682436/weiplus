package b00;

@j95.b
/* loaded from: classes8.dex */
public final class u extends i95.w implements c00.c3 {
    public java.lang.String Ai(java.lang.String str, long j17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsGMsgIdService", "gen gmsgid with null sns id");
            return "";
        }
        bw5.b7 b7Var = new bw5.b7();
        b7Var.f107083h = str;
        boolean[] zArr = b7Var.f107084i;
        zArr[6] = true;
        b7Var.f107082g = j17;
        zArr[5] = true;
        java.lang.String encodeToString = android.util.Base64.encodeToString(b7Var.mo14344x5f01b1f6(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public java.lang.String wi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsGMsgIdService", "gen gmsgid with null msg info");
            return "";
        }
        java.lang.String c17 = g95.e0.c(f9Var);
        if (c17 == null || c17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsGMsgIdService", "gen gmsgid, to user is null");
            return "";
        }
        java.lang.String str = c17 + '_' + f9Var.I0();
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(digest);
        java.lang.String concat = "uniqver1_".concat(kz5.z.a0(digest, "", null, null, 0, null, b00.t.f98304d, 30, null));
        bw5.b7 b7Var = new bw5.b7();
        b7Var.f107081f = concat;
        boolean[] zArr = b7Var.f107084i;
        zArr[4] = true;
        b7Var.f107082g = f9Var.mo78012x3fdd41df() / 1000;
        zArr[5] = true;
        java.lang.String encodeToString = android.util.Base64.encodeToString(b7Var.mo14344x5f01b1f6(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
        return encodeToString;
    }
}
