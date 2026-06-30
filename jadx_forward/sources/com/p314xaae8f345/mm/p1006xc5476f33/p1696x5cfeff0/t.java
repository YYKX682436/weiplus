package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547 f218784d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547 viewOnClickListenerC15531xcd76b547) {
        this.f218784d = viewOnClickListenerC15531xcd76b547;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547 viewOnClickListenerC15531xcd76b547 = this.f218784d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 c15530x17431dc6 = viewOnClickListenerC15531xcd76b547.f218585e;
        c15530x17431dc6.f218581n.cancel();
        c15530x17431dc6.f218582o.cancel();
        c15530x17431dc6.f218583p.cancel();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = viewOnClickListenerC15531xcd76b547.f218584d;
        textureViewSurfaceTextureListenerC15528xde21bc5f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "release");
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218565t.mo63481x41012807();
        textureViewSurfaceTextureListenerC15528xde21bc5f.N.cancel();
        viewOnClickListenerC15531xcd76b547.f218591n.mo48814x2efc64();
        viewOnClickListenerC15531xcd76b547.f218592o.mo48814x2efc64();
    }
}
