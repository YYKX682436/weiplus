package tn0;

/* loaded from: classes10.dex */
public final class d implements com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502192a;

    public d(tn0.w0 w0Var) {
        this.f502192a = w0Var;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onCapturedAudioFrame */
    public void mo14853xad1683f4(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f502192a.f502312x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).mo14853xad1683f4(tRTCAudioFrame);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onLocalProcessedAudioFrame */
    public void mo14854x307058b9(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f502192a.f502312x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).mo14854x307058b9(tRTCAudioFrame);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onMixedAllAudioFrame */
    public void mo105619xdefe77bc(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f502192a.f502312x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).getClass();
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onMixedPlayAudioFrame */
    public void mo105620xb29ba607(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f502192a.f502312x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).getClass();
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onRemoteUserAudioFrame */
    public void mo14855xb56a47c7(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        java.util.Iterator it = this.f502192a.f502312x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).mo14855xb56a47c7(tRTCAudioFrame, str);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onVoiceEarMonitorAudioFrame */
    public void mo14856x7e98b6ae(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f502192a.f502312x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).mo14856x7e98b6ae(tRTCAudioFrame);
        }
    }
}
