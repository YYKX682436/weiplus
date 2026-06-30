package nk4;

/* loaded from: classes15.dex */
public final class a implements java.lang.Cloneable {
    public int A;
    public org.json.JSONObject E;
    public org.json.JSONObject F;
    public long G;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f419576J;
    public int K;
    public int M;
    public int N;
    public int P;

    /* renamed from: e, reason: collision with root package name */
    public int f419578e;

    /* renamed from: f, reason: collision with root package name */
    public long f419579f;

    /* renamed from: g, reason: collision with root package name */
    public int f419580g;

    /* renamed from: h, reason: collision with root package name */
    public int f419581h;

    /* renamed from: i, reason: collision with root package name */
    public long f419582i;

    /* renamed from: m, reason: collision with root package name */
    public long f419583m;

    /* renamed from: n, reason: collision with root package name */
    public long f419584n;

    /* renamed from: o, reason: collision with root package name */
    public int f419585o;

    /* renamed from: t, reason: collision with root package name */
    public int f419590t;

    /* renamed from: v, reason: collision with root package name */
    public long f419592v;

    /* renamed from: w, reason: collision with root package name */
    public int f419593w;

    /* renamed from: x, reason: collision with root package name */
    public int f419594x;

    /* renamed from: y, reason: collision with root package name */
    public int f419595y;

    /* renamed from: z, reason: collision with root package name */
    public int f419596z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f419577d = "";

    /* renamed from: p, reason: collision with root package name */
    public int f419586p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f419587q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f419588r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f419589s = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f419591u = -1;
    public java.util.concurrent.CopyOnWriteArrayList B = new java.util.concurrent.CopyOnWriteArrayList();
    public java.util.concurrent.CopyOnWriteArrayList C = new java.util.concurrent.CopyOnWriteArrayList();
    public java.lang.String D = "";
    public float L = 1.0f;

    public final nk4.a a() {
        java.lang.Object clone = super.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.report.ExtraPlayInfo");
        nk4.a aVar = (nk4.a) clone;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        aVar.C = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(this.C);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
        aVar.B = copyOnWriteArrayList2;
        copyOnWriteArrayList2.addAll(this.B);
        org.json.JSONObject jSONObject = this.E;
        if (jSONObject != null) {
            aVar.E = new org.json.JSONObject(jSONObject.toString());
        }
        org.json.JSONObject jSONObject2 = this.F;
        if (jSONObject2 != null) {
            aVar.F = new org.json.JSONObject(jSONObject2.toString());
        }
        return aVar;
    }

    public final float b() {
        long j17 = this.f419579f;
        if (j17 == 0) {
            return -1.0f;
        }
        return (this.f419578e * 1000.0f) / ((float) j17);
    }

    public final long c() {
        return this.I;
    }

    /* renamed from: clone */
    public java.lang.Object m149724x5a5dd5d() {
        return super.clone();
    }

    public final long d() {
        return this.f419576J;
    }

    public final org.json.JSONObject e() {
        return this.F;
    }

    public final java.lang.String f() {
        return this.D;
    }

    public final void g() {
        if (this.f419583m == 0 || this.f419579f > 0) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f419583m;
        if (elapsedRealtime >= 0) {
            this.f419579f += elapsedRealtime;
        }
        if (elapsedRealtime > this.f419582i) {
            this.f419582i = elapsedRealtime;
        }
        this.f419583m = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OnStopPlayData", "onBlur focusTimeMs:" + elapsedRealtime + " focusMaxTimeMs:" + this.f419582i + " blurFPS:" + b() + ' ' + this.f419577d);
    }

    public final void h() {
        if (this.f419583m != 0) {
            return;
        }
        this.f419583m = android.os.SystemClock.elapsedRealtime();
        this.f419581h++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OnStopPlayData", "onFocus focusTotalCount:" + this.f419581h + ' ' + this.f419577d);
    }

