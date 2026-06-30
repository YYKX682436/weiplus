package tl;

/* loaded from: classes14.dex */
public class w {
    public yl.d A;
    public final int C;
    public java.lang.String F;

    /* renamed from: f, reason: collision with root package name */
    public final int f501686f;

    /* renamed from: g, reason: collision with root package name */
    public final int f501687g;

    /* renamed from: h, reason: collision with root package name */
    public int f501688h;

    /* renamed from: k, reason: collision with root package name */
    public int f501691k;

    /* renamed from: l, reason: collision with root package name */
    public final int f501692l;

    /* renamed from: q, reason: collision with root package name */
    public int f501697q;

    /* renamed from: s, reason: collision with root package name */
    public int f501699s;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f501703w;

    /* renamed from: x, reason: collision with root package name */
    public android.media.AudioRecord f501704x;

    /* renamed from: y, reason: collision with root package name */
    public tl.c f501705y;

    /* renamed from: z, reason: collision with root package name */
    public tl.f0 f501706z;

    /* renamed from: a, reason: collision with root package name */
    public int f501681a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f501682b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f501683c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f501684d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f501685e = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f501689i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f501690j = false;

    /* renamed from: m, reason: collision with root package name */
    public int f501693m = -123456789;

    /* renamed from: n, reason: collision with root package name */
    public boolean f501694n = false;

    /* renamed from: o, reason: collision with root package name */
    public long f501695o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long f501696p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f501698r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f501700t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f501701u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f501702v = false;
    public boolean B = false;
    public int D = 1;
    public int E = 0;
    public long G = -1;
    public int H = -1;
    public final tl.e0 I = new tl.u(this);

