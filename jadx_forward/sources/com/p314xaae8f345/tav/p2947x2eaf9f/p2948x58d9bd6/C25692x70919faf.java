package com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6;

/* renamed from: com.tencent.tav.core.audio.AudioExportTask */
/* loaded from: classes16.dex */
public class C25692x70919faf implements com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25697xc329e446 {
    private static final java.lang.String TAG = "AudioEncoderTask";

    /* renamed from: mAsset */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788<? extends com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> f47585xbdca3683;

    /* renamed from: mCallback */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25696x8c617039 f47586x1ab9c7d2;

    /* renamed from: mOutSavePath */
    private java.lang.String f47588x96188a03;

    /* renamed from: mSegmentCount */
    private int f47590xb5e762a9 = 0;

    /* renamed from: mSessionId */
    private java.lang.String f47591x9ef18864 = new java.util.Random().nextLong() + "";

    /* renamed from: mEncoderList */
    private java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.RunnableC25690x905666da> f47587x1da2cd2d = new java.util.ArrayList();

    /* renamed from: mProgressMap */
    private java.util.HashMap<java.lang.Integer, com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus> f47589xed7eb142 = new java.util.HashMap<>();

    /* renamed from: com.tencent.tav.core.audio.AudioExportTask$SegmentStatus */
    /* loaded from: classes16.dex */
    public static class SegmentStatus {

        /* renamed from: mProgress */
        private float f47594xe95269ba;

        /* renamed from: mStatus */
        private int f47595x1a39f6bf;

        /* renamed from: mTimeRange */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47596x7c26f883;

        public SegmentStatus(int i17, float f17) {
            this.f47595x1a39f6bf = i17;
            this.f47594xe95269ba = f17;
        }

        /* renamed from: getTimeRange */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96877xdd1fba() {
            return this.f47596x7c26f883;
        }

        /* renamed from: setTimeRange */
        public void m96878x5d30e02e(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
            this.f47596x7c26f883 = c25738xead39d26;
        }
    }

    public C25692x70919faf(com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788<? extends com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> interfaceC25698xaf2a0788, java.lang.String str) {
        this.f47585xbdca3683 = interfaceC25698xaf2a0788;
        this.f47588x96188a03 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createOrUpdateSegmentStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus m96861x6a5a443d(int i17, int i18, float f17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "createOrUpdateSegmentStatus index = " + i17 + " mStatus = " + i18 + " mProgress = " + f17);
        if (!this.f47589xed7eb142.containsKey(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus segmentStatus = new com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus(i18, f17);
            this.f47589xed7eb142.put(java.lang.Integer.valueOf(i17), segmentStatus);
            return segmentStatus;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus segmentStatus2 = this.f47589xed7eb142.get(java.lang.Integer.valueOf(i17));
        segmentStatus2.f47594xe95269ba = f17;
        segmentStatus2.f47595x1a39f6bf = i18;
        return segmentStatus2;
    }

    /* renamed from: createSegmentStatus */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus m96862x2831f169(int i17, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus segmentStatus = new com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus(0, 0.0f);
        segmentStatus.f47596x7c26f883 = c25738xead39d26;
        this.f47589xed7eb142.put(java.lang.Integer.valueOf(i17), segmentStatus);
        return segmentStatus;
    }

    /* renamed from: exportAudio */
    private void m96863x817dc882(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, final int i17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "exportAudio timeRange = " + c25738xead39d26 + " index = " + i17);
        com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.RunnableC25690x905666da runnableC25690x905666da = new com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.RunnableC25690x905666da(this.f47585xbdca3683, c25738xead39d26);
        runnableC25690x905666da.m96854xfb0731c4(com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25695x970c115.m96887x71788c(this.f47588x96188a03, i17, this.f47591x9ef18864));
        runnableC25690x905666da.m96850x6c4ebec7(new com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25696x8c617039() { // from class: com.tencent.tav.core.audio.AudioExportTask.1
            @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25696x8c617039
            /* renamed from: onProgress */
            public void mo96870x696ee52c(int i18, float f17) {
                synchronized (com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.this) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.this.m96861x6a5a443d(i17, i18, f17);
                    com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.this.m96864xb48c4f5c();
                }
            }
        });
        try {
            runnableC25690x905666da.m96848xed060d07();
            runnableC25690x905666da.m96856x68ac462();
            this.f47587x1da2cd2d.add(runnableC25690x905666da);
        } catch (java.io.IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyProgressAndStatusUpdate */
    public void m96864xb48c4f5c() {
        if (this.f47589xed7eb142.size() == 0) {
            return;
        }
        float f17 = this.f47590xb5e762a9;
        float f18 = 0.0f;
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus> entry : this.f47589xed7eb142.entrySet()) {
            f18 += entry.getValue().f47594xe95269ba;
            i17 |= entry.getValue().f47595x1a39f6bf;
        }
        float f19 = f18 / f17;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, " mStatus = " + i17 + " mProgress = " + f19);
        if (i17 == 255) {
            m96865x696ee52c(255, f19);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25695x970c115.m96885x6b6e45b6(this.f47588x96188a03, this.f47590xb5e762a9, this.f47591x9ef18864);
            new java.io.File(this.f47588x96188a03).delete();
            return;
        }
        if (i17 >= 4) {
            m96865x696ee52c(4, f19);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25695x970c115.m96885x6b6e45b6(this.f47588x96188a03, this.f47590xb5e762a9, this.f47591x9ef18864);
            new java.io.File(this.f47588x96188a03).delete();
        } else {
            if (i17 == 2) {
                if (com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25695x970c115.m96889x1ae87dae(this.f47588x96188a03, this.f47590xb5e762a9, this.f47591x9ef18864)) {
                    m96865x696ee52c(2, 1.0f);
                } else {
                    m96865x696ee52c(255, 1.0f);
                }
                com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25695x970c115.m96885x6b6e45b6(this.f47588x96188a03, this.f47590xb5e762a9, this.f47591x9ef18864);
                return;
            }
            if (i17 >= 1) {
                m96865x696ee52c(1, f19);
            } else {
                m96865x696ee52c(0, f19);
            }
        }
    }

