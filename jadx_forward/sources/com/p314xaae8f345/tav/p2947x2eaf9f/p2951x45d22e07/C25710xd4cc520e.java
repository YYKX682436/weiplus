package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/tav/core/parallel/FixedParallelStrategy;", "Lcom/tencent/tav/core/parallel/BaseParallelStrategy;", "", "parallelSize", "Lcom/tencent/tav/core/AssetParallelExportSession;", "exportSession", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "list", "Ljz5/f0;", "calculateSubsection", "Lcom/tencent/tav/core/AssetParallelExportSession;", "getExportSession", "()Lcom/tencent/tav/core/AssetParallelExportSession;", "setExportSession", "(Lcom/tencent/tav/core/AssetParallelExportSession;)V", "I", "<init>", "Companion", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.tav.core.parallel.FixedParallelStrategy */
/* loaded from: classes16.dex */
public final class C25710xd4cc520e extends com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.AbstractC25709xafa6fbab {
    private static final java.lang.String TAG = "MicroMsg.FixedParallelStrategy";
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b exportSession;
    private int parallelSize;

    public C25710xd4cc520e(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b exportSession) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportSession, "exportSession");
        this.exportSession = exportSession;
        this.parallelSize = 5;
        int i17 = com.p314xaae8f345.tav.p2959x5befac44.C25759xbfeccb44.f48006x77ad2bf5;
        if (i17 > 0) {
            this.parallelSize = i17;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "CodecHelper set debug suggestParallelCount:" + this.parallelSize);
            return;
        }
        if (exportSession.m96476x12477e8c().m96744x45d4b29a() > 0) {
            this.parallelSize = this.exportSession.m96476x12477e8c().m96744x45d4b29a();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "exportSession set suggestParallelCount:" + this.parallelSize);
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.InterfaceC25711xea41d103
    /* renamed from: calculateSubsection */
    public void mo96969x6d2d90ab(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b, java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> arrayList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25659xe2dfb08b);
        int m97257x37a7fb48 = (int) (c25659xe2dfb08b.m96488xdd1fba().m97257x37a7fb48() / 10000000);
        int i17 = this.parallelSize;
        if (m97257x37a7fb48 > i17) {
            m97257x37a7fb48 = i17;
        }
        this.parallelSize = m97257x37a7fb48;
        long m97261xccb87a6a = c25659xe2dfb08b.f47306x16fae70.m97261xccb87a6a();
        if (this.parallelSize <= 1) {
            long j17 = 1000;
            m96967x79a906ec(0, m97261xccb87a6a / j17, c25659xe2dfb08b.f47306x16fae70.m97259x74606f23() / j17, arrayList);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "parallel size is 1");
            return;
        }
        long m97257x37a7fb482 = c25659xe2dfb08b.m96488xdd1fba().m97257x37a7fb48() / this.parallelSize;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "calculateSubsection offset:%d currentPts:%d", java.lang.Long.valueOf(m97257x37a7fb482), java.lang.Long.valueOf(m97261xccb87a6a));
        int i18 = 0;
        if (this.parallelSize == 1) {
            long j18 = 1000;
            m96967x79a906ec(0, m97261xccb87a6a / j18, c25659xe2dfb08b.f47306x16fae70.m97259x74606f23() / j18, arrayList);
        } else {
            com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
            java.lang.Object obj = c25659xe2dfb08b.f47284x58ceaf0.mo96129x317d5b7e().get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.tav.asset.AssetTrack<*>");
            java.lang.Object obj2 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b) obj).mo96159xbac98516().get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.tav.asset.CompositionTrackSegment");
            c25820xcadb1d34.m97977x683d6267(((com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) obj2).m96184xabff72d6());
            c25820xcadb1d34.m97975xc3b89af(com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(c25820xcadb1d34, "video/"));
            long j19 = m97257x37a7fb482;
            while (true) {
                long j27 = m97261xccb87a6a + j19;
                if (j27 >= c25659xe2dfb08b.m96488xdd1fba().m97259x74606f23() || i18 >= this.parallelSize - 1) {
                    break;
                }
                c25820xcadb1d34.m97974xc9fc1b13(j27, 1);
                long m97964xf6c90f8d = c25820xcadb1d34.m97964xf6c90f8d();
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "currentPts:%d sampleTime:%d", java.lang.Long.valueOf(m97261xccb87a6a), java.lang.Long.valueOf(m97964xf6c90f8d));
                if (m97964xf6c90f8d <= 0 && m97261xccb87a6a == 0) {
                    int i19 = this.parallelSize;
                    if (i19 <= 1) {
                        break;
                    }
                    this.parallelSize = i19 - 1;
                    j19 = c25659xe2dfb08b.m96488xdd1fba().m97257x37a7fb48() / this.parallelSize;
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "update parallel size:" + this.parallelSize + " offset:" + j19);
                } else {
                    if (m97964xf6c90f8d <= m97261xccb87a6a) {
                        break;
                    }
                    long j28 = 1000;
                    m96967x79a906ec(i18, m97261xccb87a6a / j28, m97964xf6c90f8d / j28, arrayList);
                    m97261xccb87a6a = m97964xf6c90f8d;
                    i18++;
                }
            }
            if (m97261xccb87a6a < c25659xe2dfb08b.f47306x16fae70.m97259x74606f23()) {
                long j29 = 1000;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "add last currentPts:%d sampleTime:%d", java.lang.Long.valueOf(m97261xccb87a6a), java.lang.Long.valueOf(c25659xe2dfb08b.f47306x16fae70.m97259x74606f23()));
                m96967x79a906ec(i18, m97261xccb87a6a / j29, c25659xe2dfb08b.f47306x16fae70.m97259x74606f23() / j29, arrayList);
            }
            c25820xcadb1d34.m97973x41012807();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
        int size = arrayList.size();
        this.parallelSize = size;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "calculateSubsection final parallelSize:%d", java.lang.Integer.valueOf(size));
    }

    public final com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b getExportSession() {
        return this.exportSession;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.InterfaceC25711xea41d103
    /* renamed from: parallelSize, reason: from getter */
    public int getParallelSize() {
        return this.parallelSize;
    }

    /* renamed from: setExportSession */
    public final void m96972x71e5700(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c25659xe2dfb08b, "<set-?>");
        this.exportSession = c25659xe2dfb08b;
    }
}
