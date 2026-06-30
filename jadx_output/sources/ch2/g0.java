package ch2;

/* loaded from: classes10.dex */
public final class g0 extends tn0.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41354a;

    public g0(ch2.o2 o2Var) {
        this.f41354a = o2Var;
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onCapturedAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        ah2.b k76;
        ch2.o2 o2Var = this.f41354a;
        try {
            if (!o2Var.i7().b7() || tRTCAudioFrame == null || (k76 = o2Var.k7()) == null) {
                return;
            }
            ((dh2.x) k76).g(tRTCAudioFrame);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVSingController", "onCapturedAudioFrame: " + th6.getMessage());
        }
    }

    @Override // tn0.m1, com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onLocalProcessedAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        ah2.b k76;
        ch2.o2 o2Var = this.f41354a;
        try {
            if (!o2Var.i7().b7() || tRTCAudioFrame == null || (k76 = o2Var.k7()) == null) {
                return;
            }
            ((dh2.x) k76).h(tRTCAudioFrame);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVSingController", "onLocalProcessedAudioFrame: " + th6.getMessage());
        }
    }

    @Override // tn0.m1, com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onRemoteUserAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        ah2.b k76;
        ch2.o2 o2Var = this.f41354a;
        try {
            if (!o2Var.i7().b7() || tRTCAudioFrame == null || (k76 = o2Var.k7()) == null) {
                return;
            }
            ((dh2.x) k76).i(tRTCAudioFrame, str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVSingController", "onRemoteUserAudioFrame: " + th6.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (((dh2.b0) r1).b() == true) goto L16;
     */
    @Override // tn0.m1, com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onVoiceEarMonitorAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame r4) {
        /*
            r3 = this;
            ch2.o2 r0 = r3.f41354a
            mm2.e1 r1 = r0.i7()
            boolean r1 = r1.b7()
            if (r1 == 0) goto L55
            if (r4 == 0) goto L55
            ah2.b r0 = r0.k7()
            if (r0 == 0) goto L55
            dh2.x r0 = (dh2.x) r0
            boolean r1 = r0.e()
            if (r1 != 0) goto L1d
            goto L55
        L1d:
            ah2.c r1 = r0.f232473m
            if (r1 == 0) goto L2b
            dh2.b0 r1 = (dh2.b0) r1
            boolean r1 = r1.b()
            r2 = 1
            if (r1 != r2) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            if (r2 == 0) goto L55
            gk2.e r1 = r0.f232468e
            java.lang.Class<om2.e> r2 = om2.e.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            om2.e r1 = (om2.e) r1
            kotlinx.coroutines.flow.j2 r1 = r1.f346295n
            kotlinx.coroutines.flow.h3 r1 = (kotlinx.coroutines.flow.h3) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L55
            dh2.w r1 = r0.f232474n
            boolean r1 = r1.c()
            if (r1 != 0) goto L55
            hh2.a r0 = r0.f232480t
            r0.c(r4)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.g0.onVoiceEarMonitorAudioFrame(com.tencent.trtc.TRTCCloudDef$TRTCAudioFrame):void");
    }
}
