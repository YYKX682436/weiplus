package w21;

/* loaded from: classes12.dex */
public class k0 implements cv.d1 {

    /* renamed from: h, reason: collision with root package name */
    public static int f523949h = 100;

    /* renamed from: d, reason: collision with root package name */
    public tl.w f523953d;

    /* renamed from: e, reason: collision with root package name */
    public yl.h f523954e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f523950a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f523951b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f523952c = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f523955f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final tl.v f523956g = new w21.j0(this);

    @Override // tl.d
    public int a() {
        return this.f523953d.D;
    }

    @Override // tl.d
    public void b(com.p314xaae8f345.mm.p944x882e457a.e1 e1Var) {
    }

    public final void c() {
        synchronized (this.f523955f) {
            tl.w wVar = this.f523953d;
            if (wVar != null) {
                wVar.l();
                this.f523953d = null;
            }
            yl.h hVar = this.f523954e;
            if (hVar != null) {
                hVar.d();
                this.f523954e = null;
            }
        }
    }

    @Override // tl.d
    public int d() {
        int i17 = this.f523951b;
        this.f523951b = 0;
        if (i17 > f523949h) {
            f523949h = i17;
        }
        return (i17 * 100) / f523949h;
    }

    @Override // tl.d
    /* renamed from: getStatus */
    public int mo166724x2fe4f2e8() {
        return this.f523952c;
    }

    @Override // tl.d
    /* renamed from: startRecord */
    public boolean mo166725x8e35cb53(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f523950a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeexRecorder", "[startRecord] fileName:%s", str);
        this.f523952c = 1;
        this.f523951b = 0;
        synchronized (this.f523955f) {
            tl.w wVar = new tl.w(16000, 1, 0);
            this.f523953d = wVar;
            wVar.f501693m = -19;
            int i17 = wo.v1.f529366m.f529284i;
            if (i17 > 0) {
                wVar.h(i17, true);
            } else {
                wVar.h(5, false);
            }
            this.f523953d.i(false);
            this.f523953d.f501705y = this.f523956g;
            yl.h hVar = new yl.h();
            this.f523954e = hVar;
            if (!hVar.b(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexRecorder", "init speex writer failed");
                c();
                this.f523952c = -1;
                return false;
            }
            if (this.f523953d.k()) {
                this.f523950a = str;
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexRecorder", "start record failed");
            c();
            this.f523952c = -1;
            return false;
        }
    }

    @Override // tl.d
    /* renamed from: stopRecord */
    public boolean mo166726xad07d6f3() {
        this.f523950a = null;
        this.f523952c = 0;
        c();
        return true;
    }
}
