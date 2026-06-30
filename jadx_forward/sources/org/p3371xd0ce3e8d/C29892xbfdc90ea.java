package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.VideoDecoderWrapper */
/* loaded from: classes16.dex */
public class C29892xbfdc90ea {
    /* renamed from: createDecoderCallback */
    public static org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.Callback m156511x48172c0d(final long j17) {
        return new org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.Callback() { // from class: org.webrtc.VideoDecoderWrapper$$a
            @Override // org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.Callback
            /* renamed from: onDecodedFrame */
            public final void mo156509x1873ca56(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, java.lang.Integer num, java.lang.Integer num2) {
                org.p3371xd0ce3e8d.C29892xbfdc90ea.m156513xe667724d(j17, c29904x150215d2, num, num2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeOnDecodedFrame */
    public static native void m156513xe667724d(long j17, org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, java.lang.Integer num, java.lang.Integer num2);
}
