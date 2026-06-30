package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f;

/* renamed from: com.tencent.thumbplayer.adapter.TPPlaybackParams */
/* loaded from: classes16.dex */
public class C26131x1fd6491d {
    private static final java.lang.String TAG = "TPPlaybackParams";

    /* renamed from: mAudioGainRatio */
    private float f49911x8ac9ea63;

    /* renamed from: mAudioNormalizeVolumeParams */
    private java.lang.String f49912xfba06d04;

    /* renamed from: mLoopback */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.LoopbackAttribute f49915xab928118;

    /* renamed from: mOutputMute */
    private boolean f49917x90416f07;

    /* renamed from: mSpeedRatio */
    private float f49919x1226c51;

    /* renamed from: mSurfaceObj */
    private java.lang.Object f49921x5da06557;

    /* renamed from: mTpProgramInfo */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36 f49923x6bc611c9;

    /* renamed from: mSurfaceType */
    private int f49922x566ee2da = 0;

    /* renamed from: trackId */
    private int f49926xc060d3c6 = -1;

    /* renamed from: mSubtitleSources */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SubtitleAttribute> f49920x68c2cc53 = new java.util.HashMap(0);

    /* renamed from: mAudioTrackSources */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.AudioTrackAttribute> f49913x7da5adf6 = new java.util.HashMap(0);

    /* renamed from: mDataSource */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26136x85a944c2 f49914x280a54b2 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26136x85a944c2();

    /* renamed from: mOptionalParams */
    private java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> f49916xba3f32d3 = new java.util.HashMap(0);

    /* renamed from: mTpSelectedTypeTrackInfoMap */
    private java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d> f49924xc381c801 = new java.util.HashMap(0);

    /* renamed from: mTpTrackInfoList */
    private java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d> f49925xf257178e = new java.util.ArrayList<>();

    /* renamed from: mSelectTrackAttributes */
    private java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SelectTrackAttribute> f49918xad4bc5f9 = new java.util.ArrayList<>();

    /* renamed from: com.tencent.thumbplayer.adapter.TPPlaybackParams$AudioTrackAttribute */
    /* loaded from: classes16.dex */
    public static class AudioTrackAttribute {

        /* renamed from: audioTrackParams */
        public java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> f49927x95ffdcfb;

        /* renamed from: httpHeader */
        public java.util.Map<java.lang.String, java.lang.String> f49928x24345135;

        /* renamed from: name */
        public java.lang.String f49929x337a8b;
        public java.lang.String url;
    }

    /* renamed from: com.tencent.thumbplayer.adapter.TPPlaybackParams$LoopbackAttribute */
    /* loaded from: classes16.dex */
    public static class LoopbackAttribute {

        /* renamed from: endPositionMs */
        public long f49930x5a7f4bea;

        /* renamed from: isLoopback */
        public boolean f49931x574c80d5;

        /* renamed from: startPositionMs */
        public long f49932xc3950ab1;
    }

    /* renamed from: com.tencent.thumbplayer.adapter.TPPlaybackParams$SelectTrackAttribute */
    /* loaded from: classes16.dex */
    public static class SelectTrackAttribute {

        /* renamed from: opaque */
        public long f49933xc3c20421;

        /* renamed from: trackIndex */
        public int f49934x43ea5e47;

        /* renamed from: trackInfo */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d f49935x2b7b2c99;
    }

    /* renamed from: com.tencent.thumbplayer.adapter.TPPlaybackParams$SubtitleAttribute */
    /* loaded from: classes16.dex */
    public static class SubtitleAttribute {

        /* renamed from: httpHeader */
        public java.util.Map<java.lang.String, java.lang.String> f49936x24345135;

        /* renamed from: mimeType */
        public java.lang.String f49937xad05ed8e;

        /* renamed from: name */
        public java.lang.String f49938x337a8b;
        public java.lang.String url;
    }

