package com.p314xaae8f345.tav.p2945x58ceaf0;

/* renamed from: com.tencent.tav.asset.Asset */
/* loaded from: classes16.dex */
public abstract class AbstractC25633x3c9fad0<Track extends com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> implements com.p314xaae8f345.tav.p2945x58ceaf0.InterfaceC25636xc68f9502 {
    public static final java.lang.String TAG = "Asset";

    /* renamed from: canContainFragments */
    private boolean f47047x4efab59f;

    /* renamed from: composable */
    private boolean f47048xe598f90d;

    /* renamed from: containsFragments */
    private boolean f47049xc1a784c4;

    /* renamed from: exportable */
    private boolean f47051xc7daf0e;

    /* renamed from: extractor */
    protected com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 f47052xf0edce24;

    /* renamed from: hasProtectedContent */
    private boolean f47054xc654e3a5;

    /* renamed from: lyrics */
    private java.lang.String f47055xbf29e7f4;

    /* renamed from: mediaFormat */
    private android.media.MediaFormat f47056xd571d8fb;

    /* renamed from: naturalSize */
    protected com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f47058x6d2a2fca;

    /* renamed from: overallDurationHint */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47059x997c1b28;

    /* renamed from: playable */
    private boolean f47060x7001668e;

    /* renamed from: preferredTransform */
    private android.graphics.Matrix f47063x5880ffeb;

    /* renamed from: providesPreciseDurationAndTiming */
    private boolean f47065x9621c4c4;

    /* renamed from: readable */
    private boolean f47066xcc5033f0;

    /* renamed from: tracks */
    protected java.util.List<Track> f47069xcc663888;

    /* renamed from: trackIndex */
    protected int f47068x43ea5e47 = 0;

    /* renamed from: trackCount */
    protected int f47067x43968684 = 0;

    /* renamed from: duration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f47050x89444d94 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;

    /* renamed from: preferredRate */
    private float f47062xdbb9a501 = 1.0f;

    /* renamed from: preferRotation */
    protected int f47061xcc7d15ae = 0;

    /* renamed from: mirror */
    private int f47057xbffd6bbf = 0;

    /* renamed from: preferredVolume */
    protected float f47064xdb79bafb = 1.0f;

    /* renamed from: extractorRetryCount */
    private int f47053x9620f48b = 3;

    public AbstractC25633x3c9fad0() {
    }

    /* renamed from: initMembers */
    private void m96110x873d29e9() {
        this.f47067x43968684 = this.f47052xf0edce24.m97968x31d73e7a();
        this.f47050x89444d94 = m96116x51e8b0a();
        this.f47058x6d2a2fca = com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97989x4ee02466(this.f47052xf0edce24);
        int m97988xbb14e2a4 = com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97988xbb14e2a4(this.f47052xf0edce24);
        this.f47061xcc7d15ae = m97988xbb14e2a4;
        if (m97988xbb14e2a4 == 0) {
            return;
        }
        this.f47063x5880ffeb = new android.graphics.Matrix();
        while (true) {
            int i17 = this.f47061xcc7d15ae;
            if (i17 >= 0) {
                int i18 = i17 % 4;
                this.f47061xcc7d15ae = i18;
                android.graphics.Matrix matrix = this.f47063x5880ffeb;
                com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f47058x6d2a2fca;
                com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97469xa52d49d5(matrix, i18, c25732x76648a85.f47833x6be2dc6, c25732x76648a85.f47832xb7389127);
                return;
            }
            this.f47061xcc7d15ae = i17 + 4;
        }
    }

