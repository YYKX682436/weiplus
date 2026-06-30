package cw2;

/* loaded from: classes10.dex */
public final class h0 extends st3.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f305270o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider, com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea previewPlugin) {
        super(configProvider, previewPlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPlugin, "previewPlugin");
        this.f305270o = "Finder.FinderCameraContainerProcess";
        if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).qj()) {
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963 = super.mo54902x402de963();
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            mo54902x402de963.f152727g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_high_record_bitrate, 10000000);
        }
    }

    @Override // st3.e, gt0.a
    /* renamed from: getEncodeConfig */
    public ct0.a mo54894x11cfd76e() {
        return new cw2.f0(this);
    }

    @Override // st3.e, gt0.a
    /* renamed from: getPreviewRenderer */
    public ms0.c mo54896xb3aa1275() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab c19568xd45988ab = this.f494058d.Q;
        if ((c19568xd45988ab.f270130e || c19568xd45988ab.f270131f) && this.f494064m == null) {
            this.f494064m = new mu3.b(6);
            this.f494065n = new mu3.a();
            mu3.b bVar = this.f494064m;
            if (bVar != null) {
                bVar.f412934y = new cw2.g0(this);
            }
        }
        return super.mo54896xb3aa1275();
    }

    @Override // st3.e, gt0.d
    /* renamed from: getResolutionLimit */
    public int mo54901x6fcd4039() {
        return 2500;
    }

    @Override // st3.e, gt0.a
    /* renamed from: getVideoTransPara */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963 = super.mo54902x402de963();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_record_max_size, 1920);
        if (mo54902x402de963.f152724d > Ni || mo54902x402de963.f152725e > Ni) {
            java.lang.String str = "getVideoTransPara, size to large, originWidth:" + mo54902x402de963.f152724d + ", originHeight:" + mo54902x402de963.f152725e + ", maxSize:" + Ni;
            java.lang.String str2 = this.f305270o;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            int i17 = mo54902x402de963.f152725e;
            int i18 = mo54902x402de963.f152724d;
            float f17 = i17 / i18;
            if (i18 > i17) {
                mo54902x402de963.f152725e = (int) (Ni * f17);
                mo54902x402de963.f152724d = Ni;
            } else {
                mo54902x402de963.f152724d = (int) (Ni / f17);
                mo54902x402de963.f152725e = Ni;
            }
            mo54902x402de963.f152724d = ai3.d.a(mo54902x402de963.f152724d);
            mo54902x402de963.f152725e = ai3.d.a(mo54902x402de963.f152725e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "getVideoTransPara, do size crop, width:" + mo54902x402de963.f152724d + ", height:" + mo54902x402de963.f152725e + ", maxSize:" + Ni);
        }
        return mo54902x402de963;
    }

    @Override // st3.e, gt0.a
    public boolean j() {
        boolean g17 = g();
        java.lang.String str = this.f305270o;
        boolean z17 = false;
        if (g17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "useDaemonRecorder useCpuCrop false");
            dw3.f.f325737b = false;
            return false;
        }
        if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).qj() && this.f494061g.a()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "useDaemonRecorder useDaemonRecorder:" + z17 + ", FinderConfig.USE_DAEMON_RECORD:" + ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).qj());
        dw3.f.f325737b = z17;
        return z17;
    }
}
