package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaDeviceFrameDrawLoopCallback */
/* loaded from: classes15.dex */
public class C3126x3196c5d7 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3405xb6fa3b3b {

    /* renamed from: frameDrawCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3627x83447f8 f11981xb6286fb6;

    /* renamed from: choreographer */
    private android.view.Choreographer f11979x4f0c8689 = android.view.Choreographer.getInstance();

    /* renamed from: frameCallback */
    private android.view.Choreographer.FrameCallback f11980x5bd370d2 = new android.view.Choreographer.FrameCallback() { // from class: com.tencent.kinda.framework.app.KindaDeviceFrameDrawLoopCallback.1
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j17) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3126x3196c5d7.this.m25130xbb0eccc3(j17);
        }
    };

    /* renamed from: isStart */
    private volatile boolean f11982x7b737158 = false;

    /* renamed from: onDoFrame */
    public void m25130xbb0eccc3(long j17) {
        this.f11981xb6286fb6.mo28475x2e7a5e(j17 / 1000000);
        if (this.f11982x7b737158) {
            this.f11979x4f0c8689.postFrameCallback(this.f11980x5bd370d2);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3405xb6fa3b3b
    /* renamed from: startListenerImpl */
    public void mo25131xd6beb676(com.p314xaae8f345.p347x615374d.gen.AbstractC3627x83447f8 abstractC3627x83447f8) {
        this.f11982x7b737158 = true;
        this.f11981xb6286fb6 = abstractC3627x83447f8;
        this.f11979x4f0c8689.removeFrameCallback(this.f11980x5bd370d2);
        this.f11979x4f0c8689.postFrameCallback(this.f11980x5bd370d2);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3405xb6fa3b3b
    /* renamed from: stopListener */
    public void mo25132xa4e0ed6() {
        this.f11982x7b737158 = false;
        this.f11979x4f0c8689.removeFrameCallback(this.f11980x5bd370d2);
    }
}
