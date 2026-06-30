package uu0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static uu0.c f512737v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.Object f512738w = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public uu0.k f512742d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f512745g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f512746h;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f512755q;

    /* renamed from: r, reason: collision with root package name */
    public uu0.b f512756r;

    /* renamed from: s, reason: collision with root package name */
    public uu0.a f512757s;

    /* renamed from: a, reason: collision with root package name */
    public uu0.o f512739a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f512740b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f512741c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public uu0.j f512743e = uu0.j.INITIALIZING;

    /* renamed from: f, reason: collision with root package name */
    public tu0.f f512744f = null;

    /* renamed from: i, reason: collision with root package name */
    public tu0.g f512747i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f512748j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f512749k = 0;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f512750l = null;

    /* renamed from: m, reason: collision with root package name */
    public long f512751m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f512752n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f512753o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f512754p = 0;

    /* renamed from: t, reason: collision with root package name */
    public final uu0.n f512758t = new uu0.d(this);

    /* renamed from: u, reason: collision with root package name */
    public final tu0.e f512759u = new uu0.e(this);

    public static void b(uu0.c cVar, java.lang.Boolean bool) {
        boolean z17;
        cVar.getClass();
        uu0.j jVar = uu0.j.STOP;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stop record in runnable");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordMgr", e17, "_stop", new java.lang.Object[0]);
            z17 = false;
        }
        if (cVar.f512743e == jVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "is stopped, don't stop again");
            return;
        }
        uu0.o oVar = cVar.f512739a;
        if (oVar != null) {
            z17 = oVar.a();
            cVar.f512739a = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "mRecorder is null, has stop record!");
            z17 = true;
        }
        cVar.f512748j = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mPcmDuration:%d", java.lang.Integer.valueOf(cVar.f512749k));
        tu0.f fVar = cVar.f512744f;
        if (fVar != null) {
            ((tu0.h) fVar).a(new byte[0], 0, true);
            cVar.f512744f.mo167049x5a5ddf8();
            cVar.f512744f = null;
        }
        tu0.g gVar = cVar.f512747i;
        if (gVar != null) {
            gVar.d();
            cVar.f512747i = null;
        }
        if (cVar.f512755q == null) {
            cVar.f512755q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        }
        cVar.f512755q.mo50293x3498a0(new uu0.i(cVar));
        if (cVar.f512743e == uu0.j.PAUSE) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "don't calculate time again if it is pause state");
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - cVar.f512754p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(cVar.f512753o));
            int i17 = (int) (cVar.f512753o + currentTimeMillis2);
            cVar.f512753o = i17;
            long j17 = cVar.f512751m - i17;
            cVar.f512752n = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(cVar.f512753o));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "onStop");
            cVar.f512743e = jVar;
            cVar.f512740b = false;
            uu0.b bVar = cVar.f512756r;
            if (bVar != null) {
                bVar.c(cVar.f512753o, cVar.f512745g, cVar.f512746h, bool);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stop record success");
        } else {
            cVar.f(9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "stop record fail");
        }
        cVar.f512742d = null;
    }

    public static uu0.c e() {
        uu0.c cVar;
        synchronized (f512738w) {
            if (f512737v == null) {
                f512737v = new uu0.c();
            }
            cVar = f512737v;
        }
        return cVar;
    }

    public final void a() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "_start in runnable");
            if (!c()) {
                f(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "init encoder fail");
                return;
            }
            this.f512742d.getClass();
            if (!d()) {
                f(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "init SilkWriter fail");
                return;
            }
            this.f512748j = false;
            this.f512749k = 0;
            if (!g()) {
                f(6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "start record fail");
                return;
            }
            tu0.f fVar = this.f512744f;
            tl.w wVar = this.f512739a.f512787a;
            int c17 = wVar != null ? wVar.c() : 0;
            tu0.b bVar = (tu0.b) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncoder", "mMinBufferSize:%d", java.lang.Integer.valueOf(bVar.f503609b));
            bVar.f503609b = c17;
            tu0.f fVar2 = this.f512744f;
            double d17 = this.f512742d.f512783h;
            tu0.b bVar2 = (tu0.b) fVar2;
            bVar2.f503610c = (int) (1024.0d * d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncoder", "setEncodeBuffFrameSize frameKbSize:%b frameByteSize:%d", java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(bVar2.f503610c));
            bVar2.f503611d = new byte[bVar2.f503610c];
            this.f512753o = 0;
            this.f512751m = this.f512742d.f512776a;
            this.f512754p = java.lang.System.currentTimeMillis();
            long j17 = this.f512751m;
            this.f512752n = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mDuration:%d, mCurrentTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f512754p));
            if (this.f512755q == null) {
                this.f512755q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
            }
            this.f512755q.mo50293x3498a0(new uu0.h(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "onStart");
            this.f512743e = uu0.j.START;
            this.f512740b = true;
            uu0.b bVar3 = this.f512756r;
            if (bVar3 != null) {
                bVar3.mo160890xb05099c3();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "start record success");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordMgr", e17, "_start", new java.lang.Object[0]);
            f(4);
        }
    }

    public final boolean c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "initEncode");
        tu0.f fVar = this.f512744f;
        tu0.f fVar2 = null;
        if (fVar != null) {
            fVar.mo167049x5a5ddf8();
            this.f512744f = null;
        }
        uu0.k kVar = this.f512742d;
        java.lang.String a17 = uu0.l.a(kVar.f512780e, kVar.f512781f);
        this.f512745g = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mFilePath:%s", a17);
        java.lang.String str = this.f512742d.f512780e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordUtil", "createEncodeByType:%s", str);
        if (uu0.l.c(str) && !"aac".equalsIgnoreCase(str) && !"mp3".equalsIgnoreCase(str)) {
            if ("wav".equalsIgnoreCase(str)) {
                fVar2 = new tu0.i();
            } else if ("pcm".equalsIgnoreCase(str)) {
                fVar2 = new tu0.h();
            }
        }
        this.f512744f = fVar2;
        boolean z17 = false;
        if (fVar2 != null) {
            if (!uu0.l.d(this.f512745g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "prepare cache file fail");
                return false;
            }
            try {
                tu0.f fVar3 = this.f512744f;
                java.lang.String str2 = this.f512745g;
                uu0.k kVar2 = this.f512742d;
                z17 = fVar3.mo167050x316510(str2, kVar2.f512777b, kVar2.f512778c, kVar2.f512779d);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordMgr", e17, "init encoder fail", new java.lang.Object[0]);
            }
            ((tu0.b) this.f512744f).f503608a = this.f512759u;
        }
        return z17;
    }

    public final boolean d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "initSilkWriter");
        tu0.g gVar = this.f512747i;
        if (gVar != null) {
            gVar.c();
            this.f512747i = null;
        }
        java.lang.String a17 = uu0.l.a("silk", this.f512742d.f512781f);
        this.f512746h = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mSilkFilePath:%s", a17);
        uu0.k kVar = this.f512742d;
        this.f512747i = new tu0.g(kVar.f512777b, kVar.f512779d);
        if (!uu0.l.d(this.f512746h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecordMgr", "prepare silk cache file fail");
            return false;
        }
        try {
            return this.f512747i.b(this.f512746h);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordMgr", e17, "init silkWriter fail", new java.lang.Object[0]);
            return false;
        }
    }

    public final void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "onError errType:%d", java.lang.Integer.valueOf(i17));
        this.f512743e = uu0.j.ERROR;
        this.f512740b = false;
        uu0.b bVar = this.f512756r;
        if (bVar != null) {
            bVar.j(i17);
        }
    }

    public final boolean g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "startRecordInternal");
        uu0.o oVar = this.f512739a;
        if (oVar != null) {
            oVar.a();
            this.f512739a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mRecorder is not null, stop it, and not callback stop event");
        }
        if (this.f512739a == null) {
            uu0.o oVar2 = new uu0.o(this.f512742d);
            this.f512739a = oVar2;
            uu0.a aVar = this.f512757s;
            if (aVar != null) {
                oVar2.f512795i = aVar;
            }
            oVar2.f512794h = this.f512758t;
        }
        uu0.o oVar3 = this.f512739a;
        oVar3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecorder", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b);
        tl.w wVar = oVar3.f512787a;
        if (wVar != null) {
            wVar.l();
            oVar3.f512787a = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oVar3.f512793g = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecorder", "start time ticket:%d", java.lang.Long.valueOf(currentTimeMillis));
        tl.w wVar2 = new tl.w(oVar3.f512789c, oVar3.f512790d, oVar3.f512791e);
        oVar3.f512787a = wVar2;
        wVar2.g(oVar3.f512792f);
        oVar3.f512787a.i(false);
        tl.w wVar3 = oVar3.f512787a;
        wVar3.f501705y = oVar3.f512796j;
        wVar3.e(oVar3.f512788b.f512785j);
        boolean k17 = oVar3.f512787a.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "record start:%b", java.lang.Boolean.valueOf(k17));
        return k17;
    }

    public boolean h(java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        ((ku5.t0) ku5.t0.f394148d).h(new uu0.g(this, bool), "app_brand_stop_record");
        return true;
    }
}
