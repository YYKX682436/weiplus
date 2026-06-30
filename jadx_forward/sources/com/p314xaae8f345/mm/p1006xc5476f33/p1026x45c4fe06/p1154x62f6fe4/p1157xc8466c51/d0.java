package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes13.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.c0 f167336a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.b0();

    public static boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return "aac".equalsIgnoreCase(str) || "mp3".equalsIgnoreCase(str) || "wav".equalsIgnoreCase(str) || "pcm".equalsIgnoreCase(str) || "opus".equalsIgnoreCase(str);
    }

    public static boolean b(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordUtil", "new audio file");
                return r6Var.k();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordUtil", e17, "prepareCacheFile", new java.lang.Object[0]);
                return false;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordUtil", e18, "prepareCacheFile", new java.lang.Object[0]);
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordUtil", "delete audio file");
        r6Var.l();
        try {
            return r6Var.k();
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordUtil", e19, "prepareCacheFile", new java.lang.Object[0]);
            return false;
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordUtil", e27, "prepareCacheFile", new java.lang.Object[0]);
            return false;
        }
    }
}
