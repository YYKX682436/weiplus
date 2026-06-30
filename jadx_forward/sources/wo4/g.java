package wo4;

/* loaded from: classes10.dex */
public final class g extends fs0.f {
    public final android.media.MediaFormat A;
    public volatile int B;
    public volatile int C;
    public long D;
    public long E;
    public long F;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f529794u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f529795v;

    /* renamed from: w, reason: collision with root package name */
    public volatile int f529796w;

    /* renamed from: x, reason: collision with root package name */
    public volatile int f529797x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f529798y;

    /* renamed from: z, reason: collision with root package name */
    public final android.os.HandlerThread f529799z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List materials) {
        super(null, "background", -1L, -1L, null, null);
        java.util.Iterator it;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materials, "materials");
        this.f529794u = materials;
        this.f529795v = new java.util.ArrayList();
        this.B = 1;
        this.C = 44100;
        this.D = 23L;
        this.E = -1L;
        java.util.Iterator it6 = materials.iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0) next;
            if (p0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) {
                hs0.a aVar = new hs0.a(p0Var.f257243c);
                android.media.MediaFormat mediaFormat = aVar.f366085f;
                if (mediaFormat != null && mediaFormat.containsKey("frame-rate")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "index:" + i17 + ", material:" + p0Var.f257243c + ", audioFps:" + mediaFormat.getInteger("frame-rate"));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var;
                long j17 = p1Var.f257244d;
                it = it6;
                long j18 = (p0Var.f257242b - p0Var.f257241a) + j17;
                fs0.f hVar = fp.h.a(23) ? new fs0.h(aVar, "background", j17, j18, null, null) : new fs0.l(aVar, "background", j17, j18, null, null);
                hVar.f347748e = new wo4.b(this, i17, p0Var);
                hVar.f347749f = new wo4.c(this, i17, p0Var, hVar, aVar);
                this.f529795v.add(new wo4.d(i17, p1Var, hVar, aVar, j17, j18));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "add video decoder, index:" + i17 + ", material:" + p0Var.f257243c + ", start:" + j17 + ',' + p0Var.f257241a + ", end:" + j18 + ',' + p0Var.f257242b);
            } else {
                it = it6;
            }
            it6 = it;
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "init finish, decoderList:" + this.f529795v.size());
        if (!this.f529795v.isEmpty()) {
            this.B = ((wo4.d) this.f529795v.get(0)).f529785c.a();
            this.C = ((wo4.d) this.f529795v.get(0)).f529785c.b();
            this.D = 23L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "init currentChannelCount:" + this.B + ", currentSampleRate:" + this.C + ", currentAudioFrameInterval:" + this.D);
        }
        int i19 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("VLogAudioBackgroundDecoder_sendVideoFrameDataThread", 5);
        this.f529799z = a17;
        a17.start();
        this.f529798y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        android.media.MediaFormat mediaFormat2 = new android.media.MediaFormat();
        mediaFormat2.setString("mime", "audio/mp4a-latm");
        mediaFormat2.setInteger("aac-profile", 2);
        mediaFormat2.setInteger("sample-rate", 44100);
        mediaFormat2.setInteger("channel-count", 1);
        mediaFormat2.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, 64000);
        mediaFormat2.setInteger("max-input-size", 16384);
        this.A = mediaFormat2;
        this.f529796w = 0;
        this.f529797x = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "init finish, defaultMediaFormat:" + mediaFormat2);
    }

    @Override // fs0.f
    public int a() {
        return this.B;
    }

    @Override // fs0.f
    public int b() {
        return this.C;
    }

    @Override // fs0.f
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "startDecoder: " + this.f529795v.size());
        if (!this.f529795v.isEmpty()) {
            this.F = 0L;
            this.f529797x = 0;
            this.f529796w = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0) this.f529794u.get(0);
            if (p0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "firstMaterial is image, startTime:" + p0Var.f257241a + ", endTime:" + p0Var.f257242b);
                f(p0Var);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish process first image material, index:");
                sb6.append(this.f529796w);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", sb6.toString());
                g(this.f529797x, p0Var, null, null);
                return;
            }
            hs0.a aVar = ((wo4.d) this.f529795v.get(0)).f529786d;
            if (aVar.f366085f != null && aVar.f366083d >= 0) {
                this.B = ((wo4.d) this.f529795v.get(0)).f529785c.a();
                this.C = ((wo4.d) this.f529795v.get(0)).f529785c.b();
                this.E = -1L;
                ((wo4.d) this.f529795v.get(0)).f529785c.d();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "first video not have audio:" + ((wo4.d) this.f529795v.get(0)).f529784b.f257243c);
            f(((wo4.d) this.f529795v.get(0)).f529784b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "finish process first mute video material");
            g(this.f529797x, ((wo4.d) this.f529795v.get(0)).f529784b, ((wo4.d) this.f529795v.get(0)).f529785c, ((wo4.d) this.f529795v.get(0)).f529786d);
        }
    }

    @Override // fs0.f
    public void e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VLogAudioBackgroundDecoder", "stopDecoder, decoderStop:" + this.f347753j, new java.lang.Object[0]);
        if (!this.f347753j) {
            java.util.Iterator it = this.f529795v.iterator();
            while (it.hasNext()) {
                ((wo4.d) it.next()).f529785c.e();
            }
            this.f529795v.clear();
        }
        this.f529799z.quitSafely();
        this.f529796w = 0;
        this.f529797x = 0;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "dumpFakeMaterialDecodeData, currentChannelCount:" + this.B + ", currentSampleRate:" + this.C + ", currentAudioFrameInterval:" + this.D);
        long j17 = p0Var.f257241a;
        long j18 = p0Var.f257242b;
        long j19 = this.D;
        if (j19 <= 0) {
            throw new java.lang.IllegalArgumentException("Step must be positive, was: " + j19 + '.');
        }
        long b17 = sz5.b.b(j17, j18, j19);
        if (j17 > b17) {
            return;
        }
        while (true) {
            this.f529798y.mo50293x3498a0(new wo4.e(this));
            if (j17 == b17) {
                return;
            } else {
                j17 += j19;
            }
        }
    }

    public final void g(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var, fs0.f fVar, hs0.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "videoDecodeEnd, index:" + i17 + ", material:" + p0Var.f257243c + ", currentPts:" + this.F);
        if (fVar != null) {
            try {
                fVar.e();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "videoDecodeEnd release decoder and extractor error");
            }
        }
        if (aVar != null) {
            aVar.d();
        }
        int i18 = i17 + 1;
        if (i18 >= this.f529794u.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "finish decode all material");
            yz5.a aVar2 = this.f347749f;
            if (aVar2 != null) {
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0) this.f529794u.get(i18);
        this.f529797x = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "nextMaterial:" + p0Var2.f257243c);
        java.lang.Object obj = null;
        if (!(p0Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1)) {
            if (!(p0Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "cannot find next material");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "next material is image, startTime:" + p0Var2.f257241a + ", endTime:" + p0Var2.f257242b);
            f(p0Var2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish process image material, index:");
            sb6.append(this.f529796w);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", sb6.toString());
            g(this.f529797x, p0Var2, null, null);
            return;
        }
        java.util.Iterator it = this.f529795v.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((wo4.d) next).f529783a == i18) {
                obj = next;
                break;
            }
        }
        wo4.d dVar = (wo4.d) obj;
        if (dVar != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("find start next decoder index:");
            sb7.append(i18);
            sb7.append(", hasAudio:");
            hs0.a aVar3 = dVar.f529786d;
            sb7.append(aVar3.f366085f != null && aVar3.f366083d >= 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", sb7.toString());
            hs0.a aVar4 = dVar.f529786d;
            if (aVar4.f366085f != null && aVar4.f366083d >= 0) {
                this.B = dVar.f529785c.a();
                this.C = dVar.f529785c.b();
                this.E = -1L;
                dVar.f529785c.d();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "next material not have audio: " + dVar.f529784b.f257243c);
                f(dVar.f529784b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "finish process mute video material, index:" + this.f529796w);
                g(this.f529797x, dVar.f529784b, dVar.f529785c, dVar.f529786d);
            }
        }
        this.f529796w = i18;
    }
}
