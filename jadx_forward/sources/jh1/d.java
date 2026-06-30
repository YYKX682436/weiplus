package jh1;

/* loaded from: classes7.dex */
public abstract class d {
    public static java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.WxaAudioUtils", "getLocalFilePathFromWxaPkg src is empty");
            return str;
        }
        if (lVar.mo50354x59eafec1() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.WxaAudioUtils", "[getLocalFilePathFromWxaPkg]service.getFileSystem() is null");
            return str;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(str);
        if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.WxaAudioUtils", "[getLocalFilePathFromWxaPkg]localFile is null");
            return str;
        }
        java.lang.String o17 = mo49620x1d537609.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.WxaAudioUtils", "getLocalFilePathFromWxaPkg:path:%s", o17);
        return o17;
    }

    public static java.lang.String b(java.lang.String str) {
        byte[] bArr;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(rl.a.d(), "base64" + str.hashCode());
        if (r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.WxaAudioUtils", "base64 file exist!");
            return r6Var.o();
        }
        java.io.OutputStream outputStream = null;
        try {
            bArr = android.util.Base64.decode(str, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("", e17, "writeToFile", new java.lang.Object[0]);
            bArr = null;
        }
        if (bArr != null && bArr.length != 0) {
            try {
                outputStream = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                outputStream.write(bArr);
                try {
                    outputStream.close();
                } catch (java.io.IOException unused) {
                }
                return r6Var.o();
            } catch (java.lang.Exception unused2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th6;
            }
        }
        return "";
    }
}
