package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.HardwareVideoDecoderFactory */
/* loaded from: classes16.dex */
public class C29786xb4a26659 extends org.p3371xd0ce3e8d.C29808x35e316f {

    /* renamed from: defaultAllowedPredicate */
    private static final org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo> f75433x195b9d50 = new org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo>() { // from class: org.webrtc.HardwareVideoDecoderFactory.1
        @Override // org.p3371xd0ce3e8d.InterfaceC29840x2718c997
        /* renamed from: test, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo155569x364492(android.media.MediaCodecInfo mediaCodecInfo) {
            return org.p3371xd0ce3e8d.C29807x3ab6251f.m155693xca6d2895(mediaCodecInfo);
        }
    };

    @java.lang.Deprecated
    public C29786xb4a26659() {
        this(null);
    }

    @Override // org.p3371xd0ce3e8d.C29808x35e316f, org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61
    /* renamed from: createDecoder */
    public /* bridge */ /* synthetic */ org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 mo155390xe1d6cfa8(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9) {
        return super.mo155390xe1d6cfa8(c29886x94209fc9);
    }

    @Override // org.p3371xd0ce3e8d.C29808x35e316f, org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61
    /* renamed from: getSupportedCodecs */
    public /* bridge */ /* synthetic */ org.p3371xd0ce3e8d.C29886x94209fc9[] mo155391xd8a0cb35() {
        return super.mo155391xd8a0cb35();
    }

    public C29786xb4a26659(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context) {
        this(context, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C29786xb4a26659(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context r2, org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo> r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            org.webrtc.Predicate<android.media.MediaCodecInfo> r3 = org.p3371xd0ce3e8d.C29786xb4a26659.f75433x195b9d50
            goto Lb
        L5:
            org.webrtc.Predicate<android.media.MediaCodecInfo> r0 = org.p3371xd0ce3e8d.C29786xb4a26659.f75433x195b9d50
            org.webrtc.Predicate r3 = r3.and(r0)
        Lb:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3371xd0ce3e8d.C29786xb4a26659.<init>(org.webrtc.EglBase$Context, org.webrtc.Predicate):void");
    }
}