    public final void i(long j17, long j18) {
        if (j17 - this.f419584n > 1000) {
            this.B.add(java.lang.Integer.valueOf((int) (j17 / 1000)));
            int i17 = this.f419578e - this.f419585o;
            this.C.add(java.lang.Integer.valueOf(i17));
            int i18 = this.f419589s;
            if (i17 < i18 || i18 == -1) {
                this.f419589s = i17;
            }
            int i19 = this.f419588r;
            if (i17 > i19 || i19 == -1) {
                this.f419588r = i17;
            }
            if (this.f419586p == -1) {
                this.f419586p = i17;
            }
            this.f419587q = i17;
            if (i17 < this.f419591u) {
                this.f419590t++;
            }
            this.f419585o = this.f419578e;
            this.f419584n = j17;
        }
    }

    public final void j(org.json.JSONObject jsonObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        jsonObject.put("stup", this.f419578e);
        jsonObject.put("psta", this.f419580g);
        jsonObject.put("fttm", this.f419579f);
        jsonObject.put("fttc", this.f419581h);
        jsonObject.put("fmtm", this.f419582i);
        jsonObject.put("ffps", java.lang.Float.valueOf(b()));
        jsonObject.put("maxfps", this.f419588r);
        jsonObject.put("minfps", this.f419589s);
        jsonObject.put("fsfps", this.f419586p);
        jsonObject.put("lsfps", this.f419587q);
        jsonObject.put("lvfps", this.f419590t);
        jsonObject.put("mopts", this.f419596z);
        jsonObject.put("mclts", this.A);
        jsonObject.put("hpsz", this.G);
        jsonObject.put("fpsg", 0);
        jsonObject.put("hdcd", this.H);
        jsonObject.put("hpsz2", this.f419592v);
        jsonObject.put("nsdcnt", this.f419593w);
        jsonObject.put("lmbcnt", this.f419594x);
        jsonObject.put("pcnt", this.f419595y);
        jsonObject.put("fileDelete", this.K);
        jsonObject.put("playSpeed", java.lang.Float.valueOf(this.L));
        jsonObject.put("bufCnt", this.M);
        jsonObject.put("appendBuf", this.N);
        jsonObject.put("isMutePlay", this.P);
        java.util.Iterator it = this.B.iterator();
        java.lang.String str = "";
        java.lang.String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + ((java.lang.Integer) it.next()) + ';';
        }
        jsonObject.put("pgsl", str2);
        java.util.Iterator it6 = this.C.iterator();
        while (it6.hasNext()) {
            str = str + ((java.lang.Integer) it6.next()) + ';';
        }
        jsonObject.put("fpsl", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OnStopPlayData", m149725x9616526c());
    }

    public final void k() {
        this.f419578e = 0;
        this.f419579f = 0L;
        this.f419580g = 0;
        this.f419581h = 0;
        this.f419582i = 0L;
        this.f419583m = 0L;
        this.f419584n = -1L;
        this.f419585o = 0;
        this.f419588r = -1;
        this.f419589s = -1;
        this.f419586p = -1;
        this.f419587q = -1;
        this.f419590t = 0;
        this.f419591u = 0;
        this.f419596z = 0;
        this.A = 0;
        this.D = "";
        this.G = 0L;
        this.H = 0;
        this.I = 0L;
        this.f419576J = 0L;
        this.K = 0;
        this.B.clear();
        this.C.clear();
    }

    /* renamed from: toString */
    public java.lang.String m149725x9616526c() {
        return "OnStopPlayData hitPreloadSize:" + this.G + " TextureUpdateCount:" + this.f419578e + " PlayerState:" + this.f419580g + "  FocusTotalTimeMs:" + this.f419579f + " FocusTotalCount:" + this.f419581h + " FocusMaxTimeMs:" + this.f419582i + " FocusFps:" + b() + " lessVideoFpsCount:" + this.f419590t + " videoFps:" + this.f419591u + " focusMinFps:" + this.f419589s + " focusMaxFps:" + this.f419588r + " firstSecondFps:" + this.f419586p + " lastSecondFps:" + this.f419587q + " progressList:" + this.B + " fpsList:" + this.C + " mediaId:" + this.f419577d + " isMute:" + this.P;
    }
}
