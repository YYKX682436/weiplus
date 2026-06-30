package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb;

/* renamed from: com.tencent.youtu.sdkkitframework.common.YtVideoEncoder */
/* loaded from: classes13.dex */
public class C27894x3ab176fc {

    /* renamed from: MIME_TYPE */
    private static final java.lang.String f61675x9c2ba465 = "video/avc";
    private static final java.lang.String TAG = "YtVideoEncoder";

    /* renamed from: mCropWidth */
    public static int f61676xc761e729;

    /* renamed from: mHeight */
    private static int f61677x6a4b7f4;

    /* renamed from: mWidth */
    private static int f61678xbefb7959;

    /* renamed from: supportCodecJSONArray */
    private static org.json.JSONArray f61679xc9ae0caa;

    /* renamed from: supportCodecType */
    private static final java.util.Set<java.lang.Integer> f61680x19be1161;

    /* renamed from: codecInfo */
    private android.media.MediaCodecInfo f61682xbcf7ede4;

    /* renamed from: mCroppedData */
    byte[] f61686x9a174a1c;

    /* renamed from: mNewFrameLatch */
    private java.util.concurrent.CountDownLatch f61688x7c5e0b2a;

    /* renamed from: mOutputFile */
    private java.io.File f61690x903e126a;

    /* renamed from: mediaMuxer */
    private android.media.MediaMuxer f61691x72a2eef9;

    /* renamed from: mediaMuxerFormat */
    private android.media.MediaFormat f61692x6decf450;

    /* renamed from: outputFileString */
    private java.lang.String f61694x6f5f9c8e;

    /* renamed from: videoEncoder */
    private android.media.MediaCodec f61697x976c1821;

    /* renamed from: videoTrackIndex */
    private int f61700x8d453122;

    /* renamed from: vidoeEncodeQueue */
    private java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca> f61701x58049c74 = new java.util.concurrent.ConcurrentLinkedQueue<>();

    /* renamed from: isMediaMuxerStarted */
    private boolean f61685x9a2cbb3e = false;

    /* renamed from: mFrameSync */
    private final java.lang.Object f61687x9b3503bb = new java.lang.Object();

    /* renamed from: mediaMuxerSync */
    private final java.lang.Object f61693x79585934 = new java.lang.Object();

    /* renamed from: videoRotation */
    private int f61699xedb0dd19 = 0;

    /* renamed from: videoGenerateIndex */
    private int f61698xc6fbbfa2 = 0;

    /* renamed from: addedTrackCount */
    private int f61681x5ec903a4 = 0;

    /* renamed from: mNoMoreFrames */
    private boolean f61689xd7d99e09 = false;

    /* renamed from: isEncodingStarted */
    private boolean f61684x10ef0924 = false;

    /* renamed from: colorFormat */
    private int f61683x2415bd3a = 21;

    /* renamed from: realColorFormat */
    private int f61695x464c7cbc = 0;

    /* renamed from: selectEncode */
    private java.util.Map<android.media.MediaCodecInfo, java.util.Set<java.lang.Integer>> f61696x6165b232 = new java.util.HashMap();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.youtu.sdkkitframework.common.YtVideoEncoder$VideoEncodeResultCode */
    /* loaded from: classes6.dex */
    public @interface VideoEncodeResultCode {

        /* renamed from: VIDEO_ENCODE_FAIL */
        public static final int f61702x94bffdc3 = -2;

        /* renamed from: VIDEO_ENCODE_SUCCESS */
        public static final int f61703x3b5df1e = 0;

        /* renamed from: VIDEO_MEDIA_NOT_HAS_USE */
        public static final int f61704x81a949b7 = -1;

        /* renamed from: VIDEO_START_SUCCESS */
        public static final int f61705xc12b9002 = 0;
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f61680x19be1161 = hashSet;
        hashSet.add(21);
        hashSet.add(39);
        hashSet.add(19);
        hashSet.add(20);
    }

