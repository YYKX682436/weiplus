package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder */
/* loaded from: classes13.dex */
public class C25374xc88b5d32 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813 {

    /* renamed from: CONTINUOUS_TIMEOUT_COUNT */
    private static final int f45836x70c6b41 = 500;

    /* renamed from: KEY_BIT_RATE */
    private static final java.lang.String f45837xc809aef2 = "bit-rate";

    /* renamed from: KEY_PCM_ENCODING */
    private static final java.lang.String f45838xca19f138 = "pcm-encoding";
    private static final java.lang.String TAG = "MediaCodecDecoder";

    /* renamed from: TIMEOUT_AUTO_SEEK_INTERVAL_MS */
    private static final long f45839xea1cdc2b = 5000;

    /* renamed from: TIMEOUT_US */
    private static final int f45840x7c09825c = 1000;

    /* renamed from: mMediaExtractor */
    private final android.media.MediaExtractor f45847x5739286d = new android.media.MediaExtractor();

    /* renamed from: mMediaCodec */
    private android.media.MediaCodec f45846x4e44f6df = null;

    /* renamed from: mInfo */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 f45845x622dabb = null;

    /* renamed from: mDecoderFinished */
    private boolean f45843x5127ca9 = false;

    /* renamed from: mCurrentDecodeTime */
    private long f45842x8d230f47 = 0;

    /* renamed from: mRemainBuffer */
    private volatile byte[] f45848xc1a7dad9 = null;

    /* renamed from: mSeekTable */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 f45849xab851249 = null;

    /* renamed from: mFileSize */
    private long f45844xf925d32a = 0;

    /* renamed from: mAudioTrackRef */
    private java.lang.ref.WeakReference<android.media.AudioTrack> f45841x339999d1 = new java.lang.ref.WeakReference<>(null);

