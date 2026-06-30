package ds0;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f324324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f324325b;

    /* renamed from: c, reason: collision with root package name */
    public final int f324326c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f324327d;

    /* renamed from: e, reason: collision with root package name */
    public fs0.f f324328e;

    /* renamed from: f, reason: collision with root package name */
    public fs0.f f324329f;

    /* renamed from: g, reason: collision with root package name */
    public gs0.a f324330g;

    /* renamed from: h, reason: collision with root package name */
    public js0.c f324331h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f324332i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f324333j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f324334k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.HandlerThread f324335l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f324336m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f324337n;

    /* renamed from: o, reason: collision with root package name */
    public int f324338o;

    /* renamed from: p, reason: collision with root package name */
    public int f324339p;

    /* renamed from: q, reason: collision with root package name */
    public int f324340q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f324341r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f324342s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f324343t;

    /* renamed from: u, reason: collision with root package name */
    public long f324344u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f324345v;

    /* renamed from: w, reason: collision with root package name */
    public int f324346w;

    public d0(int i17, int i18, int i19, yz5.q qVar) {
        this.f324324a = i17;
        this.f324325b = i18;
        this.f324326c = i19;
        this.f324327d = qVar;
        int i27 = pu5.i.f440006b;
        this.f324335l = pu5.f.a("MediaCodecAACCodec_EncodeThread", 5);
        lp0.b.D();
        this.f324341r = new ds0.z(this);
        this.f324342s = new ds0.a0(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "init MediaCodecAACCodec, sampleRate:" + i18 + ", channelCount:" + i19);
        this.f324331h = new js0.c(i18, i19, kz5.c0.i(3, 1).contains(java.lang.Integer.valueOf(this.f324324a)), kz5.c0.i(2, 3).contains(java.lang.Integer.valueOf(this.f324324a)), new ds0.a(this), new ds0.b(this));
    }

    public static final void a(ds0.d0 d0Var, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo, android.media.MediaFormat mediaFormat) {
        d0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("encode end ,data size is ");
        sb6.append(byteBuffer);
        sb6.append(' ');
        int i17 = d0Var.f324338o;
        d0Var.f324338o = i17 + 1;
        sb6.append(i17);
        sb6.append(", pts:");
        sb6.append(bufferInfo.presentationTimeUs);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", sb6.toString());
        yz5.q qVar = d0Var.f324327d;
        if (qVar != null) {
            qVar.mo147xb9724478(byteBuffer, bufferInfo, mediaFormat);
        }
    }

    public static final void b(ds0.d0 d0Var) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        kl.k kVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "onFrameEncodeEnd, mixCount:" + d0Var.f324346w);
        js0.c cVar = d0Var.f324331h;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "stopMix");
            java.util.List pcmDataList = cVar.f382999h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pcmDataList, "pcmDataList");
            synchronized (pcmDataList) {
                cVar.f382999h.clear();
            }
            synchronized (cVar.f383004m) {
                cVar.f383002k = true;
                try {
                    cVar.f383004m.notifyAll();
                } catch (java.lang.Exception unused) {
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "isMixingFinish1 " + cVar.f383000i);
            if (!cVar.f383000i) {
                synchronized (cVar.f383005n) {
                    try {
                        if (!cVar.f383000i) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "isMixingFinish2 " + cVar.f383000i);
                            cVar.f383005n.wait();
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                }
            }
            nl.d dVar = cVar.f382996e;
            dVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = dVar.f419675e.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.util.HashMap hashMap4 = dVar.f419677g;
                if (hashMap4.containsKey(str)) {
                    byte[] bArr = (byte[]) hashMap4.get(str);
                    java.util.HashMap hashMap5 = dVar.f419678h;
                    int intValue = ((java.lang.Integer) hashMap5.get(str)).intValue();
                    hl.e eVar = new hl.e();
                    int i17 = dVar.f419674d;
                    byte[] bArr2 = new byte[i17];
                    if (intValue > 0 && intValue <= i17) {
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, intValue);
                    } else if (bArr != null) {
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i17);
                    }
                    eVar.f363571f = bArr2;
                    arrayList.add(eVar);
                    hashMap5.put(str, 0);
                    java.util.Arrays.fill(bArr, 0, nl.d.f419670j, (byte) 0);
                    hashMap4.put(str, bArr);
                }
            }
            byte[] b17 = dVar.b(arrayList);
            nl.d dVar2 = cVar.f382996e;
            java.util.ArrayList arrayList2 = dVar2.f419675e;
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(arrayList2.size())};
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioSyncMixController", "release, ids size:%d", objArr);
            java.util.Iterator it6 = arrayList2.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                hashMap = dVar2.f419678h;
                hashMap2 = dVar2.f419677g;
                hashMap3 = dVar2.f419676f;
                if (!hasNext) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it6.next();
                if (hashMap3.containsKey(str2) && (kVar = (kl.k) hashMap3.remove(str2)) != null) {
                    kVar.mo143607x41012807();
                }
                hashMap2.remove(str2);
                hashMap.remove(str2);
            }
            hashMap3.clear();
            hashMap2.clear();
            hashMap.clear();
            arrayList2.clear();
            if (dVar2.f419679i != null) {
                dVar2.f419679i = null;
            }
            java.lang.String str3 = cVar.f383003l;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopMix, final dstAudio:");
            sb6.append(b17 != null ? b17.length : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
            if (b17 != null) {
                cVar.f382995d.mo149xb9724478(b17, 0L);
            } else {
                cVar.f382995d.mo149xb9724478(new byte[0], 0L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "stopMix finish");
        }
        gs0.a aVar = d0Var.f324330g;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAudioEncoder");
            throw null;
        }
        aVar.b();
        gs0.a aVar2 = d0Var.f324330g;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAudioEncoder");
            throw null;
        }
        aVar2.b();
        yz5.a aVar3 = d0Var.f324337n;
        if (aVar3 != null) {
            aVar3.mo152xb9724478();
        }
    }

    public static final void c(ds0.d0 d0Var) {
        d0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "on background decode end");
        js0.c cVar = d0Var.f324331h;
        if (cVar != null) {
            cVar.d("background");
        }
        d0Var.l(true);
    }

    public static final void d(ds0.d0 d0Var, byte[] bArr, long j17) {
        js0.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "on background frame decode, isDecodeEnd:" + d0Var.f324332i);
        if (d0Var.f324332i) {
            return;
        }
        d0Var.f324339p++;
        if (bArr != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "input background data");
            fs0.f fVar = d0Var.f324329f;
            if (fVar == null || (cVar = d0Var.f324331h) == null) {
                return;
            }
            cVar.c(bArr, "background", j17, fVar.b(), fVar.a());
        }
    }

    public static final void e(ds0.d0 d0Var, byte[] bArr, long j17) {
        d0Var.f324346w++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "onFrameMixEnd, mixCount:" + d0Var.f324346w + ", decodeMusicFrameCount:" + d0Var.f324340q + ", decodeBackgroundFrameCount:" + d0Var.f324339p + ", mixType:" + d0Var.f324324a + ", data:" + bArr.length + ", pts:" + j17);
        if (d0Var.f324324a == 3) {
            d0Var.h(bArr, j17, d0Var.f324332i && d0Var.f324346w == d0Var.f324339p);
            return;
        }
        if (!d0Var.f324332i) {
            d0Var.h(bArr, j17, false);
        } else if (d0Var.f324324a == 2) {
            d0Var.h(bArr, j17, d0Var.f324332i && d0Var.f324346w == d0Var.f324340q);
        } else {
            d0Var.h(bArr, j17, d0Var.f324332i && d0Var.f324346w == d0Var.f324339p);
        }
    }

    public static final void f(ds0.d0 d0Var) {
        d0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "on music decode end");
        js0.c cVar = d0Var.f324331h;
        if (cVar != null) {
            cVar.d("music");
        }
        d0Var.l(false);
    }

    public static final void g(ds0.d0 d0Var, byte[] bArr, long j17) {
        js0.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "on music frame decode, isDecodeEnd:" + d0Var.f324332i);
        if (d0Var.f324332i && d0Var.f324340q == d0Var.f324339p) {
            return;
        }
        d0Var.f324340q++;
        if (bArr != null) {
            fs0.f fVar = d0Var.f324328e;
            if (fVar != null && (cVar = d0Var.f324331h) != null) {
                cVar.c(bArr, "music", j17, fVar.b(), fVar.a());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "input music data");
        }
    }

    public final void h(byte[] bArr, long j17, boolean z17) {
        if (this.f324336m == null) {
            android.os.HandlerThread handlerThread = this.f324335l;
            handlerThread.start();
            this.f324336m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper(), new ds0.d(this));
        }
        if (z17) {
            this.f324345v = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f324336m;
        android.os.Message mo50288x733c63a2 = n3Var != null ? n3Var.mo50288x733c63a2() : null;
        if (mo50288x733c63a2 != null) {
            mo50288x733c63a2.what = 1024;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        ds0.c cVar = new ds0.c(copyOf, j17, z17);
        if (mo50288x733c63a2 != null) {
            mo50288x733c63a2.obj = cVar;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f324336m;
        if (n3Var2 != null) {
            n3Var2.mo50308x2936bf5f(mo50288x733c63a2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "checkPostEncoder, " + cVar.f324319a.length + ", pts:" + cVar.f324320b + ", isLast: " + cVar.f324321c);
    }

    public final void i() {
        long j17 = this.f324340q * 5;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f324336m;
        if (n3Var != null) {
            n3Var.mo50297x7c4d7ca2(new ds0.e(this), j17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "set check post encode end delay:" + j17);
    }

    public final void j(hs0.a aVar, hs0.a aVar2, long j17, long j18) {
        android.media.MediaFormat mediaFormat;
        fs0.f lVar;
        fs0.f lVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "init decoder background " + aVar + "music is " + aVar2);
        if (aVar != null) {
            try {
                mediaFormat = aVar.f366085f;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecAACCodec", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACDecoderInitFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 22L, 1L);
                throw e17;
            }
        } else {
            mediaFormat = null;
        }
        if (mediaFormat == null && this.f324324a == 3) {
            this.f324324a = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCodecAACCodec", "background AudioFormat is null, recreate AudioMixCodec, sampleRate:" + this.f324325b + ", channelCount:" + this.f324326c);
            this.f324331h = new js0.c(this.f324325b, this.f324326c, kz5.c0.i(3, 1).contains(java.lang.Integer.valueOf(this.f324324a)), kz5.c0.i(2, 3).contains(java.lang.Integer.valueOf(this.f324324a)), new ds0.g(this), new ds0.h(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxBackgroundNoAudioTrack");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 25L, 1L);
        }
        if (this.f324324a == 3 && aVar != null) {
            if (fp.h.a(23)) {
                lVar2 = new fs0.h(aVar, "background", j17, j18, new ds0.i(this), new ds0.j(this));
            } else {
                this.f324343t = true;
                lVar2 = new fs0.l(aVar, "background", j17, j18, new ds0.k(this), new ds0.l(this));
            }
            this.f324329f = lVar2;
        }
        if (aVar2 != null) {
            if (fp.h.a(23)) {
                lVar = new fs0.h(aVar2, "music", 0L, j18 - j17, new ds0.m(this), new ds0.n(this));
            } else {
                this.f324343t = true;
                lVar = new fs0.l(aVar2, "music", 0L, j18 - j17, new ds0.o(this), new ds0.f(this));
            }
            this.f324328e = lVar;
        }
    }

    public final void k(android.media.MediaFormat mediaFormat) {
        gs0.a hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        try {
            if (fp.h.a(23)) {
                hVar = new gs0.c(mediaFormat, new ds0.p(this), new ds0.q(this));
            } else {
                this.f324343t = true;
                hVar = new gs0.h(mediaFormat, new ds0.r(this), new ds0.s(this));
            }
            this.f324330g = hVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecAACCodec", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACEncoderInitFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 23L, 1L);
        }
    }

    public final synchronized void l(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MediaCodecAACCodec", "onDecodeEnd, isDecodeEnd:" + this.f324332i + ", isBackground:" + z17 + ", mixCount:" + this.f324346w + ", decodeMusicFrameCount:" + this.f324340q + ", decodeBackgroundFrameCount:" + this.f324339p, new java.lang.Object[0]);
        if (z17) {
            this.f324334k = true;
        } else {
            this.f324333j = true;
        }
        int i17 = this.f324324a;
        if (i17 == 3 && this.f324333j && this.f324334k) {
            if (!this.f324332i) {
                this.f324332i = true;
                fs0.f fVar = this.f324328e;
                if (fVar != null) {
                    fVar.e();
                }
                fs0.f fVar2 = this.f324329f;
                if (fVar2 != null) {
                    fVar2.e();
                }
                i();
            }
        } else if (i17 == 2 && this.f324333j) {
            if (!this.f324332i) {
                this.f324332i = true;
                fs0.f fVar3 = this.f324328e;
                if (fVar3 != null) {
                    fVar3.e();
                }
                i();
            }
        } else if (i17 == 1 && this.f324334k && !this.f324332i) {
            this.f324332i = true;
            fs0.f fVar4 = this.f324329f;
            if (fVar4 != null) {
                fVar4.e();
            }
        }
    }

    public boolean m(yz5.a aVar) {
        js0.c cVar = this.f324331h;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "startMix");
            cVar.f383001j = true;
            pm0.v.m("AudioMixCodec_MixAudio", true, new js0.b(cVar));
        }
        int i17 = this.f324324a;
        if (i17 == 3 || i17 == 1) {
            pm0.v.m("BackgroundDecoder", true, new ds0.b0(this));
        }
        if (this.f324328e != null) {
            pm0.v.m("MusicDecoder", true, new ds0.c0(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "startCodec");
        this.f324337n = aVar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f324344u = android.os.SystemClock.elapsedRealtime();
        return true;
    }

    public boolean n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "stopCodec, isPostDecodeEnd:" + this.f324345v);
        fs0.f fVar = this.f324329f;
        if (fVar != null) {
            fVar.e();
        }
        fs0.f fVar2 = this.f324328e;
        if (fVar2 != null) {
            fVar2.e();
        }
        gs0.a aVar = this.f324330g;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAudioEncoder");
            throw null;
        }
        aVar.b();
        this.f324335l.quitSafely();
        long j17 = this.f324344u;
        if (j17 <= 0) {
            return true;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (this.f324343t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACAsyncMix");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(986L, 26L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACAsyncMixTime: " + elapsedRealtime);
            g0Var.C(986L, 27L, elapsedRealtime);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACSyncMix");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.C(986L, 30L, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACSyncMixTime: " + elapsedRealtime);
        g0Var2.C(986L, 31L, elapsedRealtime);
        return true;
    }
}
