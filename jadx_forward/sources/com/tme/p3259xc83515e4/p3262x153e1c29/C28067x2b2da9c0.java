package com.tme.p3259xc83515e4.p3262x153e1c29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086 J!\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086 J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\rH\u0086 R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/tme/karaoke/lib_singscore/PitchNativeBridge;", "", "", "sampleRate", "channel", "", "isCalAsync", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "", "byteArray", "len", "", "timeStamp", "Ljz5/f0;", "process", "", "", "getPitchArray", "()[[F", "unInit", "", "nativeHandle", "J", "<init>", "()V", "Companion", "oy5/d", "lib_singscore_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.tme.karaoke.lib_singscore.PitchNativeBridge */
/* loaded from: classes10.dex */
public final class C28067x2b2da9c0 {

    /* renamed from: Companion */
    public static final oy5.d f65775x233c02ec = new oy5.d(null);

    /* renamed from: loadRet */
    private static boolean f65776x141089db;
    private long nativeHandle;

    static {
        if (f65776x141089db) {
            return;
        }
        f65776x141089db = oy5.f.f431626a.a();
    }

    /* renamed from: getPitchArray */
    public final native float[][] m122263xdac67eef();

    /* renamed from: init */
    public final native int m122264x316510(int sampleRate, int channel, boolean isCalAsync);

    /* renamed from: process */
    public final native void m122265xed8d1e6f(byte[] bArr, int i17, float f17);

    /* renamed from: unInit */
    public final native void m122266xcdd7f349();
}
