package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public final class g implements fk4.p {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282463a;

    /* renamed from: b, reason: collision with root package name */
    public final t21.v2 f282464b;

    /* renamed from: c, reason: collision with root package name */
    public final ok4.c f282465c;

    /* renamed from: d, reason: collision with root package name */
    public final t21.j3 f282466d;

    /* renamed from: e, reason: collision with root package name */
    public dn.o f282467e;

    /* renamed from: f, reason: collision with root package name */
    public t21.v2 f282468f;

    /* renamed from: g, reason: collision with root package name */
    public final int f282469g;

    /* renamed from: h, reason: collision with root package name */
    public final int f282470h;

    /* renamed from: i, reason: collision with root package name */
    public final int f282471i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f282472j;

    /* renamed from: k, reason: collision with root package name */
    public int f282473k;

    public g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, t21.v2 videoInfo, ok4.c reporter, t21.j3 parseInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parseInfo, "parseInfo");
        this.f282463a = msg;
        this.f282464b = videoInfo;
        this.f282465c = reporter;
        this.f282466d = parseInfo;
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidOnlineVideoArgs");
        boolean z17 = false;
        if (!(d17 == null || d17.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2COriginVideoDownloadTask", "online video config : " + d17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            java.lang.String[] strArr = (java.lang.String[]) new r26.t(";").g(d17, 0).toArray(new java.lang.String[0]);
            if (strArr.length >= 4) {
                this.f282469g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[0], 5);
                this.f282470h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[1], 1);
                this.f282473k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 75);
                this.f282471i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[3], 1) * 1048576;
                z17 = true;
            }
        }
        if (!z17) {
            this.f282469g = 5;
            this.f282470h = 1;
            this.f282473k = 75;
            this.f282471i = 1048576;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2COriginVideoDownloadTask", "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]", java.lang.Integer.valueOf(this.f282469g), java.lang.Integer.valueOf(this.f282470h), java.lang.Integer.valueOf(this.f282473k), java.lang.Integer.valueOf(this.f282471i));
    }

    @Override // fk4.p
    public void a() {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String e17 = e();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(e17);
        if (h17 != null) {
            this.f282468f = h17;
        }
    }

    @Override // fk4.p
    public java.lang.Long c() {
        return java.lang.Long.valueOf(this.f282463a.m124847x74d37ac6());
    }

    @Override // fk4.p
    public int d() {
        return this.f282473k;
    }

    @Override // fk4.p
    public java.lang.String e() {
        dn.o oVar = this.f282467e;
        if (oVar != null) {
            return oVar.E1;
        }
        return null;
    }

    @Override // fk4.p
    public void f(int i17) {
        dn.o oVar = this.f282467e;
        if (oVar == null) {
            return;
        }
        oVar.H1 = i17;
    }

    @Override // fk4.p
    public boolean g() {
        return true;
    }

    @Override // fk4.p
    /* renamed from: getLength */
    public long mo79594x23255ddc() {
        return this.f282467e != null ? r0.G1 : this.f282464b.f496548m;
    }

    @Override // fk4.p
    public boolean h() {
        return this.f282472j;
    }

    @Override // fk4.p
    public java.lang.String i() {
        dn.o oVar = this.f282467e;
        if (oVar != null) {
            return oVar.f69601xaca5bdda;
        }
        return null;
    }

    @Override // fk4.p
    /* renamed from: isFinished */
    public boolean mo79595xa89067bc() {
        t21.v2 v2Var = this.f282468f;
        if (v2Var != null) {
            return v2Var.i() || v2Var.f496544i == 123;
        }
        return false;
    }

    @Override // fk4.p
    public java.lang.String j() {
        java.lang.String str;
        r45.vh4 vh4Var;
        t21.v2 v2Var = this.f282464b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.S)) {
            return null;
        }
        int i17 = v2Var.f496559x;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282463a;
        if (i17 == -1) {
            str = !com.p314xaae8f345.mm.vfs.w6.j(v2Var.f()) ? ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, true) : v2Var.f();
        } else {
            java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, true);
            if (f9Var.A0() == 1 && (vh4Var = v2Var.H) != null && vh4Var.f469768e) {
                try {
                    java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(Ai);
                    if (r17 == null) {
                        r17 = "";
                    }
                    if (!r26.i0.n(r17, "/", false)) {
                        r17 = r17.concat("/");
                    }
                    java.lang.String str2 = r17 + com.p314xaae8f345.mm.vfs.w6.q(Ai) + "_hd.mp4";
                    boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2COriginVideoDownloadTask", "local capture video, hdFilePath: " + str2 + ", exist: " + j17);
                    if (j17) {
                        str = str2;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2COriginVideoDownloadTask", "try to get hd filePath error: " + e17.getMessage());
                }
            }
            str = Ai;
        }
        if (str == null || com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return str;
        }
        java.lang.String Ni = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ni(f9Var, true);
        return com.p314xaae8f345.mm.vfs.w6.j(Ni) ? Ni : str;
    }

    @Override // fk4.p
    public java.lang.String k() {
        return null;
    }

    @Override // fk4.p
    public void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2COriginVideoDownloadTask", "finishRemaining()");
        dn.o oVar = this.f282467e;
        t21.d3.J(oVar != null ? oVar.E1 : null, 2);
    }

    public final t21.v2 m(java.lang.String str) {
        if (str == null) {
            return null;
        }
        t21.v2 v2Var = this.f282464b;
        v2Var.o(str);
        t21.v2 v2Var2 = new t21.v2();
        v2Var2.f496552q = v2Var.h();
        v2Var2.f496554s = v2Var.e();
        v2Var2.f496545j = this.f282463a.mo78012x3fdd41df();
        v2Var2.f496537c = v2Var.f496537c;
        v2Var2.f496549n = v2Var.f496549n;
        v2Var2.n(v2Var.f496553r);
        v2Var2.f496541f = this.f282466d.f496342g;
        v2Var2.f496548m = v2Var.f496548m;
        v2Var2.f496555t = 0;
        v2Var2.f496533a = str;
        v2Var2.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v2Var2.f496550o = 0;
        v2Var2.f496559x = 1;
        v2Var2.f496544i = 111;
        return v2Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        if (t21.o2.Ui().C(r4) == false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d1  */
    @Override // fk4.p
    /* renamed from: start */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo79596x68ac462() {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g.mo79596x68ac462():boolean");
    }

    @Override // fk4.p
    /* renamed from: stop */
    public void mo79597x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2COriginVideoDownloadTask", "stop()");
        this.f282472j = false;
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.l3 Di = t21.o2.Di();
        java.lang.String i17 = i();
        ok4.b v17 = this.f282465c.v();
        Di.g(i17, new java.lang.Integer[]{java.lang.Integer.valueOf(v17.f427499a), java.lang.Integer.valueOf(v17.f427500b), java.lang.Integer.valueOf(v17.f427501c), java.lang.Integer.valueOf(v17.f427502d), java.lang.Integer.valueOf(v17.f427503e), java.lang.Integer.valueOf(v17.f427504f), java.lang.Integer.valueOf(v17.f427505g)});
    }
}
