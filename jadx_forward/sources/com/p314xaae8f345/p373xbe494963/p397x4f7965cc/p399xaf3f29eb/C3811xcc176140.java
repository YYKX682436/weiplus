package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.common.EncodedVideoFrame */
/* loaded from: classes14.dex */
public class C3811xcc176140 {
    private static final java.lang.String TAG = "EncodedVideoFrame";

    /* renamed from: data */
    public java.nio.ByteBuffer f14889x2eefaa;
    public long dts;

    /* renamed from: height */
    public int f14894xb7389127;
    public long pts;

    /* renamed from: rotation */
    public int f14902xfd990f7e;

    /* renamed from: videoFormat */
    public android.media.MediaFormat f14904x27b47052;

    /* renamed from: width */
    public int f14905x6be2dc6;

    /* renamed from: producerChainTimestamp */
    public final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7 f14899xb7a56f87 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7();

    /* renamed from: consumerChainTimestamp */
    public final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b f14888x90ca4eb = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b();

    /* renamed from: nativePtr */
    public long f14898xc3e75f57 = 0;

    /* renamed from: nalType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c f14897x668d77f3 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.UNKNOWN;

    /* renamed from: profileType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d f14900xa979083 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d.UNKNOWN;

    /* renamed from: codecType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850 f14887xbcfd1870 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850.H264;

    /* renamed from: gopIndex */
    public long f14892x7ec3bd2a = 0;

    /* renamed from: gopFrameIndex */
    public long f14891xd645ce0d = 0;

    /* renamed from: frameIndex */
    public long f14890xeea76b65 = 0;

    /* renamed from: refFrameIndex */
    public long f14901xf807a458 = 0;

    /* renamed from: svcInfo */
    public java.lang.Integer f14903x925e672e = null;

    /* renamed from: isEosFrame */
    public boolean f14896x84af152e = false;

    /* renamed from: hdrType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.b f14893x2e9b2b50 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.b.UNKNOWN;

    /* renamed from: info */
    public android.media.MediaCodec.BufferInfo f14895x3164ae = null;