    public w(int i17, int i18, int i19) {
        int i27;
        this.f501686f = 1;
        this.f501687g = 8000;
        this.f501688h = 120;
        this.f501691k = 10;
        this.f501692l = -1;
        this.f501703w = false;
        this.C = 16;
        this.f501686f = i18;
        this.f501687g = i17;
        this.f501692l = i19;
        if (i18 == 2) {
            this.C = 12;
        } else {
            this.C = 16;
        }
        if (i19 == 0 && (i27 = wo.v1.f529366m.f529282g) > 0) {
            this.f501688h = i27;
        }
        wo.o oVar = wo.v1.f529366m;
        int i28 = oVar.f529289n;
        if (i28 > 0) {
            this.C = i28;
        }
        int i29 = oVar.f529279d;
        if (i29 > 0) {
            this.f501691k = i29;
        }
        if (wo.v1.f529356c.G) {
            this.A = new yl.d(tl.i0.f501585a, i18, i17, 2);
        }
        ((bv.c) ((cv.x0) i95.n0.c(cv.x0.class))).getClass();
        this.f501703w = 1 == tl.g0.a("EnableRecorderCheckUnreasonableData", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "MMPcmRecorder sampleRate:%d channelCnt:%d durationPreFrame:%d newBufPreFrame:%b Biz:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f501688h), java.lang.Boolean.valueOf(this.f501689i), java.lang.Integer.valueOf(i19));
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "doNewIDKeyStatOnStopRecord, mRecordDetailState: %d", java.lang.Integer.valueOf(this.f501681a));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 0, 1));
        if (this.f501681a != 0) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 1, 1));
        }
        switch (this.f501681a) {
            case 1:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 2, 1));
                break;
            case 2:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 3, 1));
                break;
            case 3:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 4, 1));
                break;
            case 4:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 5, 1));
                break;
            case 5:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 6, 1));
                break;
            case 6:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 7, 1));
                break;
            case 7:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 8, 1));
                break;
            case 8:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 9, 1));
                break;
            case 9:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 10, 1));
                break;
            case 10:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 11, 1));
                break;
            case 11:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 12, 1));
                break;
            case 12:
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(357, 13, 1));
                break;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "do idkey, infolist size: %d", java.lang.Integer.valueOf(arrayList.size()));
        jx3.f.INSTANCE.b(arrayList, false);
    }

    public int b() {
        tl.f0 f0Var = this.f501706z;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "getAudioRecordReadNum: return cached num %d", java.lang.Integer.valueOf(this.H));
            return this.H;
        }
        int i17 = f0Var.f501580c;
        this.H = i17;
        return i17;
    }

    public int c() {
        int i17 = this.E;
        if (i17 > 0) {
            return i17;
        }
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(this.f501687g, this.C, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "getDefaultMinBufferSize minBufSize:%d", java.lang.Integer.valueOf(minBufferSize));
        if (minBufferSize == -2 || minBufferSize == -1) {
            return 0;
        }
        int i18 = this.f501691k * minBufferSize;
        this.E = i18;
        return i18;
    }

    public final void d() {
        tl.c cVar = this.f501705y;
        if (cVar != null) {
            cVar.a(this.D, this.f501681a);
        }
    }

    public void e(int i17) {
        this.f501685e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "mAudioSource: " + i17);
    }

    public void f(boolean z17) {
        this.f501690j = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "mCheckAudioQuality: " + this.f501690j);
    }

    public void g(int i17) {
        this.f501688h = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "mDurationPreFrame: " + this.f501688h);
    }

    public void h(int i17, boolean z17) {
        if (10 == this.f501691k || z17) {
            this.f501691k = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "mMultipleOfMinBuffer: " + this.f501691k);
        }
    }

    public void i(boolean z17) {
        this.f501689i = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "mNewBufPreFrame: " + this.f501689i);
    }

    public void j(boolean z17) {
        this.f501694n = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "mUsePreProcess: " + this.f501694n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x01c6, code lost:
    
        if (r11 > (-1)) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k() {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.w.k():boolean");
    }

    public synchronized boolean l() {
        if (true == this.f501700t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "already have stopped");
            return true;
        }
        this.f501700t = true;
        boolean m17 = m();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f501695o;
        this.f501696p = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "stopRecord recordLen:%s ", java.lang.Long.valueOf(currentTimeMillis));
        if ((!this.f501698r && -1 != this.f501695o && java.lang.System.currentTimeMillis() - this.f501695o >= 2000) || this.f501702v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "stopRecord publish PermissionShowDlgEvent");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5838xa0c1aaa7 c5838xa0c1aaa7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5838xa0c1aaa7();
            c5838xa0c1aaa7.f136147g.f88389a = 1;
            c5838xa0c1aaa7.e();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5837xd03f9d7d c5837xd03f9d7d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5837xd03f9d7d();
        am.fo foVar = c5837xd03f9d7d.f136145g;
        foVar.f88221b = 1;
        foVar.f88220a = false;
        foVar.getClass();
        c5837xd03f9d7d.e();
        a();
        return m17;
    }

    public final boolean m() {
        fp.j jVar = new fp.j();
        yl.d dVar = this.A;
        if (dVar != null) {
            dVar.a();
            this.A = null;
        }
        jVar.b();
        tl.f0 f0Var = this.f501706z;
        if (f0Var != null) {
            f0Var.b();
            this.f501706z = null;
        }
        this.B = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "cost " + jVar.a() + "ms to call stopRecord");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopRecord, ");
        sb6.append(java.lang.Thread.currentThread().getStackTrace()[2].getMethodName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", sb6.toString());
        android.media.AudioRecord audioRecord = this.f501704x;
        if (audioRecord == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPcmRecorder", "audioRecord is null");
            return false;
        }
        if (audioRecord.getState() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPcmRecorder", "audioRecord sate error " + this.f501704x.getState());
            return false;
        }
        if (this.F != null) {
            int i17 = this.f501692l;
            if (i17 == 0) {
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ai(0, 0, this.F, this.f501685e, this.f501687g, this.C, this.f501681a);
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ni(i17);
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ri(i17);
            } else if (i17 == 1) {
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ai(0, 1, this.F, this.f501685e, this.f501687g, this.C, this.f501681a);
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ni(i17);
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ri(i17);
            }
        }
        jVar.b();
        this.f501704x.stop();
        this.f501704x.release();
        this.f501704x = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "cost " + jVar.a() + "ms to call stop and release");
        return true;
    }

    public void n(boolean z17) {
        this.B = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPcmRecorder", "switchMute mute:" + z17 + ", mRecordMode=" + this.f501706z);
        tl.f0 f0Var = this.f501706z;
        if (f0Var != null) {
            f0Var.c(z17);
        }
    }
}
