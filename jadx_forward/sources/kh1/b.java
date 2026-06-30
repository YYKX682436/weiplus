package kh1;

/* loaded from: classes13.dex */
public abstract class b {
    public static kh1.e a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncodeFactory", "createEncodeByType:%s", str);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.d0.a(str)) {
            return null;
        }
        if ("aac".equalsIgnoreCase(str)) {
            return new kh1.a();
        }
        if ("mp3".equalsIgnoreCase(str)) {
            return new kh1.f();
        }
        if ("wav".equalsIgnoreCase(str)) {
            return new kh1.i();
        }
        if ("pcm".equalsIgnoreCase(str)) {
            return new kh1.h();
        }
        if ("opus".equalsIgnoreCase(str)) {
            return new kh1.g();
        }
        return null;
    }
}
