package lh1;

/* loaded from: classes15.dex */
public abstract class e {
    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c) {
        return !android.text.TextUtils.isEmpty(c12420xb1146e9c.f167372h) && c12420xb1146e9c.f167368d >= 0 && c12420xb1146e9c.f167371g > 0 && c12420xb1146e9c.f167369e > 0 && c12420xb1146e9c.f167370f > 0;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.RecordParamCompatibility", "recordParam duration:%d, numberOfChannels:%d, sampleRate:%d, encodeBitRate:%d", java.lang.Integer.valueOf(c12420xb1146e9c.f167368d), java.lang.Integer.valueOf(c12420xb1146e9c.f167370f), java.lang.Integer.valueOf(c12420xb1146e9c.f167369e), java.lang.Integer.valueOf(c12420xb1146e9c.f167371g));
        int i17 = c12420xb1146e9c.f167368d;
        if (i17 <= 0) {
            c12420xb1146e9c.f167368d = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        } else if (i17 >= 600000) {
            c12420xb1146e9c.f167368d = 600000;
        }
        int i18 = c12420xb1146e9c.f167370f;
        if (i18 < 1 && i18 > 2) {
            c12420xb1146e9c.f167370f = 2;
        }
        int i19 = c12420xb1146e9c.f167369e;
        if (i19 > 48000) {
            c12420xb1146e9c.f167369e = 48000;
        } else if (i19 < 8000) {
            c12420xb1146e9c.f167369e = 8000;
        }
        int i27 = c12420xb1146e9c.f167371g;
        if (i27 > 320000) {
            c12420xb1146e9c.f167371g = 320000;
        } else if (i27 < 16000) {
            c12420xb1146e9c.f167371g = 16000;
        }
    }
}
