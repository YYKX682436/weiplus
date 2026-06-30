package com.p314xaae8f345.mm.rfx.p2589x5fb4e56;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8 f273770d;

    public d(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8 c20958x70e103f8) {
        this.f273770d = c20958x70e103f8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76 c20960x26a13e76;
        android.media.MediaCodec mediaCodec;
        android.media.MediaCodec mediaCodec2;
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8 c20958x70e103f8 = this.f273770d;
        try {
            mediaCodec2 = c20958x70e103f8.f39151x5befac44;
            mediaCodec2.stop();
        } catch (java.lang.Exception unused) {
        }
        try {
            mediaCodec = c20958x70e103f8.f39151x5befac44;
            mediaCodec.release();
        } catch (java.lang.Exception unused2) {
        }
        c20958x70e103f8.f39151x5befac44 = null;
        c20960x26a13e76 = c20958x70e103f8.f39155x88c47fb2;
        c20960x26a13e76.m77651x41012807();
    }
}
