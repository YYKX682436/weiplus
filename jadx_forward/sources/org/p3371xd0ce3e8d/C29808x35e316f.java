package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.MediaCodecVideoDecoderFactory */
/* loaded from: classes16.dex */
class C29808x35e316f implements org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 {
    private static final java.lang.String TAG = "MediaCodecVideoDecoderFactory";

    /* renamed from: codecAllowedPredicate */
    private final org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo> f75546x2cb28d25;

    /* renamed from: sharedContext */
    private final org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context f75547x2748558a;

    public C29808x35e316f(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo> interfaceC29840x2718c997) {
        this.f75547x2748558a = context;
        this.f75546x2cb28d25 = interfaceC29840x2718c997;
    }

    /* renamed from: findCodecForType */
    private android.media.MediaCodecInfo m155699xd8d0e306(org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329) {
        int i17 = 0;
        while (true) {
            android.media.MediaCodecInfo mediaCodecInfo = null;
            if (i17 >= android.media.MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i17);
            } catch (java.lang.IllegalArgumentException e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Cannot retrieve decoder codec info", e17);
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && m155702x32ad8fd2(mediaCodecInfo, enumC29887xf25c2329)) {
                return mediaCodecInfo;
            }
            i17++;
        }
    }

    /* renamed from: isCodecAllowed */
    private boolean m155700xa02656fc(android.media.MediaCodecInfo mediaCodecInfo) {
        org.p3371xd0ce3e8d.InterfaceC29840x2718c997<android.media.MediaCodecInfo> interfaceC29840x2718c997 = this.f75546x2cb28d25;
        if (interfaceC29840x2718c997 == null) {
            return true;
        }
        return interfaceC29840x2718c997.mo155569x364492(mediaCodecInfo);
    }

    /* renamed from: isH264HighProfileSupported */
    private boolean m155701x15971339(android.media.MediaCodecInfo mediaCodecInfo) {
        java.lang.String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    /* renamed from: isSupportedCodec */
    private boolean m155702x32ad8fd2(android.media.MediaCodecInfo mediaCodecInfo, org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329) {
        mediaCodecInfo.getName();
        if (org.p3371xd0ce3e8d.C29807x3ab6251f.m155690x21998f14(mediaCodecInfo, enumC29887xf25c2329) && org.p3371xd0ce3e8d.C29807x3ab6251f.m155697x80967a9e(org.p3371xd0ce3e8d.C29807x3ab6251f.f75537x86737965, mediaCodecInfo.getCapabilitiesForType(enumC29887xf25c2329.m156503xad05ed8e())) != null) {
            return m155700xa02656fc(mediaCodecInfo);
        }
        return false;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61
    /* renamed from: createDecoder */
    public org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 mo155390xe1d6cfa8(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9) {
        org.p3371xd0ce3e8d.EnumC29887xf25c2329 m156500x1d43fb0c = org.p3371xd0ce3e8d.EnumC29887xf25c2329.m156500x1d43fb0c(c29886x94209fc9.m156495xfb82e301());
        android.media.MediaCodecInfo m155699xd8d0e306 = m155699xd8d0e306(m156500x1d43fb0c);
        if (m155699xd8d0e306 == null) {
            return null;
        }
        return new org.p3371xd0ce3e8d.C29722xc6806338(new org.p3371xd0ce3e8d.C29811x50f01a09(), m155699xd8d0e306.getName(), m156500x1d43fb0c, org.p3371xd0ce3e8d.C29807x3ab6251f.m155697x80967a9e(org.p3371xd0ce3e8d.C29807x3ab6251f.f75537x86737965, m155699xd8d0e306.getCapabilitiesForType(m156500x1d43fb0c.m156503xad05ed8e())).intValue(), this.f75547x2748558a);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61
    /* renamed from: getSupportedCodecs */
    public org.p3371xd0ce3e8d.C29886x94209fc9[] mo155391xd8a0cb35() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.p3371xd0ce3e8d.EnumC29887xf25c2329[] enumC29887xf25c2329Arr = {org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8, org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP9, org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264, org.p3371xd0ce3e8d.EnumC29887xf25c2329.AV1};
        for (int i17 = 0; i17 < 4; i17++) {
            org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329 = enumC29887xf25c2329Arr[i17];
            android.media.MediaCodecInfo m155699xd8d0e306 = m155699xd8d0e306(enumC29887xf25c2329);
            if (m155699xd8d0e306 != null) {
                java.lang.String m156504x7fcb405d = enumC29887xf25c2329.m156504x7fcb405d();
                if (enumC29887xf25c2329 == org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264 && m155701x15971339(m155699xd8d0e306)) {
                    arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(m156504x7fcb405d, org.p3371xd0ce3e8d.C29807x3ab6251f.m155691x9bbba7b3(enumC29887xf25c2329, true)));
                }
                arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(m156504x7fcb405d, org.p3371xd0ce3e8d.C29807x3ab6251f.m155691x9bbba7b3(enumC29887xf25c2329, false)));
            }
        }
        return (org.p3371xd0ce3e8d.C29886x94209fc9[]) arrayList.toArray(new org.p3371xd0ce3e8d.C29886x94209fc9[arrayList.size()]);
    }
}
