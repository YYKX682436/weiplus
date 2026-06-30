package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f;

/* renamed from: com.tencent.thumbplayer.adapter.TPPlaybackInfo */
/* loaded from: classes16.dex */
public class C26130x49ae05 {
    private static java.lang.String TAG = "TPPlaybackInfo";

    /* renamed from: audioBitRate */
    private long f49891x9b4b0ed7;

    /* renamed from: audioCodec */
    private java.lang.String f49892x5acc79e0;

    /* renamed from: audioProfile */
    private int f49893x8f00a8f3;

    /* renamed from: channels */
    private int f49894x556423d0;

    /* renamed from: containerFormat */
    private java.lang.String f49895x2210bd8;

    /* renamed from: currentPlayClipNo */
    private int f49896x7aea2fde;

    /* renamed from: currentPositionMs */
    private long f49897x8a9ed308;

    /* renamed from: definition */
    private java.lang.String f49898xc3893553;

    /* renamed from: demuxerOffset */
    private long f49899xd643084f = -1;

    /* renamed from: durationMs */
    private long f49900x4967425a;

    /* renamed from: height */
    private long f49901xb7389127;

    /* renamed from: playableDurationMs */
    private long f49902x990e2b88;

    /* renamed from: sampleRate */
    private long f49903x88751aa;

    /* renamed from: videoBitRate */
    private long f49904xf1138292;

    /* renamed from: videoCodec */
    private java.lang.String f49905x9e04a05b;

    /* renamed from: videoCodedId */
    private int f49906x2f5e0297;

    /* renamed from: videoColorSpace */
    private int f49907x958eca3e;

    /* renamed from: videoLevel */
    private int f49908x9e7f2bc9;

    /* renamed from: videoProfile */
    private int f49909xe4c91cae;

    /* renamed from: width */
    private long f49910x6be2dc6;

    /* renamed from: parseInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 m100262x92b86201(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05();
        }
        java.lang.String[] split = str.split("\n");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < split.length; i17++) {
            if (!split[i17].startsWith("#") && split[i17].contains("=")) {
                java.lang.String[] split2 = split[i17].split("=");
                if (split2 == null || split2.length < 2) {
                    java.lang.String str2 = TAG;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseInfo, ");
                    sb6.append((split2 == null || split2.length < 1) ? "param null, " : split2[0]);
                    sb6.append("is empty");
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(str2, sb6.toString());
                } else {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05();
        if (hashMap.containsKey("ContainerFormat")) {
            c26130x49ae05.m100288x1d597716((java.lang.String) hashMap.get("ContainerFormat"));
        }
        if (hashMap.containsKey("VideoCodec")) {
            c26130x49ae05.m100298xba69a65d((java.lang.String) hashMap.get("VideoCodec"));
        }
        if (hashMap.containsKey("AudioCodec")) {
            c26130x49ae05.m100285x77317fe2((java.lang.String) hashMap.get("AudioCodec"));
        }
        if (hashMap.containsKey("Width")) {
            c26130x49ae05.m100303x53e9ee84(java.lang.Long.valueOf((java.lang.String) hashMap.get("Width")).longValue());
        }
        if (hashMap.containsKey("Height")) {
            c26130x49ae05.m100294xf84e829(java.lang.Long.valueOf((java.lang.String) hashMap.get("Height")).longValue());
        }
        if (hashMap.containsKey("VideoBitRate")) {
            c26130x49ae05.m100297x884f1014(java.lang.Long.valueOf((java.lang.String) hashMap.get("VideoBitRate")).longValue());
        }
        if (hashMap.containsKey("AudioBitRate")) {
            c26130x49ae05.m100284x32869c59(java.lang.Long.valueOf((java.lang.String) hashMap.get("AudioBitRate")).longValue());
        }
        if (hashMap.containsKey("SampleRate")) {
            c26130x49ae05.m100296x24ec57ac(java.lang.Long.valueOf((java.lang.String) hashMap.get("SampleRate")).longValue());
        }
        if (hashMap.containsKey("Channels")) {
            c26130x49ae05.m100287xcbf6c252(java.lang.Integer.valueOf((java.lang.String) hashMap.get("Channels")).intValue());
        }
        if (hashMap.containsKey("Definition")) {
            c26130x49ae05.m100291xdfee3b55((java.lang.String) hashMap.get("Definition"));
        }
        return c26130x49ae05;
    }

    /* renamed from: clear */
    public void m100263x5a5b64d() {
        this.f49895x2210bd8 = null;
        this.f49905x9e04a05b = null;
        this.f49909xe4c91cae = 0;
        this.f49906x2f5e0297 = 0;
        this.f49910x6be2dc6 = 0L;
        this.f49901xb7389127 = 0L;
        this.f49904xf1138292 = 0L;
        this.f49892x5acc79e0 = null;
        this.f49893x8f00a8f3 = 0;
        this.f49891x9b4b0ed7 = 0L;
        this.f49894x556423d0 = 0;
        this.f49903x88751aa = 0L;
        this.f49907x958eca3e = 2;
        this.f49908x9e7f2bc9 = 0;
        this.f49897x8a9ed308 = 0L;
        this.f49900x4967425a = 0L;
        this.f49902x990e2b88 = 0L;
        this.f49896x7aea2fde = 0;
        this.f49899xd643084f = -1L;
    }

    /* renamed from: getAudioBitRate */
    public long m100264xfc3da14d() {
        return this.f49891x9b4b0ed7;
    }

