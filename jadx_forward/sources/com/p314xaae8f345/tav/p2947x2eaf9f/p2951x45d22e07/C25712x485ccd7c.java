package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07;

/* renamed from: com.tencent.tav.core.parallel.PipelineParallelStrategy */
/* loaded from: classes16.dex */
public class C25712x485ccd7c extends com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.AbstractC25709xafa6fbab {

    /* renamed from: SEGMENT_DURATION_MS */
    public static final int f47680x6d02dd05 = 5000;

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.InterfaceC25711xea41d103
    /* renamed from: calculateSubsection */
    public void mo96969x6d2d90ab(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b, java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> arrayList) {
        int i17;
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
        c25820xcadb1d34.m97977x683d6267(((com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) ((com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b) c25659xe2dfb08b.f47284x58ceaf0.mo96129x317d5b7e().get(0)).mo96159xbac98516().get(0)).m96184xabff72d6());
        c25820xcadb1d34.m97975xc3b89af(com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(c25820xcadb1d34, "video/"));
        long m97261xccb87a6a = c25659xe2dfb08b.f47306x16fae70.m97261xccb87a6a();
        int i18 = 0;
        while (true) {
            long j17 = 5000000 + m97261xccb87a6a;
            if (j17 >= c25659xe2dfb08b.f47306x16fae70.m97259x74606f23()) {
                i17 = i18;
                break;
            }
            c25820xcadb1d34.m97974xc9fc1b13(j17, 1);
            long m97964xf6c90f8d = c25820xcadb1d34.m97964xf6c90f8d();
            int i19 = i18 + 1;
            m96967x79a906ec(i18, m97261xccb87a6a / 1000, m97964xf6c90f8d / 1000, arrayList);
            if (m97964xf6c90f8d <= m97261xccb87a6a) {
                i17 = i19;
                break;
            } else {
                m97261xccb87a6a = m97964xf6c90f8d;
                i18 = i19;
            }
        }
        if (m97261xccb87a6a < c25659xe2dfb08b.f47306x16fae70.m97259x74606f23()) {
            m96967x79a906ec(i17, m97261xccb87a6a / 1000, c25659xe2dfb08b.f47306x16fae70.m97259x74606f23() / 1000, arrayList);
        }
        c25820xcadb1d34.m97973x41012807();
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.InterfaceC25711xea41d103
    /* renamed from: parallelSize */
    public int mo96971x959526a8() {
        return 2;
    }
}
