package st3;

/* loaded from: classes10.dex */
public class e implements gt0.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f494058d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea f494059e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f494060f;

    /* renamed from: g, reason: collision with root package name */
    public final bt0.a f494061g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f494062h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f494063i;

    /* renamed from: m, reason: collision with root package name */
    public mu3.b f494064m;

    /* renamed from: n, reason: collision with root package name */
    public mu3.a f494065n;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider, com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea previewPlugin) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPlugin, "previewPlugin");
        this.f494058d = configProvider;
        this.f494059e = previewPlugin;
        android.content.Context context = previewPlugin.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f494061g = new bt0.a(context);
        dw3.c0.f325715a.a(configProvider);
        java.lang.Object m48123x5a5dd5d = configProvider.f237209n.m48123x5a5dd5d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m48123x5a5dd5d, "null cannot be cast to non-null type com.tencent.mm.modelcontrol.VideoTransPara");
        this.f494060f = (com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d) m48123x5a5dd5d;
        if (st3.t.f494134e && (c11120x15dce88d = st3.t.f494131b) != null) {
            java.lang.Object m48123x5a5dd5d2 = c11120x15dce88d.m48123x5a5dd5d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m48123x5a5dd5d2, "null cannot be cast to non-null type com.tencent.mm.modelcontrol.VideoTransPara");
            this.f494060f = (com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d) m48123x5a5dd5d2;
        }
        boolean z17 = true;
        if (configProvider.f237206h == 1) {
            if (!st3.t.f494134e) {
                int i17 = vt3.q.f521570a;
                int i18 = vt3.q.f521571b;
                int i19 = vt3.q.f521570a;
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = this.f494060f;
                c11120x15dce88d2.f152724d = (c11120x15dce88d2.f152725e * i19) / i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "SightRecordConfig init failed, fix videoPara");
            }
            if (!es0.b.f337843a) {
                int i27 = configProvider.F;
                if (i27 == 2) {
                    this.f494060f.f152727g = (int) (r7.f152727g * 6.0f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "final kbps: 6.0  " + this.f494060f.f152727g);
                } else if (i27 == 1) {
                    this.f494060f.f152727g = (int) (r7.f152727g * 8.0f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "final kbps: 8.0  " + this.f494060f.f152727g);
                } else {
                    this.f494060f.f152727g = 8000000;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "final kbps: $2  " + this.f494060f.f152727g);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab c19568xd45988ab = configProvider.Q;
        if (!c19568xd45988ab.f270130e && !c19568xd45988ab.f270131f) {
            z17 = false;
        }
        this.f494062h = z17;
        ts0.d.f503084b = configProvider.F;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "init CameraContainerProcess, scene: " + configProvider.F + "   " + this.f494060f);
    }

    @Override // gt0.a
    public boolean g() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_PREVIEW_CROP_INT_SYNC, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "cuttype : " + intValue);
        if (intValue == 1) {
            dw3.f.f325736a = false;
            return false;
        }
        if (intValue == 2) {
            dw3.f.f325736a = true;
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("mediacodec_create_error", false)) {
            dw3.f.f325736a = true;
            return true;
        }
        java.lang.Boolean valueOf = st3.t.f494134e ? java.lang.Boolean.valueOf(st3.t.f494130a.b()) : this.f494058d.f237203e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        dw3.f.f325736a = valueOf.booleanValue();
        return valueOf.booleanValue();
    }

    @Override // gt0.a
    /* renamed from: getCameraPreviewView */
    public et0.q mo54891x9333e172() {
        return this.f494059e;
    }

    @Override // gt0.a
    /* renamed from: getContext */
    public android.content.Context mo132348x76847179() {
        android.content.Context context = this.f494059e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // gt0.a
    /* renamed from: getDaemonVideoTransPara */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54892x7cd80487() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParam = this.f494058d.f237209n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoParam, "videoParam");
        return videoParam;
    }

    @Override // gt0.a
    /* renamed from: getEncodeConfig */
    public ct0.a mo54894x11cfd76e() {
        return new st3.c(this);
    }

    @Override // gt0.a
    /* renamed from: getPreviewRenderer */
    public ms0.c mo54896xb3aa1275() {
        boolean z17 = this.f494062h;
        if (!z17) {
            this.f494064m = null;
            this.f494065n = null;
        } else if (this.f494064m == null) {
            this.f494064m = new mu3.b(2);
            this.f494065n = new mu3.a();
            mu3.b bVar = this.f494064m;
            if (bVar != null) {
                bVar.f412934y = new st3.d(this);
            }
        }
        if (z17) {
            return this.f494064m;
        }
        return null;
    }

    @Override // gt0.a
    /* renamed from: getRecordRenderer */
    public ms0.c mo54897xbfb4fd2a() {
        if (this.f494062h) {
            return this.f494065n;
        }
        return null;
    }

    @Override // gt0.d
    /* renamed from: getRecordScene */
    public int mo54898x27ac0d85() {
        return this.f494058d.F;
    }

    @Override // gt0.a
    /* renamed from: getRecorder */
    public ht0.b mo54899x4c36e634() {
        if (!this.f494062h) {
            return null;
        }
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963 = mo54902x402de963();
        mu3.a aVar = this.f494065n;
        android.opengl.EGLContext mo8977xe0fe423b = this.f494059e.mo8977xe0fe423b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo8977xe0fe423b);
        mu3.b bVar = this.f494064m;
        is0.c cVar = bVar != null ? bVar.f412932w : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        return new ht0.s(mo54902x402de963, aVar, mo8977xe0fe423b, cVar.f375928e);
    }

    @Override // gt0.d
    /* renamed from: getResolutionLimit */
    public int mo54901x6fcd4039() {
        return st3.t.f494134e ? st3.t.f494132c : this.f494058d.f237204f;
    }

    @Override // gt0.a
    /* renamed from: getVideoTransPara */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        int i17;
        boolean z17 = st3.t.f494134e;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = this.f494060f;
        if (z17 && (c11120x15dce88d = st3.t.f494131b) != null && ((i17 = c11120x15dce88d.f152724d) != c11120x15dce88d2.f152724d || c11120x15dce88d.f152725e != c11120x15dce88d2.f152725e)) {
            c11120x15dce88d2.f152724d = i17;
            c11120x15dce88d2.f152725e = c11120x15dce88d.f152725e;
        }
        return c11120x15dce88d2;
    }

    @Override // gt0.a
    /* renamed from: isMute */
    public boolean mo54903xb9a62e63() {
        return this.f494063i;
    }

    @Override // gt0.a
    public boolean j() {
        boolean z17 = false;
        if (g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "useDaemonRecorder false");
            dw3.f.f325737b = false;
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f494058d;
        int i17 = c16993xacc19624.F;
        if (i17 != 2 && i17 != 1) {
            dw3.f.f325737b = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "scene " + c16993xacc19624.F + " not use DaemonRecorder");
            return false;
        }
        if (mo54894x11cfd76e().c() == 1) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("info: enable:[");
        bt0.a aVar = this.f494061g;
        boolean z18 = aVar.f105672b;
        sb6.append(z18);
        sb6.append("] ramConfig:[");
        sb6.append(aVar.f105673c);
        sb6.append("] blackModelList:[");
        sb6.append(aVar.f105674d);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DaemonChecker", sb6.toString());
        if (z18 && aVar.a()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraContainerProcess", "useDaemonRecorder " + z17);
        dw3.f.f325737b = z17;
        return z17;
    }
}