    /* renamed from: tryInitMembers */
    private void m96111x1c763d2e() {
        int i17 = this.f47053x9620f48b;
        this.f47053x9620f48b = i17 - 1;
        if (i17 <= 0) {
            return;
        }
        try {
            m96110x873d29e9();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "Asset: initMembers failed, path = " + m96126xabff72d6(), e17);
            m96112x73cd59dc(100);
            m96111x1c763d2e();
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "tryInitMembers: try count = " + (3 - this.f47053x9620f48b));
    }

    /* renamed from: trySleep */
    private void m96112x73cd59dc(int i17) {
        try {
            java.lang.Thread.sleep(i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "tryInitMembers: Thread.sleep(100) ", e17);
        }
    }

    /* renamed from: cancelLoading */
    public synchronized void m96113x62eeed62() {
    }

    /* renamed from: createTracks */
    public void mo96114x5d1b18a4() {
        int m97968x31d73e7a = this.f47052xf0edce24.m97968x31d73e7a();
        if (this.f47069xcc663888 == null) {
            this.f47069xcc663888 = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < m97968x31d73e7a; i17++) {
            java.lang.String string = this.f47052xf0edce24.m97969xe2db7ec(i17).getString("mime");
            if (string.startsWith("video/")) {
                int i18 = this.f47068x43ea5e47;
                this.f47068x43ea5e47 = i18 + 1;
                com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b = new com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b(this, i18, 1, new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, mo96130x36bbd779()));
                c25634xf527485b.mo96170x308e3ed(this.f47063x5880ffeb);
                c25634xf527485b.m96169x7fcd02dd(this.f47061xcc7d15ae);
                this.f47069xcc663888.add(c25634xf527485b);
            } else if (string.startsWith("audio/")) {
                int i19 = this.f47068x43ea5e47;
                this.f47068x43ea5e47 = i19 + 1;
                com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b2 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b(this, i19, 2, new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, mo96115xd375d3d4()));
                c25634xf527485b2.mo96171xf6b22639(this.f47064xdb79bafb);
                this.f47069xcc663888.add(c25634xf527485b2);
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "Asset createTracks finish, has track count: " + this.f47069xcc663888);
    }

    /* renamed from: getAudioDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96115xd375d3d4() {
        return com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.m97303x391f00ab(this.f47052xf0edce24.m97960xd375d3d4());
    }

    /* renamed from: getDuration */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96116x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = this.f47050x89444d94;
        if (c25736x76b98a57 == null || c25736x76b98a57.m97229x22a7969a(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f)) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96130x36bbd779 = mo96130x36bbd779();
            if (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f.m97229x22a7969a(mo96130x36bbd779)) {
                mo96130x36bbd779 = mo96115xd375d3d4();
            }
            this.f47050x89444d94 = mo96130x36bbd779;
        }
        return this.f47050x89444d94;
    }

    /* renamed from: getExtractor */
    public synchronized com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 m96117xf05b3f6e() {
        return this.f47052xf0edce24;
    }

    /* renamed from: getLyrics */
    public java.lang.String m96118x24410aea() {
        return this.f47055xbf29e7f4;
    }

    /* renamed from: getMediaFormat */
    public android.media.MediaFormat m96119xaf481fc5() {
        return this.f47056xd571d8fb;
    }

    /* renamed from: getNaturalSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 mo96120x47007694() {
        return this.f47058x6d2a2fca;
    }

    /* renamed from: getOverallDurationHint */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96121xf1abf7f2() {
        return this.f47059x997c1b28;
    }

    /* renamed from: getPreferRotation */
    public int mo96122xbb14e2a4() {
        return this.f47061xcc7d15ae;
    }

    /* renamed from: getPreferredRate */
    public float m96123x9919614b() {
        return this.f47062xdbb9a501;
    }

    /* renamed from: getPreferredTransform */
    public android.graphics.Matrix m96124x6bdd61e1() {
        return this.f47063x5880ffeb;
    }

    /* renamed from: getPreferredVolume */
    public float m96125xbfdb8cc5() {
        return this.f47064xdb79bafb;
    }

    /* renamed from: getSourcePath */
    public synchronized java.lang.String m96126xabff72d6() {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f47052xf0edce24;
        if (c25820xcadb1d34 == null) {
            return null;
        }
        return c25820xcadb1d34.m97967xabff72d6();
    }

    /* renamed from: getTrackCount */
    public int m96127x31d73e7a() {
        return this.f47067x43968684;
    }

    /* renamed from: getTrackFormat */
    public synchronized android.media.MediaFormat m96128xe2db7ec(int i17) {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f47052xf0edce24;
        if (c25820xcadb1d34 == null) {
            return null;
        }
        return c25820xcadb1d34.m97969xe2db7ec(i17);
    }

    /* renamed from: getTracks */
    public java.util.List<Track> mo96129x317d5b7e() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "getTracks finish, has track count: " + this.f47069xcc663888);
        return this.f47069xcc663888;
    }

    /* renamed from: getVideoDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96130x36bbd779() {
        return com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.m97303x391f00ab(this.f47052xf0edce24.m97961x51e8b0a());
    }

    /* renamed from: isCanContainFragments */
    public boolean m96131xd21e7c15() {
        return this.f47047x4efab59f;
    }

    /* renamed from: isComposable */
    public boolean m96132x6703f5d7() {
        return this.f47048xe598f90d;
    }

    /* renamed from: isContainsFragments */
    public boolean m96133x54d670ba() {
        return this.f47049xc1a784c4;
    }

    /* renamed from: isExportable */
    public boolean m96134x8de8abd8() {
        return this.f47051xc7daf0e;
    }

    /* renamed from: isHasProtectedContent */
    public boolean m96135x4978aa1b() {
        return this.f47054xc654e3a5;
    }

    /* renamed from: isPlayable */
    public boolean m96136x40b90dd8() {
        return this.f47060x7001668e;
    }

    /* renamed from: isProvidesPreciseDurationAndTiming */
    public boolean m96137x2a0aae0e() {
        return this.f47065x9621c4c4;
    }

    /* renamed from: isReadable */
    public boolean m96138x9d07db3a() {
        return this.f47066xcc5033f0;
    }

    /* renamed from: release */
    public void m96139x41012807() {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f47052xf0edce24;
        if (c25820xcadb1d34 != null) {
            c25820xcadb1d34.m97973x41012807();
        }
    }

    /* renamed from: selectTrack */
    public synchronized void m96140xc3b89af(int i17) {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = this.f47052xf0edce24;
        if (c25820xcadb1d34 != null) {
            c25820xcadb1d34.m97975xc3b89af(i17);
        }
    }

    /* renamed from: trackWithTrackID */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b mo96141x94b0f9b5(int i17) {
        java.util.List<Track> list = this.f47069xcc663888;
        if (list == null) {
            return null;
        }
        for (Track track : list) {
            if (track != null && track.m96163xfe2e0f70() == i17) {
                return track;
            }
        }
        return null;
    }

    /* renamed from: tracksWithMediaCharacteristic */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> m96142x62ed8a51(java.lang.String str) {
        return null;
    }

    /* renamed from: tracksWithMediaType */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b> mo96143x6e29e370(int i17) {
        if (this.f47069xcc663888 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Track track : this.f47069xcc663888) {
            if (track != null && track.m96152x7f025288() == i17) {
                arrayList.add(track);
            }
        }
        return arrayList;
    }

    public AbstractC25633x3c9fad0(java.net.URL url) {
    }

    public AbstractC25633x3c9fad0(java.lang.String str) {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
        this.f47052xf0edce24 = c25820xcadb1d34;
        c25820xcadb1d34.m97977x683d6267(str);
        m96111x1c763d2e();
        mo96114x5d1b18a4();
    }
}
