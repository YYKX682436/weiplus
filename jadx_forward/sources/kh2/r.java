package kh2;

/* loaded from: classes10.dex */
public final class r implements jh2.c {

    /* renamed from: b, reason: collision with root package name */
    public jh2.a f389562b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f389563c;

    /* renamed from: d, reason: collision with root package name */
    public my5.a f389564d;

    /* renamed from: e, reason: collision with root package name */
    public long f389565e;

    /* renamed from: f, reason: collision with root package name */
    public long f389566f;

    /* renamed from: g, reason: collision with root package name */
    public long f389567g;

    /* renamed from: h, reason: collision with root package name */
    public om2.u f389568h;

    /* renamed from: i, reason: collision with root package name */
    public lh2.a f389569i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f389570j;

    /* renamed from: k, reason: collision with root package name */
    public long f389571k;

    /* renamed from: l, reason: collision with root package name */
    public long f389572l;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f389561a = "MMScoreCoreImpl_" + hashCode();

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f389573m = jz5.h.b(kh2.o.f389558d);

    @Override // jh2.c
    public void a(om2.u songData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songData, "songData");
        this.f389568h = songData;
        om2.p pVar = songData.f427917b;
        this.f389572l = pVar.f427904e * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389561a, "init songDuration: " + this.f389572l);
        this.f389564d = pVar.f427901b.f427924c;
        this.f389569i = new lh2.a("mm_origin_" + songData.f427916a + ".pcm");
    }

    @Override // jh2.c
    public void b(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389561a, "updateValidTimeRange: " + j17 + '-' + j18);
        if (j17 < 0 || j18 <= 0 || j17 > j18) {
            return;
        }
        dn0.j i17 = i();
        i17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i17.f323374a, "updateValidTimeRange: " + j17 + '-' + j18);
        i17.f323381h = j17;
        i17.f323382i = j18;
    }

    @Override // jh2.c
    public void c(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389561a, "updateCustomVoiceEndTime: " + j17);
        if (j17 <= 0) {
            return;
        }
        this.f389567g = j17;
        k();
    }

    @Override // jh2.c
    public void d(double d17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389561a, "setReduceRatio: " + d17);
        i().getClass();
    }

    @Override // jh2.c
    public void e(jh2.a aVar) {
        this.f389562b = aVar;
    }

    @Override // jh2.c
    public void f(yz5.l lVar) {
        om2.u uVar = this.f389568h;
        if (uVar != null) {
            h(uVar, null);
        }
        dn0.j i17 = i();
        kh2.n nVar = new kh2.n(lVar);
        synchronized (i17) {
            java.lang.Long l17 = i17.f323376c;
            if (l17 != null) {
                p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) i17.f323383j).mo141623x754a37bb(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new dn0.f(i17, l17.longValue(), nVar, null), 2, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i17.f323374a, "getNoteInfo scoreHandle invalid");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // jh2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.r.g(com.tencent.trtc.TRTCCloudDef$TRTCAudioFrame, long, boolean):void");
    }

    public final int h(om2.u uVar, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        int i17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if (this.f389570j) {
            return 0;
        }
        dn0.j i18 = i();
        int i19 = tRTCAudioFrame != null ? tRTCAudioFrame.f57043x88751aa : 48000;
        int i27 = tRTCAudioFrame != null ? tRTCAudioFrame.f57040x2c0b7d03 : 2;
        if (dn0.b.f323359b) {
            synchronized (i18) {
                i18.f323376c = java.lang.Long.valueOf(i18.f323375b.m46468x22d930(i19, i27));
                i18.f323378e = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i18.f323374a, "init scoreHandle = " + i18.f323376c);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(i18.f323374a, "init error so load");
        }
        dn0.j i28 = i();
        om2.w wVar = uVar.f427917b.f427903d;
        byte[] bArr = (wVar == null || (gVar = wVar.f427920c) == null) ? null : gVar.f273689a;
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] bArr2 = bArr;
        my5.a aVar = this.f389564d;
        int[] a17 = aVar != null ? aVar.a() : null;
        int[] iArr = a17 == null ? new int[0] : a17;
        i28.getClass();
        synchronized (i28) {
            java.lang.Long l17 = i28.f323376c;
            if (l17 != null) {
                i17 = i28.f323375b.m46470xc2bcab3b(l17.longValue(), bArr2, bArr2.length, iArr, iArr.length);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i28.f323374a, "setSongInfo res = " + i17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i28.f323374a, "setSongInfo scoreHandle invalid");
                i17 = -1;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389561a, "checkInitScore res: " + i17);
        this.f389570j = true;
        return i17;
    }

    public final dn0.j i() {
        return (dn0.j) ((jz5.n) this.f389573m).mo141623x754a37bb();
    }

    @Override // jh2.c
    public void j() {
        java.io.OutputStream outputStream;
        dn0.j i17 = i();
        synchronized (i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i17.f323374a, "unInit:" + i17.f323376c + " nativeLoader " + i17.f323375b);
            java.lang.Long l17 = i17.f323376c;
            if (l17 != null) {
                i17.f323375b.m46474x973cdf69(l17.longValue());
            }
            i17.f323376c = null;
            i17.f323378e = false;
        }
        i17.f323377d = null;
        p3325xe03a0797.p3326xc267989b.z0.e((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) i17.f323383j).mo141623x754a37bb(), null, 1, null);
        p3325xe03a0797.p3326xc267989b.z0.e((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) i17.f323384k).mo141623x754a37bb(), null, 1, null);
        i17.f323380g = 0;
        i17.f323379f = 0;
        i17.f323381h = 0L;
        i17.f323382i = 0L;
        this.f389563c = false;
        this.f389565e = 0L;
        this.f389566f = 0L;
        this.f389567g = 0L;
        lh2.a aVar = this.f389569i;
        if (aVar != null && (outputStream = aVar.f400193b) != null) {
            outputStream.close();
        }
        this.f389562b = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389561a, "unInit :" + this.f389563c);
    }

    public final void k() {
        long max;
        long j17;
        long j18 = this.f389567g;
        if (j18 > 0) {
            long j19 = this.f389566f;
            if (j19 > 0) {
                j18 = java.lang.Math.min(j18, j19);
                this.f389565e = j18;
                max = java.lang.Math.max(j18, 0L);
                this.f389565e = max;
                j17 = this.f389572l;
                if (j17 > 0 || 6000 + max <= j17) {
                    j17 = max + p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d;
                }
                this.f389571k = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389561a, "voiceEndTime: " + this.f389565e + " customVoiceEndTime: " + this.f389567g + " lastSentenceEndTime: " + this.f389566f + " singFinishTime: " + this.f389571k + " songDuraion: " + this.f389572l);
            }
        }
        long j27 = this.f389566f;
        if (j27 > 0) {
            j18 = j27;
        }
        this.f389565e = j18;
        max = java.lang.Math.max(j18, 0L);
        this.f389565e = max;
        j17 = this.f389572l;
        if (j17 > 0) {
        }
        j17 = max + p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d;
        this.f389571k = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389561a, "voiceEndTime: " + this.f389565e + " customVoiceEndTime: " + this.f389567g + " lastSentenceEndTime: " + this.f389566f + " singFinishTime: " + this.f389571k + " songDuraion: " + this.f389572l);
    }

    @Override // jh2.c
    /* renamed from: setKeyShift */
    public void mo140935x93c29fe5(int i17) {
        jz5.f0 f0Var;
        dn0.j i18 = i();
        synchronized (i18) {
            java.lang.Long l17 = i18.f323376c;
            if (l17 != null) {
                int m46473xb0cdfadd = i18.f323375b.m46473xb0cdfadd(l17.longValue(), i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i18.f323374a, "setKeyShift res: " + m46473xb0cdfadd);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i18.f323374a, "setKeyShift scoreHandle invalid");
            }
        }
    }
}
