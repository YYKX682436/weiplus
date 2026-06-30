package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07;

/* renamed from: com.tencent.tav.core.parallel.BaseParallelStrategy */
/* loaded from: classes16.dex */
public abstract class AbstractC25709xafa6fbab implements com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.InterfaceC25711xea41d103 {
    protected static final java.lang.String TAG = "SimpleParallelStrategy";

    /* renamed from: addPipelineIndicator */
    public void m96967x79a906ec(int i17, long j17, long j18, java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> arrayList) {
        if (j17 < 0 || j17 >= j18) {
            return;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "index:%d  CMRange[%d %d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        arrayList.add(new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb(1, i17, new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97219xb488def0(j17), com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97219xb488def0(j18 - j17))));
    }
}
