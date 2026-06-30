package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class m extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 f218693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809, long j17, long j18) {
        super(j17, j18);
        this.f218693a = textureViewSurfaceTextureListenerC15532xe9ad4809;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218693a;
        textureViewSurfaceTextureListenerC15532xe9ad4809.L = true;
        if (textureViewSurfaceTextureListenerC15532xe9ad4809.B || textureViewSurfaceTextureListenerC15532xe9ad4809.getVisibility() != 0) {
            return;
        }
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218610r.g();
        tz2.l lVar = tz2.l.f504836e;
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218608p0 = lVar;
        textureViewSurfaceTextureListenerC15532xe9ad4809.i(lVar);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120763xed82fe04(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, null);
        vz2.c.c().f137750s = 6;
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218611s.a7(((tz2.e) textureViewSurfaceTextureListenerC15532xe9ad4809.f218614v).f(i65.a.r(textureViewSurfaceTextureListenerC15532xe9ad4809.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572706c81), 90017).toString());
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
    }
}
