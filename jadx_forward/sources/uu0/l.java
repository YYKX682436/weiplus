package uu0;

/* loaded from: classes5.dex */
public abstract class l {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(b());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audio");
        java.lang.String str3 = "";
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("" + str2));
        if (!android.text.TextUtils.isEmpty(str)) {
            if ("aac".equalsIgnoreCase(str)) {
                str3 = ".m4a";
            } else if ("mp3".equalsIgnoreCase(str)) {
                str3 = ".mp3";
            } else if ("wav".equalsIgnoreCase(str)) {
                str3 = ".wav";
            } else if ("silk".equalsIgnoreCase(str)) {
                str3 = ".silk";
            }
        }
        sb6.append(str3);
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, sb6.toString());
        r6Var2.n();
        return r6Var2.o();
    }

    public static java.lang.String b() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("MaasCache") + "/MovieComposing/"), "AudioRecord");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o();
    }

    public static boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return "aac".equalsIgnoreCase(str) || "mp3".equalsIgnoreCase(str) || "wav".equalsIgnoreCase(str) || "pcm".equalsIgnoreCase(str);
    }

    public static boolean d(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordUtil", "new audio file");
                return r6Var.k();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordUtil", e17, "prepareCacheFile", new java.lang.Object[0]);
                return false;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordUtil", e18, "prepareCacheFile", new java.lang.Object[0]);
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordUtil", "delete audio file");
        r6Var.l();
        try {
            return r6Var.k();
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordUtil", e19, "prepareCacheFile", new java.lang.Object[0]);
            return false;
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordUtil", e27, "prepareCacheFile", new java.lang.Object[0]);
            return false;
        }
    }
}
