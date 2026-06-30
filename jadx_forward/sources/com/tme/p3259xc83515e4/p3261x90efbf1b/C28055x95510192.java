package com.tme.p3259xc83515e4.p3261x90efbf1b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086 J\u0019\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086 J\u0019\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086 J\u0019\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086 J\u0019\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086 J\t\u0010\u0011\u001a\u00020\u0010H\u0086 R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/tme/karaoke/lib_singreverb/ReverbNativeBridge;", "", "", "sampleRate", "channel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, dm.i4.f66865x76d1ec5a, "", "setReverbId", "Ljava/nio/ByteBuffer;", "byteBuffer", "len", "accompanyProcess", "voicePreProcess", "voicePostProcess", "mixProcess", "Ljz5/f0;", "unInit", "", "nativeHandle", "J", "<init>", "()V", "Companion", "ny5/b", "lib_singreverb_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.tme.karaoke.lib_singreverb.ReverbNativeBridge */
/* loaded from: classes10.dex */
public final class C28055x95510192 {

    /* renamed from: Companion */
    public static final ny5.b f65740x233c02ec = new ny5.b(null);

    /* renamed from: loadRet */
    private static boolean f65741x141089db;
    private long nativeHandle;

    static {
        if (f65741x141089db) {
            return;
        }
        f65741x141089db = ny5.d.f423011a.a();
    }

    /* renamed from: accompanyProcess */
    public final native int m122174x15d50bd4(java.nio.ByteBuffer byteBuffer, int len);

    /* renamed from: init */
    public final native int m122175x316510(int sampleRate, int channel);

    /* renamed from: mixProcess */
    public final native int m122176xd5a97073(java.nio.ByteBuffer byteBuffer, int len);

    /* renamed from: setReverbId */
    public final native boolean m122177x66ce650f(int id6);

    /* renamed from: unInit */
    public final native void m122178xcdd7f349();

    /* renamed from: voicePostProcess */
    public final native int m122179x49f49d1d(java.nio.ByteBuffer byteBuffer, int len);

    /* renamed from: voicePreProcess */
    public final native int m122180x9001bd1e(java.nio.ByteBuffer byteBuffer, int len);
}
