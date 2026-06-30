package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class a extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f f218594a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f, long j17, long j18) {
        super(j17, j18);
        this.f218594a = textureViewSurfaceTextureListenerC15528xde21bc5f;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onFinish");
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = this.f218594a;
        textureViewSurfaceTextureListenerC15528xde21bc5f.H = true;
        if (textureViewSurfaceTextureListenerC15528xde21bc5f.f218570y || textureViewSurfaceTextureListenerC15528xde21bc5f.getVisibility() != 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onFinish break face detect!");
        textureViewSurfaceTextureListenerC15528xde21bc5f.g();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120763xed82fe04(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, null);
        vz2.c.b().B = 6;
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218562q.a7(((tz2.e) textureViewSurfaceTextureListenerC15528xde21bc5f.f218565t).f(i65.a.r(textureViewSurfaceTextureListenerC15528xde21bc5f.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572706c81), 90017).toString());
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
    }
}