    /* renamed from: I420ToNV21 */
    private void m120667x9195b0eb(int i17, int i18, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[((i17 * i18) * 3) / 2];
        }
        int i19 = i17 * i18;
        if (i19 >= 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i19);
        }
        int i27 = (i19 / 4) + i19;
        int i28 = i19;
        int i29 = i28;
        while (i28 < (i19 * 3) / 2) {
            bArr2[i27] = bArr[i28];
            bArr2[i29] = bArr[i28 + 1];
            i27++;
            i29++;
            i28 += 2;
        }
    }

    /* renamed from: NV12ToNV21 */
    private void m120668xa06ee4b(int i17, int i18, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[((i17 * i18) * 3) / 2];
        }
        int i19 = i17 * i18;
        if (i19 >= 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i19);
        }
        int i27 = i19;
        while (i27 < (i19 * 3) / 2) {
            int i28 = i27 + 1;
            if (i28 % 2 == 0) {
                int i29 = i27 - 1;
                bArr2[i27] = bArr[i29];
                bArr2[i29] = bArr[i27];
            }
            i27 = i28;
        }
    }

    /* renamed from: colorFormatInt2String */
    public static java.lang.String m120669xbb3124ee(int i17) {
        for (java.lang.reflect.Field field : android.media.MediaCodecInfo.CodecCapabilities.class.getDeclaredFields()) {
            if (field.getName().toLowerCase().contains("COLOR_".toLowerCase())) {
                try {
                    if (field.getInt(null) == i17) {
                        return field.getName();
                    }
                    continue;
                } catch (java.lang.IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return "unknown colorFormat: " + i17;
    }

    /* renamed from: computePresentationTime */
    private long m120670xca64275e(long j17, int i17) {
        return ((j17 * 1000000) / i17) + 132;
    }

    /* renamed from: convertYUV */
    private void m120671x79c97a27(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca c27890x2eae4aca, byte[] bArr) {
        m120672x3de1d42a(c27890x2eae4aca.f61647x723a620d, c27890x2eae4aca.m120617x755bd410(), c27890x2eae4aca.m120615x1c4fb41d(), f61676xc761e729);
        int i17 = this.f61683x2415bd3a;
        if (i17 == 21) {
            m120668xa06ee4b(f61676xc761e729, c27890x2eae4aca.m120615x1c4fb41d(), this.f61686x9a174a1c, bArr);
        } else if (i17 != 39) {
            m120667x9195b0eb(f61676xc761e729, c27890x2eae4aca.m120615x1c4fb41d(), this.f61686x9a174a1c, bArr);
        } else {
            byte[] bArr2 = this.f61686x9a174a1c;
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
    }

    /* renamed from: cropYUV */
    private void m120672x3de1d42a(byte[] bArr, int i17, int i18, int i19) {
        if (this.f61686x9a174a1c == null) {
            this.f61686x9a174a1c = new byte[((i19 * i18) * 3) / 2];
        }
        int i27 = (i17 - i19) / 2;
        int i28 = (i17 * i18) + i27;
        for (int i29 = 0; i29 < i18; i29++) {
            java.lang.System.arraycopy(bArr, i27, this.f61686x9a174a1c, i29 * i19, i19);
            i27 += i17;
        }
        for (int i37 = 0; i37 < i18 / 2; i37++) {
            java.lang.System.arraycopy(bArr, i28, this.f61686x9a174a1c, (i19 * i18) + (i37 * i19), i19);
            i28 += i17;
        }
    }

    /* renamed from: getInputBuffer */
    private java.nio.ByteBuffer m120673xaa9f9f74(int i17) {
        return this.f61697x976c1821.getInputBuffer(i17);
    }

    /* renamed from: getOutputBuffer */
    private java.nio.ByteBuffer m120674x3c33a717(int i17) {
        return this.f61697x976c1821.getOutputBuffer(i17);
    }

    /* renamed from: release */
    private void m120675x41012807() {
        synchronized (this.f61693x79585934) {
            if (this.f61697x976c1821 != null) {
                java.lang.String str = TAG;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str, "reset media codec");
                this.f61697x976c1821.reset();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str, "stop media codec");
                this.f61697x976c1821.stop();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str, "Release media codec");
                this.f61697x976c1821.release();
                this.f61697x976c1821 = null;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str, "RELEASE Video CODEC");
            }
            if (this.f61691x72a2eef9 != null) {
                java.lang.String str2 = TAG;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str2, "Stop media muxer");
                this.f61691x72a2eef9.stop();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str2, "Release media muxer");
                this.f61691x72a2eef9.release();
                this.f61691x72a2eef9 = null;
                this.f61685x9a2cbb3e = false;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str2, "RELEASE MUXER");
            }
            this.f61692x6decf450 = null;
        }
    }

    /* renamed from: startMediaMuxer */
    private void m120676xe3e6fcfb(android.media.MediaFormat mediaFormat) {
        synchronized (this.f61693x79585934) {
            if (this.f61685x9a2cbb3e) {
                android.media.MediaFormat mediaFormat2 = this.f61692x6decf450;
                if (mediaFormat2 != null && mediaFormat != null && mediaFormat2.toString().equals(mediaFormat.toString())) {
                    return;
                }
                try {
                    this.f61691x72a2eef9.stop();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "media muxer stop failed:" + android.util.Log.getStackTraceString(e17));
                }
                this.f61691x72a2eef9.release();
                this.f61691x72a2eef9 = null;
                this.f61685x9a2cbb3e = false;
                try {
                    this.f61691x72a2eef9 = new android.media.MediaMuxer(this.f61694x6f5f9c8e, 0);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Unable to get path for " + android.util.Log.getStackTraceString(e18));
                    return;
                }
            }
            this.f61692x6decf450 = mediaFormat;
            this.f61700x8d453122 = this.f61691x72a2eef9.addTrack(mediaFormat);
            int i17 = this.f61681x5ec903a4 + 1;
            this.f61681x5ec903a4 = i17;
            if (i17 >= 1) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "Media muxer is starting...");
                this.f61691x72a2eef9.start();
                this.f61685x9a2cbb3e = true;
                this.f61693x79585934.notifyAll();
            }
        }
    }

    /* renamed from: abortEncoding */
    public void m120677x426084a3() {
        this.f61684x10ef0924 = false;
        if (this.f61690x903e126a != null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "Clean up record file");
            this.f61690x903e126a.delete();
            this.f61690x903e126a = null;
        }
        if (this.f61697x976c1821 == null || this.f61691x72a2eef9 == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "Failed to abort encoding since it never started");
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "Aborting encoding");
        m120675x41012807();
        this.f61689xd7d99e09 = true;
        this.f61701x58049c74 = new java.util.concurrent.ConcurrentLinkedQueue<>();
        synchronized (this.f61687x9b3503bb) {
            java.util.concurrent.CountDownLatch countDownLatch = this.f61688x7c5e0b2a;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                this.f61688x7c5e0b2a.countDown();
            }
        }
    }

    /* renamed from: clearCache */
    public void m120678xd2bef135() {
        if (this.f61690x903e126a != null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "Clean up record file");
            this.f61690x903e126a.delete();
            this.f61690x903e126a = null;
        }
        if (this.f61684x10ef0924) {
            try {
                this.f61697x976c1821.stop();
                this.f61697x976c1821.release();
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "restart:stop video error" + android.util.Log.getStackTraceString(e17));
            }
        }
        if (this.f61691x72a2eef9 != null) {
            this.f61691x72a2eef9 = null;
        }
        this.f61701x58049c74.clear();
        this.f61684x10ef0924 = false;
    }

    /* renamed from: encode */
    public void m120679xb2963e16(int i17, byte[] bArr) {
        java.util.concurrent.CountDownLatch countDownLatch;
        if (this.f61684x10ef0924) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "Encoder started");
            if (this.f61689xd7d99e09 && this.f61701x58049c74.size() == 0) {
                return;
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca poll = this.f61701x58049c74.poll();
            if (poll == null) {
                synchronized (this.f61687x9b3503bb) {
                    countDownLatch = new java.util.concurrent.CountDownLatch(1);
                    this.f61688x7c5e0b2a = countDownLatch;
                }
                try {
                    countDownLatch.await();
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Queueing frame" + android.util.Log.getStackTraceString(e17));
                }
                poll = this.f61701x58049c74.poll();
            }
            if (poll == null) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "encode data is Null!!: ");
                return;
            }
            m120671x79c97a27(poll, bArr);
            int dequeueInputBuffer = this.f61697x976c1821.dequeueInputBuffer(200000L);
            long m120670xca64275e = m120670xca64275e(this.f61698xc6fbbfa2, i17);
            if (dequeueInputBuffer >= 0) {
                java.nio.ByteBuffer m120673xaa9f9f74 = m120673xaa9f9f74(dequeueInputBuffer);
                m120673xaa9f9f74.clear();
                m120673xaa9f9f74.put(bArr);
                this.f61697x976c1821.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, m120670xca64275e, 0);
                this.f61698xc6fbbfa2++;
            }
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.f61697x976c1821.dequeueOutputBuffer(bufferInfo, 200000L);
            if (dequeueOutputBuffer == -1) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "No output from encoder available");
                return;
            }
            if (dequeueOutputBuffer == -2) {
                m120676xe3e6fcfb(this.f61697x976c1821.getOutputFormat());
                return;
            }
            if (dequeueOutputBuffer < 0) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
                return;
            }
            if (bufferInfo.size != 0) {
                java.nio.ByteBuffer m120674x3c33a717 = m120674x3c33a717(dequeueOutputBuffer);
                if (m120674x3c33a717 == null) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                    return;
                }
                m120674x3c33a717.position(bufferInfo.offset);
                m120674x3c33a717.limit(bufferInfo.offset + bufferInfo.size);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "media muxer write video data outputindex " + this.f61698xc6fbbfa2);
                synchronized (this.f61691x72a2eef9) {
                    this.f61691x72a2eef9.writeSampleData(this.f61700x8d453122, m120674x3c33a717, bufferInfo);
                }
                this.f61697x976c1821.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        }
    }

    /* renamed from: getCodecInfo */
    public android.media.MediaCodecInfo m120680xbc655f2e() {
        return this.f61682xbcf7ede4;
    }

    /* renamed from: getColorFormat */
    public int m120681xfdec0404() {
        return this.f61695x464c7cbc;
    }

    /* renamed from: getMediaCodecInfos */
    public void m120682x59d95fdd() {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder() && (codecInfoAt.getName().contains("google") || codecInfoAt.getName().contains(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f))) {
                for (java.lang.String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                        java.util.HashSet hashSet = new java.util.HashSet();
                        int i18 = 0;
                        while (true) {
                            int[] iArr = capabilitiesForType.colorFormats;
                            if (i18 >= iArr.length) {
                                break;
                            }
                            int i19 = iArr[i18];
                            if (f61680x19be1161.contains(java.lang.Integer.valueOf(i19))) {
                                hashSet.add(java.lang.Integer.valueOf(i19));
                            }
                            i18++;
                        }
                        if (hashSet.size() > 0) {
                            this.f61696x6165b232.put(codecInfoAt, hashSet);
                        }
                    }
                }
            }
        }
        f61679xc9ae0caa = new org.json.JSONArray();
        for (android.media.MediaCodecInfo mediaCodecInfo : this.f61696x6165b232.keySet()) {
            try {
                f61679xc9ae0caa.put(mediaCodecInfo.getName() + ":" + java.util.Arrays.toString(this.f61696x6165b232.get(mediaCodecInfo).toArray(new java.lang.Integer[0])));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "supportCodecJSONArray error" + android.util.Log.getStackTraceString(e17));
            }
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, f61679xc9ae0caa.length() + "--getMediaCodecInfos:" + f61679xc9ae0caa.toString());
    }

    /* renamed from: getSupportCodecJSONStr */
    public java.lang.String m120683xb1e7958c() {
        return f61679xc9ae0caa.toString();
    }

    /* renamed from: isEncodingStarted */
    public boolean m120684x10ef0924() {
        return this.f61684x10ef0924;
    }

    /* renamed from: queueFrame */
    public void m120685x712aa2dc(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca c27890x2eae4aca) {
        if (!this.f61684x10ef0924 || this.f61697x976c1821 == null || this.f61691x72a2eef9 == null) {
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "Queueing frame");
        this.f61701x58049c74.add(c27890x2eae4aca);
        synchronized (this.f61687x9b3503bb) {
            java.util.concurrent.CountDownLatch countDownLatch = this.f61688x7c5e0b2a;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                this.f61688x7c5e0b2a.countDown();
            }
        }
    }

    /* renamed from: selectColorFormat */
    public int m120686x80967a9e() {
        java.util.Map<android.media.MediaCodecInfo, java.util.Set<java.lang.Integer>> map = this.f61696x6165b232;
        if (map != null && map.size() != 0) {
            if (this.f61682xbcf7ede4 == null) {
                java.util.Iterator<android.media.MediaCodecInfo> it = this.f61696x6165b232.keySet().iterator();
                if (it.hasNext()) {
                    this.f61682xbcf7ede4 = it.next();
                }
            }
            java.util.Set<java.lang.Integer> set = this.f61696x6165b232.get(this.f61682xbcf7ede4);
            if (set == null || set.size() == 0) {
                this.f61696x6165b232.remove(this.f61682xbcf7ede4);
                java.util.Iterator<android.media.MediaCodecInfo> it6 = this.f61696x6165b232.keySet().iterator();
                if (it6.hasNext()) {
                    android.media.MediaCodecInfo next = it6.next();
                    this.f61682xbcf7ede4 = next;
                    set = this.f61696x6165b232.get(next);
                }
            }
            if (set.contains(21)) {
                set.remove(21);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "codecInfo=" + this.f61682xbcf7ede4.getName() + "|selectColorFormat:" + m120669xbb3124ee(21));
                return 21;
            }
            java.util.Iterator<java.lang.Integer> it7 = set.iterator();
            if (it7.hasNext()) {
                java.lang.Integer next2 = it7.next();
                it7.remove();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, "codecInfo=" + this.f61682xbcf7ede4.getName() + "|selectColorFormat:" + m120669xbb3124ee(next2.intValue()));
                return next2.intValue();
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "selectColorFormat error");
        }
        return -1;
    }

    /* renamed from: startEncoding */
    public void m120687x6d92d3d5(int i17, int i18, java.io.File file, int i19, int i27, int i28, int i29) {
        if (i17 == 480) {
            f61676xc761e729 = com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df;
        } else if (i17 == 720) {
            f61676xc761e729 = 704;
        } else {
            f61676xc761e729 = i17;
        }
        f61678xbefb7959 = i17;
        f61677x6a4b7f4 = i18;
        this.f61690x903e126a = file;
        file.delete();
        this.f61694x6f5f9c8e = file.getCanonicalPath();
        if (this.f61691x72a2eef9 == null) {
            android.media.MediaMuxer mediaMuxer = new android.media.MediaMuxer(this.f61694x6f5f9c8e, 0);
            this.f61691x72a2eef9 = mediaMuxer;
            mediaMuxer.setOrientationHint(this.f61699xedb0dd19);
        }
        java.lang.String str = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(str, "found codec: " + this.f61682xbcf7ede4.getName() + "|colorFormat:" + i29);
        this.f61695x464c7cbc = i29;
        this.f61697x976c1821 = android.media.MediaCodec.createByCodecName(this.f61682xbcf7ede4.getName());
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat("video/avc", f61676xc761e729, f61677x6a4b7f4);
        createVideoFormat.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, i19);
        createVideoFormat.setInteger("frame-rate", i27);
        createVideoFormat.setInteger("color-format", i29);
        createVideoFormat.setInteger("i-frame-interval", i28);
        this.f61697x976c1821.configure(createVideoFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        this.f61697x976c1821.start();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "Initialization complete. Starting encoder...");
        this.f61684x10ef0924 = true;
    }

    /* renamed from: stopEncoding */
    public void m120688x20107775() {
        this.f61684x10ef0924 = false;
        if (this.f61697x976c1821 == null || this.f61691x72a2eef9 == null) {
            return;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "Stopping encoding");
        this.f61689xd7d99e09 = true;
        synchronized (this.f61687x9b3503bb) {
            java.util.concurrent.CountDownLatch countDownLatch = this.f61688x7c5e0b2a;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                this.f61688x7c5e0b2a.countDown();
            }
        }
        m120675x41012807();
    }
}
