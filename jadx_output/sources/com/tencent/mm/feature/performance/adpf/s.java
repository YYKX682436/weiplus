package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class s extends com.tencent.matrix.lifecycle.h {

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f67478e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f67479f;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f67474a = jz5.h.b(com.tencent.mm.feature.performance.adpf.r.f67469d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f67475b = jz5.h.b(com.tencent.mm.feature.performance.adpf.k.f67436d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f67476c = jz5.h.b(com.tencent.mm.feature.performance.adpf.j.f67430d);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.feature.performance.adpf.s f67477d = this;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f67480g = jz5.h.b(new com.tencent.mm.feature.performance.adpf.m(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f67481h = jz5.h.b(new com.tencent.mm.feature.performance.adpf.q(this));

    public final void a() {
        synchronized (this.f67477d) {
            com.tencent.mm.feature.performance.adpf.a2.a().removeCallbacks((java.lang.Runnable) ((jz5.n) this.f67480g).getValue());
            android.os.Handler handler = this.f67479f;
            if (handler != null) {
                handler.removeCallbacks((com.tencent.mm.feature.performance.adpf.p) ((jz5.n) this.f67481h).getValue());
            }
            this.f67478e = null;
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) this.f67474a).getValue()).turnOnSync();
        a();
        synchronized (this.f67477d) {
            com.tencent.mm.feature.performance.adpf.a2.a().postDelayed((java.lang.Runnable) ((jz5.n) this.f67480g).getValue(), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) this.f67474a).getValue()).turnOffSync();
        a();
    }
}