    /* renamed from: createEncodedVideoFrame */
    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 m30964xe04057c4(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, long j17, long j18, long j19, long j27, long j28, long j29, int i27, long j37, int i28, int i29, boolean z17, int i37, int i38) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140();
        c3811xcc176140.f14889x2eefaa = byteBuffer;
        c3811xcc176140.f14898xc3e75f57 = j37;
        c3811xcc176140.f14897x668d77f3 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.a(i17);
        c3811xcc176140.f14900xa979083 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d.a(i18);
        c3811xcc176140.f14887xbcfd1870 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850.a(i27);
        c3811xcc176140.f14902xfd990f7e = i19;
        c3811xcc176140.dts = j17;
        c3811xcc176140.pts = j18;
        c3811xcc176140.f14892x7ec3bd2a = j19;
        c3811xcc176140.f14891xd645ce0d = j27;
        c3811xcc176140.f14890xeea76b65 = j28;
        c3811xcc176140.f14901xf807a458 = j29;
        c3811xcc176140.f14895x3164ae = null;
        c3811xcc176140.f14905x6be2dc6 = i28;
        c3811xcc176140.f14894xb7389127 = i29;
        if (z17) {
            c3811xcc176140.f14903x925e672e = java.lang.Integer.valueOf(i37);
        } else {
            c3811xcc176140.f14903x925e672e = null;
        }
        c3811xcc176140.f14893x2e9b2b50 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.b.a(i38);
        return c3811xcc176140;
    }

    /* renamed from: getNalTypeFromH264NALHeader */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c m30965x7d5d7717(java.nio.ByteBuffer byteBuffer, int i17) {
        int i18 = byteBuffer.get(i17) & 31;
        return i18 != 5 ? i18 != 6 ? i18 != 7 ? i18 != 8 ? com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.UNKNOWN : com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.PPS : com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.SPS : com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.SEI : com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.IDR;
    }

    /* renamed from: getNalTypeFromH265NALHeader */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c m30966x71a6e836(java.nio.ByteBuffer byteBuffer, int i17) {
        int i18 = (byteBuffer.get(i17) & 126) >> 1;
        if (i18 == 39) {
            return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.SEI;
        }
        switch (i18) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.IDR;
            default:
                switch (i18) {
                    case 32:
                        return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.VPS;
                    case 33:
                        return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.SPS;
                    case 34:
                        return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.PPS;
                    default:
                        return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.UNKNOWN;
                }
        }
    }

    /* renamed from: getNextNALHeaderPos */
    public static int m30967x1226c977(int i17, java.nio.ByteBuffer byteBuffer) {
        while (true) {
            int i18 = i17 + 3;
            if (i18 >= byteBuffer.remaining()) {
                return -1;
            }
            if (byteBuffer.get(i17) == 0 && byteBuffer.get(i17 + 1) == 0 && byteBuffer.get(i17 + 2) == 0 && byteBuffer.get(i18) == 1) {
                return i17 + 4;
            }
            if (byteBuffer.get(i17) == 0 && byteBuffer.get(i17 + 1) == 0 && byteBuffer.get(i17 + 2) == 1) {
                return i18;
            }
            i17++;
        }
    }

    /* renamed from: nativeRelease */
    private native void m30968x7f877f0(long j17);

    /* renamed from: resetEncodedVideoFrame */
    public static long m30969xf003abd1(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140) {
        long j17 = c3811xcc176140.f14898xc3e75f57;
        if (j17 == 0 || c3811xcc176140.f14889x2eefaa == null) {
            return 0L;
        }
        c3811xcc176140.f14889x2eefaa = null;
        c3811xcc176140.f14898xc3e75f57 = 0L;
        return j17;
    }

    /* renamed from: finalize */
    public void m30970xd764dc1e() {
        super.finalize();
        if (this.f14898xc3e75f57 != 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "nativePtr != 0, must call release before finalize ");
            m30977x41012807();
        }
    }

    /* renamed from: isH265 */
    public boolean m30971xb9a2e553() {
        return this.f14887xbcfd1870 == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850.H265;
    }

    /* renamed from: isHDRFrame */
    public boolean m30972xa156bb61() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.b bVar = this.f14893x2e9b2b50;
        return (bVar == null || bVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.b.UNKNOWN) ? false : true;
    }

    /* renamed from: isIDRFrame */
    public boolean m30973x937e840() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c cVar = this.f14897x668d77f3;
        if (cVar != null) {
            if (cVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.IDR) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isRPSEnable */
    public boolean m30974x65b3fdce() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d dVar = this.f14900xa979083;
        return dVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d.BASELINE_RPS || dVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d.MAIN_RPS || dVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d.HIGH_RPS;
    }

    /* renamed from: isSVCEnable */
    public boolean m30975x1adbc5f9() {
        return this.f14903x925e672e != null;
    }

    /* renamed from: isValidFrame */
    public boolean m30976x7d54c39b() {
        java.nio.ByteBuffer byteBuffer = this.f14889x2eefaa;
        return byteBuffer != null && byteBuffer.remaining() > 0 && this.f14897x668d77f3 != null && this.f14887xbcfd1870 != null && this.f14905x6be2dc6 > 0 && this.f14894xb7389127 > 0;
    }

    /* renamed from: release */
    public void m30977x41012807() {
        long j17 = this.f14898xc3e75f57;
        if (j17 != 0) {
            m30968x7f877f0(j17);
            this.f14898xc3e75f57 = 0L;
        }
    }

    /* renamed from: toString */
    public java.lang.String m30978x9616526c() {
        return "nalType = " + this.f14897x668d77f3 + ", profiletype=" + this.f14900xa979083 + ", rotation=" + this.f14902xfd990f7e + ", codecType=" + this.f14887xbcfd1870 + ", dts=" + this.dts + ", pts=" + this.pts + ", gopIndex=" + this.f14892x7ec3bd2a + ", gopFrameIndex=" + this.f14891xd645ce0d + ", frameIndex=" + this.f14890xeea76b65;
    }

    /* renamed from: updateNALTypeAccordingNALHeader */
    public void m30979x6bc228e() {
        if (this.f14889x2eefaa == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c cVar = this.f14897x668d77f3;
        if (cVar != null && cVar != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.UNKNOWN) {
            return;
        }
        int i17 = 0;
        while (true) {
            i17 = m30967x1226c977(i17, this.f14889x2eefaa);
            if (i17 == -1 || i17 >= this.f14889x2eefaa.remaining()) {
                return;
            }
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c cVar2 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.UNKNOWN;
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c m30966x71a6e836 = m30971xb9a2e553() ? m30966x71a6e836(this.f14889x2eefaa, i17) : m30965x7d5d7717(this.f14889x2eefaa, i17);
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c cVar3 = this.f14897x668d77f3;
            if (cVar3 == null || cVar3 == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.UNKNOWN || m30966x71a6e836 == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.IDR) {
                this.f14897x668d77f3 = m30966x71a6e836;
            }
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c cVar4 = this.f14897x668d77f3;
            if (cVar4 != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.SPS && cVar4 != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.PPS && cVar4 != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.VPS && cVar4 != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.SEI) {
                return;
            }
        }
    }
}