    /* renamed from: onProgress */
    private void m96865x696ee52c(int i17, float f17) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25696x8c617039 interfaceC25696x8c617039 = this.f47586x1ab9c7d2;
        if (interfaceC25696x8c617039 != null) {
            interfaceC25696x8c617039.mo96870x696ee52c(i17, f17);
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25697xc329e446
    /* renamed from: cancel */
    public void mo96866xae7a2e7a() {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.RunnableC25690x905666da> it = this.f47587x1da2cd2d.iterator();
        while (it.hasNext()) {
            it.next().m96843xae7a2e7a();
        }
    }

    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96867x51e8b0a() {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788<? extends com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> interfaceC25698xaf2a0788 = this.f47585xbdca3683;
        return interfaceC25698xaf2a0788 != null ? interfaceC25698xaf2a0788.mo96879x51e8b0a() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25697xc329e446
    /* renamed from: setExportCallback */
    public void mo96868x7ea8d91b(com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25696x8c617039 interfaceC25696x8c617039) {
        this.f47586x1ab9c7d2 = interfaceC25696x8c617039;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25697xc329e446
    /* renamed from: start */
    public void mo96869x68ac462() {
        this.f47589xed7eb142.clear();
        this.f47587x1da2cd2d.clear();
        long m97232x31040141 = m96867x51e8b0a().m97232x31040141();
        long j17 = com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25691x9457f02c.f47584x6d02ddfd;
        this.f47591x9ef18864 = java.lang.System.currentTimeMillis() + "";
        this.f47590xb5e762a9 = (int) (((m97232x31040141 + j17) - 1) / j17);
        long j18 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i17 < this.f47590xb5e762a9) {
            long j19 = j18 + j17;
            m96862x2831f169(i18, new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97221xb488dfe8(j18), com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97221xb488dfe8(j19 > m97232x31040141 ? m97232x31040141 - j18 : j17)));
            i18++;
            i17++;
            j18 = j19;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25692x70919faf.SegmentStatus>> it = this.f47589xed7eb142.entrySet().iterator();
        int i19 = 1;
        while (it.hasNext()) {
            m96863x817dc882(it.next().getValue().f47596x7c26f883, i19);
            i19++;
        }
    }

    public C25692x70919faf(java.lang.String str) {
        this.f47588x96188a03 = str;
    }
}
