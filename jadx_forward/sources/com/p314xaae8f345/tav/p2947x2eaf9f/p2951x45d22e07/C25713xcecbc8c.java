package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07;

/* renamed from: com.tencent.tav.core.parallel.SimpleParallelStrategy */
/* loaded from: classes16.dex */
public class C25713xcecbc8c extends com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.AbstractC25709xafa6fbab {

    /* renamed from: extractor */
    com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 f47681xf0edce24 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();

    /* renamed from: parallelSize */
    private int f47682x959526a8;

    public C25713xcecbc8c(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b) {
        this.f47682x959526a8 = 1;
        this.f47681xf0edce24.m97977x683d6267(((com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) ((com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b) c25659xe2dfb08b.f47284x58ceaf0.mo96129x317d5b7e().get(0)).mo96159xbac98516().get(0)).m96184xabff72d6());
        int m97464x334942e1 = com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97464x334942e1(this.f47681xf0edce24, "video/");
        this.f47681xf0edce24.m97975xc3b89af(m97464x334942e1);
        android.media.MediaFormat m97969xe2db7ec = this.f47681xf0edce24.m97969xe2db7ec(m97464x334942e1);
        try {
            int m97443xccb8f9fd = com.p314xaae8f345.tav.p2959x5befac44.C25759xbfeccb44.m97443xccb8f9fd(m97969xe2db7ec.containsKey("width") ? m97969xe2db7ec.getInteger("width") : 0, m97969xe2db7ec.containsKey("height") ? m97969xe2db7ec.getInteger("height") : 0, m97969xe2db7ec.containsKey("frame-rate") ? m97969xe2db7ec.getInteger("frame-rate") : 30, m97969xe2db7ec.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) ? m97969xe2db7ec.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) : 0L, m97969xe2db7ec.getString("mime"));
            this.f47682x959526a8 = m97443xccb8f9fd;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("SimpleParallelStrategy", "parallelSize %d", java.lang.Integer.valueOf(m97443xccb8f9fd));
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.InterfaceC25711xea41d103
    /* renamed from: calculateSubsection */
    public void mo96969x6d2d90ab(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b, java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> arrayList) {
        long m97257x37a7fb48 = c25659xe2dfb08b.m96488xdd1fba().m97257x37a7fb48() / this.f47682x959526a8;
        long m97261xccb87a6a = c25659xe2dfb08b.f47306x16fae70.m97261xccb87a6a();
        if (this.f47682x959526a8 == 1) {
            m96967x79a906ec(0, m97261xccb87a6a / 1000, c25659xe2dfb08b.f47306x16fae70.m97259x74606f23() / 1000, arrayList);
        } else {
            long j17 = m97261xccb87a6a;
            int i17 = 0;
            while (true) {
                long j18 = j17 + m97257x37a7fb48;
                if (j18 >= c25659xe2dfb08b.m96488xdd1fba().m97259x74606f23() || i17 >= this.f47682x959526a8 - 1) {
                    break;
                }
                this.f47681xf0edce24.m97974xc9fc1b13(j18, 1);
                long m97964xf6c90f8d = this.f47681xf0edce24.m97964xf6c90f8d();
                int i18 = i17 + 1;
                m96967x79a906ec(i17, j17 / 1000, m97964xf6c90f8d / 1000, arrayList);
                if (m97964xf6c90f8d <= j17) {
                    i17 = i18;
                    break;
                } else {
                    j17 = m97964xf6c90f8d;
                    i17 = i18;
                }
            }
            if (j17 < c25659xe2dfb08b.f47306x16fae70.m97259x74606f23()) {
                m96967x79a906ec(i17, j17 / 1000, c25659xe2dfb08b.f47306x16fae70.m97259x74606f23() / 1000, arrayList);
            }
            this.f47681xf0edce24.m97973x41012807();
        }
        int size = arrayList.size();
        this.f47682x959526a8 = size;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("SimpleParallelStrategy", "calculateSubsection final parallelSize:%d", java.lang.Integer.valueOf(size));
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.InterfaceC25711xea41d103
    /* renamed from: parallelSize */
    public int mo96971x959526a8() {
        return this.f47682x959526a8;
    }
}