    /* renamed from: generateTrackInfoBySubtitleSource */
    private void m100304x9a04294e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f49926xc060d3c6++;
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d = new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d();
        c26201xd4eb4d7d.f51066x2b805725 = 3;
        c26201xd4eb4d7d.f51065x337a8b = str3;
        c26201xd4eb4d7d.f51064x17bd99e5 = false;
        c26201xd4eb4d7d.f51062xaac50094 = true;
        c26201xd4eb4d7d.f51063xf2b76e07 = false;
        this.f49925xf257178e.add(c26201xd4eb4d7d);
    }

    /* renamed from: generateTrackInfoByTrackSource */
    private void m100305xb6b8402b(java.lang.String str, java.lang.String str2) {
        this.f49926xc060d3c6++;
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d = new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d();
        c26201xd4eb4d7d.f51066x2b805725 = 2;
        c26201xd4eb4d7d.f51065x337a8b = str2;
        c26201xd4eb4d7d.f51064x17bd99e5 = false;
        c26201xd4eb4d7d.f51062xaac50094 = true;
        c26201xd4eb4d7d.f51063xf2b76e07 = false;
        this.f49925xf257178e.add(c26201xd4eb4d7d);
    }

    /* renamed from: addAudioTrackSource */
    public void m100306xa28fa651(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.AudioTrackAttribute audioTrackAttribute = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.AudioTrackAttribute();
        audioTrackAttribute.url = str;
        audioTrackAttribute.f49928x24345135 = map;
        audioTrackAttribute.f49929x337a8b = str2;
        audioTrackAttribute.f49927x95ffdcfb = list;
        this.f49913x7da5adf6.put(str, audioTrackAttribute);
        m100305xb6b8402b(str, str2);
    }

    /* renamed from: addOptionalParams */
    public void m100307x3ee04007(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        if (c26182x67c007f1 != null) {
            this.f49916xba3f32d3.put(java.lang.Integer.valueOf(c26182x67c007f1.m101069xb5884f29()), c26182x67c007f1);
        }
    }

    /* renamed from: addSelectedTrackInfo */
    public void m100308x9590159d(int i17, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d) {
        this.f49924xc381c801.put(java.lang.Integer.valueOf(c26201xd4eb4d7d.m101187x2aedc86f()), c26201xd4eb4d7d);
        if (i17 < 0 || i17 >= this.f49925xf257178e.size()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "track Index:" + i17 + " is invalid, trackInfoList size:" + this.f49925xf257178e.size());
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SelectTrackAttribute selectTrackAttribute = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SelectTrackAttribute();
        selectTrackAttribute.f49934x43ea5e47 = i17;
        selectTrackAttribute.f49933xc3c20421 = j17;
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d> it = this.f49925xf257178e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d next = it.next();
            if (next.f51066x2b805725 == c26201xd4eb4d7d.f51066x2b805725) {
                if ((android.text.TextUtils.isEmpty(next.f51065x337a8b) && android.text.TextUtils.isEmpty(c26201xd4eb4d7d.f51065x337a8b)) || next.f51065x337a8b.equals(c26201xd4eb4d7d.f51065x337a8b)) {
                    next.f51064x17bd99e5 = true;
                    selectTrackAttribute.f49935x2b7b2c99 = next;
                } else {
                    next.f51064x17bd99e5 = false;
                }
            }
        }
        this.f49918xad4bc5f9.add(selectTrackAttribute);
    }

    /* renamed from: addSubtitleSource */
    public void m100309x14654554(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SubtitleAttribute subtitleAttribute = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SubtitleAttribute();
        subtitleAttribute.url = str;
        subtitleAttribute.f49936x24345135 = map;
        subtitleAttribute.f49937xad05ed8e = str2;
        subtitleAttribute.f49938x337a8b = str3;
        this.f49920x68c2cc53.put(str, subtitleAttribute);
        m100304x9a04294e(str, str2, str3);
    }

    /* renamed from: audioGainRatio */
    public float m100310x8416e096() {
        return this.f49911x8ac9ea63;
    }

    /* renamed from: audioNormalizeVolumeParams */
    public java.lang.String m100311xcf46aeb7() {
        return this.f49912xfba06d04;
    }

    /* renamed from: audioTrackSources */
    public java.util.List<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.AudioTrackAttribute> m100312xe0c426e3() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f49913x7da5adf6.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.AudioTrackAttribute>> it = this.f49913x7da5adf6.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* renamed from: dataSource */
    public com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26136x85a944c2 m100313x4bd85c65() {
        return this.f49914x280a54b2;
    }

    /* renamed from: getOptionalParam */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m100314xe432b557(int i17) {
        return this.f49916xba3f32d3.get(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getSelectProgramInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36 m100315xebec5a00() {
        return this.f49923x6bc611c9;
    }

    /* renamed from: getSelectTrackAttributes */
    public java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SelectTrackAttribute> m100316x525d2b0() {
        return this.f49918xad4bc5f9;
    }

    /* renamed from: getTrackInfoByType */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d m100317xeed65ff4(int i17) {
        return this.f49924xc381c801.get(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getTrackInfos */
    public java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d> m100318x322b1ef0() {
        return this.f49925xf257178e;
    }

    /* renamed from: loopback */
    public com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.LoopbackAttribute m100319x8694d98b() {
        return this.f49915xab928118;
    }

    /* renamed from: optionalParams */
    public java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> m100320xb38c2906() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f49916xba3f32d3.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1>> it = this.f49916xba3f32d3.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* renamed from: outputMute */
    public boolean m100321xb40f76ba() {
        return this.f49917x90416f07;
    }

    /* renamed from: reset */
    public void m100322x6761d4f() {
        this.f49920x68c2cc53.clear();
        this.f49913x7da5adf6.clear();
        this.f49917x90416f07 = false;
        this.f49911x8ac9ea63 = 1.0f;
        this.f49912xfba06d04 = "";
        this.f49919x1226c51 = 1.0f;
        this.f49924xc381c801.clear();
        this.f49921x5da06557 = null;
        this.f49922x566ee2da = 0;
        this.f49916xba3f32d3.clear();
        this.f49914x280a54b2 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26136x85a944c2();
        this.f49915xab928118 = null;
        this.f49923x6bc611c9 = null;
        this.f49926xc060d3c6 = -1;
        this.f49925xf257178e.clear();
        this.f49918xad4bc5f9.clear();
    }

    /* renamed from: setAudioGainRatio */
    public void m100323x3aa51598(float f17) {
        this.f49911x8ac9ea63 = f17;
    }

    /* renamed from: setAudioNormalizeVolumeParams */
    public void m100324x1e3370b9(java.lang.String str) {
        this.f49912xfba06d04 = str;
    }

    /* renamed from: setDataSource */
    public void m100329x683d6267(java.lang.String str) {
        this.f49914x280a54b2.m100525xca029dad(str);
    }

    /* renamed from: setDeselectTrackInfo */
    public void m100331xbac5c81a(int i17, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d) {
        this.f49924xc381c801.remove(java.lang.Integer.valueOf(c26201xd4eb4d7d.m101187x2aedc86f()));
        if (i17 < 0 || i17 >= this.f49925xf257178e.size()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "track Index:" + i17 + " is invalid, trackInfoList size:" + this.f49925xf257178e.size());
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d> it = this.f49925xf257178e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d next = it.next();
            if (next.f51066x2b805725 == c26201xd4eb4d7d.f51066x2b805725 && ((android.text.TextUtils.isEmpty(next.f51065x337a8b) && android.text.TextUtils.isEmpty(c26201xd4eb4d7d.f51065x337a8b)) || next.f51065x337a8b.equals(c26201xd4eb4d7d.f51065x337a8b))) {
                next.f51064x17bd99e5 = false;
                break;
            }
        }
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SelectTrackAttribute> it6 = this.f49918xad4bc5f9.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SelectTrackAttribute next2 = it6.next();
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d2 = next2.f49935x2b7b2c99;
            if (c26201xd4eb4d7d2 != null && c26201xd4eb4d7d2.m101183xb2c87fbf(c26201xd4eb4d7d)) {
                this.f49918xad4bc5f9.remove(next2);
                return;
            }
        }
    }

    /* renamed from: setLoopback */
    public void m100332xfd27780d(boolean z17) {
        if (this.f49915xab928118 == null) {
            this.f49915xab928118 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.LoopbackAttribute();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.LoopbackAttribute loopbackAttribute = this.f49915xab928118;
        loopbackAttribute.f49931x574c80d5 = z17;
        loopbackAttribute.f49932xc3950ab1 = 0L;
        loopbackAttribute.f49930x5a7f4bea = -1L;
    }

    /* renamed from: setOutputMute */
    public void m100334xd0747cbc(boolean z17) {
        this.f49917x90416f07 = z17;
    }

    /* renamed from: setSelectProgramInfo */
    public void m100335xc7826674(com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36 c26189x4a228d36) {
        this.f49923x6bc611c9 = c26189x4a228d36;
    }

    /* renamed from: setSpeedRatio */
    public void m100336x41557a06(float f17) {
        this.f49919x1226c51 = f17;
    }

    /* renamed from: setSurface */
    public void m100337x42c875eb(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17) {
        this.f49921x5da06557 = surface;
        this.f49922x566ee2da = this.f49922x566ee2da;
    }

    /* renamed from: setSurfaceHolder */
    public void m100338x5660d377(android.view.SurfaceHolder surfaceHolder) {
        this.f49921x5da06557 = surfaceHolder;
    }

    /* renamed from: speedRatio */
    public float m100339x24f07404() {
        return this.f49919x1226c51;
    }

    /* renamed from: subtitleSources */
    public java.util.List<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SubtitleAttribute> m100340x99149c80() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f49920x68c2cc53.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SubtitleAttribute>> it = this.f49920x68c2cc53.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* renamed from: supportClip */
    public boolean m100341x91a017bf() {
        return m100313x4bd85c65() != null && m100313x4bd85c65().m100515xfb85f7b0() == 2;
    }

    /* renamed from: surface */
    public java.lang.Object m100342x9189ecad() {
        return this.f49921x5da06557;
    }

    /* renamed from: surfaceType */
    public int m100343xac61d187() {
        return this.f49922x566ee2da;
    }

    /* renamed from: validDataSource */
    public boolean m100344xb34ffd81() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26136x85a944c2 c26136x85a944c2 = this.f49914x280a54b2;
        return c26136x85a944c2 != null && c26136x85a944c2.m100517x7b953cf2();
    }

    /* renamed from: setDataSource */
    public void m100330x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f49914x280a54b2.m100525xca029dad(str);
        this.f49914x280a54b2.m100521xd291901c(map);
    }

    /* renamed from: setDataSource */
    public void m100327x683d6267(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f49914x280a54b2.m100524xd56f3556(c26142x43104e18);
        this.f49914x280a54b2.m100521xd291901c(map);
    }

    /* renamed from: setDataSource */
    public void m100325x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.f49914x280a54b2.m100520xb1996959(assetFileDescriptor);
    }

    /* renamed from: setLoopback */
    public void m100333xfd27780d(boolean z17, long j17, long j18) {
        if (this.f49915xab928118 == null) {
            this.f49915xab928118 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.LoopbackAttribute();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.LoopbackAttribute loopbackAttribute = this.f49915xab928118;
        loopbackAttribute.f49931x574c80d5 = z17;
        loopbackAttribute.f49932xc3950ab1 = j17;
        loopbackAttribute.f49930x5a7f4bea = j18;
    }

    /* renamed from: setDataSource */
    public void m100326x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.f49914x280a54b2.m100523xec066df6(parcelFileDescriptor);
    }

    /* renamed from: setDataSource */
    public void m100328x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        this.f49914x280a54b2.m100522xab0326e0(interfaceC26214xf9e9afd1);
    }
}
