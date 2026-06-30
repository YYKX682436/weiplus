package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AudioCompositor */
/* loaded from: classes16.dex */
public class C25670x49b6bc57 {

    /* renamed from: audioMixer */
    private com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3 f47436x5b56f5d3;

    /* renamed from: currentSamples */
    private java.nio.ShortBuffer f47438x1063b050;

    /* renamed from: lastSamples */
    private java.nio.ShortBuffer f47439xdf755093;
    private final java.lang.String TAG = "AudioCompositor@" + java.lang.Integer.toHexString(hashCode());

    /* renamed from: audioResample */
    private final com.p314xaae8f345.tav.p2947x2eaf9f.C25673xa753cb73 f47437x77b49b93 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25673xa753cb73();

    public C25670x49b6bc57(com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        this.f47436x5b56f5d3 = new com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3(c25756x82a4b984.f47985x88751aa, c25756x82a4b984.f47983xf99d8dcc);
    }

    /* renamed from: resample */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 m96679xeae2d19d(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        java.nio.ByteBuffer m96698xeae2d19d;
        java.nio.ByteBuffer m97192x1d62828 = c25734xcdff9c14.m97192x1d62828();
        if (m97192x1d62828 == null || m97192x1d62828.limit() <= 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.f47437x77b49b93.TAG, "resample: 不进行重采样 byteBuffer = " + m97192x1d62828);
            return c25756x82a4b984;
        }
        if (com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8.m97805x9cf0d20b().m97807x439a014a() && (m96698xeae2d19d = this.f47437x77b49b93.m96698xeae2d19d(m97192x1d62828, c25756x82a4b984)) != null) {
            c25756x82a4b984 = this.f47437x77b49b93.m96697x84ccd6c();
            m97192x1d62828 = m96698xeae2d19d;
        }
        c25734xcdff9c14.m97198xa5d2bd34(m97192x1d62828);
        return c25756x82a4b984;
    }

    /* renamed from: clear */
    public synchronized void m96680x5a5b64d() {
        this.f47438x1063b050 = null;
        this.f47439xdf755093 = null;
    }

    /* renamed from: processFrame */
    public java.nio.ByteBuffer m96681x756f483e(java.nio.ByteBuffer byteBuffer, float f17, float f18, com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        this.f47436x5b56f5d3.m97432x66f3cb62(c25756x82a4b984.f47985x88751aa, c25756x82a4b984.f47983xf99d8dcc, c25756x82a4b984.f47984x2771c84d);
        return this.f47436x5b56f5d3.m97430x753a5f3c(byteBuffer, f18, f17, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[Catch: all -> 0x01cc, TryCatch #1 {, blocks: (B:10:0x0009, B:14:0x0013, B:16:0x0023, B:19:0x002a, B:20:0x0047, B:22:0x004b, B:24:0x0051, B:26:0x0059, B:27:0x007d, B:28:0x008d, B:79:0x01b1, B:82:0x0030, B:5:0x01c6, B:33:0x0099, B:35:0x00cd, B:38:0x00db, B:40:0x00e6, B:41:0x00f0, B:43:0x00f6, B:48:0x0102, B:50:0x010c, B:52:0x0112, B:53:0x0129, B:58:0x013d, B:60:0x0146, B:63:0x014d, B:64:0x016a, B:69:0x0153, B:55:0x0183, B:65:0x0190), top: B:9:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x01cc, TryCatch #1 {, blocks: (B:10:0x0009, B:14:0x0013, B:16:0x0023, B:19:0x002a, B:20:0x0047, B:22:0x004b, B:24:0x0051, B:26:0x0059, B:27:0x007d, B:28:0x008d, B:79:0x01b1, B:82:0x0030, B:5:0x01c6, B:33:0x0099, B:35:0x00cd, B:38:0x00db, B:40:0x00e6, B:41:0x00f0, B:43:0x00f6, B:48:0x0102, B:50:0x010c, B:52:0x0112, B:53:0x0129, B:58:0x013d, B:60:0x0146, B:63:0x014d, B:64:0x016a, B:69:0x0153, B:55:0x0183, B:65:0x0190), top: B:9:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0190 A[EDGE_INSN: B:81:0x0190->B:65:0x0190 BREAK  A[LOOP:0: B:30:0x0095->B:47:0x018d], SYNTHETIC] */
    /* renamed from: readMergeSample */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m96682xef17908c(com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d r17, com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae r18, com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 r19) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.tav.p2947x2eaf9f.C25670x49b6bc57.m96682xef17908c(com.tencent.tav.decoder.AudioDecoderTrack, com.tencent.tav.core.AudioMixInputParameters, com.tencent.tav.coremedia.CMSampleBuffer):com.tencent.tav.coremedia.CMSampleBuffer");
    }

    /* renamed from: setAudioInfo */
    public void m96683x66f3cb62(com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        this.f47436x5b56f5d3 = new com.p314xaae8f345.tav.p2959x5befac44.C25757xd228d1f3(c25756x82a4b984.f47985x88751aa, c25756x82a4b984.f47983xf99d8dcc);
    }
}
