package ch2;

/* loaded from: classes10.dex */
public final class g0 extends tn0.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122887a;

    public g0(ch2.o2 o2Var) {
        this.f122887a = o2Var;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onCapturedAudioFrame */
    public void mo14853xad1683f4(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        ah2.b k76;
        ch2.o2 o2Var = this.f122887a;
        try {
            if (!o2Var.i7().b7() || tRTCAudioFrame == null || (k76 = o2Var.k7()) == null) {
                return;
            }
            ((dh2.x) k76).g(tRTCAudioFrame);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVSingController", "onCapturedAudioFrame: " + th6.getMessage());
        }
    }

    @Override // tn0.m1, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onLocalProcessedAudioFrame */
    public void mo14854x307058b9(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        ah2.b k76;
        ch2.o2 o2Var = this.f122887a;
        try {
            if (!o2Var.i7().b7() || tRTCAudioFrame == null || (k76 = o2Var.k7()) == null) {
                return;
            }
            ((dh2.x) k76).h(tRTCAudioFrame);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVSingController", "onLocalProcessedAudioFrame: " + th6.getMessage());
        }
    }

    @Override // tn0.m1, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onRemoteUserAudioFrame */
    public void mo14855xb56a47c7(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        ah2.b k76;
        ch2.o2 o2Var = this.f122887a;
        try {
            if (!o2Var.i7().b7() || tRTCAudioFrame == null || (k76 = o2Var.k7()) == null) {
                return;
            }
            ((dh2.x) k76).i(tRTCAudioFrame, str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVSingController", "onRemoteUserAudioFrame: " + th6.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (((dh2.b0) r1).b() == true) goto L16;
     */
    @Override // tn0.m1, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onVoiceEarMonitorAudioFrame */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo14856x7e98b6ae(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame r4) {
        /*
            r3 = this;
            ch2.o2 r0 = r3.f122887a
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
            ah2.c r1 = r0.f314006m
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
            gk2.e r1 = r0.f314001e
            java.lang.Class<om2.e> r2 = om2.e.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            om2.e r1 = (om2.e) r1
            kotlinx.coroutines.flow.j2 r1 = r1.f427828n
            kotlinx.coroutines.flow.h3 r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r1
            java.lang.Object r1 = r1.mo144003x754a37bb()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L55
            dh2.w r1 = r0.f314007n
            boolean r1 = r1.c()
            if (r1 != 0) goto L55
            hh2.a r0 = r0.f314013t
            r0.c(r4)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.g0.mo14856x7e98b6ae(com.tencent.trtc.TRTCCloudDef$TRTCAudioFrame):void");
    }
}