    /* renamed from: com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder$BufferTimeoutException */
    /* loaded from: classes13.dex */
    public static class BufferTimeoutException extends java.lang.Exception {
        public BufferTimeoutException() {
            super("buffer timeout exception");
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder$NullInputBufferException */
    /* loaded from: classes13.dex */
    public static class NullInputBufferException extends java.lang.Exception {
        public NullInputBufferException() {
            super("Null Input Buffer exception");
        }
    }

    /* renamed from: decodeDataInternal */
    private int m94003x9cc84195(int i17, byte[] bArr) {
        int m94009x1b84edc;
        byte[] bArr2 = this.f45848xc1a7dad9;
        if (bArr2 != null && bArr2.length > 0) {
            if (i17 >= bArr2.length) {
                java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                int length = bArr2.length;
                this.f45848xc1a7dad9 = null;
                return length;
            }
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, i17);
            int length2 = bArr2.length - i17;
            byte[] bArr3 = new byte[length2];
            java.lang.System.arraycopy(bArr2, i17, bArr3, 0, length2);
            this.f45848xc1a7dad9 = bArr3;
            return i17;
        }
        if (this.f45846x4e44f6df == null) {
            return 0;
        }
        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
        int i18 = 0;
        int i19 = 0;
        while (!this.f45843x5127ca9 && i18 <= 0) {
            try {
                m94009x1b84edc = m94009x1b84edc(bufferInfo);
            } catch (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32.NullInputBufferException unused) {
            }
            if (m94009x1b84edc == -3) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "INFO_OUTPUT_BUFFERS_CHANGED");
            } else if (m94009x1b84edc == -2) {
                android.media.MediaFormat outputFormat = this.f45846x4e44f6df.getOutputFormat();
                android.media.AudioTrack audioTrack = this.f45841x339999d1.get();
                if (audioTrack != null && outputFormat != null) {
                    audioTrack.setPlaybackRate(outputFormat.getInteger("sample-rate"));
                }
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "New format " + outputFormat);
            } else if (m94009x1b84edc != -1) {
                java.nio.ByteBuffer outputBuffer = this.f45846x4e44f6df.getOutputBuffer(m94009x1b84edc);
                if (outputBuffer != null) {
                    i18 = java.lang.Math.min(java.lang.Math.min(i17, outputBuffer.remaining()), bArr.length);
                    outputBuffer.get(bArr, 0, i18);
                    int i27 = bufferInfo.size;
                    if (i27 > i17) {
                        int i28 = i27 - i17;
                        this.f45848xc1a7dad9 = new byte[i28];
                        outputBuffer.get(this.f45848xc1a7dad9, 0, i28);
                    }
                    outputBuffer.clear();
                    this.f45846x4e44f6df.releaseOutputBuffer(m94009x1b84edc, false);
                    long j17 = this.f45842x8d230f47;
                    this.f45842x8d230f47 = bufferInfo.presentationTimeUs / 1000;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396 = this.f45845x622dabb;
                    if (c25316x94782396 != null && c25316x94782396.m93537xbc5bbb2c() == 0) {
                        this.f45845x622dabb.m93548xab112a30(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25318x39612e21.m93567x3a4364dd(bufferInfo.size, this.f45842x8d230f47 - j17, this.f45845x622dabb.m93539xd13e6146(), this.f45845x622dabb.m93542xf6c809a0()));
                    }
                }
            } else {
                i19++;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "dequeueOutputBuffer timed out!");
                if (i19 == 500) {
                    throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32.BufferTimeoutException();
                }
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.f45843x5127ca9 = true;
                this.f45842x8d230f47 = mo93989x51e8b0a();
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "OutputBuffer BUFFER_FLAG_END_OF_STREAM");
            }
        }
        return i18;
    }

    /* renamed from: getAudioType */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94005xaa5357a(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        try {
            mediaExtractor.setDataSource(str);
            z17 = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "getAudioType", th6);
            z17 = false;
        }
        if (!z17) {
            return audioType;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21 c25437x56394f21 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(str);
        c25437x56394f21.mo94263x34264a();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94004xaa5357a = m94004xaa5357a(mediaExtractor, c25437x56394f21);
        c25437x56394f21.close();
        return m94004xaa5357a;
    }

    /* renamed from: getMediaFormatByExtractor */
    private static android.media.MediaFormat m94006x247f3e88(android.media.MediaExtractor mediaExtractor) {
        for (int i17 = 0; i17 < mediaExtractor.getTrackCount(); i17++) {
            android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(i17);
            java.lang.String string = trackFormat.getString("mime");
            if (!android.text.TextUtils.isEmpty(string) && string.startsWith("audio")) {
                return trackFormat;
            }
        }
        return null;
    }

    /* renamed from: initAudioInformation */
    private boolean m94007x21dd68a6(java.lang.String str, int i17, android.media.MediaFormat mediaFormat, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType) {
        android.media.MediaFormat mediaFormat2;
        this.f45847x5739286d.selectTrack(i17);
        android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(str);
        this.f45846x4e44f6df = createDecoderByType;
        createDecoderByType.configure(mediaFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        this.f45846x4e44f6df.start();
        int i18 = -1;
        for (int i19 = 0; i19 < 500 && (i18 == -1 || i18 == -3); i19++) {
            try {
                i18 = m94009x1b84edc(new android.media.MediaCodec.BufferInfo());
            } catch (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32.NullInputBufferException unused) {
            }
            if (i18 == -2) {
                mediaFormat2 = this.f45846x4e44f6df.getOutputFormat();
                break;
            }
        }
        mediaFormat2 = null;
        if (mediaFormat2 == null) {
            this.f45846x4e44f6df.release();
            return false;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "format:" + mediaFormat + " outputFormat:" + mediaFormat2);
        java.lang.String str2 = f45838xca19f138;
        if (mediaFormat2.containsKey(str2)) {
            mediaFormat.setInteger(str2, mediaFormat2.getInteger(str2));
        }
        if (mediaFormat2.containsKey("sample-rate")) {
            mediaFormat.setInteger("sample-rate", mediaFormat2.getInteger("sample-rate"));
        }
        if (mediaFormat2.containsKey("channel-count")) {
            mediaFormat.setInteger("channel-count", mediaFormat2.getInteger("channel-count"));
        }
        m94010x2e68af0c(this.f45845x622dabb, mediaFormat, interfaceC25439x37e1318e.mo94260xfb854877());
        if (audioType == com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC) {
            this.f45849xab851249 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e((int) this.f45845x622dabb.m93542xf6c809a0());
        } else if (audioType == com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.M4A || audioType == com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.MP4) {
            this.f45849xab851249 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.C25418xbba7d465();
        } else if (audioType == com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.MP3) {
            this.f45849xab851249 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25416xc75e6346();
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 interfaceC25410xa83fe816 = this.f45849xab851249;
        if (interfaceC25410xa83fe816 != null) {
            try {
                interfaceC25410xa83fe816.mo94147x6581ab3(interfaceC25439x37e1318e);
            } catch (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b e17) {
                this.f45849xab851249 = null;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "seek table parse", e17);
            }
        }
        return this.f45845x622dabb.m93540x51e8b0a() > 0 && this.f45845x622dabb.m93539xd13e6146() >= 2;
    }

    /* renamed from: initMediaCodecAndFormat */
    private boolean m94008x8b66f0c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        for (int i17 = 0; i17 < this.f45847x5739286d.getTrackCount(); i17++) {
            android.media.MediaFormat trackFormat = this.f45847x5739286d.getTrackFormat(i17);
            java.lang.String string = trackFormat.getString("mime");
            if (!android.text.TextUtils.isEmpty(string) && string.startsWith("audio")) {
                this.f45845x622dabb = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396();
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a = interfaceC25439x37e1318e.mo94257xaa5357a();
                this.f45845x622dabb.m93547x66f8f5ee(mo94257xaa5357a);
                m93999x66f8f5ee(mo94257xaa5357a);
                return m94007x21dd68a6(string, i17, trackFormat, interfaceC25439x37e1318e, mo94257xaa5357a);
            }
        }
        return false;
    }

    /* renamed from: processInputOutputBuffer */
    private int m94009x1b84edc(android.media.MediaCodec.BufferInfo bufferInfo) {
        int dequeueInputBuffer = this.f45846x4e44f6df.dequeueInputBuffer(1000L);
        if (dequeueInputBuffer >= 0) {
            java.nio.ByteBuffer inputBuffer = this.f45846x4e44f6df.getInputBuffer(dequeueInputBuffer);
            if (inputBuffer == null) {
                throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32.NullInputBufferException();
            }
            int readSampleData = this.f45847x5739286d.readSampleData(inputBuffer, 0);
            if (readSampleData < 0) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "InputBuffer BUFFER_FLAG_END_OF_STREAM");
                this.f45846x4e44f6df.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.f45846x4e44f6df.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.f45847x5739286d.getSampleTime(), 0);
                this.f45847x5739286d.advance();
            }
        }
        return this.f45846x4e44f6df.dequeueOutputBuffer(bufferInfo, 1000L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(2:36|(1:38)(1:39))|4|(2:6|(1:8)(1:28))(2:29|(2:31|(1:33)(1:34))(1:35))|9|(7:11|(1:13)(1:26)|15|16|(1:(1:19))(1:23)|20|21)|27|15|16|(0)(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (r5 != 4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* renamed from: setAudioInformationByMediaFormat */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m94010x2e68af0c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 r16, android.media.MediaFormat r17, long r18) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "sample-rate"
            int r2 = r1.getInteger(r2)
            java.lang.String r3 = "channel-count"
            int r3 = r1.getInteger(r3)
            java.lang.String r4 = "bitrate"
            boolean r5 = r1.containsKey(r4)
            r6 = 0
            if (r5 == 0) goto L20
            int r4 = r1.getInteger(r4)
            int r4 = r4 / 1000
            goto L30
        L20:
            java.lang.String r4 = "bit-rate"
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L2f
            int r4 = r1.getInteger(r4)
            int r4 = r4 / 1000
            goto L30
        L2f:
            r4 = r6
        L30:
            r7 = 8
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r5 = "durationUs"
            if (r4 <= 0) goto L4b
            boolean r11 = r1.containsKey(r5)
            if (r11 == 0) goto L44
            long r7 = r1.getLong(r5)
            long r7 = r7 / r9
            goto L68
        L44:
            long r9 = (long) r4
            long r9 = r18 / r9
            long r9 = r9 * r7
            int r5 = (int) r9
            long r7 = (long) r5
            goto L68
        L4b:
            boolean r11 = r1.containsKey(r5)
            r12 = 0
            if (r11 == 0) goto L67
            long r4 = r1.getLong(r5)
            long r4 = r4 / r9
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 <= 0) goto L64
            long r9 = r18 / r4
            long r9 = r9 * r7
            int r7 = (int) r9
            r14 = r4
            r4 = r7
            r7 = r14
            goto L68
        L64:
            r7 = r4
            r4 = r6
            goto L68
        L67:
            r7 = r12
        L68:
            java.lang.String r5 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32.f45838xca19f138
            boolean r9 = r1.containsKey(r5)
            r10 = 3
            r11 = 1
            r12 = 2
            if (r9 == 0) goto L7c
            int r5 = r1.getInteger(r5)
            if (r5 == r10) goto L7e
            r9 = 4
            if (r5 == r9) goto L7f
        L7c:
            r9 = r12
            goto L7f
        L7e:
            r9 = r11
        L7f:
            java.lang.String r5 = "bitrate-mode"
            int r6 = r1.getInteger(r5)     // Catch: java.lang.Exception -> L85
        L85:
            if (r6 == r11) goto L8e
            if (r6 == r12) goto L8a
            goto L91
        L8a:
            r0.m93550xca025831(r11)
            goto L91
        L8e:
            r0.m93550xca025831(r10)
        L91:
            long r1 = (long) r2
            r0.m93554x24ec57ac(r1)
            r0.m93551xcbf6c252(r3)
            r0.m93552xffd6ec16(r7)
            r0.m93549xab2604ab(r4)
            r0.m93548xab112a30(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32.m94010x2e68af0c(com.tencent.qqmusic.mediaplayer.AudioInformation, android.media.MediaFormat, long):void");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: decodeData */
    public int mo93984xb7ec4eb8(int i17, byte[] bArr) {
        long mo93988xfdac66b0;
        try {
            return m94003x9cc84195(i17, bArr);
        } catch (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32.BufferTimeoutException unused) {
            do {
                mo93988xfdac66b0 = mo93988xfdac66b0() + f45839xea1cdc2b;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "decodeData buffer timeout, seekTime:" + mo93988xfdac66b0);
                mo93997xc9fc1b13((int) java.lang.Math.min(mo93989x51e8b0a(), mo93988xfdac66b0));
                try {
                    return m94003x9cc84195(i17, bArr);
                } catch (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32.BufferTimeoutException unused2) {
                    if (mo93988xfdac66b0 < mo93989x51e8b0a()) {
                        return -1;
                    }
                }
            } while (mo93988xfdac66b0 < mo93989x51e8b0a());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getAudioInformation */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93985x6e8c46ec() {
        return this.f45845x622dabb;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getBytePositionOfTime */
    public long mo93987x775e74eb(long j17) {
        int m93538x37b4b737 = this.f45845x622dabb.m93538x37b4b737();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 interfaceC25410xa83fe816 = this.f45849xab851249;
        if (interfaceC25410xa83fe816 != null) {
            return interfaceC25410xa83fe816.mo94148x35ce78(j17);
        }
        if (m93538x37b4b737 > 0) {
            return j17 * m93538x37b4b737;
        }
        if (mo93989x51e8b0a() > 0) {
            return (this.f45844xf925d32a * j17) / mo93989x51e8b0a();
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getCurrentTime */
    public long mo93988xfdac66b0() {
        return this.f45842x8d230f47;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getDuration */
    public long mo93989x51e8b0a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396 = this.f45845x622dabb;
        if (c25316x94782396 != null) {
            return c25316x94782396.m93540x51e8b0a();
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getErrorCodeMask */
    public int mo93990x5470d4eb() {
        return -1;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getMinBufferSize */
    public long mo93991x55bbc89d() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396 = this.f45845x622dabb;
        if (c25316x94782396 == null) {
            return 0L;
        }
        int m93537xbc5bbb2c = c25316x94782396.m93537xbc5bbb2c();
        return android.media.AudioTrack.getMinBufferSize((int) this.f45845x622dabb.m93542xf6c809a0(), 12, m93537xbc5bbb2c == 1 ? 3 : m93537xbc5bbb2c == 4 ? 4 : 2);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getNativeLibs */
    public java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65> mo93992xa743473b() {
        return new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: init */
    public int mo93994x316510(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 interfaceC25441x92a45) {
        return -1;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: release */
    public int mo93996x41012807() {
        this.f45847x5739286d.release();
        android.media.MediaCodec mediaCodec = this.f45846x4e44f6df;
        if (mediaCodec == null) {
            return 0;
        }
        mediaCodec.release();
        return 0;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: seekTo */
    public int mo93997xc9fc1b13(int i17) {
        this.f45846x4e44f6df.flush();
        this.f45848xc1a7dad9 = null;
        this.f45847x5739286d.seekTo(i17 * 1000, 2);
        this.f45842x8d230f47 = i17;
        return i17;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: setAudioTrack */
    public void mo93998x78226117(android.media.AudioTrack audioTrack) {
        this.f45841x339999d1 = new java.lang.ref.WeakReference<>(audioTrack);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: init */
    public int mo93995x316510(java.lang.String str, boolean z17) {
        return mo93993x316510(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(str));
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: init */
    public int mo93993x316510(final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        if (interfaceC25439x37e1318e == null) {
            return -1;
        }
        try {
            interfaceC25439x37e1318e.mo94263x34264a();
            this.f45847x5739286d.setDataSource(new android.media.MediaDataSource() { // from class: com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.1
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // android.media.MediaDataSource
                public long getSize() {
                    return interfaceC25439x37e1318e.mo94260xfb854877();
                }

                @Override // android.media.MediaDataSource
                public int readAt(long j17, byte[] bArr, int i17, int i18) {
                    return interfaceC25439x37e1318e.mo94264xc8455469(j17, bArr, i17, i18);
                }
            });
            this.f45844xf925d32a = interfaceC25439x37e1318e.mo94260xfb854877();
            return m94008x8b66f0c(interfaceC25439x37e1318e) ? 0 : -1;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, th6);
            return -1;
        }
    }

    /* renamed from: getAudioType */
    private static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94004xaa5357a(android.media.MediaExtractor mediaExtractor, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
        android.media.MediaFormat m94006x247f3e88 = m94006x247f3e88(mediaExtractor);
        if (m94006x247f3e88 == null) {
            return audioType;
        }
        java.lang.String string = m94006x247f3e88.getString("mime");
        if (android.text.TextUtils.isEmpty(string) || !string.startsWith("audio")) {
            return audioType;
        }
        char c17 = 65535;
        switch (string.hashCode()) {
            case -1003765268:
                if (string.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54266xd63d2e3c)) {
                    c17 = 0;
                    break;
                }
                break;
            case -53558318:
                if (string.equals("audio/mp4a-latm")) {
                    c17 = 1;
                    break;
                }
                break;
            case 187094639:
                if (string.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54263xb16343ff)) {
                    c17 = 2;
                    break;
                }
                break;
            case 1504619009:
                if (string.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54255x7affee51)) {
                    c17 = 3;
                    break;
                }
                break;
            case 1504831518:
                if (string.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54258x7b032c6e)) {
                    c17 = 4;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.OGG;
            case 1:
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2901xb3deea45.C25378xb1d9d012.m94034x5fd1250(interfaceC25439x37e1318e) ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.M4A : audioType;
            case 2:
                if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.p2902x2fff68.C25380xb042ff2f.m94036xb9a2dbb2(interfaceC25439x37e1318e)) {
                    return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC;
                }
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.wav.C25386x2b905d4b.m94069x5fd3d62(interfaceC25439x37e1318e) ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.WAV : audioType;
            case 3:
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.FLAC;
            case 4:
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.MP3;
            default:
                return audioType;
        }
    }
}