    /* renamed from: getAudioCodec */
    public java.lang.String m100265x490d31d6() {
        return this.f49892x5acc79e0;
    }

    /* renamed from: getAudioProfile */
    public int m100266xeff33b69() {
        return this.f49893x8f00a8f3;
    }

    /* renamed from: getChannels */
    public int m100267xd13e6146() {
        return this.f49894x556423d0;
    }

    /* renamed from: getContainerFormat */
    public java.lang.String m100268xe682dda2() {
        return this.f49895x2210bd8;
    }

    /* renamed from: getCurrentPlayClipNo */
    public int m100269xce1eb728() {
        return this.f49896x7aea2fde;
    }

    /* renamed from: getCurrentPositionMs */
    public long m100270xddd35a52() {
        return this.f49897x8a9ed308;
    }

    /* renamed from: getDefinition */
    public java.lang.String m100271xb1c9ed49() {
        return this.f49898xc3893553;
    }

    /* renamed from: getDemuxerOffset */
    public long m100272x93a2c499() {
        return this.f49899xd643084f;
    }

    /* renamed from: getDurationMs */
    public long m100273x37a7fa50() {
        return this.f49900x4967425a;
    }

    /* renamed from: getHeight */
    public long m100274x1c4fb41d() {
        return this.f49901xb7389127;
    }

    /* renamed from: getPlayableDurationMs */
    public long m100275xac6a8d7e() {
        return this.f49902x990e2b88;
    }

    /* renamed from: getSampleRate */
    public long m100276xf6c809a0() {
        return this.f49903x88751aa;
    }

    /* renamed from: getVideoBitRate */
    public long m100277x52061508() {
        return this.f49904xf1138292;
    }

    /* renamed from: getVideoCodec */
    public java.lang.String m100278x8c455851() {
        return this.f49905x9e04a05b;
    }

    /* renamed from: getVideoCodedId */
    public int m100279x9050950d() {
        return this.f49906x2f5e0297;
    }

    /* renamed from: getVideoColorSpace */
    public int m100280x79f09c08() {
        return this.f49907x958eca3e;
    }

    /* renamed from: getVideoLevel */
    public int m100281x8cbfe3bf() {
        return this.f49908x9e7f2bc9;
    }

    /* renamed from: getVideoProfile */
    public int m100282x45bbaf24() {
        return this.f49909xe4c91cae;
    }

    /* renamed from: getWidth */
    public long m100283x755bd410() {
        return this.f49910x6be2dc6;
    }

    /* renamed from: setAudioBitRate */
    public void m100284x32869c59(long j17) {
        this.f49891x9b4b0ed7 = j17;
    }

    /* renamed from: setAudioCodec */
    public void m100285x77317fe2(java.lang.String str) {
        this.f49892x5acc79e0 = str;
    }

    /* renamed from: setAudioProfile */
    public void m100286x263c3675(int i17) {
        this.f49893x8f00a8f3 = i17;
    }

    /* renamed from: setChannels */
    public void m100287xcbf6c252(int i17) {
        this.f49894x556423d0 = i17;
    }

    /* renamed from: setContainerFormat */
    public void m100288x1d597716(java.lang.String str) {
        this.f49895x2210bd8 = str;
    }

    /* renamed from: setCurrentPlayClipNo */
    public void m100289xa9b4c39c(int i17) {
        this.f49896x7aea2fde = i17;
    }

    /* renamed from: setCurrentPositionMs */
    public void m100290xb96966c6(long j17) {
        this.f49897x8a9ed308 = j17;
    }

    /* renamed from: setDefinition */
    public void m100291xdfee3b55(java.lang.String str) {
        this.f49898xc3893553 = str;
    }

    /* renamed from: setDemuxerOffset */
    public void m100292x26792b0d(long j17) {
        this.f49899xd643084f = j17;
    }

    /* renamed from: setDurationMs */
    public void m100293x65cc485c(long j17) {
        this.f49900x4967425a = j17;
    }

    /* renamed from: setHeight */
    public void m100294xf84e829(long j17) {
        this.f49901xb7389127 = j17;
    }

    /* renamed from: setPlayableDurationMs */
    public void m100295x43960f8a(long j17) {
        this.f49902x990e2b88 = j17;
    }

    /* renamed from: setSampleRate */
    public void m100296x24ec57ac(long j17) {
        this.f49903x88751aa = j17;
    }

    /* renamed from: setVideoBitRate */
    public void m100297x884f1014(long j17) {
        this.f49904xf1138292 = j17;
    }

    /* renamed from: setVideoCodec */
    public void m100298xba69a65d(java.lang.String str) {
        this.f49905x9e04a05b = str;
    }

    /* renamed from: setVideoCodedId */
    public void m100299xc6999019(int i17) {
        this.f49906x2f5e0297 = i17;
    }

    /* renamed from: setVideoColorSpace */
    public void m100300xb0c7357c(int i17) {
        this.f49907x958eca3e = i17;
    }

    /* renamed from: setVideoLevel */
    public void m100301xbae431cb(int i17) {
        this.f49908x9e7f2bc9 = i17;
    }

    /* renamed from: setVideoProfile */
    public void m100302x7c04aa30(int i17) {
        this.f49909xe4c91cae = i17;
    }

    /* renamed from: setWidth */
    public void m100303x53e9ee84(long j17) {
        this.f49910x6be2dc6 = j17;
    }
}
